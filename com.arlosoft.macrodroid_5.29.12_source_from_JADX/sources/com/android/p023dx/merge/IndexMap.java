package com.android.p023dx.merge;

import com.android.dex.Annotation;
import com.android.dex.ClassDef;
import com.android.dex.Dex;
import com.android.dex.DexException;
import com.android.dex.EncodedValue;
import com.android.dex.EncodedValueCodec;
import com.android.dex.EncodedValueReader;
import com.android.dex.FieldId;
import com.android.dex.Leb128;
import com.android.dex.MethodId;
import com.android.dex.ProtoId;
import com.android.dex.TableOfContents;
import com.android.dex.TypeList;
import com.android.dex.util.ByteOutput;
import com.android.p023dx.util.ByteArrayAnnotatedOutput;
import java.util.HashMap;

/* renamed from: com.android.dx.merge.IndexMap */
public final class IndexMap {
    private final HashMap<Integer, Integer> annotationDirectoryOffsets;
    private final HashMap<Integer, Integer> annotationOffsets = new HashMap<>();
    private final HashMap<Integer, Integer> annotationSetOffsets;
    private final HashMap<Integer, Integer> annotationSetRefListOffsets;
    public final short[] fieldIds;
    public final short[] methodIds;
    public final short[] protoIds;
    private final HashMap<Integer, Integer> staticValuesOffsets;
    public final int[] stringIds;
    private final Dex target;
    public final short[] typeIds;
    private final HashMap<Integer, Integer> typeListOffsets;

    /* renamed from: com.android.dx.merge.IndexMap$EncodedValueTransformer */
    private final class EncodedValueTransformer {
        private final ByteOutput out;

        public EncodedValueTransformer(ByteOutput byteOutput) {
            this.out = byteOutput;
        }

        /* access modifiers changed from: private */
        public void transformAnnotation(EncodedValueReader encodedValueReader) {
            int readAnnotation = encodedValueReader.readAnnotation();
            Leb128.writeUnsignedLeb128(this.out, IndexMap.this.adjustType(encodedValueReader.getAnnotationType()));
            Leb128.writeUnsignedLeb128(this.out, readAnnotation);
            for (int i = 0; i < readAnnotation; i++) {
                Leb128.writeUnsignedLeb128(this.out, IndexMap.this.adjustString(encodedValueReader.readAnnotationName()));
                transform(encodedValueReader);
            }
        }

        /* access modifiers changed from: private */
        public void transformArray(EncodedValueReader encodedValueReader) {
            int readArray = encodedValueReader.readArray();
            Leb128.writeUnsignedLeb128(this.out, readArray);
            for (int i = 0; i < readArray; i++) {
                transform(encodedValueReader);
            }
        }

        private void writeTypeAndArg(int i, int i2) {
            this.out.writeByte(i | (i2 << 5));
        }

        public void transform(EncodedValueReader encodedValueReader) {
            int peek = encodedValueReader.peek();
            if (peek == 0) {
                EncodedValueCodec.writeSignedIntegralValue(this.out, 0, (long) encodedValueReader.readByte());
            } else if (peek == 6) {
                EncodedValueCodec.writeSignedIntegralValue(this.out, 6, encodedValueReader.readLong());
            } else if (peek == 2) {
                EncodedValueCodec.writeSignedIntegralValue(this.out, 2, (long) encodedValueReader.readShort());
            } else if (peek == 3) {
                EncodedValueCodec.writeUnsignedIntegralValue(this.out, 3, (long) encodedValueReader.readChar());
            } else if (peek == 4) {
                EncodedValueCodec.writeSignedIntegralValue(this.out, 4, (long) encodedValueReader.readInt());
            } else if (peek == 16) {
                EncodedValueCodec.writeRightZeroExtendedValue(this.out, 16, ((long) Float.floatToIntBits(encodedValueReader.readFloat())) << 32);
            } else if (peek != 17) {
                switch (peek) {
                    case 23:
                        EncodedValueCodec.writeUnsignedIntegralValue(this.out, 23, (long) IndexMap.this.adjustString(encodedValueReader.readString()));
                        return;
                    case 24:
                        EncodedValueCodec.writeUnsignedIntegralValue(this.out, 24, (long) IndexMap.this.adjustType(encodedValueReader.readType()));
                        return;
                    case 25:
                        EncodedValueCodec.writeUnsignedIntegralValue(this.out, 25, (long) IndexMap.this.adjustField(encodedValueReader.readField()));
                        return;
                    case 26:
                        EncodedValueCodec.writeUnsignedIntegralValue(this.out, 26, (long) IndexMap.this.adjustMethod(encodedValueReader.readMethod()));
                        return;
                    case 27:
                        EncodedValueCodec.writeUnsignedIntegralValue(this.out, 27, (long) IndexMap.this.adjustField(encodedValueReader.readEnum()));
                        return;
                    case 28:
                        writeTypeAndArg(28, 0);
                        transformArray(encodedValueReader);
                        return;
                    case 29:
                        writeTypeAndArg(29, 0);
                        transformAnnotation(encodedValueReader);
                        return;
                    case 30:
                        encodedValueReader.readNull();
                        writeTypeAndArg(30, 0);
                        return;
                    case 31:
                        writeTypeAndArg(31, encodedValueReader.readBoolean() ? 1 : 0);
                        return;
                    default:
                        throw new DexException("Unexpected type: " + Integer.toHexString(encodedValueReader.peek()));
                }
            } else {
                EncodedValueCodec.writeRightZeroExtendedValue(this.out, 17, Double.doubleToLongBits(encodedValueReader.readDouble()));
            }
        }
    }

