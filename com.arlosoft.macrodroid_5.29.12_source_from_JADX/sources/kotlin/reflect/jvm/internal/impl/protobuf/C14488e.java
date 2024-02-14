package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.C14516o;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e */
/* compiled from: CodedInputStream */
public final class C14488e {

    /* renamed from: a */
    private final byte[] f63336a;

    /* renamed from: b */
    private final boolean f63337b;

    /* renamed from: c */
    private int f63338c;

    /* renamed from: d */
    private int f63339d;

    /* renamed from: e */
    private int f63340e;

    /* renamed from: f */
    private final InputStream f63341f;

    /* renamed from: g */
    private int f63342g;

    /* renamed from: h */
    private boolean f63343h;

    /* renamed from: i */
    private int f63344i;

    /* renamed from: j */
    private int f63345j;

    /* renamed from: k */
    private int f63346k;

    /* renamed from: l */
    private int f63347l;

    /* renamed from: m */
    private int f63348m;

    /* renamed from: n */
    private C14489a f63349n;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e$a */
    /* compiled from: CodedInputStream */
    private interface C14489a {
        /* renamed from: a */
        void mo73361a();
    }

    private C14488e(InputStream inputStream) {
        this.f63343h = false;
        this.f63345j = Integer.MAX_VALUE;
        this.f63347l = 64;
        this.f63348m = 67108864;
        this.f63349n = null;
        this.f63336a = new byte[4096];
        this.f63338c = 0;
        this.f63340e = 0;
        this.f63344i = 0;
        this.f63341f = inputStream;
        this.f63337b = false;
    }

