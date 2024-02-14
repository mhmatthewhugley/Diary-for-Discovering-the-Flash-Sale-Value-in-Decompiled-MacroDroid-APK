package com.android.p023dx.p024cf.direct;

import com.android.p023dx.p024cf.attrib.AttAnnotationDefault;
import com.android.p023dx.p024cf.attrib.AttCode;
import com.android.p023dx.p024cf.attrib.AttConstantValue;
import com.android.p023dx.p024cf.attrib.AttDeprecated;
import com.android.p023dx.p024cf.attrib.AttEnclosingMethod;
import com.android.p023dx.p024cf.attrib.AttExceptions;
import com.android.p023dx.p024cf.attrib.AttInnerClasses;
import com.android.p023dx.p024cf.attrib.AttLineNumberTable;
import com.android.p023dx.p024cf.attrib.AttLocalVariableTable;
import com.android.p023dx.p024cf.attrib.AttLocalVariableTypeTable;
import com.android.p023dx.p024cf.attrib.AttRuntimeInvisibleAnnotations;
import com.android.p023dx.p024cf.attrib.AttRuntimeInvisibleParameterAnnotations;
import com.android.p023dx.p024cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.p023dx.p024cf.attrib.AttRuntimeVisibleParameterAnnotations;
import com.android.p023dx.p024cf.attrib.AttSignature;
import com.android.p023dx.p024cf.attrib.AttSourceFile;
import com.android.p023dx.p024cf.attrib.AttSynthetic;
import com.android.p023dx.p024cf.attrib.InnerClassList;
import com.android.p023dx.p024cf.code.ByteCatchList;
import com.android.p023dx.p024cf.code.BytecodeArray;
import com.android.p023dx.p024cf.code.LineNumberList;
import com.android.p023dx.p024cf.code.LocalVariableList;
import com.android.p023dx.p024cf.iface.Attribute;
import com.android.p023dx.p024cf.iface.ParseException;
import com.android.p023dx.p024cf.iface.ParseObserver;
import com.android.p023dx.p024cf.iface.StdAttributeList;
import com.android.p023dx.rop.annotation.AnnotationVisibility;
import com.android.p023dx.rop.code.AccessFlags;
import com.android.p023dx.rop.cst.ConstantPool;
import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.cst.TypedConstant;
import com.android.p023dx.util.ByteArray;
import com.android.p023dx.util.Hex;
import java.io.IOException;

/* renamed from: com.android.dx.cf.direct.StdAttributeFactory */
public class StdAttributeFactory extends AttributeFactory {
    public static final StdAttributeFactory THE_ONE = new StdAttributeFactory();

    private Attribute annotationDefault(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (i2 < 2) {
            throwSeverelyTruncated();
        }
        return new AttAnnotationDefault(new AnnotationParser(directClassFile, i, i2, parseObserver).parseValueAttribute(), i2);
    }