    public IndexMap(Dex dex, TableOfContents tableOfContents) {
        this.target = dex;
        this.stringIds = new int[tableOfContents.stringIds.size];
        this.typeIds = new short[tableOfContents.typeIds.size];
        this.protoIds = new short[tableOfContents.protoIds.size];
        this.fieldIds = new short[tableOfContents.fieldIds.size];
        this.methodIds = new short[tableOfContents.methodIds.size];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        this.typeListOffsets = hashMap;
        HashMap<Integer, Integer> hashMap2 = new HashMap<>();
        this.annotationSetOffsets = hashMap2;
        this.annotationSetRefListOffsets = new HashMap<>();
        HashMap<Integer, Integer> hashMap3 = new HashMap<>();
        this.annotationDirectoryOffsets = hashMap3;
        HashMap<Integer, Integer> hashMap4 = new HashMap<>();
        this.staticValuesOffsets = hashMap4;
        hashMap.put(0, 0);
        hashMap2.put(0, 0);
        hashMap3.put(0, 0);
        hashMap4.put(0, 0);
    }

    public MethodId adjust(MethodId methodId) {
        return new MethodId(this.target, adjustType(methodId.getDeclaringClassIndex()), adjustProto(methodId.getProtoIndex()), adjustString(methodId.getNameIndex()));
    }

    public int adjustAnnotation(int i) {
        return this.annotationOffsets.get(Integer.valueOf(i)).intValue();
    }

    public int adjustAnnotationDirectory(int i) {
        return this.annotationDirectoryOffsets.get(Integer.valueOf(i)).intValue();
    }

    public int adjustAnnotationSet(int i) {
        return this.annotationSetOffsets.get(Integer.valueOf(i)).intValue();
    }

    public int adjustAnnotationSetRefList(int i) {
        return this.annotationSetRefListOffsets.get(Integer.valueOf(i)).intValue();
    }

    public EncodedValue adjustEncodedArray(EncodedValue encodedValue) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(32);
        new EncodedValueTransformer(byteArrayAnnotatedOutput).transformArray(new EncodedValueReader(encodedValue, 28));
        return new EncodedValue(byteArrayAnnotatedOutput.toByteArray());
    }

    public EncodedValue adjustEncodedValue(EncodedValue encodedValue) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(32);
        new EncodedValueTransformer(byteArrayAnnotatedOutput).transform(new EncodedValueReader(encodedValue));
        return new EncodedValue(byteArrayAnnotatedOutput.toByteArray());
    }

    public int adjustField(int i) {
        return this.fieldIds[i] & 65535;
    }

    public int adjustMethod(int i) {
        return this.methodIds[i] & 65535;
    }

    public int adjustProto(int i) {
        return this.protoIds[i] & 65535;
    }

    public int adjustStaticValues(int i) {
        return this.staticValuesOffsets.get(Integer.valueOf(i)).intValue();
    }

    public int adjustString(int i) {
        if (i == -1) {
            return -1;
        }
        return this.stringIds[i];
    }

    public int adjustType(int i) {
        if (i == -1) {
            return -1;
        }
        return 65535 & this.typeIds[i];
    }

    public TypeList adjustTypeList(TypeList typeList) {
        if (typeList == TypeList.EMPTY) {
            return typeList;
        }
        short[] sArr = (short[]) typeList.getTypes().clone();
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = (short) adjustType(sArr[i]);
        }
        return new TypeList(this.target, sArr);
    }

    public int adjustTypeListOffset(int i) {
        return this.typeListOffsets.get(Integer.valueOf(i)).intValue();
    }

    public void putAnnotationDirectoryOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.annotationDirectoryOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void putAnnotationOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.annotationOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void putAnnotationSetOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.annotationSetOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void putAnnotationSetRefListOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.annotationSetRefListOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void putStaticValuesOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.staticValuesOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void putTypeListOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.typeListOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public FieldId adjust(FieldId fieldId) {
        return new FieldId(this.target, adjustType(fieldId.getDeclaringClassIndex()), adjustType(fieldId.getTypeIndex()), adjustString(fieldId.getNameIndex()));
    }

    public ProtoId adjust(ProtoId protoId) {
        return new ProtoId(this.target, adjustString(protoId.getShortyIndex()), adjustType(protoId.getReturnTypeIndex()), adjustTypeListOffset(protoId.getParametersOffset()));
    }

    public ClassDef adjust(ClassDef classDef) {
        return new ClassDef(this.target, classDef.getOffset(), adjustType(classDef.getTypeIndex()), classDef.getAccessFlags(), adjustType(classDef.getSupertypeIndex()), adjustTypeListOffset(classDef.getInterfacesOffset()), classDef.getSourceFileIndex(), classDef.getAnnotationsOffset(), classDef.getClassDataOffset(), classDef.getStaticValuesOffset());
    }

    public SortableType adjust(SortableType sortableType) {
        return new SortableType(sortableType.getDex(), sortableType.getIndexMap(), adjust(sortableType.getClassDef()));
    }

    public Annotation adjust(Annotation annotation) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(32);
        new EncodedValueTransformer(byteArrayAnnotatedOutput).transformAnnotation(annotation.getReader());
        return new Annotation(this.target, annotation.getVisibility(), new EncodedValue(byteArrayAnnotatedOutput.toByteArray()));
    }
}