    /* renamed from: B */
    public static int m90863B(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw InvalidProtocolBufferException.m90809k();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.m90809k();
            } else if ((read2 & 128) == 0) {
                return i2;
            } else {
                i3 += 7;
            }
        }
        throw InvalidProtocolBufferException.m90805f();
    }

    /* renamed from: N */
    private void m90864N() {
        int i = this.f63338c + this.f63339d;
        this.f63338c = i;
        int i2 = this.f63344i + i;
        int i3 = this.f63345j;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f63339d = i4;
            this.f63338c = i - i4;
            return;
        }
        this.f63339d = 0;
    }

    /* renamed from: O */
    private void m90865O(int i) throws IOException {
        if (!m90867T(i)) {
            throw InvalidProtocolBufferException.m90809k();
        }
    }

    /* renamed from: S */
    private void m90866S(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f63344i;
            int i3 = this.f63340e;
            int i4 = i2 + i3 + i;
            int i5 = this.f63345j;
            if (i4 <= i5) {
                int i6 = this.f63338c;
                int i7 = i6 - i3;
                this.f63340e = i6;
                m90865O(1);
                while (true) {
                    int i8 = i - i7;
                    int i9 = this.f63338c;
                    if (i8 > i9) {
                        i7 += i9;
                        this.f63340e = i9;
                        m90865O(1);
                    } else {
                        this.f63340e = i8;
                        return;
                    }
                }
            } else {
                mo73340R((i5 - i2) - i3);
                throw InvalidProtocolBufferException.m90809k();
            }
        } else {
            throw InvalidProtocolBufferException.m90806g();
        }
    }

    /* renamed from: T */
    private boolean m90867T(int i) throws IOException {
        int i2 = this.f63340e;
        if (i2 + i <= this.f63338c) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        } else if (this.f63344i + i2 + i > this.f63345j) {
            return false;
        } else {
            C14489a aVar = this.f63349n;
            if (aVar != null) {
                aVar.mo73361a();
            }
            if (this.f63341f != null) {
                int i3 = this.f63340e;
                if (i3 > 0) {
                    int i4 = this.f63338c;
                    if (i4 > i3) {
                        byte[] bArr = this.f63336a;
                        System.arraycopy(bArr, i3, bArr, 0, i4 - i3);
                    }
                    this.f63344i += i3;
                    this.f63338c -= i3;
                    this.f63340e = 0;
                }
                InputStream inputStream = this.f63341f;
                byte[] bArr2 = this.f63336a;
                int i5 = this.f63338c;
                int read = inputStream.read(bArr2, i5, bArr2.length - i5);
                if (read == 0 || read < -1 || read > this.f63336a.length) {
                    StringBuilder sb2 = new StringBuilder(102);
                    sb2.append("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                } else if (read > 0) {
                    this.f63338c += read;
                    if ((this.f63344i + i) - this.f63348m <= 0) {
                        m90864N();
                        if (this.f63338c >= i) {
                            return true;
                        }
                        return m90867T(i);
                    }
                    throw InvalidProtocolBufferException.m90808j();
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public static int m90868b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m90869c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: d */
    private void m90870d(int i) throws IOException {
        if (this.f63338c - this.f63340e < i) {
            m90865O(i);
        }
    }

    /* renamed from: g */
    public static C14488e m90871g(InputStream inputStream) {
        return new C14488e(inputStream);
    }

    /* renamed from: h */
    static C14488e m90872h(C14513n nVar) {
        C14488e eVar = new C14488e(nVar);
        try {
            eVar.mo73345j(nVar.size());
            return eVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: x */
    private byte[] m90873x(int i) throws IOException {
        if (i > 0) {
            int i2 = this.f63344i;
            int i3 = this.f63340e;
            int i4 = i2 + i3 + i;
            int i5 = this.f63345j;
            if (i4 > i5) {
                mo73340R((i5 - i2) - i3);
                throw InvalidProtocolBufferException.m90809k();
            } else if (i < 4096) {
                byte[] bArr = new byte[i];
                int i6 = this.f63338c - i3;
                System.arraycopy(this.f63336a, i3, bArr, 0, i6);
                this.f63340e = this.f63338c;
                int i7 = i - i6;
                m90870d(i7);
                System.arraycopy(this.f63336a, 0, bArr, i6, i7);
                this.f63340e = i7;
                return bArr;
            } else {
                int i8 = this.f63338c;
                this.f63344i = i2 + i8;
                this.f63340e = 0;
                this.f63338c = 0;
                int i9 = i8 - i3;
                int i10 = i - i9;
                ArrayList<byte[]> arrayList = new ArrayList<>();
                while (i10 > 0) {
                    int min = Math.min(i10, 4096);
                    byte[] bArr2 = new byte[min];
                    int i11 = 0;
                    while (i11 < min) {
                        InputStream inputStream = this.f63341f;
                        int read = inputStream == null ? -1 : inputStream.read(bArr2, i11, min - i11);
                        if (read != -1) {
                            this.f63344i += read;
                            i11 += read;
                        } else {
                            throw InvalidProtocolBufferException.m90809k();
                        }
                    }
                    i10 -= min;
                    arrayList.add(bArr2);
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(this.f63336a, i3, bArr3, 0, i9);
                for (byte[] bArr4 : arrayList) {
                    System.arraycopy(bArr4, 0, bArr3, i9, bArr4.length);
                    i9 += bArr4.length;
                }
                return bArr3;
            }
        } else if (i == 0) {
            return C14503i.f63379a;
        } else {
            throw InvalidProtocolBufferException.m90806g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r2[r3] < 0) goto L_0x007c;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo73326A() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f63340e
            int r1 = r9.f63338c
            if (r1 != r0) goto L_0x0008
            goto L_0x007c
        L_0x0008:
            byte[] r2 = r9.f63336a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0013
            r9.f63340e = r3
            return r0
        L_0x0013:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x0019
            goto L_0x007c
        L_0x0019:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x002d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x0029:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L_0x0082
        L_0x002d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x003f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L_0x003d:
            r1 = r3
            goto L_0x0082
        L_0x003f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x004f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x0029
        L_0x004f:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x0082
        L_0x007c:
            long r0 = r9.mo73328D()
            int r1 = (int) r0
            return r1
        L_0x0082:
            r9.f63340e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C14488e.mo73326A():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b8;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo73327C() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f63340e
            int r1 = r9.f63338c
            if (r1 != r0) goto L_0x0008
            goto L_0x00b8
        L_0x0008:
            byte[] r2 = r9.f63336a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0014
            r9.f63340e = r3
            long r0 = (long) r0
            return r0
        L_0x0014:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x001b
            goto L_0x00b8
        L_0x001b:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x002b:
            long r2 = r3 ^ r5
            goto L_0x00bf
        L_0x002f:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            long r7 = (long) r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0042
            r1 = 16256(0x3f80, double:8.0315E-320)
        L_0x003d:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00bf
        L_0x0042:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            int r0 = r0 << 21
            long r7 = (long) r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x002b
        L_0x0052:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 28
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0063
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L_0x003d
        L_0x0063:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L_0x002b
        L_0x0076:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0089
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x003d
        L_0x0089:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x002b
        L_0x009c:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bd
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00be
        L_0x00b8:
            long r0 = r9.mo73328D()
            return r0
        L_0x00bd:
            r1 = r0
        L_0x00be:
            r2 = r3
        L_0x00bf:
            r9.f63340e = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C14488e.mo73327C():long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public long mo73328D() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte w = mo73358w();
            j |= ((long) (w & Byte.MAX_VALUE)) << i;
            if ((w & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m90805f();
    }

    /* renamed from: E */
    public int mo73329E() throws IOException {
        return mo73359y();
    }

    /* renamed from: F */
    public long mo73330F() throws IOException {
        return mo73360z();
    }

    /* renamed from: G */
    public int mo73331G() throws IOException {
        return m90868b(mo73326A());
    }

    /* renamed from: H */
    public long mo73332H() throws IOException {
        return m90869c(mo73327C());
    }

    /* renamed from: I */
    public String mo73333I() throws IOException {
        int A = mo73326A();
        int i = this.f63338c;
        int i2 = this.f63340e;
        if (A <= i - i2 && A > 0) {
            String str = new String(this.f63336a, i2, A, "UTF-8");
            this.f63340e += A;
            return str;
        } else if (A == 0) {
            return "";
        } else {
            return new String(m90873x(A), "UTF-8");
        }
    }

    /* renamed from: J */
    public String mo73334J() throws IOException {
        byte[] bArr;
        int A = mo73326A();
        int i = this.f63340e;
        if (A <= this.f63338c - i && A > 0) {
            bArr = this.f63336a;
            this.f63340e = i + A;
        } else if (A == 0) {
            return "";
        } else {
            bArr = m90873x(A);
            i = 0;
        }
        if (C14538v.m91113f(bArr, i, i + A)) {
            return new String(bArr, i, A, "UTF-8");
        }
        throw InvalidProtocolBufferException.m90803d();
    }

    /* renamed from: K */
    public int mo73335K() throws IOException {
        if (mo73343f()) {
            this.f63342g = 0;
            return 0;
        }
        int A = mo73326A();
        this.f63342g = A;
        if (C14539w.m91117a(A) != 0) {
            return this.f63342g;
        }
        throw InvalidProtocolBufferException.m90802c();
    }

    /* renamed from: L */
    public int mo73336L() throws IOException {
        return mo73326A();
    }

    /* renamed from: M */
    public long mo73337M() throws IOException {
        return mo73327C();
    }

    /* renamed from: P */
    public boolean mo73338P(int i, CodedOutputStream codedOutputStream) throws IOException {
        int b = C14539w.m91118b(i);
        if (b == 0) {
            long t = mo73355t();
            codedOutputStream.mo73264o0(i);
            codedOutputStream.mo73275z0(t);
            return true;
        } else if (b == 1) {
            long z = mo73360z();
            codedOutputStream.mo73264o0(i);
            codedOutputStream.mo73245V(z);
            return true;
        } else if (b == 2) {
            C14485d l = mo73347l();
            codedOutputStream.mo73264o0(i);
            codedOutputStream.mo73239P(l);
            return true;
        } else if (b == 3) {
            codedOutputStream.mo73264o0(i);
            mo73339Q(codedOutputStream);
            int c = C14539w.m91119c(C14539w.m91117a(i), 4);
            mo73341a(c);
            codedOutputStream.mo73264o0(c);
            return true;
        } else if (b == 4) {
            return false;
        } else {
            if (b == 5) {
                int y = mo73359y();
                codedOutputStream.mo73264o0(i);
                codedOutputStream.mo73244U(y);
                return true;
            }
            throw InvalidProtocolBufferException.m90804e();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: Q */
    public void mo73339Q(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2) throws java.io.IOException {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r1.mo73335K()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.mo73338P(r0, r2)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C14488e.mo73339Q(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream):void");
    }

    /* renamed from: R */
    public void mo73340R(int i) throws IOException {
        int i2 = this.f63338c;
        int i3 = this.f63340e;
        if (i > i2 - i3 || i < 0) {
            m90866S(i);
        } else {
            this.f63340e = i3 + i;
        }
    }

    /* renamed from: a */
    public void mo73341a(int i) throws InvalidProtocolBufferException {
        if (this.f63342g != i) {
            throw InvalidProtocolBufferException.m90801b();
        }
    }

    /* renamed from: e */
    public int mo73342e() {
        int i = this.f63345j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f63344i + this.f63340e);
    }

    /* renamed from: f */
    public boolean mo73343f() throws IOException {
        return this.f63340e == this.f63338c && !m90867T(1);
    }

    /* renamed from: i */
    public void mo73344i(int i) {
        this.f63345j = i;
        m90864N();
    }

    /* renamed from: j */
    public int mo73345j(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = i + this.f63344i + this.f63340e;
            int i3 = this.f63345j;
            if (i2 <= i3) {
                this.f63345j = i2;
                m90864N();
                return i3;
            }
            throw InvalidProtocolBufferException.m90809k();
        }
        throw InvalidProtocolBufferException.m90806g();
    }

    /* renamed from: k */
    public boolean mo73346k() throws IOException {
        return mo73327C() != 0;
    }

    /* renamed from: l */
    public C14485d mo73347l() throws IOException {
        int A = mo73326A();
        int i = this.f63338c;
        int i2 = this.f63340e;
        if (A <= i - i2 && A > 0) {
            C14485d i3 = (!this.f63337b || !this.f63343h) ? C14485d.m90838i(this.f63336a, i2, A) : new C14482c(this.f63336a, this.f63340e, A);
            this.f63340e += A;
            return i3;
        } else if (A == 0) {
            return C14485d.f63329a;
        } else {
            return new C14513n(m90873x(A));
        }
    }

    /* renamed from: m */
    public double mo73348m() throws IOException {
        return Double.longBitsToDouble(mo73360z());
    }

    /* renamed from: n */
    public int mo73349n() throws IOException {
        return mo73326A();
    }

    /* renamed from: o */
    public int mo73350o() throws IOException {
        return mo73359y();
    }

    /* renamed from: p */
    public long mo73351p() throws IOException {
        return mo73360z();
    }

    /* renamed from: q */
    public float mo73352q() throws IOException {
        return Float.intBitsToFloat(mo73359y());
    }

    /* renamed from: r */
    public void mo73353r(int i, C14516o.C14517a aVar, C14490f fVar) throws IOException {
        int i2 = this.f63346k;
        if (i2 < this.f63347l) {
            this.f63346k = i2 + 1;
            aVar.mo71034h0(this, fVar);
            mo73341a(C14539w.m91119c(i, 4));
            this.f63346k--;
            return;
        }
        throw InvalidProtocolBufferException.m90807h();
    }

    /* renamed from: s */
    public int mo73354s() throws IOException {
        return mo73326A();
    }

    /* renamed from: t */
    public long mo73355t() throws IOException {
        return mo73327C();
    }

    /* renamed from: u */
    public <T extends C14516o> T mo73356u(C14519q<T> qVar, C14490f fVar) throws IOException {
        int A = mo73326A();
        if (this.f63346k < this.f63347l) {
            int j = mo73345j(A);
            this.f63346k++;
            T t = (C14516o) qVar.mo71021c(this, fVar);
            mo73341a(0);
            this.f63346k--;
            mo73344i(j);
            return t;
        }
        throw InvalidProtocolBufferException.m90807h();
    }

    /* renamed from: v */
    public void mo73357v(C14516o.C14517a aVar, C14490f fVar) throws IOException {
        int A = mo73326A();
        if (this.f63346k < this.f63347l) {
            int j = mo73345j(A);
            this.f63346k++;
            aVar.mo71034h0(this, fVar);
            mo73341a(0);
            this.f63346k--;
            mo73344i(j);
            return;
        }
        throw InvalidProtocolBufferException.m90807h();
    }

    /* renamed from: w */
    public byte mo73358w() throws IOException {
        if (this.f63340e == this.f63338c) {
            m90865O(1);
        }
        byte[] bArr = this.f63336a;
        int i = this.f63340e;
        this.f63340e = i + 1;
        return bArr[i];
    }

    /* renamed from: y */
    public int mo73359y() throws IOException {
        int i = this.f63340e;
        if (this.f63338c - i < 4) {
            m90865O(4);
            i = this.f63340e;
        }
        byte[] bArr = this.f63336a;
        this.f63340e = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: z */
    public long mo73360z() throws IOException {
        int i = this.f63340e;
        if (this.f63338c - i < 8) {
            m90865O(8);
            i = this.f63340e;
        }
        byte[] bArr = this.f63336a;
        this.f63340e = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    private C14488e(C14513n nVar) {
        this.f63343h = false;
        this.f63345j = Integer.MAX_VALUE;
        this.f63347l = 64;
        this.f63348m = 67108864;
        this.f63349n = null;
        this.f63336a = nVar.f63390c;
        int M = nVar.mo73295M();
        this.f63340e = M;
        this.f63338c = M + nVar.size();
        this.f63344i = -this.f63340e;
        this.f63341f = null;
        this.f63337b = true;
    }
}
