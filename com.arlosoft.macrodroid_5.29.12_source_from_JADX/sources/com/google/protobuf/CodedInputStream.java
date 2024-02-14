package com.google.protobuf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class CodedInputStream {

    /* renamed from: a */
    int f56634a;

    /* renamed from: b */
    int f56635b;

    /* renamed from: c */
    int f56636c;

    /* renamed from: d */
    CodedInputStreamReader f56637d;

    /* renamed from: e */
    private boolean f56638e;

    private static final class ArrayDecoder extends CodedInputStream {

        /* renamed from: f */
        private final byte[] f56639f;

        /* renamed from: g */
        private final boolean f56640g;

        /* renamed from: h */
        private int f56641h;

        /* renamed from: i */
        private int f56642i;

        /* renamed from: j */
        private int f56643j;

        /* renamed from: k */
        private int f56644k;

        /* renamed from: l */
        private int f56645l;

        /* renamed from: m */
        private boolean f56646m;

        /* renamed from: n */
        private int f56647n;

        /* renamed from: O */
        private void m79865O() {
            int i = this.f56641h + this.f56642i;
            this.f56641h = i;
            int i2 = i - this.f56644k;
            int i3 = this.f56647n;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f56642i = i4;
                this.f56641h = i - i4;
                return;
            }
            this.f56642i = 0;
        }

        /* renamed from: R */
        private void m79866R() throws IOException {
            if (this.f56641h - this.f56643j >= 10) {
                m79867S();
            } else {
                m79868T();
            }
        }

        /* renamed from: S */
        private void m79867S() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f56639f;
                int i2 = this.f56643j;
                this.f56643j = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m80762e();
        }

        /* renamed from: T */
        private void m79868T() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo64976H() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m80762e();
        }

        /* renamed from: A */
        public String mo64951A() throws IOException {
            int L = mo64980L();
            if (L > 0) {
                int i = this.f56641h;
                int i2 = this.f56643j;
                if (L <= i - i2) {
                    String str = new String(this.f56639f, i2, L, Internal.f56935a);
                    this.f56643j += L;
                    return str;
                }
            }
            if (L == 0) {
                return "";
            }
            if (L < 0) {
                throw InvalidProtocolBufferException.m80763f();
            }
            throw InvalidProtocolBufferException.m80767k();
        }

        /* renamed from: B */
        public String mo64952B() throws IOException {
            int L = mo64980L();
            if (L > 0) {
                int i = this.f56641h;
                int i2 = this.f56643j;
                if (L <= i - i2) {
                    String h = Utf8.m81474h(this.f56639f, i2, L);
                    this.f56643j += L;
                    return h;
                }
            }
            if (L == 0) {
                return "";
            }
            if (L <= 0) {
                throw InvalidProtocolBufferException.m80763f();
            }
            throw InvalidProtocolBufferException.m80767k();
        }

        /* renamed from: C */
        public int mo64953C() throws IOException {
            if (mo64960e()) {
                this.f56645l = 0;
                return 0;
            }
            int L = mo64980L();
            this.f56645l = L;
            if (WireFormat.m81547a(L) != 0) {
                return this.f56645l;
            }
            throw InvalidProtocolBufferException.m80759b();
        }

        /* renamed from: D */
        public int mo64954D() throws IOException {
            return mo64980L();
        }

        /* renamed from: E */
        public long mo64955E() throws IOException {
            return mo64981M();
        }

        /* renamed from: G */
        public boolean mo64957G(int i) throws IOException {
            int b = WireFormat.m81548b(i);
            if (b == 0) {
                m79866R();
                return true;
            } else if (b == 1) {
                mo64984Q(8);
                return true;
            } else if (b == 2) {
                mo64984Q(mo64980L());
                return true;
            } else if (b == 3) {
                mo64983P();
                mo64958a(WireFormat.m81549c(WireFormat.m81547a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo64984Q(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m80761d();
            }
        }

        /* renamed from: H */
        public byte mo64976H() throws IOException {
            int i = this.f56643j;
            if (i != this.f56641h) {
                byte[] bArr = this.f56639f;
                this.f56643j = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m80767k();
        }

        /* renamed from: I */
        public byte[] mo64977I(int i) throws IOException {
            if (i > 0) {
                int i2 = this.f56641h;
                int i3 = this.f56643j;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f56643j = i4;
                    return Arrays.copyOfRange(this.f56639f, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.m80767k();
            } else if (i == 0) {
                return Internal.f56937c;
            } else {
                throw InvalidProtocolBufferException.m80763f();
            }
        }

        /* renamed from: J */
        public int mo64978J() throws IOException {
            int i = this.f56643j;
            if (this.f56641h - i >= 4) {
                byte[] bArr = this.f56639f;
                this.f56643j = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.m80767k();
        }

        /* renamed from: K */
        public long mo64979K() throws IOException {
            int i = this.f56643j;
            if (this.f56641h - i >= 8) {
                byte[] bArr = this.f56639f;
                this.f56643j = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.m80767k();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: L */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo64980L() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f56643j
                int r1 = r5.f56641h
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f56639f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f56643j = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo64982N()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f56643j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.ArrayDecoder.mo64980L():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: M */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo64981M() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f56643j
                int r1 = r11.f56641h
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f56639f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f56643j = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo64982N()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f56643j = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.ArrayDecoder.mo64981M():long");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: N */
        public long mo64982N() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte H = mo64976H();
                j |= ((long) (H & Byte.MAX_VALUE)) << i;
                if ((H & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m80762e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: P */
        public void mo64983P() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo64953C()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo64957G(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.ArrayDecoder.mo64983P():void");
        }

        /* renamed from: Q */
        public void mo64984Q(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f56641h;
                int i3 = this.f56643j;
                if (i <= i2 - i3) {
                    this.f56643j = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.m80763f();
            }
            throw InvalidProtocolBufferException.m80767k();
        }

        /* renamed from: a */
        public void mo64958a(int i) throws InvalidProtocolBufferException {
            if (this.f56645l != i) {
                throw InvalidProtocolBufferException.m80758a();
            }
        }

        /* renamed from: d */
        public int mo64959d() {
            return this.f56643j - this.f56644k;
        }

        /* renamed from: e */
        public boolean mo64960e() throws IOException {
            return this.f56643j == this.f56641h;
        }

        /* renamed from: l */
        public void mo64961l(int i) {
            this.f56647n = i;
            m79865O();
        }

        /* renamed from: m */
        public int mo64962m(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int d = i + mo64959d();
                int i2 = this.f56647n;
                if (d <= i2) {
                    this.f56647n = d;
                    m79865O();
                    return i2;
                }
                throw InvalidProtocolBufferException.m80767k();
            }
            throw InvalidProtocolBufferException.m80763f();
        }

        /* renamed from: n */
        public boolean mo64963n() throws IOException {
            return mo64981M() != 0;
        }

        /* renamed from: o */
        public ByteString mo64964o() throws IOException {
            ByteString byteString;
            int L = mo64980L();
            if (L > 0) {
                int i = this.f56641h;
                int i2 = this.f56643j;
                if (L <= i - i2) {
                    if (!this.f56640g || !this.f56646m) {
                        byteString = ByteString.m79774q(this.f56639f, i2, L);
                    } else {
                        byteString = ByteString.m79767g0(this.f56639f, i2, L);
                    }
                    this.f56643j += L;
                    return byteString;
                }
            }
            if (L == 0) {
                return ByteString.f56619a;
            }
            return ByteString.m79766f0(mo64977I(L));
        }

        /* renamed from: p */
        public double mo64965p() throws IOException {
            return Double.longBitsToDouble(mo64979K());
        }

        /* renamed from: q */
        public int mo64966q() throws IOException {
            return mo64980L();
        }

        /* renamed from: r */
        public int mo64967r() throws IOException {
            return mo64978J();
        }

        /* renamed from: s */
        public long mo64968s() throws IOException {
            return mo64979K();
        }

        /* renamed from: t */
        public float mo64969t() throws IOException {
            return Float.intBitsToFloat(mo64978J());
        }

        /* renamed from: u */
        public int mo64970u() throws IOException {
            return mo64980L();
        }

        /* renamed from: v */
        public long mo64971v() throws IOException {
            return mo64981M();
        }

        /* renamed from: w */
        public int mo64972w() throws IOException {
            return mo64978J();
        }

        /* renamed from: x */
        public long mo64973x() throws IOException {
            return mo64979K();
        }

        /* renamed from: y */
        public int mo64974y() throws IOException {
            return CodedInputStream.m79832b(mo64980L());
        }

        /* renamed from: z */
        public long mo64975z() throws IOException {
            return CodedInputStream.m79833c(mo64981M());
        }

        private ArrayDecoder(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f56647n = Integer.MAX_VALUE;
            this.f56639f = bArr;
            this.f56641h = i2 + i;
            this.f56643j = i;
            this.f56644k = i;
            this.f56640g = z;
        }
    }

    private static final class IterableDirectByteBufferDecoder extends CodedInputStream {

        /* renamed from: f */
        private Iterator<ByteBuffer> f56648f;

        /* renamed from: g */
        private ByteBuffer f56649g;

        /* renamed from: h */
        private boolean f56650h;

        /* renamed from: i */
        private boolean f56651i;

        /* renamed from: j */
        private int f56652j;

        /* renamed from: k */
        private int f56653k;

        /* renamed from: l */
        private int f56654l;

        /* renamed from: m */
        private int f56655m;

        /* renamed from: n */
        private int f56656n;

        /* renamed from: o */
        private int f56657o;

        /* renamed from: p */
        private long f56658p;

        /* renamed from: q */
        private long f56659q;

        /* renamed from: r */
        private long f56660r;

        /* renamed from: s */
        private long f56661s;

        /* renamed from: H */
        private long m79902H() {
            return this.f56661s - this.f56658p;
        }

        /* renamed from: I */
        private void m79903I() throws InvalidProtocolBufferException {
            if (this.f56648f.hasNext()) {
                m79909W();
                return;
            }
            throw InvalidProtocolBufferException.m80767k();
        }

        /* renamed from: K */
        private void m79904K(byte[] bArr, int i, int i2) throws IOException {
            if (i2 >= 0 && i2 <= m79906R()) {
                int i3 = i2;
                while (i3 > 0) {
                    if (m79902H() == 0) {
                        m79903I();
                    }
                    int min = Math.min(i3, (int) m79902H());
                    long j = (long) min;
                    UnsafeUtil.m81392n(this.f56658p, bArr, (long) ((i2 - i3) + i), j);
                    i3 -= min;
                    this.f56658p += j;
                }
            } else if (i2 > 0) {
                throw InvalidProtocolBufferException.m80767k();
            } else if (i2 != 0) {
                throw InvalidProtocolBufferException.m80763f();
            }
        }

        /* renamed from: Q */
        private void m79905Q() {
            int i = this.f56652j + this.f56653k;
            this.f56652j = i;
            int i2 = i - this.f56657o;
            int i3 = this.f56654l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f56653k = i4;
                this.f56652j = i - i4;
                return;
            }
            this.f56653k = 0;
        }

        /* renamed from: R */
        private int m79906R() {
            return (int) ((((long) (this.f56652j - this.f56656n)) - this.f56658p) + this.f56659q);
        }

        /* renamed from: U */
        private void m79907U() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo64985J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m80762e();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
            throw com.google.protobuf.InvalidProtocolBufferException.m80767k();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
            r3.f56649g.position(r0);
            r3.f56649g.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0029 */
        /* renamed from: V */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.nio.ByteBuffer m79908V(int r4, int r5) throws java.io.IOException {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f56649g
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f56649g
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f56649g     // Catch:{ IllegalArgumentException -> 0x0029 }
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r4 = r3.f56649g     // Catch:{ IllegalArgumentException -> 0x0029 }
                r4.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r4 = r3.f56649g     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r5 = r3.f56649g
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f56649g
                r5.limit(r1)
                return r4
            L_0x0027:
                r4 = move-exception
                goto L_0x002e
            L_0x0029:
                com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.m80767k()     // Catch:{ all -> 0x0027 }
                throw r4     // Catch:{ all -> 0x0027 }
            L_0x002e:
                java.nio.ByteBuffer r5 = r3.f56649g
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f56649g
                r5.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.IterableDirectByteBufferDecoder.m79908V(int, int):java.nio.ByteBuffer");
        }

        /* renamed from: W */
        private void m79909W() {
            ByteBuffer next = this.f56648f.next();
            this.f56649g = next;
            this.f56656n += (int) (this.f56658p - this.f56659q);
            long position = (long) next.position();
            this.f56658p = position;
            this.f56659q = position;
            this.f56661s = (long) this.f56649g.limit();
            long i = UnsafeUtil.m81387i(this.f56649g);
            this.f56660r = i;
            this.f56658p += i;
            this.f56659q += i;
            this.f56661s += i;
        }

        /* renamed from: A */
        public String mo64951A() throws IOException {
            int N = mo64988N();
            if (N > 0) {
                long j = (long) N;
                long j2 = this.f56661s;
                long j3 = this.f56658p;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[N];
                    UnsafeUtil.m81392n(j3, bArr, 0, j);
                    String str = new String(bArr, Internal.f56935a);
                    this.f56658p += j;
                    return str;
                }
            }
            if (N > 0 && N <= m79906R()) {
                byte[] bArr2 = new byte[N];
                m79904K(bArr2, 0, N);
                return new String(bArr2, Internal.f56935a);
            } else if (N == 0) {
                return "";
            } else {
                if (N < 0) {
                    throw InvalidProtocolBufferException.m80763f();
                }
                throw InvalidProtocolBufferException.m80767k();
            }
        }

        /* renamed from: B */
        public String mo64952B() throws IOException {
            int N = mo64988N();
            if (N > 0) {
                long j = (long) N;
                long j2 = this.f56661s;
                long j3 = this.f56658p;
                if (j <= j2 - j3) {
                    String g = Utf8.m81473g(this.f56649g, (int) (j3 - this.f56659q), N);
                    this.f56658p += j;
                    return g;
                }
            }
            if (N >= 0 && N <= m79906R()) {
                byte[] bArr = new byte[N];
                m79904K(bArr, 0, N);
                return Utf8.m81474h(bArr, 0, N);
            } else if (N == 0) {
                return "";
            } else {
                if (N <= 0) {
                    throw InvalidProtocolBufferException.m80763f();
                }
                throw InvalidProtocolBufferException.m80767k();
            }
        }

        /* renamed from: C */
        public int mo64953C() throws IOException {
            if (mo64960e()) {
                this.f56655m = 0;
                return 0;
            }
            int N = mo64988N();
            this.f56655m = N;
            if (WireFormat.m81547a(N) != 0) {
                return this.f56655m;
            }
            throw InvalidProtocolBufferException.m80759b();
        }

        /* renamed from: D */
        public int mo64954D() throws IOException {
            return mo64988N();
        }

        /* renamed from: E */
        public long mo64955E() throws IOException {
            return mo64989O();
        }

        /* renamed from: G */
        public boolean mo64957G(int i) throws IOException {
            int b = WireFormat.m81548b(i);
            if (b == 0) {
                m79907U();
                return true;
            } else if (b == 1) {
                mo64992T(8);
                return true;
            } else if (b == 2) {
                mo64992T(mo64988N());
                return true;
            } else if (b == 3) {
                mo64991S();
                mo64958a(WireFormat.m81549c(WireFormat.m81547a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo64992T(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m80761d();
            }
        }

        /* renamed from: J */
        public byte mo64985J() throws IOException {
            if (m79902H() == 0) {
                m79903I();
            }
            long j = this.f56658p;
            this.f56658p = 1 + j;
            return UnsafeUtil.m81400v(j);
        }

        /* renamed from: L */
        public int mo64986L() throws IOException {
            if (m79902H() < 4) {
                return (mo64985J() & 255) | ((mo64985J() & 255) << 8) | ((mo64985J() & 255) << 16) | ((mo64985J() & 255) << 24);
            }
            long j = this.f56658p;
            this.f56658p = 4 + j;
            return ((UnsafeUtil.m81400v(j + 3) & 255) << 24) | (UnsafeUtil.m81400v(j) & 255) | ((UnsafeUtil.m81400v(1 + j) & 255) << 8) | ((UnsafeUtil.m81400v(2 + j) & 255) << 16);
        }

        /* renamed from: M */
        public long mo64987M() throws IOException {
            if (m79902H() < 8) {
                return (((long) mo64985J()) & 255) | ((((long) mo64985J()) & 255) << 8) | ((((long) mo64985J()) & 255) << 16) | ((((long) mo64985J()) & 255) << 24) | ((((long) mo64985J()) & 255) << 32) | ((((long) mo64985J()) & 255) << 40) | ((((long) mo64985J()) & 255) << 48) | ((((long) mo64985J()) & 255) << 56);
            }
            long j = this.f56658p;
            this.f56658p = 8 + j;
            return ((((long) UnsafeUtil.m81400v(j + 7)) & 255) << 56) | (((long) UnsafeUtil.m81400v(j)) & 255) | ((((long) UnsafeUtil.m81400v(1 + j)) & 255) << 8) | ((((long) UnsafeUtil.m81400v(2 + j)) & 255) << 16) | ((((long) UnsafeUtil.m81400v(3 + j)) & 255) << 24) | ((((long) UnsafeUtil.m81400v(4 + j)) & 255) << 32) | ((((long) UnsafeUtil.m81400v(5 + j)) & 255) << 40) | ((((long) UnsafeUtil.m81400v(6 + j)) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
            if (com.google.protobuf.UnsafeUtil.m81400v(r4) < 0) goto L_0x008a;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo64988N() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f56658p
                long r2 = r10.f56661s
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x000a
                goto L_0x008a
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.UnsafeUtil.m81400v(r0)
                if (r0 < 0) goto L_0x001a
                long r4 = r10.f56658p
                long r4 = r4 + r2
                r10.f56658p = r4
                return r0
            L_0x001a:
                long r6 = r10.f56661s
                long r8 = r10.f56658p
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0026
                goto L_0x008a
            L_0x0026:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0034
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0090
            L_0x0034:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0043
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x0041:
                r6 = r4
                goto L_0x0090
            L_0x0043:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0053
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x0090
            L_0x0053:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r4)
                if (r1 >= 0) goto L_0x0090
            L_0x008a:
                long r0 = r10.mo64990P()
                int r1 = (int) r0
                return r1
            L_0x0090:
                r10.f56658p = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.IterableDirectByteBufferDecoder.mo64988N():int");
        }

        /* renamed from: O */
        public long mo64989O() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f56658p;
            if (this.f56661s != j4) {
                long j5 = j4 + 1;
                byte v = UnsafeUtil.m81400v(j4);
                if (v >= 0) {
                    this.f56658p++;
                    return (long) v;
                } else if (this.f56661s - this.f56658p >= 10) {
                    long j6 = j5 + 1;
                    byte v2 = v ^ (UnsafeUtil.m81400v(j5) << 7);
                    if (v2 < 0) {
                        b = v2 ^ Byte.MIN_VALUE;
                    } else {
                        long j7 = j6 + 1;
                        byte v3 = v2 ^ (UnsafeUtil.m81400v(j6) << 14);
                        if (v3 >= 0) {
                            j = (long) (v3 ^ 16256);
                        } else {
                            j6 = j7 + 1;
                            byte v4 = v3 ^ (UnsafeUtil.m81400v(j7) << 21);
                            if (v4 < 0) {
                                b = v4 ^ -2080896;
                            } else {
                                j7 = j6 + 1;
                                long v5 = ((long) v4) ^ (((long) UnsafeUtil.m81400v(j6)) << 28);
                                if (v5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long v6 = v5 ^ (((long) UnsafeUtil.m81400v(j7)) << 35);
                                    if (v6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        v5 = v6 ^ (((long) UnsafeUtil.m81400v(j8)) << 42);
                                        if (v5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            v6 = v5 ^ (((long) UnsafeUtil.m81400v(j7)) << 49);
                                            if (v6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (v6 ^ (((long) UnsafeUtil.m81400v(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) UnsafeUtil.m81400v(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f56658p = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = v6 ^ j2;
                                    j6 = j8;
                                    this.f56658p = j6;
                                    return j;
                                }
                                j = v5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f56658p = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f56658p = j6;
                    return j;
                }
            }
            return mo64990P();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P */
        public long mo64990P() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo64985J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m80762e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: S */
        public void mo64991S() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo64953C()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo64957G(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.IterableDirectByteBufferDecoder.mo64991S():void");
        }

        /* renamed from: T */
        public void mo64992T(int i) throws IOException {
            if (i >= 0 && ((long) i) <= (((long) (this.f56652j - this.f56656n)) - this.f56658p) + this.f56659q) {
                while (i > 0) {
                    if (m79902H() == 0) {
                        m79903I();
                    }
                    int min = Math.min(i, (int) m79902H());
                    i -= min;
                    this.f56658p += (long) min;
                }
            } else if (i < 0) {
                throw InvalidProtocolBufferException.m80763f();
            } else {
                throw InvalidProtocolBufferException.m80767k();
            }
        }

        /* renamed from: a */
        public void mo64958a(int i) throws InvalidProtocolBufferException {
            if (this.f56655m != i) {
                throw InvalidProtocolBufferException.m80758a();
            }
        }

        /* renamed from: d */
        public int mo64959d() {
            return (int) ((((long) (this.f56656n - this.f56657o)) + this.f56658p) - this.f56659q);
        }

        /* renamed from: e */
        public boolean mo64960e() throws IOException {
            return (((long) this.f56656n) + this.f56658p) - this.f56659q == ((long) this.f56652j);
        }

        /* renamed from: l */
        public void mo64961l(int i) {
            this.f56654l = i;
            m79905Q();
        }

        /* renamed from: m */
        public int mo64962m(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int d = i + mo64959d();
                int i2 = this.f56654l;
                if (d <= i2) {
                    this.f56654l = d;
                    m79905Q();
                    return i2;
                }
                throw InvalidProtocolBufferException.m80767k();
            }
            throw InvalidProtocolBufferException.m80763f();
        }

        /* renamed from: n */
        public boolean mo64963n() throws IOException {
            return mo64989O() != 0;
        }

        /* renamed from: o */
        public ByteString mo64964o() throws IOException {
            int N = mo64988N();
            if (N > 0) {
                long j = (long) N;
                long j2 = this.f56661s;
                long j3 = this.f56658p;
                if (j <= j2 - j3) {
                    if (!this.f56650h || !this.f56651i) {
                        byte[] bArr = new byte[N];
                        UnsafeUtil.m81392n(j3, bArr, 0, j);
                        this.f56658p += j;
                        return ByteString.m79766f0(bArr);
                    }
                    int i = (int) (j3 - this.f56660r);
                    ByteString d0 = ByteString.m79764d0(m79908V(i, N + i));
                    this.f56658p += j;
                    return d0;
                }
            }
            if (N > 0 && N <= m79906R()) {
                byte[] bArr2 = new byte[N];
                m79904K(bArr2, 0, N);
                return ByteString.m79766f0(bArr2);
            } else if (N == 0) {
                return ByteString.f56619a;
            } else {
                if (N < 0) {
                    throw InvalidProtocolBufferException.m80763f();
                }
                throw InvalidProtocolBufferException.m80767k();
            }
        }

        /* renamed from: p */
        public double mo64965p() throws IOException {
            return Double.longBitsToDouble(mo64987M());
        }

        /* renamed from: q */
        public int mo64966q() throws IOException {
            return mo64988N();
        }

        /* renamed from: r */
        public int mo64967r() throws IOException {
            return mo64986L();
        }

        /* renamed from: s */
        public long mo64968s() throws IOException {
            return mo64987M();
        }

        /* renamed from: t */
        public float mo64969t() throws IOException {
            return Float.intBitsToFloat(mo64986L());
        }

        /* renamed from: u */
        public int mo64970u() throws IOException {
            return mo64988N();
        }

        /* renamed from: v */
        public long mo64971v() throws IOException {
            return mo64989O();
        }

        /* renamed from: w */
        public int mo64972w() throws IOException {
            return mo64986L();
        }

        /* renamed from: x */
        public long mo64973x() throws IOException {
            return mo64987M();
        }

        /* renamed from: y */
        public int mo64974y() throws IOException {
            return CodedInputStream.m79832b(mo64988N());
        }

        /* renamed from: z */
        public long mo64975z() throws IOException {
            return CodedInputStream.m79833c(mo64989O());
        }
    }

    private static final class StreamDecoder extends CodedInputStream {

        /* renamed from: f */
        private final InputStream f56662f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final byte[] f56663g;

        /* renamed from: h */
        private int f56664h;

        /* renamed from: i */
        private int f56665i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f56666j;

        /* renamed from: k */
        private int f56667k;

        /* renamed from: l */
        private int f56668l;

        /* renamed from: m */
        private int f56669m;

        /* renamed from: n */
        private RefillCallback f56670n;

        private interface RefillCallback {
            /* renamed from: a */
            void mo65001a();
        }

        private class SkippedDataSink implements RefillCallback {

            /* renamed from: a */
            private int f56671a;

            /* renamed from: b */
            private ByteArrayOutputStream f56672b;

            /* renamed from: c */
            final /* synthetic */ StreamDecoder f56673c;

            /* renamed from: a */
            public void mo65001a() {
                if (this.f56672b == null) {
                    this.f56672b = new ByteArrayOutputStream();
                }
                this.f56672b.write(this.f56673c.f56663g, this.f56671a, this.f56673c.f56666j - this.f56671a);
                this.f56671a = 0;
            }
        }

        /* renamed from: J */
        private ByteString m79944J(int i) throws IOException {
            byte[] M = m79946M(i);
            if (M != null) {
                return ByteString.m79773p(M);
            }
            int i2 = this.f56666j;
            int i3 = this.f56664h;
            int i4 = i3 - i2;
            this.f56668l += i3;
            this.f56666j = 0;
            this.f56664h = 0;
            List<byte[]> N = m79947N(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f56663g, i2, bArr, 0, i4);
            for (byte[] next : N) {
                System.arraycopy(next, 0, bArr, i4, next.length);
                i4 += next.length;
            }
            return ByteString.m79766f0(bArr);
        }

        /* renamed from: L */
        private byte[] m79945L(int i, boolean z) throws IOException {
            byte[] M = m79946M(i);
            if (M != null) {
                return z ? (byte[]) M.clone() : M;
            }
            int i2 = this.f56666j;
            int i3 = this.f56664h;
            int i4 = i3 - i2;
            this.f56668l += i3;
            this.f56666j = 0;
            this.f56664h = 0;
            List<byte[]> N = m79947N(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f56663g, i2, bArr, 0, i4);
            for (byte[] next : N) {
                System.arraycopy(next, 0, bArr, i4, next.length);
                i4 += next.length;
            }
            return bArr;
        }

        /* renamed from: M */
        private byte[] m79946M(int i) throws IOException {
            if (i == 0) {
                return Internal.f56937c;
            }
            if (i >= 0) {
                int i2 = this.f56668l;
                int i3 = this.f56666j;
                int i4 = i2 + i3 + i;
                if (i4 - this.f56636c <= 0) {
                    int i5 = this.f56669m;
                    if (i4 <= i5) {
                        int i6 = this.f56664h - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > this.f56662f.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f56663g, this.f56666j, bArr, 0, i6);
                        this.f56668l += this.f56664h;
                        this.f56666j = 0;
                        this.f56664h = 0;
                        while (i6 < i) {
                            int read = this.f56662f.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f56668l += read;
                                i6 += read;
                            } else {
                                throw InvalidProtocolBufferException.m80767k();
                            }
                        }
                        return bArr;
                    }
                    mo65000W((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.m80767k();
                }
                throw InvalidProtocolBufferException.m80766j();
            }
            throw InvalidProtocolBufferException.m80763f();
        }

        /* renamed from: N */
        private List<byte[]> m79947N(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f56662f.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f56668l += read;
                        i2 += read;
                    } else {
                        throw InvalidProtocolBufferException.m80767k();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: T */
        private void m79948T() {
            int i = this.f56664h + this.f56665i;
            this.f56664h = i;
            int i2 = this.f56668l + i;
            int i3 = this.f56669m;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f56665i = i4;
                this.f56664h = i - i4;
                return;
            }
            this.f56665i = 0;
        }

        /* renamed from: U */
        private void m79949U(int i) throws IOException {
            if (m79954b0(i)) {
                return;
            }
            if (i > (this.f56636c - this.f56668l) - this.f56666j) {
                throw InvalidProtocolBufferException.m80766j();
            }
            throw InvalidProtocolBufferException.m80767k();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            throw new java.lang.IllegalStateException(r8.f56662f.getClass() + "#skip returned invalid result: " + r0 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: X */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m79950X(int r9) throws java.io.IOException {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x0097
                int r0 = r8.f56668l
                int r1 = r8.f56666j
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.f56669m
                if (r2 > r3) goto L_0x008d
                com.google.protobuf.CodedInputStream$StreamDecoder$RefillCallback r2 = r8.f56670n
                r3 = 0
                if (r2 != 0) goto L_0x006f
                int r0 = r0 + r1
                r8.f56668l = r0
                int r0 = r8.f56664h
                int r0 = r0 - r1
                r8.f56664h = r3
                r8.f56666j = r3
                r3 = r0
            L_0x001d:
                if (r3 >= r9) goto L_0x0067
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.f56662f     // Catch:{ all -> 0x005d }
                long r4 = (long) r0     // Catch:{ all -> 0x005d }
                long r0 = r1.skip(r4)     // Catch:{ all -> 0x005d }
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L_0x0038
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0038
                if (r2 != 0) goto L_0x0035
                goto L_0x0067
            L_0x0035:
                int r1 = (int) r0     // Catch:{ all -> 0x005d }
                int r3 = r3 + r1
                goto L_0x001d
            L_0x0038:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
                r2.<init>()     // Catch:{ all -> 0x005d }
                java.io.InputStream r4 = r8.f56662f     // Catch:{ all -> 0x005d }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x005d }
                r2.append(r4)     // Catch:{ all -> 0x005d }
                java.lang.String r4 = "#skip returned invalid result: "
                r2.append(r4)     // Catch:{ all -> 0x005d }
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = "\nThe InputStream implementation is buggy."
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x005d }
                r9.<init>(r0)     // Catch:{ all -> 0x005d }
                throw r9     // Catch:{ all -> 0x005d }
            L_0x005d:
                r9 = move-exception
                int r0 = r8.f56668l
                int r0 = r0 + r3
                r8.f56668l = r0
                r8.m79948T()
                throw r9
            L_0x0067:
                int r0 = r8.f56668l
                int r0 = r0 + r3
                r8.f56668l = r0
                r8.m79948T()
            L_0x006f:
                if (r3 >= r9) goto L_0x008c
                int r0 = r8.f56664h
                int r1 = r8.f56666j
                int r1 = r0 - r1
                r8.f56666j = r0
                r0 = 1
                r8.m79949U(r0)
            L_0x007d:
                int r2 = r9 - r1
                int r3 = r8.f56664h
                if (r2 <= r3) goto L_0x008a
                int r1 = r1 + r3
                r8.f56666j = r3
                r8.m79949U(r0)
                goto L_0x007d
            L_0x008a:
                r8.f56666j = r2
            L_0x008c:
                return
            L_0x008d:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.mo65000W(r3)
                com.google.protobuf.InvalidProtocolBufferException r9 = com.google.protobuf.InvalidProtocolBufferException.m80767k()
                throw r9
            L_0x0097:
                com.google.protobuf.InvalidProtocolBufferException r9 = com.google.protobuf.InvalidProtocolBufferException.m80763f()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.StreamDecoder.m79950X(int):void");
        }

        /* renamed from: Y */
        private void m79951Y() throws IOException {
            if (this.f56664h - this.f56666j >= 10) {
                m79952Z();
            } else {
                m79953a0();
            }
        }

        /* renamed from: Z */
        private void m79952Z() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f56663g;
                int i2 = this.f56666j;
                this.f56666j = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m80762e();
        }

        /* renamed from: a0 */
        private void m79953a0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo64993K() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m80762e();
        }

        /* renamed from: b0 */
        private boolean m79954b0(int i) throws IOException {
            int i2 = this.f56666j;
            if (i2 + i > this.f56664h) {
                int i3 = this.f56636c;
                int i4 = this.f56668l;
                if (i > (i3 - i4) - i2 || i4 + i2 + i > this.f56669m) {
                    return false;
                }
                RefillCallback refillCallback = this.f56670n;
                if (refillCallback != null) {
                    refillCallback.mo65001a();
                }
                int i5 = this.f56666j;
                if (i5 > 0) {
                    int i6 = this.f56664h;
                    if (i6 > i5) {
                        byte[] bArr = this.f56663g;
                        System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                    }
                    this.f56668l += i5;
                    this.f56664h -= i5;
                    this.f56666j = 0;
                }
                InputStream inputStream = this.f56662f;
                byte[] bArr2 = this.f56663g;
                int i7 = this.f56664h;
                int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.f56636c - this.f56668l) - i7));
                if (read == 0 || read < -1 || read > this.f56663g.length) {
                    throw new IllegalStateException(this.f56662f.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f56664h += read;
                    m79948T();
                    if (this.f56664h >= i) {
                        return true;
                    }
                    return m79954b0(i);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
        }

        /* renamed from: A */
        public String mo64951A() throws IOException {
            int Q = mo64996Q();
            if (Q > 0) {
                int i = this.f56664h;
                int i2 = this.f56666j;
                if (Q <= i - i2) {
                    String str = new String(this.f56663g, i2, Q, Internal.f56935a);
                    this.f56666j += Q;
                    return str;
                }
            }
            if (Q == 0) {
                return "";
            }
            if (Q > this.f56664h) {
                return new String(m79945L(Q, false), Internal.f56935a);
            }
            m79949U(Q);
            String str2 = new String(this.f56663g, this.f56666j, Q, Internal.f56935a);
            this.f56666j += Q;
            return str2;
        }

        /* renamed from: B */
        public String mo64952B() throws IOException {
            byte[] bArr;
            int Q = mo64996Q();
            int i = this.f56666j;
            int i2 = this.f56664h;
            if (Q <= i2 - i && Q > 0) {
                bArr = this.f56663g;
                this.f56666j = i + Q;
            } else if (Q == 0) {
                return "";
            } else {
                if (Q <= i2) {
                    m79949U(Q);
                    bArr = this.f56663g;
                    this.f56666j = Q + 0;
                } else {
                    bArr = m79945L(Q, false);
                }
                i = 0;
            }
            return Utf8.m81474h(bArr, i, Q);
        }

        /* renamed from: C */
        public int mo64953C() throws IOException {
            if (mo64960e()) {
                this.f56667k = 0;
                return 0;
            }
            int Q = mo64996Q();
            this.f56667k = Q;
            if (WireFormat.m81547a(Q) != 0) {
                return this.f56667k;
            }
            throw InvalidProtocolBufferException.m80759b();
        }

        /* renamed from: D */
        public int mo64954D() throws IOException {
            return mo64996Q();
        }

        /* renamed from: E */
        public long mo64955E() throws IOException {
            return mo64997R();
        }

        /* renamed from: G */
        public boolean mo64957G(int i) throws IOException {
            int b = WireFormat.m81548b(i);
            if (b == 0) {
                m79951Y();
                return true;
            } else if (b == 1) {
                mo65000W(8);
                return true;
            } else if (b == 2) {
                mo65000W(mo64996Q());
                return true;
            } else if (b == 3) {
                mo64999V();
                mo64958a(WireFormat.m81549c(WireFormat.m81547a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo65000W(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m80761d();
            }
        }

        /* renamed from: K */
        public byte mo64993K() throws IOException {
            if (this.f56666j == this.f56664h) {
                m79949U(1);
            }
            byte[] bArr = this.f56663g;
            int i = this.f56666j;
            this.f56666j = i + 1;
            return bArr[i];
        }

        /* renamed from: O */
        public int mo64994O() throws IOException {
            int i = this.f56666j;
            if (this.f56664h - i < 4) {
                m79949U(4);
                i = this.f56666j;
            }
            byte[] bArr = this.f56663g;
            this.f56666j = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: P */
        public long mo64995P() throws IOException {
            int i = this.f56666j;
            if (this.f56664h - i < 8) {
                m79949U(8);
                i = this.f56666j;
            }
            byte[] bArr = this.f56663g;
            this.f56666j = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: Q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo64996Q() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f56666j
                int r1 = r5.f56664h
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f56663g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f56666j = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo64998S()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f56666j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.StreamDecoder.mo64996Q():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: R */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo64997R() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f56666j
                int r1 = r11.f56664h
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f56663g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f56666j = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo64998S()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f56666j = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.StreamDecoder.mo64997R():long");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: S */
        public long mo64998S() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte K = mo64993K();
                j |= ((long) (K & Byte.MAX_VALUE)) << i;
                if ((K & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m80762e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: V */
        public void mo64999V() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo64953C()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo64957G(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.StreamDecoder.mo64999V():void");
        }

        /* renamed from: W */
        public void mo65000W(int i) throws IOException {
            int i2 = this.f56664h;
            int i3 = this.f56666j;
            if (i > i2 - i3 || i < 0) {
                m79950X(i);
            } else {
                this.f56666j = i3 + i;
            }
        }

        /* renamed from: a */
        public void mo64958a(int i) throws InvalidProtocolBufferException {
            if (this.f56667k != i) {
                throw InvalidProtocolBufferException.m80758a();
            }
        }

        /* renamed from: d */
        public int mo64959d() {
            return this.f56668l + this.f56666j;
        }

        /* renamed from: e */
        public boolean mo64960e() throws IOException {
            return this.f56666j == this.f56664h && !m79954b0(1);
        }

        /* renamed from: l */
        public void mo64961l(int i) {
            this.f56669m = i;
            m79948T();
        }

        /* renamed from: m */
        public int mo64962m(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = i + this.f56668l + this.f56666j;
                int i3 = this.f56669m;
                if (i2 <= i3) {
                    this.f56669m = i2;
                    m79948T();
                    return i3;
                }
                throw InvalidProtocolBufferException.m80767k();
            }
            throw InvalidProtocolBufferException.m80763f();
        }

        /* renamed from: n */
        public boolean mo64963n() throws IOException {
            return mo64997R() != 0;
        }

        /* renamed from: o */
        public ByteString mo64964o() throws IOException {
            int Q = mo64996Q();
            int i = this.f56664h;
            int i2 = this.f56666j;
            if (Q <= i - i2 && Q > 0) {
                ByteString q = ByteString.m79774q(this.f56663g, i2, Q);
                this.f56666j += Q;
                return q;
            } else if (Q == 0) {
                return ByteString.f56619a;
            } else {
                return m79944J(Q);
            }
        }

        /* renamed from: p */
        public double mo64965p() throws IOException {
            return Double.longBitsToDouble(mo64995P());
        }

        /* renamed from: q */
        public int mo64966q() throws IOException {
            return mo64996Q();
        }

        /* renamed from: r */
        public int mo64967r() throws IOException {
            return mo64994O();
        }

        /* renamed from: s */
        public long mo64968s() throws IOException {
            return mo64995P();
        }

        /* renamed from: t */
        public float mo64969t() throws IOException {
            return Float.intBitsToFloat(mo64994O());
        }

        /* renamed from: u */
        public int mo64970u() throws IOException {
            return mo64996Q();
        }

        /* renamed from: v */
        public long mo64971v() throws IOException {
            return mo64997R();
        }

        /* renamed from: w */
        public int mo64972w() throws IOException {
            return mo64994O();
        }

        /* renamed from: x */
        public long mo64973x() throws IOException {
            return mo64995P();
        }

        /* renamed from: y */
        public int mo64974y() throws IOException {
            return CodedInputStream.m79832b(mo64996Q());
        }

        /* renamed from: z */
        public long mo64975z() throws IOException {
            return CodedInputStream.m79833c(mo64997R());
        }

        private StreamDecoder(InputStream inputStream, int i) {
            super();
            this.f56669m = Integer.MAX_VALUE;
            this.f56670n = null;
            Internal.m80733b(inputStream, "input");
            this.f56662f = inputStream;
            this.f56663g = new byte[i];
            this.f56664h = 0;
            this.f56666j = 0;
            this.f56668l = 0;
        }
    }

    private static final class UnsafeDirectNioDecoder extends CodedInputStream {

        /* renamed from: f */
        private final ByteBuffer f56674f;

        /* renamed from: g */
        private final boolean f56675g;

        /* renamed from: h */
        private final long f56676h;

        /* renamed from: i */
        private long f56677i;

        /* renamed from: j */
        private long f56678j;

        /* renamed from: k */
        private long f56679k;

        /* renamed from: l */
        private int f56680l;

        /* renamed from: m */
        private int f56681m;

        /* renamed from: n */
        private boolean f56682n;

        /* renamed from: o */
        private int f56683o;

        /* renamed from: H */
        private int m79989H(long j) {
            return (int) (j - this.f56676h);
        }

        /* renamed from: I */
        static boolean m79990I() {
            return UnsafeUtil.m81363I();
        }

        /* renamed from: P */
        private void m79991P() {
            long j = this.f56677i + ((long) this.f56680l);
            this.f56677i = j;
            int i = (int) (j - this.f56679k);
            int i2 = this.f56683o;
            if (i > i2) {
                int i3 = i - i2;
                this.f56680l = i3;
                this.f56677i = j - ((long) i3);
                return;
            }
            this.f56680l = 0;
        }

        /* renamed from: Q */
        private int m79992Q() {
            return (int) (this.f56677i - this.f56678j);
        }

        /* renamed from: T */
        private void m79993T() throws IOException {
            if (m79992Q() >= 10) {
                m79994U();
            } else {
                m79995V();
            }
        }

        /* renamed from: U */
        private void m79994U() throws IOException {
            int i = 0;
            while (i < 10) {
                long j = this.f56678j;
                this.f56678j = 1 + j;
                if (UnsafeUtil.m81400v(j) < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m80762e();
        }

        /* renamed from: V */
        private void m79995V() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo65002J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m80762e();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
            throw com.google.protobuf.InvalidProtocolBufferException.m80767k();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
            r3.f56674f.position(r0);
            r3.f56674f.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0031 */
        /* renamed from: W */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.nio.ByteBuffer m79996W(long r4, long r6) throws java.io.IOException {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f56674f
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f56674f
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f56674f     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r4 = r3.m79989H(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.f56674f     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r5 = r3.m79989H(r6)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r4.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.f56674f     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r5 = r3.f56674f
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f56674f
                r5.limit(r1)
                return r4
            L_0x002f:
                r4 = move-exception
                goto L_0x0036
            L_0x0031:
                com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.m80767k()     // Catch:{ all -> 0x002f }
                throw r4     // Catch:{ all -> 0x002f }
            L_0x0036:
                java.nio.ByteBuffer r5 = r3.f56674f
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f56674f
                r5.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.m79996W(long, long):java.nio.ByteBuffer");
        }

        /* renamed from: A */
        public String mo64951A() throws IOException {
            int M = mo65005M();
            if (M > 0 && M <= m79992Q()) {
                byte[] bArr = new byte[M];
                long j = (long) M;
                UnsafeUtil.m81392n(this.f56678j, bArr, 0, j);
                String str = new String(bArr, Internal.f56935a);
                this.f56678j += j;
                return str;
            } else if (M == 0) {
                return "";
            } else {
                if (M < 0) {
                    throw InvalidProtocolBufferException.m80763f();
                }
                throw InvalidProtocolBufferException.m80767k();
            }
        }

        /* renamed from: B */
        public String mo64952B() throws IOException {
            int M = mo65005M();
            if (M > 0 && M <= m79992Q()) {
                String g = Utf8.m81473g(this.f56674f, m79989H(this.f56678j), M);
                this.f56678j += (long) M;
                return g;
            } else if (M == 0) {
                return "";
            } else {
                if (M <= 0) {
                    throw InvalidProtocolBufferException.m80763f();
                }
                throw InvalidProtocolBufferException.m80767k();
            }
        }

        /* renamed from: C */
        public int mo64953C() throws IOException {
            if (mo64960e()) {
                this.f56681m = 0;
                return 0;
            }
            int M = mo65005M();
            this.f56681m = M;
            if (WireFormat.m81547a(M) != 0) {
                return this.f56681m;
            }
            throw InvalidProtocolBufferException.m80759b();
        }

        /* renamed from: D */
        public int mo64954D() throws IOException {
            return mo65005M();
        }

        /* renamed from: E */
        public long mo64955E() throws IOException {
            return mo65006N();
        }

        /* renamed from: G */
        public boolean mo64957G(int i) throws IOException {
            int b = WireFormat.m81548b(i);
            if (b == 0) {
                m79993T();
                return true;
            } else if (b == 1) {
                mo65009S(8);
                return true;
            } else if (b == 2) {
                mo65009S(mo65005M());
                return true;
            } else if (b == 3) {
                mo65008R();
                mo64958a(WireFormat.m81549c(WireFormat.m81547a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo65009S(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m80761d();
            }
        }

        /* renamed from: J */
        public byte mo65002J() throws IOException {
            long j = this.f56678j;
            if (j != this.f56677i) {
                this.f56678j = 1 + j;
                return UnsafeUtil.m81400v(j);
            }
            throw InvalidProtocolBufferException.m80767k();
        }

        /* renamed from: K */
        public int mo65003K() throws IOException {
            long j = this.f56678j;
            if (this.f56677i - j >= 4) {
                this.f56678j = 4 + j;
                return ((UnsafeUtil.m81400v(j + 3) & 255) << 24) | (UnsafeUtil.m81400v(j) & 255) | ((UnsafeUtil.m81400v(1 + j) & 255) << 8) | ((UnsafeUtil.m81400v(2 + j) & 255) << 16);
            }
            throw InvalidProtocolBufferException.m80767k();
        }

        /* renamed from: L */
        public long mo65004L() throws IOException {
            long j = this.f56678j;
            if (this.f56677i - j >= 8) {
                this.f56678j = 8 + j;
                return ((((long) UnsafeUtil.m81400v(j + 7)) & 255) << 56) | (((long) UnsafeUtil.m81400v(j)) & 255) | ((((long) UnsafeUtil.m81400v(1 + j)) & 255) << 8) | ((((long) UnsafeUtil.m81400v(2 + j)) & 255) << 16) | ((((long) UnsafeUtil.m81400v(3 + j)) & 255) << 24) | ((((long) UnsafeUtil.m81400v(4 + j)) & 255) << 32) | ((((long) UnsafeUtil.m81400v(5 + j)) & 255) << 40) | ((((long) UnsafeUtil.m81400v(6 + j)) & 255) << 48);
            }
            throw InvalidProtocolBufferException.m80767k();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (com.google.protobuf.UnsafeUtil.m81400v(r4) < 0) goto L_0x0085;
         */
        /* renamed from: M */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo65005M() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f56678j
                long r2 = r10.f56677i
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.UnsafeUtil.m81400v(r0)
                if (r0 < 0) goto L_0x0017
                r10.f56678j = r4
                return r0
            L_0x0017:
                long r6 = r10.f56677i
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m81400v(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.mo65007O()
                int r1 = (int) r0
                return r1
            L_0x008b:
                r10.f56678j = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.mo65005M():int");
        }

        /* renamed from: N */
        public long mo65006N() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f56678j;
            if (this.f56677i != j4) {
                long j5 = j4 + 1;
                byte v = UnsafeUtil.m81400v(j4);
                if (v >= 0) {
                    this.f56678j = j5;
                    return (long) v;
                } else if (this.f56677i - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte v2 = v ^ (UnsafeUtil.m81400v(j5) << 7);
                    if (v2 < 0) {
                        b = v2 ^ Byte.MIN_VALUE;
                    } else {
                        long j7 = j6 + 1;
                        byte v3 = v2 ^ (UnsafeUtil.m81400v(j6) << 14);
                        if (v3 >= 0) {
                            j = (long) (v3 ^ 16256);
                        } else {
                            j6 = j7 + 1;
                            byte v4 = v3 ^ (UnsafeUtil.m81400v(j7) << 21);
                            if (v4 < 0) {
                                b = v4 ^ -2080896;
                            } else {
                                j7 = j6 + 1;
                                long v5 = ((long) v4) ^ (((long) UnsafeUtil.m81400v(j6)) << 28);
                                if (v5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long v6 = v5 ^ (((long) UnsafeUtil.m81400v(j7)) << 35);
                                    if (v6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        v5 = v6 ^ (((long) UnsafeUtil.m81400v(j8)) << 42);
                                        if (v5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            v6 = v5 ^ (((long) UnsafeUtil.m81400v(j7)) << 49);
                                            if (v6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (v6 ^ (((long) UnsafeUtil.m81400v(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) UnsafeUtil.m81400v(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f56678j = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = v6 ^ j2;
                                    j6 = j8;
                                    this.f56678j = j6;
                                    return j;
                                }
                                j = v5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f56678j = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f56678j = j6;
                    return j;
                }
            }
            return mo65007O();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public long mo65007O() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo65002J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m80762e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: R */
        public void mo65008R() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo64953C()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo64957G(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.mo65008R():void");
        }

        /* renamed from: S */
        public void mo65009S(int i) throws IOException {
            if (i >= 0 && i <= m79992Q()) {
                this.f56678j += (long) i;
            } else if (i < 0) {
                throw InvalidProtocolBufferException.m80763f();
            } else {
                throw InvalidProtocolBufferException.m80767k();
            }
        }

        /* renamed from: a */
        public void mo64958a(int i) throws InvalidProtocolBufferException {
            if (this.f56681m != i) {
                throw InvalidProtocolBufferException.m80758a();
            }
        }

        /* renamed from: d */
        public int mo64959d() {
            return (int) (this.f56678j - this.f56679k);
        }

        /* renamed from: e */
        public boolean mo64960e() throws IOException {
            return this.f56678j == this.f56677i;
        }

        /* renamed from: l */
        public void mo64961l(int i) {
            this.f56683o = i;
            m79991P();
        }

        /* renamed from: m */
        public int mo64962m(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int d = i + mo64959d();
                int i2 = this.f56683o;
                if (d <= i2) {
                    this.f56683o = d;
                    m79991P();
                    return i2;
                }
                throw InvalidProtocolBufferException.m80767k();
            }
            throw InvalidProtocolBufferException.m80763f();
        }

        /* renamed from: n */
        public boolean mo64963n() throws IOException {
            return mo65006N() != 0;
        }

        /* renamed from: o */
        public ByteString mo64964o() throws IOException {
            int M = mo65005M();
            if (M <= 0 || M > m79992Q()) {
                if (M == 0) {
                    return ByteString.f56619a;
                }
                if (M < 0) {
                    throw InvalidProtocolBufferException.m80763f();
                }
                throw InvalidProtocolBufferException.m80767k();
            } else if (!this.f56675g || !this.f56682n) {
                byte[] bArr = new byte[M];
                long j = (long) M;
                UnsafeUtil.m81392n(this.f56678j, bArr, 0, j);
                this.f56678j += j;
                return ByteString.m79766f0(bArr);
            } else {
                long j2 = this.f56678j;
                long j3 = (long) M;
                ByteBuffer W = m79996W(j2, j2 + j3);
                this.f56678j += j3;
                return ByteString.m79764d0(W);
            }
        }

        /* renamed from: p */
        public double mo64965p() throws IOException {
            return Double.longBitsToDouble(mo65004L());
        }

        /* renamed from: q */
        public int mo64966q() throws IOException {
            return mo65005M();
        }

        /* renamed from: r */
        public int mo64967r() throws IOException {
            return mo65003K();
        }

        /* renamed from: s */
        public long mo64968s() throws IOException {
            return mo65004L();
        }

        /* renamed from: t */
        public float mo64969t() throws IOException {
            return Float.intBitsToFloat(mo65003K());
        }

        /* renamed from: u */
        public int mo64970u() throws IOException {
            return mo65005M();
        }

        /* renamed from: v */
        public long mo64971v() throws IOException {
            return mo65006N();
        }

        /* renamed from: w */
        public int mo64972w() throws IOException {
            return mo65003K();
        }

        /* renamed from: x */
        public long mo64973x() throws IOException {
            return mo65004L();
        }

        /* renamed from: y */
        public int mo64974y() throws IOException {
            return CodedInputStream.m79832b(mo65005M());
        }

        /* renamed from: z */
        public long mo64975z() throws IOException {
            return CodedInputStream.m79833c(mo65006N());
        }

        private UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f56683o = Integer.MAX_VALUE;
            this.f56674f = byteBuffer;
            long i = UnsafeUtil.m81387i(byteBuffer);
            this.f56676h = i;
            this.f56677i = ((long) byteBuffer.limit()) + i;
            long position = i + ((long) byteBuffer.position());
            this.f56678j = position;
            this.f56679k = position;
            this.f56675g = z;
        }
    }

    /* renamed from: b */
    public static int m79832b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m79833c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: f */
    public static CodedInputStream m79834f(InputStream inputStream) {
        return m79835g(inputStream, 4096);
    }

    /* renamed from: g */
    public static CodedInputStream m79835g(InputStream inputStream, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        } else if (inputStream == null) {
            return m79837i(Internal.f56937c);
        } else {
            return new StreamDecoder(inputStream, i);
        }
    }

    /* renamed from: h */
    static CodedInputStream m79836h(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m79839k(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && UnsafeDirectNioDecoder.m79990I()) {
            return new UnsafeDirectNioDecoder(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m79839k(bArr, 0, remaining, true);
    }

    /* renamed from: i */
    public static CodedInputStream m79837i(byte[] bArr) {
        return m79838j(bArr, 0, bArr.length);
    }

    /* renamed from: j */
    public static CodedInputStream m79838j(byte[] bArr, int i, int i2) {
        return m79839k(bArr, i, i2, false);
    }

    /* renamed from: k */
    static CodedInputStream m79839k(byte[] bArr, int i, int i2, boolean z) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i, i2, z);
        try {
            arrayDecoder.mo64962m(i2);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract String mo64951A() throws IOException;

    /* renamed from: B */
    public abstract String mo64952B() throws IOException;

    /* renamed from: C */
    public abstract int mo64953C() throws IOException;

    /* renamed from: D */
    public abstract int mo64954D() throws IOException;

    /* renamed from: E */
    public abstract long mo64955E() throws IOException;

    /* renamed from: F */
    public final int mo64956F(int i) {
        if (i >= 0) {
            int i2 = this.f56636c;
            this.f56636c = i;
            return i2;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i);
    }

    /* renamed from: G */
    public abstract boolean mo64957G(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo64958a(int i) throws InvalidProtocolBufferException;

    /* renamed from: d */
    public abstract int mo64959d();

    /* renamed from: e */
    public abstract boolean mo64960e() throws IOException;

    /* renamed from: l */
    public abstract void mo64961l(int i);

    /* renamed from: m */
    public abstract int mo64962m(int i) throws InvalidProtocolBufferException;

    /* renamed from: n */
    public abstract boolean mo64963n() throws IOException;

    /* renamed from: o */
    public abstract ByteString mo64964o() throws IOException;

    /* renamed from: p */
    public abstract double mo64965p() throws IOException;

    /* renamed from: q */
    public abstract int mo64966q() throws IOException;

    /* renamed from: r */
    public abstract int mo64967r() throws IOException;

    /* renamed from: s */
    public abstract long mo64968s() throws IOException;

    /* renamed from: t */
    public abstract float mo64969t() throws IOException;

    /* renamed from: u */
    public abstract int mo64970u() throws IOException;

    /* renamed from: v */
    public abstract long mo64971v() throws IOException;

    /* renamed from: w */
    public abstract int mo64972w() throws IOException;

    /* renamed from: x */
    public abstract long mo64973x() throws IOException;

    /* renamed from: y */
    public abstract int mo64974y() throws IOException;

    /* renamed from: z */
    public abstract long mo64975z() throws IOException;

    private CodedInputStream() {
        this.f56635b = 100;
        this.f56636c = Integer.MAX_VALUE;
        this.f56638e = false;
    }
}