    private Attribute code(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        String str;
        int i3 = i;
        int i4 = i2;
        ParseObserver parseObserver2 = parseObserver;
        if (i4 < 12) {
            return throwSeverelyTruncated();
        }
        ByteArray bytes = directClassFile.getBytes();
        ConstantPool constantPool = directClassFile.getConstantPool();
        int unsignedShort = bytes.getUnsignedShort(i3);
        int i5 = i3 + 2;
        int unsignedShort2 = bytes.getUnsignedShort(i5);
        int i6 = i3 + 4;
        int i7 = bytes.getInt(i6);
        if (parseObserver2 != null) {
            parseObserver2.parsed(bytes, i3, 2, "max_stack: " + Hex.m907u2(unsignedShort));
            parseObserver2.parsed(bytes, i5, 2, "max_locals: " + Hex.m907u2(unsignedShort2));
            parseObserver2.parsed(bytes, i6, 4, "code_length: " + Hex.m909u4(i7));
        }
        int i8 = i3 + 8;
        int i9 = i4 - 8;
        if (i9 < i7 + 4) {
            return throwTruncated();
        }
        int i10 = i8 + i7;
        int i11 = i9 - i7;
        BytecodeArray bytecodeArray = new BytecodeArray(bytes.slice(i8, i10), constantPool);
        if (parseObserver2 != null) {
            bytecodeArray.forEach(new CodeObserver(bytecodeArray.getBytes(), parseObserver2));
        }
        int unsignedShort3 = bytes.getUnsignedShort(i10);
        ByteCatchList byteCatchList = unsignedShort3 == 0 ? ByteCatchList.EMPTY : new ByteCatchList(unsignedShort3);
        if (parseObserver2 != null) {
            parseObserver2.parsed(bytes, i10, 2, "exception_table_length: " + Hex.m907u2(unsignedShort3));
        }
        int i12 = i10 + 2;
        int i13 = i11 - 2;
        if (i13 < (unsignedShort3 * 8) + 2) {
            return throwTruncated();
        }
        for (int i14 = 0; i14 < unsignedShort3; i14++) {
            if (parseObserver2 != null) {
                parseObserver2.changeIndent(1);
            }
            int unsignedShort4 = bytes.getUnsignedShort(i12);
            int unsignedShort5 = bytes.getUnsignedShort(i12 + 2);
            int unsignedShort6 = bytes.getUnsignedShort(i12 + 4);
            CstType cstType = (CstType) constantPool.get0Ok(bytes.getUnsignedShort(i12 + 6));
            byteCatchList.set(i14, unsignedShort4, unsignedShort5, unsignedShort6, cstType);
            if (parseObserver2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(Hex.m907u2(unsignedShort4));
                sb.append("..");
                sb.append(Hex.m907u2(unsignedShort5));
                sb.append(" -> ");
                sb.append(Hex.m907u2(unsignedShort6));
                sb.append(" ");
                if (cstType == null) {
                    str = "<any>";
                } else {
                    str = cstType.toHuman();
                }
                sb.append(str);
                parseObserver2.parsed(bytes, i12, 8, sb.toString());
            }
            i12 += 8;
            i13 -= 8;
            if (parseObserver2 != null) {
                parseObserver2.changeIndent(-1);
            }
        }
        byteCatchList.setImmutable();
        AttributeListParser attributeListParser = new AttributeListParser(directClassFile, 3, i12, this);
        attributeListParser.setObserver(parseObserver2);
        StdAttributeList list = attributeListParser.getList();
        list.setImmutable();
        int endOffset = attributeListParser.getEndOffset() - i12;
        if (endOffset != i13) {
            return throwBadLength(endOffset + (i12 - i3));
        }
        return new AttCode(unsignedShort, unsignedShort2, bytecodeArray, byteCatchList, list);
    }

