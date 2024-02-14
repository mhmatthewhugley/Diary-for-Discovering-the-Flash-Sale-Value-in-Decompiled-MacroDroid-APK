package com.google.protobuf;

import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

abstract class BinaryReader implements Reader {

    /* renamed from: com.google.protobuf.BinaryReader$1 */
    static /* synthetic */ class C115571 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56577a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56577a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f56577a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.BinaryReader.C115571.<clinit>():void");
        }
    }

    private static final class SafeHeapReader extends BinaryReader {

        /* renamed from: a */
        private final boolean f56578a;

        /* renamed from: b */
        private final byte[] f56579b;

        /* renamed from: c */
        private int f56580c;

        /* renamed from: d */
        private final int f56581d;

        /* renamed from: e */
        private int f56582e;

        /* renamed from: f */
        private int f56583f;

        /* renamed from: g */
        private int f56584g;

        public SafeHeapReader(ByteBuffer byteBuffer, boolean z) {
            super((C115571) null);
            this.f56578a = z;
            this.f56579b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f56580c = arrayOffset;
            this.f56581d = arrayOffset;
            this.f56582e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: R */
        private boolean m79394R() {
            return this.f56580c == this.f56582e;
        }

        /* renamed from: S */
        private byte m79395S() throws IOException {
            int i = this.f56580c;
            if (i != this.f56582e) {
                byte[] bArr = this.f56579b;
                this.f56580c = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m80767k();
        }

        /* renamed from: T */
        private Object m79396T(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            switch (C115571.f56577a[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(mo64790f());
                case 2:
                    return mo64805s();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(mo64797m());
                case 5:
                    return Integer.valueOf(mo64812z());
                case 6:
                    return Long.valueOf(mo64784b());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(mo64806t());
                case 9:
                    return Long.valueOf(mo64780O());
                case 10:
                    return mo64811y(cls, extensionRegistryLite);
                case 11:
                    return Integer.valueOf(mo64777L());
                case 12:
                    return Long.valueOf(mo64792h());
                case 13:
                    return Integer.valueOf(mo64798n());
                case 14:
                    return Long.valueOf(mo64770E());
                case 15:
                    return mo64781P();
                case 16:
                    return Integer.valueOf(mo64794j());
                case 17:
                    return Long.valueOf(mo64809w());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* renamed from: U */
        private <T> T m79397U(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i = this.f56584g;
            this.f56584g = WireFormat.m81549c(WireFormat.m81547a(this.f56583f), 4);
            try {
                T newInstance = schema.newInstance();
                schema.mo65351h(newInstance, this, extensionRegistryLite);
                schema.mo65348e(newInstance);
                if (this.f56583f == this.f56584g) {
                    return newInstance;
                }
                throw InvalidProtocolBufferException.m80764g();
            } finally {
                this.f56584g = i;
            }
        }

        /* renamed from: V */
        private int m79398V() throws IOException {
            m79405f0(4);
            return m79399W();
        }

        /* renamed from: W */
        private int m79399W() {
            int i = this.f56580c;
            byte[] bArr = this.f56579b;
            this.f56580c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: X */
        private long m79400X() throws IOException {
            m79405f0(8);
            return m79401Y();
        }

        /* renamed from: Y */
        private long m79401Y() {
            int i = this.f56580c;
            byte[] bArr = this.f56579b;
            this.f56580c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: Z */
        private <T> T m79402Z(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int c0 = m79403c0();
            m79405f0(c0);
            int i = this.f56582e;
            int i2 = this.f56580c + c0;
            this.f56582e = i2;
            try {
                T newInstance = schema.newInstance();
                schema.mo65351h(newInstance, this, extensionRegistryLite);
                schema.mo65348e(newInstance);
                if (this.f56580c == i2) {
                    return newInstance;
                }
                throw InvalidProtocolBufferException.m80764g();
            } finally {
                this.f56582e = i;
            }
        }

        /* renamed from: c0 */
        private int m79403c0() throws IOException {
            byte b;
            int i = this.f56580c;
            int i2 = this.f56582e;
            if (i2 != i) {
                byte[] bArr = this.f56579b;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f56580c = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) m79404e0();
                } else {
                    int i4 = i3 + 1;
                    byte b3 = b2 ^ (bArr[i3] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i5 = i4 + 1;
                        byte b4 = b3 ^ (bArr[i4] << 14);
                        if (b4 >= 0) {
                            b = b4 ^ 16256;
                        } else {
                            i4 = i5 + 1;
                            byte b5 = b4 ^ (bArr[i5] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                i5 = i4 + 1;
                                byte b6 = bArr[i4];
                                b = (b5 ^ (b6 << 28)) ^ 266354560;
                                if (b6 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw InvalidProtocolBufferException.m80762e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.f56580c = i4;
                    return b;
                }
            } else {
                throw InvalidProtocolBufferException.m80767k();
            }
        }

        /* renamed from: e0 */
        private long m79404e0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte S = m79395S();
                j |= ((long) (S & Byte.MAX_VALUE)) << i;
                if ((S & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m80762e();
        }

        /* renamed from: f0 */
        private void m79405f0(int i) throws IOException {
            if (i < 0 || i > this.f56582e - this.f56580c) {
                throw InvalidProtocolBufferException.m80767k();
            }
        }

        /* renamed from: g0 */
        private void m79406g0(int i) throws IOException {
            if (this.f56580c != i) {
                throw InvalidProtocolBufferException.m80767k();
            }
        }

        /* renamed from: h0 */
        private void m79407h0(int i) throws IOException {
            if (WireFormat.m81548b(this.f56583f) != i) {
                throw InvalidProtocolBufferException.m80761d();
            }
        }

        /* renamed from: i0 */
        private void m79408i0(int i) throws IOException {
            m79405f0(i);
            this.f56580c += i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* renamed from: j0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m79409j0() throws java.io.IOException {
            /*
                r3 = this;
                int r0 = r3.f56584g
                int r1 = r3.f56583f
                int r1 = com.google.protobuf.WireFormat.m81547a(r1)
                r2 = 4
                int r1 = com.google.protobuf.WireFormat.m81549c(r1, r2)
                r3.f56584g = r1
            L_0x000f:
                int r1 = r3.mo64772G()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.mo64776K()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f56583f
                int r2 = r3.f56584g
                if (r1 != r2) goto L_0x0027
                r3.f56584g = r0
                return
            L_0x0027:
                com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.m80764g()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.BinaryReader.SafeHeapReader.m79409j0():void");
        }

        /* renamed from: k0 */
        private void m79410k0() throws IOException {
            int i = this.f56582e;
            int i2 = this.f56580c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f56579b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f56580c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            m79411l0();
        }

        /* renamed from: l0 */
        private void m79411l0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (m79395S() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m80762e();
        }

        /* renamed from: m0 */
        private void m79412m0(int i) throws IOException {
            m79405f0(i);
            if ((i & 3) != 0) {
                throw InvalidProtocolBufferException.m80764g();
            }
        }

        /* renamed from: n0 */
        private void m79413n0(int i) throws IOException {
            m79405f0(i);
            if ((i & 7) != 0) {
                throw InvalidProtocolBufferException.m80764g();
            }
        }

        /* renamed from: A */
        public <T> T mo64766A(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            m79407h0(3);
            return m79397U(schema, extensionRegistryLite);
        }

        /* renamed from: B */
        public void mo64767B(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int b = WireFormat.m81548b(this.f56583f);
                if (b == 1) {
                    do {
                        longArrayList.mo65308i(mo64792h());
                        if (!m79394R()) {
                            i2 = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i2;
                } else if (b == 2) {
                    int c0 = m79403c0();
                    m79413n0(c0);
                    int i3 = this.f56580c + c0;
                    while (this.f56580c < i3) {
                        longArrayList.mo65308i(m79401Y());
                    }
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            } else {
                int b2 = WireFormat.m81548b(this.f56583f);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo64792h()));
                        if (!m79394R()) {
                            i = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i;
                } else if (b2 == 2) {
                    int c02 = m79403c0();
                    m79413n0(c02);
                    int i4 = this.f56580c + c02;
                    while (this.f56580c < i4) {
                        list.add(Long.valueOf(m79401Y()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            }
        }

        /* renamed from: C */
        public void mo64768C(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int b = WireFormat.m81548b(this.f56583f);
                if (b == 0) {
                    do {
                        intArrayList.mo65218h(mo64806t());
                        if (!m79394R()) {
                            i2 = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i2;
                } else if (b == 2) {
                    int c0 = this.f56580c + m79403c0();
                    while (this.f56580c < c0) {
                        intArrayList.mo65218h(m79403c0());
                    }
                    m79406g0(c0);
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            } else {
                int b2 = WireFormat.m81548b(this.f56583f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo64806t()));
                        if (!m79394R()) {
                            i = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i;
                } else if (b2 == 2) {
                    int c02 = this.f56580c + m79403c0();
                    while (this.f56580c < c02) {
                        list.add(Integer.valueOf(m79403c0()));
                    }
                    m79406g0(c02);
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            }
        }

        /* renamed from: D */
        public void mo64769D(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int b = WireFormat.m81548b(this.f56583f);
                if (b == 2) {
                    int c0 = m79403c0();
                    m79412m0(c0);
                    int i3 = this.f56580c + c0;
                    while (this.f56580c < i3) {
                        intArrayList.mo65218h(m79399W());
                    }
                } else if (b == 5) {
                    do {
                        intArrayList.mo65218h(mo64812z());
                        if (!m79394R()) {
                            i2 = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i2;
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            } else {
                int b2 = WireFormat.m81548b(this.f56583f);
                if (b2 == 2) {
                    int c02 = m79403c0();
                    m79412m0(c02);
                    int i4 = this.f56580c + c02;
                    while (this.f56580c < i4) {
                        list.add(Integer.valueOf(m79399W()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo64812z()));
                        if (!m79394R()) {
                            i = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i;
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            }
        }

        /* renamed from: E */
        public long mo64770E() throws IOException {
            m79407h0(0);
            return CodedInputStream.m79833c(mo64788d0());
        }

        /* renamed from: F */
        public String mo64771F() throws IOException {
            return mo64783a0(false);
        }

        /* renamed from: G */
        public int mo64772G() throws IOException {
            if (m79394R()) {
                return Integer.MAX_VALUE;
            }
            int c0 = m79403c0();
            this.f56583f = c0;
            if (c0 == this.f56584g) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.m81547a(c0);
        }

        /* renamed from: H */
        public void mo64773H(List<String> list) throws IOException {
            mo64785b0(list, false);
        }

        /* renamed from: I */
        public <T> T mo64774I(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            m79407h0(2);
            return m79402Z(schema, extensionRegistryLite);
        }

        /* renamed from: J */
        public void mo64775J(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof FloatArrayList) {
                FloatArrayList floatArrayList = (FloatArrayList) list;
                int b = WireFormat.m81548b(this.f56583f);
                if (b == 2) {
                    int c0 = m79403c0();
                    m79412m0(c0);
                    int i3 = this.f56580c + c0;
                    while (this.f56580c < i3) {
                        floatArrayList.mo65156h(Float.intBitsToFloat(m79399W()));
                    }
                } else if (b == 5) {
                    do {
                        floatArrayList.mo65156h(readFloat());
                        if (!m79394R()) {
                            i2 = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i2;
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            } else {
                int b2 = WireFormat.m81548b(this.f56583f);
                if (b2 == 2) {
                    int c02 = m79403c0();
                    m79412m0(c02);
                    int i4 = this.f56580c + c02;
                    while (this.f56580c < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(m79399W())));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!m79394R()) {
                            i = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i;
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            }
        }

        /* renamed from: K */
        public boolean mo64776K() throws IOException {
            int i;
            if (m79394R() || (i = this.f56583f) == this.f56584g) {
                return false;
            }
            int b = WireFormat.m81548b(i);
            if (b == 0) {
                m79410k0();
                return true;
            } else if (b == 1) {
                m79408i0(8);
                return true;
            } else if (b == 2) {
                m79408i0(m79403c0());
                return true;
            } else if (b == 3) {
                m79409j0();
                return true;
            } else if (b == 5) {
                m79408i0(4);
                return true;
            } else {
                throw InvalidProtocolBufferException.m80761d();
            }
        }

        /* renamed from: L */
        public int mo64777L() throws IOException {
            m79407h0(5);
            return m79398V();
        }

        /* renamed from: M */
        public void mo64778M(List<ByteString> list) throws IOException {
            int i;
            if (WireFormat.m81548b(this.f56583f) == 2) {
                do {
                    list.add(mo64805s());
                    if (!m79394R()) {
                        i = this.f56580c;
                    } else {
                        return;
                    }
                } while (m79403c0() == this.f56583f);
                this.f56580c = i;
                return;
            }
            throw InvalidProtocolBufferException.m80761d();
        }

        /* renamed from: N */
        public void mo64779N(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof DoubleArrayList) {
                DoubleArrayList doubleArrayList = (DoubleArrayList) list;
                int b = WireFormat.m81548b(this.f56583f);
                if (b == 1) {
                    do {
                        doubleArrayList.mo65087h(readDouble());
                        if (!m79394R()) {
                            i2 = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i2;
                } else if (b == 2) {
                    int c0 = m79403c0();
                    m79413n0(c0);
                    int i3 = this.f56580c + c0;
                    while (this.f56580c < i3) {
                        doubleArrayList.mo65087h(Double.longBitsToDouble(m79401Y()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            } else {
                int b2 = WireFormat.m81548b(this.f56583f);
                if (b2 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!m79394R()) {
                            i = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i;
                } else if (b2 == 2) {
                    int c02 = m79403c0();
                    m79413n0(c02);
                    int i4 = this.f56580c + c02;
                    while (this.f56580c < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(m79401Y())));
                    }
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            }
        }

        /* renamed from: O */
        public long mo64780O() throws IOException {
            m79407h0(0);
            return mo64788d0();
        }

        /* renamed from: P */
        public String mo64781P() throws IOException {
            return mo64783a0(true);
        }

        /* renamed from: a */
        public int mo64782a() {
            return this.f56583f;
        }

        /* renamed from: a0 */
        public String mo64783a0(boolean z) throws IOException {
            m79407h0(2);
            int c0 = m79403c0();
            if (c0 == 0) {
                return "";
            }
            m79405f0(c0);
            if (z) {
                byte[] bArr = this.f56579b;
                int i = this.f56580c;
                if (!Utf8.m81487u(bArr, i, i + c0)) {
                    throw InvalidProtocolBufferException.m80760c();
                }
            }
            String str = new String(this.f56579b, this.f56580c, c0, Internal.f56935a);
            this.f56580c += c0;
            return str;
        }

        /* renamed from: b */
        public long mo64784b() throws IOException {
            m79407h0(1);
            return m79400X();
        }

        /* renamed from: b0 */
        public void mo64785b0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (WireFormat.m81548b(this.f56583f) != 2) {
                throw InvalidProtocolBufferException.m80761d();
            } else if (!(list instanceof LazyStringList) || z) {
                do {
                    list.add(mo64783a0(z));
                    if (!m79394R()) {
                        i = this.f56580c;
                    } else {
                        return;
                    }
                } while (m79403c0() == this.f56583f);
                this.f56580c = i;
            } else {
                LazyStringList lazyStringList = (LazyStringList) list;
                do {
                    lazyStringList.mo65272Z(mo64805s());
                    if (!m79394R()) {
                        i2 = this.f56580c;
                    } else {
                        return;
                    }
                } while (m79403c0() == this.f56583f);
                this.f56580c = i2;
            }
        }

        /* renamed from: c */
        public void mo64786c(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int b = WireFormat.m81548b(this.f56583f);
                if (b == 2) {
                    int c0 = m79403c0();
                    m79412m0(c0);
                    int i3 = this.f56580c + c0;
                    while (this.f56580c < i3) {
                        intArrayList.mo65218h(m79399W());
                    }
                } else if (b == 5) {
                    do {
                        intArrayList.mo65218h(mo64777L());
                        if (!m79394R()) {
                            i2 = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i2;
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            } else {
                int b2 = WireFormat.m81548b(this.f56583f);
                if (b2 == 2) {
                    int c02 = m79403c0();
                    m79412m0(c02);
                    int i4 = this.f56580c + c02;
                    while (this.f56580c < i4) {
                        list.add(Integer.valueOf(m79399W()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo64777L()));
                        if (!m79394R()) {
                            i = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i;
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            }
        }

        /* renamed from: d */
        public void mo64787d(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int b = WireFormat.m81548b(this.f56583f);
                if (b == 0) {
                    do {
                        longArrayList.mo65308i(mo64770E());
                        if (!m79394R()) {
                            i2 = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i2;
                } else if (b == 2) {
                    int c0 = this.f56580c + m79403c0();
                    while (this.f56580c < c0) {
                        longArrayList.mo65308i(CodedInputStream.m79833c(mo64788d0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            } else {
                int b2 = WireFormat.m81548b(this.f56583f);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo64770E()));
                        if (!m79394R()) {
                            i = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i;
                } else if (b2 == 2) {
                    int c02 = this.f56580c + m79403c0();
                    while (this.f56580c < c02) {
                        list.add(Long.valueOf(CodedInputStream.m79833c(mo64788d0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            }
        }

        /* renamed from: d0 */
        public long mo64788d0() throws IOException {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f56580c;
            int i3 = this.f56582e;
            if (i3 != i2) {
                byte[] bArr = this.f56579b;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f56580c = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return m79404e0();
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << 14);
                        if (b4 >= 0) {
                            i = i6;
                            j = (long) (b4 ^ 16256);
                        } else {
                            i5 = i6 + 1;
                            byte b5 = b4 ^ (bArr[i6] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                long j4 = (long) b5;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw InvalidProtocolBufferException.m80762e();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.f56580c = i;
                        return j;
                    }
                    j = (long) b;
                    this.f56580c = i;
                    return j;
                }
            } else {
                throw InvalidProtocolBufferException.m80767k();
            }
        }

        /* renamed from: e */
        public <T> void mo64789e(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i;
            if (WireFormat.m81548b(this.f56583f) == 3) {
                int i2 = this.f56583f;
                do {
                    list.add(m79397U(schema, extensionRegistryLite));
                    if (!m79394R()) {
                        i = this.f56580c;
                    } else {
                        return;
                    }
                } while (m79403c0() == i2);
                this.f56580c = i;
                return;
            }
            throw InvalidProtocolBufferException.m80761d();
        }

        /* renamed from: f */
        public boolean mo64790f() throws IOException {
            m79407h0(0);
            if (m79403c0() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public <T> void mo64791g(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i;
            if (WireFormat.m81548b(this.f56583f) == 2) {
                int i2 = this.f56583f;
                do {
                    list.add(m79402Z(schema, extensionRegistryLite));
                    if (!m79394R()) {
                        i = this.f56580c;
                    } else {
                        return;
                    }
                } while (m79403c0() == i2);
                this.f56580c = i;
                return;
            }
            throw InvalidProtocolBufferException.m80761d();
        }

        /* renamed from: h */
        public long mo64792h() throws IOException {
            m79407h0(1);
            return m79400X();
        }

        /* renamed from: i */
        public void mo64793i(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int b = WireFormat.m81548b(this.f56583f);
                if (b == 0) {
                    do {
                        longArrayList.mo65308i(mo64809w());
                        if (!m79394R()) {
                            i2 = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i2;
                } else if (b == 2) {
                    int c0 = this.f56580c + m79403c0();
                    while (this.f56580c < c0) {
                        longArrayList.mo65308i(mo64788d0());
                    }
                    m79406g0(c0);
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            } else {
                int b2 = WireFormat.m81548b(this.f56583f);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo64809w()));
                        if (!m79394R()) {
                            i = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i;
                } else if (b2 == 2) {
                    int c02 = this.f56580c + m79403c0();
                    while (this.f56580c < c02) {
                        list.add(Long.valueOf(mo64788d0()));
                    }
                    m79406g0(c02);
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            }
        }

        /* renamed from: j */
        public int mo64794j() throws IOException {
            m79407h0(0);
            return m79403c0();
        }

        /* renamed from: k */
        public void mo64795k(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int b = WireFormat.m81548b(this.f56583f);
                if (b == 0) {
                    do {
                        longArrayList.mo65308i(mo64780O());
                        if (!m79394R()) {
                            i2 = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i2;
                } else if (b == 2) {
                    int c0 = this.f56580c + m79403c0();
                    while (this.f56580c < c0) {
                        longArrayList.mo65308i(mo64788d0());
                    }
                    m79406g0(c0);
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            } else {
                int b2 = WireFormat.m81548b(this.f56583f);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo64780O()));
                        if (!m79394R()) {
                            i = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i;
                } else if (b2 == 2) {
                    int c02 = this.f56580c + m79403c0();
                    while (this.f56580c < c02) {
                        list.add(Long.valueOf(mo64788d0()));
                    }
                    m79406g0(c02);
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            }
        }

        /* renamed from: l */
        public void mo64796l(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int b = WireFormat.m81548b(this.f56583f);
                if (b == 0) {
                    do {
                        intArrayList.mo65218h(mo64797m());
                        if (!m79394R()) {
                            i2 = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i2;
                } else if (b == 2) {
                    int c0 = this.f56580c + m79403c0();
                    while (this.f56580c < c0) {
                        intArrayList.mo65218h(m79403c0());
                    }
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            } else {
                int b2 = WireFormat.m81548b(this.f56583f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo64797m()));
                        if (!m79394R()) {
                            i = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i;
                } else if (b2 == 2) {
                    int c02 = this.f56580c + m79403c0();
                    while (this.f56580c < c02) {
                        list.add(Integer.valueOf(m79403c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            }
        }

        /* renamed from: m */
        public int mo64797m() throws IOException {
            m79407h0(0);
            return m79403c0();
        }

        /* renamed from: n */
        public int mo64798n() throws IOException {
            m79407h0(0);
            return CodedInputStream.m79832b(m79403c0());
        }

        /* renamed from: o */
        public void mo64799o(List<Boolean> list) throws IOException {
            int i;
            int i2;
            if (list instanceof BooleanArrayList) {
                BooleanArrayList booleanArrayList = (BooleanArrayList) list;
                int b = WireFormat.m81548b(this.f56583f);
                if (b == 0) {
                    do {
                        booleanArrayList.mo64893i(mo64790f());
                        if (!m79394R()) {
                            i2 = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i2;
                } else if (b == 2) {
                    int c0 = this.f56580c + m79403c0();
                    while (this.f56580c < c0) {
                        booleanArrayList.mo64893i(m79403c0() != 0);
                    }
                    m79406g0(c0);
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            } else {
                int b2 = WireFormat.m81548b(this.f56583f);
                if (b2 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo64790f()));
                        if (!m79394R()) {
                            i = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i;
                } else if (b2 == 2) {
                    int c02 = this.f56580c + m79403c0();
                    while (this.f56580c < c02) {
                        list.add(Boolean.valueOf(m79403c0() != 0));
                    }
                    m79406g0(c02);
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            }
        }

        /* renamed from: p */
        public <T> T mo64800p(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            m79407h0(3);
            return m79397U(Protobuf.m81041a().mo65366d(cls), extensionRegistryLite);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (mo64776K() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
            throw new com.google.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <K, V> void mo64801q(java.util.Map<K, V> r8, com.google.protobuf.MapEntryLite.Metadata<K, V> r9, com.google.protobuf.ExtensionRegistryLite r10) throws java.io.IOException {
            /*
                r7 = this;
                r0 = 2
                r7.m79407h0(r0)
                int r1 = r7.m79403c0()
                r7.m79405f0(r1)
                int r2 = r7.f56582e
                int r3 = r7.f56580c
                int r3 = r3 + r1
                r7.f56582e = r3
                K r1 = r9.f57000b     // Catch:{ all -> 0x005b }
                V r3 = r9.f57002d     // Catch:{ all -> 0x005b }
            L_0x0016:
                int r4 = r7.mo64772G()     // Catch:{ all -> 0x005b }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0025
                r8.put(r1, r3)     // Catch:{ all -> 0x005b }
                r7.f56582e = r2
                return
            L_0x0025:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0046
                if (r4 == r0) goto L_0x0039
                boolean r4 = r7.mo64776K()     // Catch:{ InvalidWireTypeException -> 0x004e }
                if (r4 == 0) goto L_0x0033
                goto L_0x0016
            L_0x0033:
                com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004e }
                r4.<init>(r6)     // Catch:{ InvalidWireTypeException -> 0x004e }
                throw r4     // Catch:{ InvalidWireTypeException -> 0x004e }
            L_0x0039:
                com.google.protobuf.WireFormat$FieldType r4 = r9.f57001c     // Catch:{ InvalidWireTypeException -> 0x004e }
                V r5 = r9.f57002d     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Object r3 = r7.m79396T(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x0046:
                com.google.protobuf.WireFormat$FieldType r4 = r9.f56999a     // Catch:{ InvalidWireTypeException -> 0x004e }
                r5 = 0
                java.lang.Object r1 = r7.m79396T(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x004e:
                boolean r4 = r7.mo64776K()     // Catch:{ all -> 0x005b }
                if (r4 == 0) goto L_0x0055
                goto L_0x0016
            L_0x0055:
                com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x005b }
                r8.<init>(r6)     // Catch:{ all -> 0x005b }
                throw r8     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                r7.f56582e = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.BinaryReader.SafeHeapReader.mo64801q(java.util.Map, com.google.protobuf.MapEntryLite$Metadata, com.google.protobuf.ExtensionRegistryLite):void");
        }

        /* renamed from: r */
        public void mo64802r(List<String> list) throws IOException {
            mo64785b0(list, true);
        }

        public double readDouble() throws IOException {
            m79407h0(1);
            return Double.longBitsToDouble(m79400X());
        }

        public float readFloat() throws IOException {
            m79407h0(5);
            return Float.intBitsToFloat(m79398V());
        }

        /* renamed from: s */
        public ByteString mo64805s() throws IOException {
            ByteString byteString;
            m79407h0(2);
            int c0 = m79403c0();
            if (c0 == 0) {
                return ByteString.f56619a;
            }
            m79405f0(c0);
            if (this.f56578a) {
                byteString = ByteString.m79767g0(this.f56579b, this.f56580c, c0);
            } else {
                byteString = ByteString.m79774q(this.f56579b, this.f56580c, c0);
            }
            this.f56580c += c0;
            return byteString;
        }

        /* renamed from: t */
        public int mo64806t() throws IOException {
            m79407h0(0);
            return m79403c0();
        }

        /* renamed from: u */
        public void mo64807u(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int b = WireFormat.m81548b(this.f56583f);
                if (b == 1) {
                    do {
                        longArrayList.mo65308i(mo64784b());
                        if (!m79394R()) {
                            i2 = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i2;
                } else if (b == 2) {
                    int c0 = m79403c0();
                    m79413n0(c0);
                    int i3 = this.f56580c + c0;
                    while (this.f56580c < i3) {
                        longArrayList.mo65308i(m79401Y());
                    }
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            } else {
                int b2 = WireFormat.m81548b(this.f56583f);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo64784b()));
                        if (!m79394R()) {
                            i = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i;
                } else if (b2 == 2) {
                    int c02 = m79403c0();
                    m79413n0(c02);
                    int i4 = this.f56580c + c02;
                    while (this.f56580c < i4) {
                        list.add(Long.valueOf(m79401Y()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            }
        }

        /* renamed from: v */
        public void mo64808v(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int b = WireFormat.m81548b(this.f56583f);
                if (b == 0) {
                    do {
                        intArrayList.mo65218h(mo64798n());
                        if (!m79394R()) {
                            i2 = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i2;
                } else if (b == 2) {
                    int c0 = this.f56580c + m79403c0();
                    while (this.f56580c < c0) {
                        intArrayList.mo65218h(CodedInputStream.m79832b(m79403c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            } else {
                int b2 = WireFormat.m81548b(this.f56583f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo64798n()));
                        if (!m79394R()) {
                            i = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i;
                } else if (b2 == 2) {
                    int c02 = this.f56580c + m79403c0();
                    while (this.f56580c < c02) {
                        list.add(Integer.valueOf(CodedInputStream.m79832b(m79403c0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            }
        }

        /* renamed from: w */
        public long mo64809w() throws IOException {
            m79407h0(0);
            return mo64788d0();
        }

        /* renamed from: x */
        public void mo64810x(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int b = WireFormat.m81548b(this.f56583f);
                if (b == 0) {
                    do {
                        intArrayList.mo65218h(mo64794j());
                        if (!m79394R()) {
                            i2 = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i2;
                } else if (b == 2) {
                    int c0 = this.f56580c + m79403c0();
                    while (this.f56580c < c0) {
                        intArrayList.mo65218h(m79403c0());
                    }
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            } else {
                int b2 = WireFormat.m81548b(this.f56583f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo64794j()));
                        if (!m79394R()) {
                            i = this.f56580c;
                        } else {
                            return;
                        }
                    } while (m79403c0() == this.f56583f);
                    this.f56580c = i;
                } else if (b2 == 2) {
                    int c02 = this.f56580c + m79403c0();
                    while (this.f56580c < c02) {
                        list.add(Integer.valueOf(m79403c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m80761d();
                }
            }
        }

        /* renamed from: y */
        public <T> T mo64811y(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            m79407h0(2);
            return m79402Z(Protobuf.m81041a().mo65366d(cls), extensionRegistryLite);
        }

        /* renamed from: z */
        public int mo64812z() throws IOException {
            m79407h0(5);
            return m79398V();
        }
    }

    private BinaryReader() {
    }

    /* synthetic */ BinaryReader(C115571 r1) {
        this();
    }

    /* renamed from: Q */
    public static BinaryReader m79393Q(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new SafeHeapReader(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
