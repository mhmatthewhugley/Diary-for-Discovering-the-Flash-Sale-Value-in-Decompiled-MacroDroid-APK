package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.util.Objects;

final class ArrayDecoders {

    /* renamed from: com.google.protobuf.ArrayDecoders$1 */
    static /* synthetic */ class C115561 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56572a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56572a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f56572a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ArrayDecoders.C115561.<clinit>():void");
        }
    }

    ArrayDecoders() {
    }

    /* renamed from: A */
    static int m79353A(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int I = m79361I(bArr, i2, registers);
        intArrayList.mo65218h(CodedInputStream.m79832b(registers.f56573a));
        while (I < i3) {
            int I2 = m79361I(bArr, I, registers);
            if (i != registers.f56573a) {
                break;
            }
            I = m79361I(bArr, I2, registers);
            intArrayList.mo65218h(CodedInputStream.m79832b(registers.f56573a));
        }
        return I;
    }

    /* renamed from: B */
    static int m79354B(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int L = m79364L(bArr, i2, registers);
        longArrayList.mo65308i(CodedInputStream.m79833c(registers.f56574b));
        while (L < i3) {
            int I = m79361I(bArr, L, registers);
            if (i != registers.f56573a) {
                break;
            }
            L = m79364L(bArr, I, registers);
            longArrayList.mo65308i(CodedInputStream.m79833c(registers.f56574b));
        }
        return L;
    }

    /* renamed from: C */
    static int m79355C(byte[] bArr, int i, Registers registers) throws InvalidProtocolBufferException {
        int I = m79361I(bArr, i, registers);
        int i2 = registers.f56573a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m80763f();
        } else if (i2 == 0) {
            registers.f56575c = "";
            return I;
        } else {
            registers.f56575c = new String(bArr, I, i2, Internal.f56935a);
            return I + i2;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[EDGE_INSN: B:21:0x0044->B:17:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* renamed from: D */
    static int m79356D(int r4, byte[] r5, int r6, int r7, com.google.protobuf.Internal.ProtobufList<?> r8, com.google.protobuf.ArrayDecoders.Registers r9) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            int r6 = m79361I(r5, r6, r9)
            int r0 = r9.f56573a
            if (r0 < 0) goto L_0x0045
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r8.add(r1)
            goto L_0x001b
        L_0x0010:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.Internal.f56935a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L_0x001a:
            int r6 = r6 + r0
        L_0x001b:
            if (r6 >= r7) goto L_0x0044
            int r0 = m79361I(r5, r6, r9)
            int r2 = r9.f56573a
            if (r4 == r2) goto L_0x0026
            goto L_0x0044
        L_0x0026:
            int r6 = m79361I(r5, r0, r9)
            int r0 = r9.f56573a
            if (r0 < 0) goto L_0x003f
            if (r0 != 0) goto L_0x0034
            r8.add(r1)
            goto L_0x001b
        L_0x0034:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.Internal.f56935a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L_0x001a
        L_0x003f:
            com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.m80763f()
            throw r4
        L_0x0044:
            return r6
        L_0x0045:
            com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.m80763f()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ArrayDecoders.m79356D(int, byte[], int, int, com.google.protobuf.Internal$ProtobufList, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r2 = r7 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (com.google.protobuf.Utf8.m81487u(r6, r7, r2) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r9.add(new java.lang.String(r6, r7, r0, com.google.protobuf.Internal.f56935a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        throw com.google.protobuf.InvalidProtocolBufferException.m80760c();
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A[EDGE_INSN: B:28:0x0059->B:23:0x0059 ?: BREAK  , SYNTHETIC] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m79357E(int r5, byte[] r6, int r7, int r8, com.google.protobuf.Internal.ProtobufList<?> r9, com.google.protobuf.ArrayDecoders.Registers r10) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            int r7 = m79361I(r6, r7, r10)
            int r0 = r10.f56573a
            if (r0 < 0) goto L_0x005f
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r9.add(r1)
            goto L_0x0023
        L_0x0010:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.Utf8.m81487u(r6, r7, r2)
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.Internal.f56935a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L_0x0022:
            r7 = r2
        L_0x0023:
            if (r7 >= r8) goto L_0x0059
            int r0 = m79361I(r6, r7, r10)
            int r2 = r10.f56573a
            if (r5 == r2) goto L_0x002e
            goto L_0x0059
        L_0x002e:
            int r7 = m79361I(r6, r0, r10)
            int r0 = r10.f56573a
            if (r0 < 0) goto L_0x0054
            if (r0 != 0) goto L_0x003c
            r9.add(r1)
            goto L_0x0023
        L_0x003c:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.Utf8.m81487u(r6, r7, r2)
            if (r3 == 0) goto L_0x004f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.Internal.f56935a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L_0x0022
        L_0x004f:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.m80760c()
            throw r5
        L_0x0054:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.m80763f()
            throw r5
        L_0x0059:
            return r7
        L_0x005a:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.m80760c()
            throw r5
        L_0x005f:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.m80763f()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ArrayDecoders.m79357E(int, byte[], int, int, com.google.protobuf.Internal$ProtobufList, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    /* renamed from: F */
    static int m79358F(byte[] bArr, int i, Registers registers) throws InvalidProtocolBufferException {
        int I = m79361I(bArr, i, registers);
        int i2 = registers.f56573a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m80763f();
        } else if (i2 == 0) {
            registers.f56575c = "";
            return I;
        } else {
            registers.f56575c = Utf8.m81474h(bArr, I, i2);
            return I + i2;
        }
    }

    /* renamed from: G */
    static int m79359G(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.m81547a(i) != 0) {
            int b = WireFormat.m81548b(i);
            if (b == 0) {
                int L = m79364L(bArr, i2, registers);
                unknownFieldSetLite.mo65469m(i, Long.valueOf(registers.f56574b));
                return L;
            } else if (b == 1) {
                unknownFieldSetLite.mo65469m(i, Long.valueOf(m79376j(bArr, i2)));
                return i2 + 8;
            } else if (b == 2) {
                int I = m79361I(bArr, i2, registers);
                int i4 = registers.f56573a;
                if (i4 < 0) {
                    throw InvalidProtocolBufferException.m80763f();
                } else if (i4 <= bArr.length - I) {
                    if (i4 == 0) {
                        unknownFieldSetLite.mo65469m(i, ByteString.f56619a);
                    } else {
                        unknownFieldSetLite.mo65469m(i, ByteString.m79774q(bArr, I, i4));
                    }
                    return I + i4;
                } else {
                    throw InvalidProtocolBufferException.m80767k();
                }
            } else if (b == 3) {
                UnknownFieldSetLite j = UnknownFieldSetLite.m81298j();
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int I2 = m79361I(bArr, i2, registers);
                    int i7 = registers.f56573a;
                    if (i7 == i5) {
                        i6 = i7;
                        i2 = I2;
                        break;
                    }
                    i6 = i7;
                    i2 = m79359G(i7, bArr, I2, i3, j, registers);
                }
                if (i2 > i3 || i6 != i5) {
                    throw InvalidProtocolBufferException.m80764g();
                }
                unknownFieldSetLite.mo65469m(i, j);
                return i2;
            } else if (b == 5) {
                unknownFieldSetLite.mo65469m(i, Integer.valueOf(m79374h(bArr, i2)));
                return i2 + 4;
            } else {
                throw InvalidProtocolBufferException.m80759b();
            }
        } else {
            throw InvalidProtocolBufferException.m80759b();
        }
    }

    /* renamed from: H */
    static int m79360H(int i, byte[] bArr, int i2, Registers registers) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            registers.f56573a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            registers.f56573a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            registers.f56573a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            registers.f56573a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                registers.f56573a = i11;
                return i12;
            }
        }
    }

    /* renamed from: I */
    static int m79361I(byte[] bArr, int i, Registers registers) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m79360H(b, bArr, i2, registers);
        }
        registers.f56573a = b;
        return i2;
    }

    /* renamed from: J */
    static int m79362J(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int I = m79361I(bArr, i2, registers);
        intArrayList.mo65218h(registers.f56573a);
        while (I < i3) {
            int I2 = m79361I(bArr, I, registers);
            if (i != registers.f56573a) {
                break;
            }
            I = m79361I(bArr, I2, registers);
            intArrayList.mo65218h(registers.f56573a);
        }
        return I;
    }

    /* renamed from: K */
    static int m79363K(long j, byte[] bArr, int i, Registers registers) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i3;
            byte b3 = b2;
            i2 = i4;
            b = b3;
        }
        registers.f56574b = j2;
        return i2;
    }

    /* renamed from: L */
    static int m79364L(byte[] bArr, int i, Registers registers) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            return m79363K(j, bArr, i2, registers);
        }
        registers.f56574b = j;
        return i2;
    }

    /* renamed from: M */
    static int m79365M(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int L = m79364L(bArr, i2, registers);
        longArrayList.mo65308i(registers.f56574b);
        while (L < i3) {
            int I = m79361I(bArr, L, registers);
            if (i != registers.f56573a) {
                break;
            }
            L = m79364L(bArr, I, registers);
            longArrayList.mo65308i(registers.f56574b);
        }
        return L;
    }

    /* renamed from: N */
    static int m79366N(int i, byte[] bArr, int i2, int i3, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.m81547a(i) != 0) {
            int b = WireFormat.m81548b(i);
            if (b == 0) {
                return m79364L(bArr, i2, registers);
            }
            if (b == 1) {
                return i2 + 8;
            }
            if (b == 2) {
                return m79361I(bArr, i2, registers) + registers.f56573a;
            }
            if (b == 3) {
                int i4 = (i & -8) | 4;
                int i5 = 0;
                while (i2 < i3) {
                    i2 = m79361I(bArr, i2, registers);
                    i5 = registers.f56573a;
                    if (i5 == i4) {
                        break;
                    }
                    i2 = m79366N(i5, bArr, i2, i3, registers);
                }
                if (i2 <= i3 && i5 == i4) {
                    return i2;
                }
                throw InvalidProtocolBufferException.m80764g();
            } else if (b == 5) {
                return i2 + 4;
            } else {
                throw InvalidProtocolBufferException.m80759b();
            }
        } else {
            throw InvalidProtocolBufferException.m80759b();
        }
    }

    /* renamed from: a */
    static int m79367a(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, Registers registers) {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int L = m79364L(bArr, i2, registers);
        booleanArrayList.mo64893i(registers.f56574b != 0);
        while (L < i3) {
            int I = m79361I(bArr, L, registers);
            if (i != registers.f56573a) {
                break;
            }
            L = m79364L(bArr, I, registers);
            booleanArrayList.mo64893i(registers.f56574b != 0);
        }
        return L;
    }

    /* renamed from: b */
    static int m79368b(byte[] bArr, int i, Registers registers) throws InvalidProtocolBufferException {
        int I = m79361I(bArr, i, registers);
        int i2 = registers.f56573a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m80763f();
        } else if (i2 > bArr.length - I) {
            throw InvalidProtocolBufferException.m80767k();
        } else if (i2 == 0) {
            registers.f56575c = ByteString.f56619a;
            return I;
        } else {
            registers.f56575c = ByteString.m79774q(bArr, I, i2);
            return I + i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d A[EDGE_INSN: B:30:0x004d->B:22:0x004d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m79369c(int r2, byte[] r3, int r4, int r5, com.google.protobuf.Internal.ProtobufList<?> r6, com.google.protobuf.ArrayDecoders.Registers r7) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            int r4 = m79361I(r3, r4, r7)
            int r0 = r7.f56573a
            if (r0 < 0) goto L_0x0053
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x004e
            if (r0 != 0) goto L_0x0014
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.f56619a
            r6.add(r0)
            goto L_0x001c
        L_0x0014:
            com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.m79774q(r3, r4, r0)
            r6.add(r1)
        L_0x001b:
            int r4 = r4 + r0
        L_0x001c:
            if (r4 >= r5) goto L_0x004d
            int r0 = m79361I(r3, r4, r7)
            int r1 = r7.f56573a
            if (r2 == r1) goto L_0x0027
            goto L_0x004d
        L_0x0027:
            int r4 = m79361I(r3, r0, r7)
            int r0 = r7.f56573a
            if (r0 < 0) goto L_0x0048
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0043
            if (r0 != 0) goto L_0x003b
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.f56619a
            r6.add(r0)
            goto L_0x001c
        L_0x003b:
            com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.m79774q(r3, r4, r0)
            r6.add(r1)
            goto L_0x001b
        L_0x0043:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.m80767k()
            throw r2
        L_0x0048:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.m80763f()
            throw r2
        L_0x004d:
            return r4
        L_0x004e:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.m80767k()
            throw r2
        L_0x0053:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.m80763f()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ArrayDecoders.m79369c(int, byte[], int, int, com.google.protobuf.Internal$ProtobufList, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    /* renamed from: d */
    static double m79370d(byte[] bArr, int i) {
        return Double.longBitsToDouble(m79376j(bArr, i));
    }

    /* renamed from: e */
    static int m79371e(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, Registers registers) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        doubleArrayList.mo65087h(m79370d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = m79361I(bArr, i4, registers);
            if (i != registers.f56573a) {
                break;
            }
            doubleArrayList.mo65087h(m79370d(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01f4, code lost:
        r9 = r9 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ff, code lost:
        r9 = r9 + 8;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m79372f(int r7, byte[] r8, int r9, int r10, com.google.protobuf.GeneratedMessageLite.ExtendableMessage<?, ?> r11, com.google.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> r12, com.google.protobuf.UnknownFieldSchema<com.google.protobuf.UnknownFieldSetLite, com.google.protobuf.UnknownFieldSetLite> r13, com.google.protobuf.ArrayDecoders.Registers r14) throws java.io.IOException {
        /*
            com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r11.extensions
            int r7 = r7 >>> 3
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r1 = r12.f56921d
            boolean r1 = r1.mo65147u()
            r2 = 0
            if (r1 == 0) goto L_0x00fb
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r1 = r12.f56921d
            boolean r1 = r1.mo65144O()
            if (r1 == 0) goto L_0x00fb
            int[] r10 = com.google.protobuf.ArrayDecoders.C115561.f56572a
            com.google.protobuf.WireFormat$FieldType r1 = r12.mo65207a()
            int r1 = r1.ordinal()
            r10 = r10[r1]
            switch(r10) {
                case 1: goto L_0x00eb;
                case 2: goto L_0x00db;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00cb;
                case 5: goto L_0x00bb;
                case 6: goto L_0x00bb;
                case 7: goto L_0x00ab;
                case 8: goto L_0x00ab;
                case 9: goto L_0x009b;
                case 10: goto L_0x009b;
                case 11: goto L_0x008b;
                case 12: goto L_0x007b;
                case 13: goto L_0x006b;
                case 14: goto L_0x0041;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Type cannot be packed: "
            r8.append(r9)
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r12.f56921d
            com.google.protobuf.WireFormat$FieldType r9 = r9.mo65142D()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0041:
            com.google.protobuf.IntArrayList r10 = new com.google.protobuf.IntArrayList
            r10.<init>()
            int r8 = m79391y(r8, r9, r10, r14)
            com.google.protobuf.UnknownFieldSetLite r9 = r11.unknownFields
            com.google.protobuf.UnknownFieldSetLite r14 = com.google.protobuf.UnknownFieldSetLite.m81294c()
            if (r9 != r14) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r2 = r9
        L_0x0054:
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r12.f56921d
            com.google.protobuf.Internal$EnumLiteMap r9 = r9.mo65206d()
            java.lang.Object r7 = com.google.protobuf.SchemaUtil.m81201z(r7, r10, r9, r2, r13)
            com.google.protobuf.UnknownFieldSetLite r7 = (com.google.protobuf.UnknownFieldSetLite) r7
            if (r7 == 0) goto L_0x0064
            r11.unknownFields = r7
        L_0x0064:
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r7 = r12.f56921d
            r0.mo65141x(r7, r10)
            goto L_0x0234
        L_0x006b:
            com.google.protobuf.LongArrayList r7 = new com.google.protobuf.LongArrayList
            r7.<init>()
            int r8 = m79390x(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r12.f56921d
            r0.mo65141x(r9, r7)
            goto L_0x0234
        L_0x007b:
            com.google.protobuf.IntArrayList r7 = new com.google.protobuf.IntArrayList
            r7.<init>()
            int r8 = m79389w(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r12.f56921d
            r0.mo65141x(r9, r7)
            goto L_0x0234
        L_0x008b:
            com.google.protobuf.BooleanArrayList r7 = new com.google.protobuf.BooleanArrayList
            r7.<init>()
            int r8 = m79384r(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r12.f56921d
            r0.mo65141x(r9, r7)
            goto L_0x0234
        L_0x009b:
            com.google.protobuf.IntArrayList r7 = new com.google.protobuf.IntArrayList
            r7.<init>()
            int r8 = m79386t(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r12.f56921d
            r0.mo65141x(r9, r7)
            goto L_0x0234
        L_0x00ab:
            com.google.protobuf.LongArrayList r7 = new com.google.protobuf.LongArrayList
            r7.<init>()
            int r8 = m79387u(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r12.f56921d
            r0.mo65141x(r9, r7)
            goto L_0x0234
        L_0x00bb:
            com.google.protobuf.IntArrayList r7 = new com.google.protobuf.IntArrayList
            r7.<init>()
            int r8 = m79391y(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r12.f56921d
            r0.mo65141x(r9, r7)
            goto L_0x0234
        L_0x00cb:
            com.google.protobuf.LongArrayList r7 = new com.google.protobuf.LongArrayList
            r7.<init>()
            int r8 = m79392z(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r12.f56921d
            r0.mo65141x(r9, r7)
            goto L_0x0234
        L_0x00db:
            com.google.protobuf.FloatArrayList r7 = new com.google.protobuf.FloatArrayList
            r7.<init>()
            int r8 = m79388v(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r12.f56921d
            r0.mo65141x(r9, r7)
            goto L_0x0234
        L_0x00eb:
            com.google.protobuf.DoubleArrayList r7 = new com.google.protobuf.DoubleArrayList
            r7.<init>()
            int r8 = m79385s(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r12.f56921d
            r0.mo65141x(r9, r7)
            goto L_0x0234
        L_0x00fb:
            com.google.protobuf.WireFormat$FieldType r1 = r12.mo65207a()
            com.google.protobuf.WireFormat$FieldType r3 = com.google.protobuf.WireFormat.FieldType.ENUM
            if (r1 != r3) goto L_0x0131
            int r9 = m79361I(r8, r9, r14)
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = r12.f56921d
            com.google.protobuf.Internal$EnumLiteMap r8 = r8.mo65206d()
            int r10 = r14.f56573a
            com.google.protobuf.Internal$EnumLite r8 = r8.mo60053a(r10)
            if (r8 != 0) goto L_0x0129
            com.google.protobuf.UnknownFieldSetLite r8 = r11.unknownFields
            com.google.protobuf.UnknownFieldSetLite r10 = com.google.protobuf.UnknownFieldSetLite.m81294c()
            if (r8 != r10) goto L_0x0123
            com.google.protobuf.UnknownFieldSetLite r8 = com.google.protobuf.UnknownFieldSetLite.m81298j()
            r11.unknownFields = r8
        L_0x0123:
            int r10 = r14.f56573a
            com.google.protobuf.SchemaUtil.m81156L(r7, r10, r8, r13)
            return r9
        L_0x0129:
            int r7 = r14.f56573a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x0201
        L_0x0131:
            int[] r11 = com.google.protobuf.ArrayDecoders.C115561.f56572a
            com.google.protobuf.WireFormat$FieldType r13 = r12.mo65207a()
            int r13 = r13.ordinal()
            r11 = r11[r13]
            switch(r11) {
                case 1: goto L_0x01f7;
                case 2: goto L_0x01ec;
                case 3: goto L_0x01e1;
                case 4: goto L_0x01e1;
                case 5: goto L_0x01d6;
                case 6: goto L_0x01d6;
                case 7: goto L_0x01cd;
                case 8: goto L_0x01cd;
                case 9: goto L_0x01c4;
                case 10: goto L_0x01c4;
                case 11: goto L_0x01b0;
                case 12: goto L_0x01a1;
                case 13: goto L_0x0192;
                case 14: goto L_0x018a;
                case 15: goto L_0x0182;
                case 16: goto L_0x017a;
                case 17: goto L_0x015a;
                case 18: goto L_0x0142;
                default: goto L_0x0140;
            }
        L_0x0140:
            goto L_0x0201
        L_0x0142:
            com.google.protobuf.Protobuf r7 = com.google.protobuf.Protobuf.m81041a()
            com.google.protobuf.MessageLite r11 = r12.mo65208b()
            java.lang.Class r11 = r11.getClass()
            com.google.protobuf.Schema r7 = r7.mo65366d(r11)
            int r9 = m79382p(r7, r8, r9, r10, r14)
            java.lang.Object r2 = r14.f56575c
            goto L_0x0201
        L_0x015a:
            int r7 = r7 << 3
            r5 = r7 | 4
            com.google.protobuf.Protobuf r7 = com.google.protobuf.Protobuf.m81041a()
            com.google.protobuf.MessageLite r11 = r12.mo65208b()
            java.lang.Class r11 = r11.getClass()
            com.google.protobuf.Schema r1 = r7.mo65366d(r11)
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r14
            int r9 = m79380n(r1, r2, r3, r4, r5, r6)
            java.lang.Object r2 = r14.f56575c
            goto L_0x0201
        L_0x017a:
            int r9 = m79355C(r8, r9, r14)
            java.lang.Object r2 = r14.f56575c
            goto L_0x0201
        L_0x0182:
            int r9 = m79368b(r8, r9, r14)
            java.lang.Object r2 = r14.f56575c
            goto L_0x0201
        L_0x018a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Shouldn't reach here."
            r7.<init>(r8)
            throw r7
        L_0x0192:
            int r9 = m79364L(r8, r9, r14)
            long r7 = r14.f56574b
            long r7 = com.google.protobuf.CodedInputStream.m79833c(r7)
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            goto L_0x0201
        L_0x01a1:
            int r9 = m79361I(r8, r9, r14)
            int r7 = r14.f56573a
            int r7 = com.google.protobuf.CodedInputStream.m79832b(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x0201
        L_0x01b0:
            int r9 = m79364L(r8, r9, r14)
            long r7 = r14.f56574b
            r10 = 0
            int r13 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r13 == 0) goto L_0x01be
            r7 = 1
            goto L_0x01bf
        L_0x01be:
            r7 = 0
        L_0x01bf:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            goto L_0x0201
        L_0x01c4:
            int r7 = m79374h(r8, r9)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x01f4
        L_0x01cd:
            long r7 = m79376j(r8, r9)
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            goto L_0x01ff
        L_0x01d6:
            int r9 = m79361I(r8, r9, r14)
            int r7 = r14.f56573a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x0201
        L_0x01e1:
            int r9 = m79364L(r8, r9, r14)
            long r7 = r14.f56574b
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            goto L_0x0201
        L_0x01ec:
            float r7 = m79378l(r8, r9)
            java.lang.Float r2 = java.lang.Float.valueOf(r7)
        L_0x01f4:
            int r9 = r9 + 4
            goto L_0x0201
        L_0x01f7:
            double r7 = m79370d(r8, r9)
            java.lang.Double r2 = java.lang.Double.valueOf(r7)
        L_0x01ff:
            int r9 = r9 + 8
        L_0x0201:
            boolean r7 = r12.mo65210d()
            if (r7 == 0) goto L_0x020d
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r7 = r12.f56921d
            r0.mo65126a(r7, r2)
            goto L_0x0233
        L_0x020d:
            int[] r7 = com.google.protobuf.ArrayDecoders.C115561.f56572a
            com.google.protobuf.WireFormat$FieldType r8 = r12.mo65207a()
            int r8 = r8.ordinal()
            r7 = r7[r8]
            r8 = 17
            if (r7 == r8) goto L_0x0222
            r8 = 18
            if (r7 == r8) goto L_0x0222
            goto L_0x022e
        L_0x0222:
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r7 = r12.f56921d
            java.lang.Object r7 = r0.mo65132i(r7)
            if (r7 == 0) goto L_0x022e
            java.lang.Object r2 = com.google.protobuf.Internal.m80739h(r7, r2)
        L_0x022e:
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r7 = r12.f56921d
            r0.mo65141x(r7, r2)
        L_0x0233:
            r8 = r9
        L_0x0234:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ArrayDecoders.m79372f(int, byte[], int, int, com.google.protobuf.GeneratedMessageLite$ExtendableMessage, com.google.protobuf.GeneratedMessageLite$GeneratedExtension, com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    /* renamed from: g */
    static int m79373g(int i, byte[] bArr, int i2, int i3, Object obj, MessageLite messageLite, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws IOException {
        GeneratedMessageLite.GeneratedExtension a = registers.f56576d.mo65097a(messageLite, i >>> 3);
        if (a == null) {
            return m79359G(i, bArr, i2, i3, MessageSchema.m80974v(obj), registers);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.mo65203T();
        return m79372f(i, bArr, i2, i3, extendableMessage, a, unknownFieldSchema, registers);
    }

    /* renamed from: h */
    static int m79374h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    static int m79375i(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        intArrayList.mo65218h(m79374h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = m79361I(bArr, i4, registers);
            if (i != registers.f56573a) {
                break;
            }
            intArrayList.mo65218h(m79374h(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    /* renamed from: j */
    static long m79376j(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: k */
    static int m79377k(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        longArrayList.mo65308i(m79376j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = m79361I(bArr, i4, registers);
            if (i != registers.f56573a) {
                break;
            }
            longArrayList.mo65308i(m79376j(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    /* renamed from: l */
    static float m79378l(byte[] bArr, int i) {
        return Float.intBitsToFloat(m79374h(bArr, i));
    }

    /* renamed from: m */
    static int m79379m(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, Registers registers) {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        floatArrayList.mo65156h(m79378l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = m79361I(bArr, i4, registers);
            if (i != registers.f56573a) {
                break;
            }
            floatArrayList.mo65156h(m79378l(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    /* renamed from: n */
    static int m79380n(Schema schema, byte[] bArr, int i, int i2, int i3, Registers registers) throws IOException {
        MessageSchema messageSchema = (MessageSchema) schema;
        Object newInstance = messageSchema.newInstance();
        int c0 = messageSchema.mo65346c0(newInstance, bArr, i, i2, i3, registers);
        messageSchema.mo65348e(newInstance);
        registers.f56575c = newInstance;
        return c0;
    }

    /* renamed from: o */
    static int m79381o(Schema schema, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        int i4 = (i & -8) | 4;
        int n = m79380n(schema, bArr, i2, i3, i4, registers);
        protobufList.add(registers.f56575c);
        while (n < i3) {
            int I = m79361I(bArr, n, registers);
            if (i != registers.f56573a) {
                break;
            }
            n = m79380n(schema, bArr, I, i3, i4, registers);
            protobufList.add(registers.f56575c);
        }
        return n;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m79382p(com.google.protobuf.Schema r6, byte[] r7, int r8, int r9, com.google.protobuf.ArrayDecoders.Registers r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m79360H(r8, r7, r0, r10)
            int r8 = r10.f56573a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.newInstance()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo65352i(r1, r2, r3, r4, r5)
            r6.mo65348e(r9)
            r10.f56575c = r9
            return r8
        L_0x0025:
            com.google.protobuf.InvalidProtocolBufferException r6 = com.google.protobuf.InvalidProtocolBufferException.m80767k()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ArrayDecoders.m79382p(com.google.protobuf.Schema, byte[], int, int, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    /* renamed from: q */
    static int m79383q(Schema<?> schema, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        int p = m79382p(schema, bArr, i2, i3, registers);
        protobufList.add(registers.f56575c);
        while (p < i3) {
            int I = m79361I(bArr, p, registers);
            if (i != registers.f56573a) {
                break;
            }
            p = m79382p(schema, bArr, I, i3, registers);
            protobufList.add(registers.f56575c);
        }
        return p;
    }

    /* renamed from: r */
    static int m79384r(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int I = m79361I(bArr, i, registers);
        int i2 = registers.f56573a + I;
        while (I < i2) {
            I = m79364L(bArr, I, registers);
            booleanArrayList.mo64893i(registers.f56574b != 0);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m80767k();
    }

    /* renamed from: s */
    static int m79385s(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        int I = m79361I(bArr, i, registers);
        int i2 = registers.f56573a + I;
        while (I < i2) {
            doubleArrayList.mo65087h(m79370d(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m80767k();
    }

    /* renamed from: t */
    static int m79386t(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int I = m79361I(bArr, i, registers);
        int i2 = registers.f56573a + I;
        while (I < i2) {
            intArrayList.mo65218h(m79374h(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m80767k();
    }

    /* renamed from: u */
    static int m79387u(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int I = m79361I(bArr, i, registers);
        int i2 = registers.f56573a + I;
        while (I < i2) {
            longArrayList.mo65308i(m79376j(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m80767k();
    }

    /* renamed from: v */
    static int m79388v(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        int I = m79361I(bArr, i, registers);
        int i2 = registers.f56573a + I;
        while (I < i2) {
            floatArrayList.mo65156h(m79378l(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m80767k();
    }

    /* renamed from: w */
    static int m79389w(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int I = m79361I(bArr, i, registers);
        int i2 = registers.f56573a + I;
        while (I < i2) {
            I = m79361I(bArr, I, registers);
            intArrayList.mo65218h(CodedInputStream.m79832b(registers.f56573a));
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m80767k();
    }

    /* renamed from: x */
    static int m79390x(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int I = m79361I(bArr, i, registers);
        int i2 = registers.f56573a + I;
        while (I < i2) {
            I = m79364L(bArr, I, registers);
            longArrayList.mo65308i(CodedInputStream.m79833c(registers.f56574b));
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m80767k();
    }

    /* renamed from: y */
    static int m79391y(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int I = m79361I(bArr, i, registers);
        int i2 = registers.f56573a + I;
        while (I < i2) {
            I = m79361I(bArr, I, registers);
            intArrayList.mo65218h(registers.f56573a);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m80767k();
    }

    /* renamed from: z */
    static int m79392z(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int I = m79361I(bArr, i, registers);
        int i2 = registers.f56573a + I;
        while (I < i2) {
            I = m79364L(bArr, I, registers);
            longArrayList.mo65308i(registers.f56574b);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.m80767k();
    }

    static final class Registers {

        /* renamed from: a */
        public int f56573a;

        /* renamed from: b */
        public long f56574b;

        /* renamed from: c */
        public Object f56575c;

        /* renamed from: d */
        public final ExtensionRegistryLite f56576d;

        Registers() {
            this.f56576d = ExtensionRegistryLite.m80520b();
        }

        Registers(ExtensionRegistryLite extensionRegistryLite) {
            Objects.requireNonNull(extensionRegistryLite);
            this.f56576d = extensionRegistryLite;
        }
    }
}
