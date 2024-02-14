package com.android.p023dx.dex.file;

import com.android.dex.EncodedValueCodec;
import com.android.p023dx.rop.annotation.Annotation;
import com.android.p023dx.rop.annotation.NameValuePair;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstAnnotation;
import com.android.p023dx.rop.cst.CstArray;
import com.android.p023dx.rop.cst.CstBoolean;
import com.android.p023dx.rop.cst.CstByte;
import com.android.p023dx.rop.cst.CstChar;
import com.android.p023dx.rop.cst.CstDouble;
import com.android.p023dx.rop.cst.CstEnumRef;
import com.android.p023dx.rop.cst.CstFieldRef;
import com.android.p023dx.rop.cst.CstFloat;
import com.android.p023dx.rop.cst.CstInteger;
import com.android.p023dx.rop.cst.CstKnownNull;
import com.android.p023dx.rop.cst.CstLiteralBits;
import com.android.p023dx.rop.cst.CstLong;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.rop.cst.CstShort;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.util.Collection;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.ValueEncoder */
public final class ValueEncoder {
    private static final int VALUE_ANNOTATION = 29;
    private static final int VALUE_ARRAY = 28;
    private static final int VALUE_BOOLEAN = 31;
    private static final int VALUE_BYTE = 0;
    private static final int VALUE_CHAR = 3;
    private static final int VALUE_DOUBLE = 17;
    private static final int VALUE_ENUM = 27;
    private static final int VALUE_FIELD = 25;
    private static final int VALUE_FLOAT = 16;
    private static final int VALUE_INT = 4;
    private static final int VALUE_LONG = 6;
    private static final int VALUE_METHOD = 26;
    private static final int VALUE_NULL = 30;
    private static final int VALUE_SHORT = 2;
    private static final int VALUE_STRING = 23;
    private static final int VALUE_TYPE = 24;
    private final DexFile file;
    private final AnnotatedOutput out;

    public ValueEncoder(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        Objects.requireNonNull(dexFile, "file == null");
        Objects.requireNonNull(annotatedOutput, "out == null");
        this.file = dexFile;
        this.out = annotatedOutput;
    }

    public static void addContents(DexFile dexFile, Annotation annotation) {
        TypeIdsSection typeIds = dexFile.getTypeIds();
        StringIdsSection stringIds = dexFile.getStringIds();
        typeIds.intern(annotation.getType());
        for (NameValuePair next : annotation.getNameValuePairs()) {
            stringIds.intern(next.getName());
            addContents(dexFile, next.getValue());
        }
    }

    public static String constantToHuman(Constant constant) {
        if (constantToValueType(constant) == 30) {
            return "null";
        }
        return constant.typeName() + ' ' + constant.toHuman();
    }

    private static int constantToValueType(Constant constant) {
        if (constant instanceof CstByte) {
            return 0;
        }
        if (constant instanceof CstShort) {
            return 2;
        }
        if (constant instanceof CstChar) {
            return 3;
        }
        if (constant instanceof CstInteger) {
            return 4;
        }
        if (constant instanceof CstLong) {
            return 6;
        }
        if (constant instanceof CstFloat) {
            return 16;
        }
        if (constant instanceof CstDouble) {
            return 17;
        }
        if (constant instanceof CstString) {
            return 23;
        }
        if (constant instanceof CstType) {
            return 24;
        }
        if (constant instanceof CstFieldRef) {
            return 25;
        }
        if (constant instanceof CstMethodRef) {
            return 26;
        }
        if (constant instanceof CstEnumRef) {
            return 27;
        }
        if (constant instanceof CstArray) {
            return 28;
        }
        if (constant instanceof CstAnnotation) {
            return 29;
        }
        if (constant instanceof CstKnownNull) {
            return 30;
        }
        if (constant instanceof CstBoolean) {
            return 31;
        }
        throw new RuntimeException("Shouldn't happen");
    }

