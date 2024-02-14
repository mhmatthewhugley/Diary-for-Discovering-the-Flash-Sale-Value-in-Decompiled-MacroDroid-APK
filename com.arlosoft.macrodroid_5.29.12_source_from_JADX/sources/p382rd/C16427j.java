package p382rd;

import java.util.Arrays;
import p351od.C15852c;
import p373qd.C16296i;
import p382rd.C16416i;

/* renamed from: rd.j */
/* compiled from: Tokeniser */
final class C16427j {

    /* renamed from: u */
    private static final char[] f67091u;

    /* renamed from: v */
    static final int[] f67092v = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: a */
    private final C16382a f67093a;

    /* renamed from: b */
    private final C16412e f67094b;

    /* renamed from: c */
    private C16429k f67095c = C16429k.Data;

    /* renamed from: d */
    private C16416i f67096d = null;

    /* renamed from: e */
    private boolean f67097e = false;

    /* renamed from: f */
    private String f67098f = null;

    /* renamed from: g */
    private final StringBuilder f67099g = new StringBuilder(1024);

    /* renamed from: h */
    StringBuilder f67100h = new StringBuilder(1024);

    /* renamed from: i */
    C16416i.C16424h f67101i = new C16416i.C16424h();

    /* renamed from: j */
    C16416i.C16423g f67102j = new C16416i.C16423g();

    /* renamed from: k */
    C16416i.C16425i f67103k = this.f67101i;

    /* renamed from: l */
    C16416i.C16419c f67104l = new C16416i.C16419c();

    /* renamed from: m */
    C16416i.C16421e f67105m = new C16416i.C16421e();

    /* renamed from: n */
    C16416i.C16420d f67106n = new C16416i.C16420d();

    /* renamed from: o */
    private String f67107o;

    /* renamed from: p */
    private String f67108p;

    /* renamed from: q */
    private int f67109q;

    /* renamed from: r */
    private int f67110r = -1;

    /* renamed from: s */
    private final int[] f67111s = new int[1];

    /* renamed from: t */
    private final int[] f67112t = new int[2];