    private Attribute constantValue(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (i2 != 2) {
            return throwBadLength(2);
        }
        ByteArray bytes = directClassFile.getBytes();
        TypedConstant typedConstant = (TypedConstant) directClassFile.getConstantPool().get(bytes.getUnsignedShort(i));
        AttConstantValue attConstantValue = new AttConstantValue(typedConstant);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i, 2, "value: " + typedConstant);
        }
        return attConstantValue;
    }

    private Attribute deprecated(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (i2 != 0) {
            return throwBadLength(0);
        }
        return new AttDeprecated();
    }

    private Attribute enclosingMethod(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (i2 != 4) {
            throwBadLength(4);
        }
        ByteArray bytes = directClassFile.getBytes();
        ConstantPool constantPool = directClassFile.getConstantPool();
        CstType cstType = (CstType) constantPool.get(bytes.getUnsignedShort(i));
        int i3 = i + 2;
        CstNat cstNat = (CstNat) constantPool.get0Ok(bytes.getUnsignedShort(i3));
        AttEnclosingMethod attEnclosingMethod = new AttEnclosingMethod(cstType, cstNat);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i, 2, "class: " + cstType);
            parseObserver.parsed(bytes, i3, 2, "method: " + DirectClassFile.stringOrNone(cstNat));
        }
        return attEnclosingMethod;
    }

    private Attribute exceptions(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (i2 < 2) {
            return throwSeverelyTruncated();
        }
        ByteArray bytes = directClassFile.getBytes();
        int unsignedShort = bytes.getUnsignedShort(i);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i, 2, "number_of_exceptions: " + Hex.m907u2(unsignedShort));
        }
        int i3 = i + 2;
        int i4 = unsignedShort * 2;
        if (i2 - 2 != i4) {
            throwBadLength(i4 + 2);
        }
        return new AttExceptions(directClassFile.makeTypeList(i3, unsignedShort));
    }

    private Attribute innerClasses(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        int i3 = i;
        int i4 = i2;
        ParseObserver parseObserver2 = parseObserver;
        if (i4 < 2) {
            return throwSeverelyTruncated();
        }
        ByteArray bytes = directClassFile.getBytes();
        ConstantPool constantPool = directClassFile.getConstantPool();
        int unsignedShort = bytes.getUnsignedShort(i3);
        if (parseObserver2 != null) {
            parseObserver2.parsed(bytes, i3, 2, "number_of_classes: " + Hex.m907u2(unsignedShort));
        }
        int i5 = i3 + 2;
        int i6 = unsignedShort * 8;
        if (i4 - 2 != i6) {
            throwBadLength(i6 + 2);
        }
        InnerClassList innerClassList = new InnerClassList(unsignedShort);
        for (int i7 = 0; i7 < unsignedShort; i7++) {
            int unsignedShort2 = bytes.getUnsignedShort(i5);
            int i8 = i5 + 2;
            int unsignedShort3 = bytes.getUnsignedShort(i8);
            int i9 = i5 + 4;
            int unsignedShort4 = bytes.getUnsignedShort(i9);
            int i10 = i5 + 6;
            int unsignedShort5 = bytes.getUnsignedShort(i10);
            CstType cstType = (CstType) constantPool.get(unsignedShort2);
            CstType cstType2 = (CstType) constantPool.get0Ok(unsignedShort3);
            CstString cstString = (CstString) constantPool.get0Ok(unsignedShort4);
            int i11 = i10;
            innerClassList.set(i7, cstType, cstType2, cstString, unsignedShort5);
            if (parseObserver2 != null) {
                parseObserver2.parsed(bytes, i5, 2, "inner_class: " + DirectClassFile.stringOrNone(cstType));
                parseObserver2.parsed(bytes, i8, 2, "  outer_class: " + DirectClassFile.stringOrNone(cstType2));
                parseObserver2.parsed(bytes, i9, 2, "  name: " + DirectClassFile.stringOrNone(cstString));
                parseObserver2.parsed(bytes, i11, 2, "  access_flags: " + AccessFlags.innerClassString(unsignedShort5));
            }
            i5 += 8;
        }
        innerClassList.setImmutable();
        return new AttInnerClasses(innerClassList);
    }

    private Attribute lineNumberTable(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (i2 < 2) {
            return throwSeverelyTruncated();
        }
        ByteArray bytes = directClassFile.getBytes();
        int unsignedShort = bytes.getUnsignedShort(i);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i, 2, "line_number_table_length: " + Hex.m907u2(unsignedShort));
        }
        int i3 = i + 2;
        int i4 = unsignedShort * 4;
        if (i2 - 2 != i4) {
            throwBadLength(i4 + 2);
        }
        LineNumberList lineNumberList = new LineNumberList(unsignedShort);
        for (int i5 = 0; i5 < unsignedShort; i5++) {
            int unsignedShort2 = bytes.getUnsignedShort(i3);
            int unsignedShort3 = bytes.getUnsignedShort(i3 + 2);
            lineNumberList.set(i5, unsignedShort2, unsignedShort3);
            if (parseObserver != null) {
                parseObserver.parsed(bytes, i3, 4, Hex.m907u2(unsignedShort2) + " " + unsignedShort3);
            }
            i3 += 4;
        }
        lineNumberList.setImmutable();
        return new AttLineNumberTable(lineNumberList);
    }

    private Attribute localVariableTable(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (i2 < 2) {
            return throwSeverelyTruncated();
        }
        ByteArray bytes = directClassFile.getBytes();
        int unsignedShort = bytes.getUnsignedShort(i);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i, 2, "local_variable_table_length: " + Hex.m907u2(unsignedShort));
        }
        return new AttLocalVariableTable(parseLocalVariables(bytes.slice(i + 2, i + i2), directClassFile.getConstantPool(), parseObserver, unsignedShort, false));
    }

    private Attribute localVariableTypeTable(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (i2 < 2) {
            return throwSeverelyTruncated();
        }
        ByteArray bytes = directClassFile.getBytes();
        int unsignedShort = bytes.getUnsignedShort(i);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i, 2, "local_variable_type_table_length: " + Hex.m907u2(unsignedShort));
        }
        return new AttLocalVariableTypeTable(parseLocalVariables(bytes.slice(i + 2, i + i2), directClassFile.getConstantPool(), parseObserver, unsignedShort, true));
    }

    private LocalVariableList parseLocalVariables(ByteArray byteArray, ConstantPool constantPool, ParseObserver parseObserver, int i, boolean z) {
        CstString cstString;
        CstString cstString2;
        ConstantPool constantPool2 = constantPool;
        ParseObserver parseObserver2 = parseObserver;
        int i2 = i;
        int i3 = i2 * 10;
        if (byteArray.size() != i3) {
            throwBadLength(i3 + 2);
        }
        ByteArray.MyDataInputStream makeDataInputStream = byteArray.makeDataInputStream();
        LocalVariableList localVariableList = new LocalVariableList(i2);
        int i4 = 0;
        while (i4 < i2) {
            try {
                int readUnsignedShort = makeDataInputStream.readUnsignedShort();
                int readUnsignedShort2 = makeDataInputStream.readUnsignedShort();
                int readUnsignedShort3 = makeDataInputStream.readUnsignedShort();
                int readUnsignedShort4 = makeDataInputStream.readUnsignedShort();
                int readUnsignedShort5 = makeDataInputStream.readUnsignedShort();
                CstString cstString3 = (CstString) constantPool2.get(readUnsignedShort3);
                CstString cstString4 = (CstString) constantPool2.get(readUnsignedShort4);
                if (z) {
                    cstString2 = null;
                    cstString = cstString4;
                } else {
                    cstString = null;
                    cstString2 = cstString4;
                }
                localVariableList.set(i4, readUnsignedShort, readUnsignedShort2, cstString3, cstString2, cstString, readUnsignedShort5);
                if (parseObserver2 != null) {
                    parseObserver2.parsed(byteArray, i4 * 10, 10, Hex.m907u2(readUnsignedShort) + ".." + Hex.m907u2(readUnsignedShort + readUnsignedShort2) + " " + Hex.m907u2(readUnsignedShort5) + " " + cstString3.toHuman() + " " + cstString4.toHuman());
                } else {
                    ByteArray byteArray2 = byteArray;
                }
                i4++;
            } catch (IOException e) {
                throw new RuntimeException("shouldn't happen", e);
            }
        }
        localVariableList.setImmutable();
        return localVariableList;
    }

    private Attribute runtimeInvisibleAnnotations(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (i2 < 2) {
            throwSeverelyTruncated();
        }
        return new AttRuntimeInvisibleAnnotations(new AnnotationParser(directClassFile, i, i2, parseObserver).parseAnnotationAttribute(AnnotationVisibility.BUILD), i2);
    }

    private Attribute runtimeInvisibleParameterAnnotations(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (i2 < 2) {
            throwSeverelyTruncated();
        }
        return new AttRuntimeInvisibleParameterAnnotations(new AnnotationParser(directClassFile, i, i2, parseObserver).parseParameterAttribute(AnnotationVisibility.BUILD), i2);
    }

    private Attribute runtimeVisibleAnnotations(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (i2 < 2) {
            throwSeverelyTruncated();
        }
        return new AttRuntimeVisibleAnnotations(new AnnotationParser(directClassFile, i, i2, parseObserver).parseAnnotationAttribute(AnnotationVisibility.RUNTIME), i2);
    }

    private Attribute runtimeVisibleParameterAnnotations(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (i2 < 2) {
            throwSeverelyTruncated();
        }
        return new AttRuntimeVisibleParameterAnnotations(new AnnotationParser(directClassFile, i, i2, parseObserver).parseParameterAttribute(AnnotationVisibility.RUNTIME), i2);
    }

    private Attribute signature(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (i2 != 2) {
            throwBadLength(2);
        }
        ByteArray bytes = directClassFile.getBytes();
        CstString cstString = (CstString) directClassFile.getConstantPool().get(bytes.getUnsignedShort(i));
        AttSignature attSignature = new AttSignature(cstString);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i, 2, "signature: " + cstString);
        }
        return attSignature;
    }

    private Attribute sourceFile(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (i2 != 2) {
            throwBadLength(2);
        }
        ByteArray bytes = directClassFile.getBytes();
        CstString cstString = (CstString) directClassFile.getConstantPool().get(bytes.getUnsignedShort(i));
        AttSourceFile attSourceFile = new AttSourceFile(cstString);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i, 2, "source: " + cstString);
        }
        return attSourceFile;
    }

    private Attribute synthetic(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (i2 != 0) {
            return throwBadLength(0);
        }
        return new AttSynthetic();
    }

    private static Attribute throwBadLength(int i) {
        throw new ParseException("bad attribute length; expected length " + Hex.m909u4(i));
    }

    private static Attribute throwSeverelyTruncated() {
        throw new ParseException("severely truncated attribute");
    }

    private static Attribute throwTruncated() {
        throw new ParseException("truncated attribute");
    }

    /* access modifiers changed from: protected */
    public Attribute parse0(DirectClassFile directClassFile, int i, String str, int i2, int i3, ParseObserver parseObserver) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (str == AttLineNumberTable.ATTRIBUTE_NAME) {
                            return lineNumberTable(directClassFile, i2, i3, parseObserver);
                        }
                        if (str == AttLocalVariableTable.ATTRIBUTE_NAME) {
                            return localVariableTable(directClassFile, i2, i3, parseObserver);
                        }
                        if (str == AttLocalVariableTypeTable.ATTRIBUTE_NAME) {
                            return localVariableTypeTable(directClassFile, i2, i3, parseObserver);
                        }
                    }
                } else if (str == AttAnnotationDefault.ATTRIBUTE_NAME) {
                    return annotationDefault(directClassFile, i2, i3, parseObserver);
                } else {
                    if (str == AttCode.ATTRIBUTE_NAME) {
                        return code(directClassFile, i2, i3, parseObserver);
                    }
                    if (str == AttDeprecated.ATTRIBUTE_NAME) {
                        return deprecated(directClassFile, i2, i3, parseObserver);
                    }
                    if (str == AttExceptions.ATTRIBUTE_NAME) {
                        return exceptions(directClassFile, i2, i3, parseObserver);
                    }
                    if (str == AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME) {
                        return runtimeInvisibleAnnotations(directClassFile, i2, i3, parseObserver);
                    }
                    if (str == AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME) {
                        return runtimeVisibleAnnotations(directClassFile, i2, i3, parseObserver);
                    }
                    if (str == AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME) {
                        return runtimeInvisibleParameterAnnotations(directClassFile, i2, i3, parseObserver);
                    }
                    if (str == AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME) {
                        return runtimeVisibleParameterAnnotations(directClassFile, i2, i3, parseObserver);
                    }
                    if (str == AttSignature.ATTRIBUTE_NAME) {
                        return signature(directClassFile, i2, i3, parseObserver);
                    }
                    if (str == AttSynthetic.ATTRIBUTE_NAME) {
                        return synthetic(directClassFile, i2, i3, parseObserver);
                    }
                }
            } else if (str == AttConstantValue.ATTRIBUTE_NAME) {
                return constantValue(directClassFile, i2, i3, parseObserver);
            } else {
                if (str == AttDeprecated.ATTRIBUTE_NAME) {
                    return deprecated(directClassFile, i2, i3, parseObserver);
                }
                if (str == AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME) {
                    return runtimeInvisibleAnnotations(directClassFile, i2, i3, parseObserver);
                }
                if (str == AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME) {
                    return runtimeVisibleAnnotations(directClassFile, i2, i3, parseObserver);
                }
                if (str == AttSignature.ATTRIBUTE_NAME) {
                    return signature(directClassFile, i2, i3, parseObserver);
                }
                if (str == AttSynthetic.ATTRIBUTE_NAME) {
                    return synthetic(directClassFile, i2, i3, parseObserver);
                }
            }
        } else if (str == AttDeprecated.ATTRIBUTE_NAME) {
            return deprecated(directClassFile, i2, i3, parseObserver);
        } else {
            if (str == AttEnclosingMethod.ATTRIBUTE_NAME) {
                return enclosingMethod(directClassFile, i2, i3, parseObserver);
            }
            if (str == AttInnerClasses.ATTRIBUTE_NAME) {
                return innerClasses(directClassFile, i2, i3, parseObserver);
            }
            if (str == AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME) {
                return runtimeInvisibleAnnotations(directClassFile, i2, i3, parseObserver);
            }
            if (str == AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME) {
                return runtimeVisibleAnnotations(directClassFile, i2, i3, parseObserver);
            }
            if (str == AttSynthetic.ATTRIBUTE_NAME) {
                return synthetic(directClassFile, i2, i3, parseObserver);
            }
            if (str == AttSignature.ATTRIBUTE_NAME) {
                return signature(directClassFile, i2, i3, parseObserver);
            }
            if (str == AttSourceFile.ATTRIBUTE_NAME) {
                return sourceFile(directClassFile, i2, i3, parseObserver);
            }
        }
        return super.parse0(directClassFile, i, str, i2, i3, parseObserver);
    }
}