    public void writeAnnotation(Annotation annotation, boolean z) {
        boolean z2 = z && this.out.annotates();
        StringIdsSection stringIds = this.file.getStringIds();
        TypeIdsSection typeIds = this.file.getTypeIds();
        CstType type = annotation.getType();
        int indexOf = typeIds.indexOf(type);
        if (z2) {
            AnnotatedOutput annotatedOutput = this.out;
            annotatedOutput.annotate("  type_idx: " + Hex.m909u4(indexOf) + " // " + type.toHuman());
        }
        this.out.writeUleb128(typeIds.indexOf(annotation.getType()));
        Collection<NameValuePair> nameValuePairs = annotation.getNameValuePairs();
        int size = nameValuePairs.size();
        if (z2) {
            AnnotatedOutput annotatedOutput2 = this.out;
            annotatedOutput2.annotate("  size: " + Hex.m909u4(size));
        }
        this.out.writeUleb128(size);
        int i = 0;
        for (NameValuePair next : nameValuePairs) {
            CstString name = next.getName();
            int indexOf2 = stringIds.indexOf(name);
            Constant value = next.getValue();
            if (z2) {
                AnnotatedOutput annotatedOutput3 = this.out;
                annotatedOutput3.annotate(0, "  elements[" + i + "]:");
                i++;
                AnnotatedOutput annotatedOutput4 = this.out;
                annotatedOutput4.annotate("    name_idx: " + Hex.m909u4(indexOf2) + " // " + name.toHuman());
            }
            this.out.writeUleb128(indexOf2);
            if (z2) {
                AnnotatedOutput annotatedOutput5 = this.out;
                annotatedOutput5.annotate("    value: " + constantToHuman(value));
            }
            writeConstant(value);
        }
        if (z2) {
            this.out.endAnnotation();
        }
    }

    public void writeArray(CstArray cstArray, boolean z) {
        boolean z2 = z && this.out.annotates();
        CstArray.List list = cstArray.getList();
        int size = list.size();
        if (z2) {
            AnnotatedOutput annotatedOutput = this.out;
            annotatedOutput.annotate("  size: " + Hex.m909u4(size));
        }
        this.out.writeUleb128(size);
        for (int i = 0; i < size; i++) {
            Constant constant = list.get(i);
            if (z2) {
                AnnotatedOutput annotatedOutput2 = this.out;
                annotatedOutput2.annotate("  [" + Integer.toHexString(i) + "] " + constantToHuman(constant));
            }
            writeConstant(constant);
        }
        if (z2) {
            this.out.endAnnotation();
        }
    }

    public void writeConstant(Constant constant) {
        int constantToValueType = constantToValueType(constant);
        if (!(constantToValueType == 0 || constantToValueType == 6 || constantToValueType == 2)) {
            if (constantToValueType == 3) {
                EncodedValueCodec.writeUnsignedIntegralValue(this.out, constantToValueType, ((CstLiteralBits) constant).getLongBits());
                return;
            } else if (constantToValueType != 4) {
                if (constantToValueType == 16) {
                    EncodedValueCodec.writeRightZeroExtendedValue(this.out, constantToValueType, ((CstFloat) constant).getLongBits() << 32);
                    return;
                } else if (constantToValueType != 17) {
                    switch (constantToValueType) {
                        case 23:
                            EncodedValueCodec.writeUnsignedIntegralValue(this.out, constantToValueType, (long) this.file.getStringIds().indexOf((CstString) constant));
                            return;
                        case 24:
                            EncodedValueCodec.writeUnsignedIntegralValue(this.out, constantToValueType, (long) this.file.getTypeIds().indexOf((CstType) constant));
                            return;
                        case 25:
                            EncodedValueCodec.writeUnsignedIntegralValue(this.out, constantToValueType, (long) this.file.getFieldIds().indexOf((CstFieldRef) constant));
                            return;
                        case 26:
                            EncodedValueCodec.writeUnsignedIntegralValue(this.out, constantToValueType, (long) this.file.getMethodIds().indexOf((CstMethodRef) constant));
                            return;
                        case 27:
                            EncodedValueCodec.writeUnsignedIntegralValue(this.out, constantToValueType, (long) this.file.getFieldIds().indexOf(((CstEnumRef) constant).getFieldRef()));
                            return;
                        case 28:
                            this.out.writeByte(constantToValueType);
                            writeArray((CstArray) constant, false);
                            return;
                        case 29:
                            this.out.writeByte(constantToValueType);
                            writeAnnotation(((CstAnnotation) constant).getAnnotation(), false);
                            return;
                        case 30:
                            this.out.writeByte(constantToValueType);
                            return;
                        case 31:
                            this.out.writeByte((((CstBoolean) constant).getIntBits() << 5) | constantToValueType);
                            return;
                        default:
                            throw new RuntimeException("Shouldn't happen");
                    }
                } else {
                    EncodedValueCodec.writeRightZeroExtendedValue(this.out, constantToValueType, ((CstDouble) constant).getLongBits());
                    return;
                }
            }
        }
        EncodedValueCodec.writeSignedIntegralValue(this.out, constantToValueType, ((CstLiteralBits) constant).getLongBits());
    }

    public static void addContents(DexFile dexFile, Constant constant) {
        if (constant instanceof CstAnnotation) {
            addContents(dexFile, ((CstAnnotation) constant).getAnnotation());
        } else if (constant instanceof CstArray) {
            CstArray.List list = ((CstArray) constant).getList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                addContents(dexFile, list.get(i));
            }
        } else {
            dexFile.internIfAppropriate(constant);
        }
    }
}