    /* renamed from: rd.j$a */
    /* compiled from: Tokeniser */
    static /* synthetic */ class C16428a {

        /* renamed from: a */
        static final /* synthetic */ int[] f67113a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                rd.k[] r0 = p382rd.C16429k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f67113a = r0
                rd.k r1 = p382rd.C16429k.TagOpen     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f67113a     // Catch:{ NoSuchFieldError -> 0x001d }
                rd.k r1 = p382rd.C16429k.Data     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p382rd.C16427j.C16428a.<clinit>():void");
        }
    }

    static {
        char[] cArr = {9, 10, 13, 12, ' ', '<', '&'};
        f67091u = cArr;
        Arrays.sort(cArr);
    }

    C16427j(C16382a aVar, C16412e eVar) {
        this.f67093a = aVar;
        this.f67094b = eVar;
    }

    /* renamed from: d */
    private void m98410d(String str, Object... objArr) {
        if (this.f67094b.mo79191c()) {
            C16412e eVar = this.f67094b;
            C16382a aVar = this.f67093a;
            eVar.add(new C16411d(aVar, String.format("Invalid character reference: " + str, objArr)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo79272a(C16429k kVar) {
        mo79294x(kVar);
        this.f67093a.mo79082a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo79273b() {
        return this.f67107o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo79274c() {
        if (this.f67108p == null) {
            this.f67108p = "</" + this.f67107o;
        }
        return this.f67108p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] mo79275e(Character ch, boolean z) {
        int i;
        if (this.f67093a.mo79104x()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.f67093a.mo79102v()) || this.f67093a.mo79070J(f67091u)) {
            return null;
        }
        int[] iArr = this.f67111s;
        this.f67093a.mo79064D();
        if (this.f67093a.mo79065E("#")) {
            boolean F = this.f67093a.mo79066F("X");
            C16382a aVar = this.f67093a;
            String k = F ? aVar.mo79090k() : aVar.mo79089j();
            if (k.length() == 0) {
                m98410d("numeric reference with no numerals", new Object[0]);
                this.f67093a.mo79078S();
                return null;
            }
            this.f67093a.mo79081W();
            if (!this.f67093a.mo79065E(";")) {
                m98410d("missing semicolon on [&#%s]", k);
            }
            try {
                i = Integer.valueOf(k, F ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i == -1 || ((i >= 55296 && i <= 57343) || i > 1114111)) {
                m98410d("character [%s] outside of valid range", Integer.valueOf(i));
                iArr[0] = 65533;
            } else {
                if (i >= 128) {
                    int[] iArr2 = f67092v;
                    if (i < iArr2.length + 128) {
                        m98410d("character [%s] is not a valid unicode code point", Integer.valueOf(i));
                        i = iArr2[i - 128];
                    }
                }
                iArr[0] = i;
            }
            return iArr;
        }
        String m = this.f67093a.mo79092m();
        boolean G = this.f67093a.mo79067G(';');
        if (!(C16296i.m97833f(m) || (C16296i.m97834g(m) && G))) {
            this.f67093a.mo79078S();
            if (G) {
                m98410d("invalid named reference [%s]", m);
            }
            return null;
        } else if (!z || (!this.f67093a.mo79074N() && !this.f67093a.mo79072L() && !this.f67093a.mo79069I('=', '-', '_'))) {
            this.f67093a.mo79081W();
            if (!this.f67093a.mo79065E(";")) {
                m98410d("missing semicolon on [&%s]", m);
            }
            int d = C16296i.m97831d(m, this.f67112t);
            if (d == 1) {
                iArr[0] = this.f67112t[0];
                return iArr;
            } else if (d == 2) {
                return this.f67112t;
            } else {
                C15852c.m95472a("Unexpected characters returned for " + m);
                return this.f67112t;
            }
        } else {
            this.f67093a.mo79078S();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo79276f() {
        this.f67106n.mo79233o();
        this.f67106n.f67067f = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo79277g() {
        this.f67106n.mo79233o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo79278h() {
        this.f67105m.mo79233o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C16416i.C16425i mo79279i(boolean z) {
        C16416i.C16425i K = z ? this.f67101i.mo79233o() : this.f67102j.mo79233o();
        this.f67103k = K;
        return K;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo79280j() {
        C16416i.m98351p(this.f67100h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo79281k(char c) {
        if (this.f67098f == null) {
            this.f67098f = String.valueOf(c);
        } else {
            if (this.f67099g.length() == 0) {
                this.f67099g.append(this.f67098f);
            }
            this.f67099g.append(c);
        }
        this.f67104l.mo79235r(this.f67110r);
        this.f67104l.mo79225g(this.f67093a.mo79077Q());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo79282l(String str) {
        if (this.f67098f == null) {
            this.f67098f = str;
        } else {
            if (this.f67099g.length() == 0) {
                this.f67099g.append(this.f67098f);
            }
            this.f67099g.append(str);
        }
        this.f67104l.mo79235r(this.f67110r);
        this.f67104l.mo79225g(this.f67093a.mo79077Q());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo79283m(StringBuilder sb) {
        if (this.f67098f == null) {
            this.f67098f = sb.toString();
        } else {
            if (this.f67099g.length() == 0) {
                this.f67099g.append(this.f67098f);
            }
            this.f67099g.append(sb);
        }
        this.f67104l.mo79235r(this.f67110r);
        this.f67104l.mo79225g(this.f67093a.mo79077Q());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo79284n(C16416i iVar) {
        C15852c.m95473b(this.f67097e);
        this.f67096d = iVar;
        this.f67097e = true;
        iVar.mo79235r(this.f67109q);
        iVar.mo79225g(this.f67093a.mo79077Q());
        this.f67110r = -1;
        C16416i.C16426j jVar = iVar.f67061a;
        if (jVar == C16416i.C16426j.StartTag) {
            this.f67107o = ((C16416i.C16424h) iVar).f67073d;
            this.f67108p = null;
        } else if (jVar == C16416i.C16426j.EndTag) {
            C16416i.C16423g gVar = (C16416i.C16423g) iVar;
            if (gVar.mo79257E()) {
                mo79290t("Attributes incorrectly present on end tag [/%s]", gVar.mo79262J());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo79285o(int[] iArr) {
        mo79282l(new String(iArr, 0, iArr.length));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo79286p() {
        mo79284n(this.f67106n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo79287q() {
        mo79284n(this.f67105m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo79288r() {
        this.f67103k.mo79255C();
        mo79284n(this.f67103k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo79289s(C16429k kVar) {
        if (this.f67094b.mo79191c()) {
            this.f67094b.add(new C16411d(this.f67093a, "Unexpectedly reached end of file (EOF) in input state [%s]", kVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo79290t(String str, Object... objArr) {
        if (this.f67094b.mo79191c()) {
            this.f67094b.add(new C16411d(this.f67093a, str, objArr));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo79291u(C16429k kVar) {
        if (this.f67094b.mo79191c()) {
            C16412e eVar = this.f67094b;
            C16382a aVar = this.f67093a;
            eVar.add(new C16411d(aVar, "Unexpected character '%s' in input state [%s]", Character.valueOf(aVar.mo79102v()), kVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo79292v() {
        return this.f67107o != null && this.f67103k.mo79259G().equalsIgnoreCase(this.f67107o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C16416i mo79293w() {
        while (!this.f67097e) {
            this.f67095c.mo79295m(this, this.f67093a);
        }
        StringBuilder sb = this.f67099g;
        if (sb.length() != 0) {
            String sb2 = sb.toString();
            sb.delete(0, sb.length());
            C16416i.C16419c t = this.f67104l.mo79238t(sb2);
            this.f67098f = null;
            return t;
        }
        String str = this.f67098f;
        if (str != null) {
            C16416i.C16419c t2 = this.f67104l.mo79238t(str);
            this.f67098f = null;
            return t2;
        }
        this.f67097e = false;
        return this.f67096d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo79294x(C16429k kVar) {
        int i = C16428a.f67113a[kVar.ordinal()];
        if (i == 1) {
            this.f67109q = this.f67093a.mo79077Q();
        } else if (i == 2 && this.f67110r == -1) {
            this.f67110r = this.f67093a.mo79077Q();
        }
        this.f67095c = kVar;
    }
}
