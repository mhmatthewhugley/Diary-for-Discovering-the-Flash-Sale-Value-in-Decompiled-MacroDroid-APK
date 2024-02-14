package p109i5;

import com.fasterxml.jackson.core.C6796a;
import com.fasterxml.jackson.core.C6802e;
import com.fasterxml.jackson.core.C6806h;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.p072io.C6811d;
import com.fasterxml.jackson.core.p072io.C6814g;
import com.fasterxml.jackson.core.p072io.C6819l;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import p115j5.C7457a;
import p115j5.C7460b;

/* renamed from: i5.a */
/* compiled from: ByteSourceJsonBootstrapper */
public final class C7419a {

    /* renamed from: a */
    protected final C6811d f18125a;

    /* renamed from: b */
    protected final InputStream f18126b;

    /* renamed from: c */
    protected final byte[] f18127c;

    /* renamed from: d */
    private int f18128d;

    /* renamed from: e */
    private int f18129e;

    /* renamed from: f */
    private final boolean f18130f;

    /* renamed from: g */
    protected int f18131g;

    /* renamed from: h */
    protected boolean f18132h = true;

    /* renamed from: i */
    protected int f18133i = 0;

    /* renamed from: i5.a$a */
    /* compiled from: ByteSourceJsonBootstrapper */
    static /* synthetic */ class C7420a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18134a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.core.a[] r0 = com.fasterxml.jackson.core.C6796a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18134a = r0
                com.fasterxml.jackson.core.a r1 = com.fasterxml.jackson.core.C6796a.UTF32_BE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18134a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.core.a r1 = com.fasterxml.jackson.core.C6796a.UTF32_LE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18134a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.core.a r1 = com.fasterxml.jackson.core.C6796a.UTF16_BE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18134a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.core.a r1 = com.fasterxml.jackson.core.C6796a.UTF16_LE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18134a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.core.a r1 = com.fasterxml.jackson.core.C6796a.UTF8     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p109i5.C7419a.C7420a.<clinit>():void");
        }
    }

    public C7419a(C6811d dVar, InputStream inputStream) {
        this.f18125a = dVar;
        this.f18126b = inputStream;
        this.f18127c = dVar.mo33901b();
        this.f18128d = 0;
        this.f18129e = 0;
        this.f18131g = 0;
        this.f18130f = true;
    }

    /* renamed from: a */
    private boolean m30632a(int i) {
        if ((65280 & i) == 0) {
            this.f18132h = true;
        } else if ((i & 255) != 0) {
            return false;
        } else {
            this.f18132h = false;
        }
        this.f18133i = 2;
        return true;
    }

    /* renamed from: b */
    private boolean m30633b(int i) throws IOException {
        if ((i >> 8) == 0) {
            this.f18132h = true;
        } else if ((16777215 & i) == 0) {
            this.f18132h = false;
        } else if ((-16711681 & i) == 0) {
            m30635h("3412");
        } else if ((i & -65281) != 0) {
            return false;
        } else {
            m30635h("2143");
        }
        this.f18133i = 4;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m30634g(int r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = -16842752(0xfffffffffeff0000, float:-1.6947657E38)
            r1 = 65534(0xfffe, float:9.1833E-41)
            r2 = 65279(0xfeff, float:9.1475E-41)
            r3 = 0
            r4 = 1
            if (r7 == r0) goto L_0x0030
            r0 = -131072(0xfffffffffffe0000, float:NaN)
            r5 = 4
            if (r7 == r0) goto L_0x0026
            if (r7 == r2) goto L_0x001c
            if (r7 == r1) goto L_0x0016
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "2143"
            r6.m30635h(r0)
            goto L_0x0030
        L_0x001c:
            r6.f18132h = r4
            int r7 = r6.f18128d
            int r7 = r7 + r5
            r6.f18128d = r7
            r6.f18133i = r5
            return r4
        L_0x0026:
            int r7 = r6.f18128d
            int r7 = r7 + r5
            r6.f18128d = r7
            r6.f18133i = r5
            r6.f18132h = r3
            return r4
        L_0x0030:
            java.lang.String r0 = "3412"
            r6.m30635h(r0)
        L_0x0035:
            int r0 = r7 >>> 16
            r5 = 2
            if (r0 != r2) goto L_0x0044
            int r7 = r6.f18128d
            int r7 = r7 + r5
            r6.f18128d = r7
            r6.f18133i = r5
            r6.f18132h = r4
            return r4
        L_0x0044:
            if (r0 != r1) goto L_0x0050
            int r7 = r6.f18128d
            int r7 = r7 + r5
            r6.f18128d = r7
            r6.f18133i = r5
            r6.f18132h = r3
            return r4
        L_0x0050:
            int r7 = r7 >>> 8
            r0 = 15711167(0xefbbbf, float:2.2016034E-38)
            if (r7 != r0) goto L_0x0062
            int r7 = r6.f18128d
            int r7 = r7 + 3
            r6.f18128d = r7
            r6.f18133i = r4
            r6.f18132h = r4
            return r4
        L_0x0062:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p109i5.C7419a.m30634g(int):boolean");
    }

    /* renamed from: h */
    private void m30635h(String str) throws IOException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    /* renamed from: c */
    public C6802e mo37469c(int i, C6806h hVar, C7457a aVar, C7460b bVar, boolean z, boolean z2) throws IOException, JsonParseException {
        boolean z3 = z;
        if (mo37471e() != C6796a.UTF8 || !z3) {
            boolean z4 = z2;
            return new C7424e(this.f18125a, i, mo37470d(), hVar, bVar.mo37605k(z, z2));
        }
        return new C7427g(this.f18125a, i, this.f18126b, hVar, aVar.mo37593p(z3, z2), this.f18127c, this.f18128d, this.f18129e, this.f18130f);
    }

    /* renamed from: d */
    public Reader mo37470d() throws IOException {
        C6796a f = this.f18125a.mo33905f();
        int i = C7420a.f18134a[f.ordinal()];
        if (i == 1 || i == 2) {
            C6811d dVar = this.f18125a;
            return new C6819l(dVar, this.f18126b, this.f18127c, this.f18128d, this.f18129e, dVar.mo33905f().mo33809d());
        } else if (i == 3 || i == 4 || i == 5) {
            InputStream inputStream = this.f18126b;
            if (inputStream == null) {
                inputStream = new ByteArrayInputStream(this.f18127c, this.f18128d, this.f18129e);
            } else if (this.f18128d < this.f18129e) {
                inputStream = new C6814g(this.f18125a, inputStream, this.f18127c, this.f18128d, this.f18129e);
            }
            return new InputStreamReader(inputStream, f.mo33808b());
        } else {
            throw new RuntimeException("Internal error");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        if (m30632a((r1[r5 + 1] & 255) | ((r1[r5] & 255) << 8)) != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        if (m30632a(r1 >>> 16) != false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.C6796a mo37471e() throws java.io.IOException, com.fasterxml.jackson.core.JsonParseException {
        /*
            r8 = this;
            r0 = 4
            boolean r1 = r8.mo37472f(r0)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0042
            byte[] r1 = r8.f18127c
            int r5 = r8.f18128d
            byte r6 = r1[r5]
            int r6 = r6 << 24
            int r7 = r5 + 1
            byte r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            r6 = r6 | r7
            int r7 = r5 + 2
            byte r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r6 = r6 | r7
            int r5 = r5 + 3
            byte r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r5 = r8.m30634g(r1)
            if (r5 == 0) goto L_0x0032
            goto L_0x005e
        L_0x0032:
            boolean r5 = r8.m30633b(r1)
            if (r5 == 0) goto L_0x0039
            goto L_0x005e
        L_0x0039:
            int r1 = r1 >>> 16
            boolean r1 = r8.m30632a(r1)
            if (r1 == 0) goto L_0x005f
            goto L_0x005e
        L_0x0042:
            boolean r1 = r8.mo37472f(r2)
            if (r1 == 0) goto L_0x005f
            byte[] r1 = r8.f18127c
            int r5 = r8.f18128d
            byte r6 = r1[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            int r5 = r5 + r3
            byte r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r1 = r8.m30632a(r1)
            if (r1 == 0) goto L_0x005f
        L_0x005e:
            r4 = 1
        L_0x005f:
            if (r4 != 0) goto L_0x0064
            com.fasterxml.jackson.core.a r0 = com.fasterxml.jackson.core.C6796a.UTF8
            goto L_0x008a
        L_0x0064:
            int r1 = r8.f18133i
            if (r1 == r3) goto L_0x0088
            if (r1 == r2) goto L_0x007e
            if (r1 != r0) goto L_0x0076
            boolean r0 = r8.f18132h
            if (r0 == 0) goto L_0x0073
            com.fasterxml.jackson.core.a r0 = com.fasterxml.jackson.core.C6796a.UTF32_BE
            goto L_0x008a
        L_0x0073:
            com.fasterxml.jackson.core.a r0 = com.fasterxml.jackson.core.C6796a.UTF32_LE
            goto L_0x008a
        L_0x0076:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Internal error"
            r0.<init>(r1)
            throw r0
        L_0x007e:
            boolean r0 = r8.f18132h
            if (r0 == 0) goto L_0x0085
            com.fasterxml.jackson.core.a r0 = com.fasterxml.jackson.core.C6796a.UTF16_BE
            goto L_0x008a
        L_0x0085:
            com.fasterxml.jackson.core.a r0 = com.fasterxml.jackson.core.C6796a.UTF16_LE
            goto L_0x008a
        L_0x0088:
            com.fasterxml.jackson.core.a r0 = com.fasterxml.jackson.core.C6796a.UTF8
        L_0x008a:
            com.fasterxml.jackson.core.io.d r1 = r8.f18125a
            r1.mo33913n(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p109i5.C7419a.mo37471e():com.fasterxml.jackson.core.a");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo37472f(int i) throws IOException {
        int i2;
        int i3 = this.f18129e - this.f18128d;
        while (i3 < i) {
            InputStream inputStream = this.f18126b;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = this.f18127c;
                int i4 = this.f18129e;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this.f18129e += i2;
            i3 += i2;
        }
        return true;
    }
}
