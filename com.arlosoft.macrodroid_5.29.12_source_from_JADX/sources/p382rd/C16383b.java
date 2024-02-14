package p382rd;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import p351od.C15852c;
import p364pd.C16171b;
import p373qd.C16283b;
import p373qd.C16285c;
import p373qd.C16286d;
import p373qd.C16287e;
import p373qd.C16288f;
import p373qd.C16293h;
import p373qd.C16301k;
import p373qd.C16303m;
import p373qd.C16308p;
import p382rd.C16384c;
import p382rd.C16416i;

/* renamed from: rd.b */
/* compiled from: HtmlTreeBuilder */
public class C16383b extends C16497l {

    /* renamed from: A */
    static final String[] f66946A = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* renamed from: B */
    static final String[] f66947B = {"ol", "ul"};

    /* renamed from: C */
    static final String[] f66948C = {"button"};

    /* renamed from: D */
    static final String[] f66949D = {"html", "table"};

    /* renamed from: E */
    static final String[] f66950E = {"optgroup", "option"};

    /* renamed from: F */
    static final String[] f66951F = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};

    /* renamed from: G */
    static final String[] f66952G = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    /* renamed from: H */
    static final String[] f66953H = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", TypedValues.Attributes.S_FRAME, "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    /* renamed from: m */
    private C16384c f66954m;

    /* renamed from: n */
    private C16384c f66955n;

    /* renamed from: o */
    private boolean f66956o;

    /* renamed from: p */
    private C16293h f66957p;

    /* renamed from: q */
    private C16301k f66958q;

    /* renamed from: r */
    private C16293h f66959r;

    /* renamed from: s */
    private ArrayList<C16293h> f66960s;

    /* renamed from: t */
    private ArrayList<C16384c> f66961t;

    /* renamed from: u */
    private List<String> f66962u;

    /* renamed from: v */
    private C16416i.C16423g f66963v;

    /* renamed from: w */
    private boolean f66964w;

    /* renamed from: x */
    private boolean f66965x;

    /* renamed from: y */
    private boolean f66966y;

    /* renamed from: z */
    private String[] f66967z = {null};

    /* renamed from: L0 */
    private void m98181L0(ArrayList<C16293h> arrayList, C16293h hVar, C16293h hVar2) {
        int lastIndexOf = arrayList.lastIndexOf(hVar);
        C15852c.m95474c(lastIndexOf != -1);
        arrayList.set(lastIndexOf, hVar2);
    }

    /* renamed from: S */
    private boolean m98182S(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.f66967z;
        strArr3[0] = str;
        return m98183T(strArr3, strArr, strArr2);
    }

    /* renamed from: T */
    private boolean m98183T(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f67189e.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String z0 = this.f67189e.get(size).mo78885z0();
            if (C16171b.m97073d(z0, strArr)) {
                return true;
            }
            if (C16171b.m97073d(z0, strArr2)) {
                return false;
            }
            if (strArr3 != null && C16171b.m97073d(z0, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* renamed from: X */
    private void m98184X(C16293h hVar, C16416i iVar) {
        m98185e0(hVar, iVar);
        this.f67189e.add(hVar);
    }

    /* renamed from: e0 */
    private void m98185e0(C16303m mVar, C16416i iVar) {
        C16301k kVar;
        if (this.f67189e.isEmpty()) {
            this.f67188d.mo78862Y(mVar);
        } else if (!mo79159i0() || !C16171b.m97073d(mo79296a().mo78885z0(), C16384c.C16410z.f66995A)) {
            mo79296a().mo78862Y(mVar);
        } else {
            mo79152c0(mVar);
        }
        if (mVar instanceof C16293h) {
            C16293h hVar = (C16293h) mVar;
            if (hVar.mo78858G0().mo79210f() && (kVar = this.f66958q) != null) {
                kVar.mo78890J0(hVar);
            }
        }
        mo79300g(mVar, iVar);
    }

    /* renamed from: l0 */
    private boolean m98186l0(C16293h hVar, C16293h hVar2) {
        return hVar.mo78885z0().equals(hVar2.mo78885z0()) && hVar.mo78867e().equals(hVar2.mo78867e());
    }

    /* renamed from: s */
    private void m98187s(String... strArr) {
        int size = this.f67189e.size() - 1;
        while (size >= 0) {
            C16293h hVar = this.f67189e.get(size);
            if (!C16171b.m97072c(hVar.mo78885z0(), strArr) && !hVar.mo78885z0().equals("html")) {
                this.f67189e.remove(size);
                size--;
            } else {
                return;
            }
        }
    }

    /* renamed from: s0 */
    private static boolean m98188s0(ArrayList<C16293h> arrayList, C16293h hVar) {
        int size = arrayList.size() - 1;
        int i = size >= 256 ? size + InputDeviceCompat.SOURCE_ANY : 0;
        while (size >= i) {
            if (arrayList.get(size) == hVar) {
                return true;
            }
            size--;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo79106A() {
        return this.f66964w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public int mo79107A0(C16293h hVar) {
        for (int i = 0; i < this.f66960s.size(); i++) {
            if (hVar == this.f66960s.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo79108B() {
        mo79112D(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public boolean mo79109B0(C16416i iVar, C16384c cVar) {
        this.f67191g = iVar;
        return cVar.mo79187n(iVar, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo79110C(String str) {
        while (C16171b.m97073d(mo79296a().mo78885z0(), f66951F)) {
            if (str == null || !mo79297b(str)) {
                mo79178v0();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void mo79111C0(C16293h hVar) {
        this.f67189e.add(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo79112D(boolean z) {
        String[] strArr = z ? f66952G : f66951F;
        while (C16171b.m97073d(mo79296a().mo78885z0(), strArr)) {
            mo79178v0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo79113D0(C16293h hVar) {
        mo79168q(hVar);
        this.f66960s.add(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public C16293h mo79114E(String str) {
        for (int size = this.f66960s.size() - 1; size >= 0; size--) {
            C16293h hVar = this.f66960s.get(size);
            if (hVar == null) {
                return null;
            }
            if (hVar.mo78885z0().equals(str)) {
                return hVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void mo79115E0(C16384c cVar) {
        this.f66961t.add(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public String mo79116F() {
        return this.f67190f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F0 */
    public void mo79117F0(C16293h hVar, int i) {
        mo79168q(hVar);
        try {
            this.f66960s.add(i, hVar);
        } catch (IndexOutOfBoundsException unused) {
            this.f66960s.add(hVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public C16288f mo79118G() {
        return this.f67188d;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: G0 */
    void mo79119G0() {
        /*
            r8 = this;
            java.util.ArrayList<qd.h> r0 = r8.f67189e
            int r0 = r0.size()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto L_0x000b
            return
        L_0x000b:
            qd.h r0 = r8.mo79164n0()
            if (r0 == 0) goto L_0x006e
            boolean r1 = r8.mo79173t0(r0)
            if (r1 == 0) goto L_0x0018
            goto L_0x006e
        L_0x0018:
            java.util.ArrayList<qd.h> r1 = r8.f66960s
            int r1 = r1.size()
            int r2 = r1 + -12
            r3 = 0
            if (r2 >= 0) goto L_0x0024
            r2 = 0
        L_0x0024:
            r4 = 1
            int r1 = r1 - r4
            r5 = r1
        L_0x0027:
            if (r5 != r2) goto L_0x002a
            goto L_0x003d
        L_0x002a:
            java.util.ArrayList<qd.h> r0 = r8.f66960s
            int r5 = r5 + -1
            java.lang.Object r0 = r0.get(r5)
            qd.h r0 = (p373qd.C16293h) r0
            if (r0 == 0) goto L_0x003c
            boolean r6 = r8.mo79173t0(r0)
            if (r6 == 0) goto L_0x0027
        L_0x003c:
            r4 = 0
        L_0x003d:
            if (r4 != 0) goto L_0x0049
            java.util.ArrayList<qd.h> r0 = r8.f66960s
            int r5 = r5 + 1
            java.lang.Object r0 = r0.get(r5)
            qd.h r0 = (p373qd.C16293h) r0
        L_0x0049:
            p351od.C15852c.m95479h(r0)
            qd.h r2 = new qd.h
            java.lang.String r4 = r0.mo78885z0()
            rd.f r6 = r8.f67192h
            rd.h r4 = r8.mo79305n(r4, r6)
            r6 = 0
            qd.b r7 = r0.mo78867e()
            qd.b r7 = r7.clone()
            r2.<init>(r4, r6, r7)
            r8.mo79146W(r2)
            java.util.ArrayList<qd.h> r4 = r8.f66960s
            r4.set(r5, r2)
            if (r5 != r1) goto L_0x003c
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p382rd.C16383b.mo79119G0():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public C16301k mo79120H() {
        return this.f66958q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public void mo79121H0(C16293h hVar) {
        for (int size = this.f66960s.size() - 1; size >= 0; size--) {
            if (this.f66960s.get(size) == hVar) {
                this.f66960s.remove(size);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public C16293h mo79122I(String str) {
        int size = this.f67189e.size() - 1;
        int i = size >= 256 ? size + InputDeviceCompat.SOURCE_ANY : 0;
        while (size >= i) {
            C16293h hVar = this.f67189e.get(size);
            if (hVar.mo78885z0().equals(str)) {
                return hVar;
            }
            size--;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public boolean mo79123I0(C16293h hVar) {
        for (int size = this.f67189e.size() - 1; size >= 0; size--) {
            if (this.f67189e.get(size) == hVar) {
                this.f67189e.remove(size);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public C16293h mo79124J() {
        return this.f66957p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public C16293h mo79125J0() {
        int size = this.f66960s.size();
        if (size > 0) {
            return this.f66960s.remove(size - 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public List<String> mo79126K() {
        return this.f66962u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void mo79127K0(C16293h hVar, C16293h hVar2) {
        m98181L0(this.f66960s, hVar, hVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public ArrayList<C16293h> mo79128L() {
        return this.f67189e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public boolean mo79129M(String str) {
        return mo79135P(str, f66948C);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void mo79130M0(C16293h hVar, C16293h hVar2) {
        m98181L0(this.f67189e, hVar, hVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public boolean mo79131N(String str) {
        return mo79135P(str, f66947B);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void mo79132N0() {
        if (!mo79171r0("body")) {
            this.f67189e.add(this.f67188d.mo78831J0());
        }
        mo79144U0(C16384c.InBody);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean mo79133O(String str) {
        return mo79135P(str, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo79134O0() {
        /*
            r9 = this;
            java.util.ArrayList<qd.h> r0 = r9.f67189e
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 256(0x100, float:3.59E-43)
            r3 = 0
            if (r0 < r2) goto L_0x0010
            int r2 = r0 + -256
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            rd.c r4 = r9.f66954m
            java.util.ArrayList<qd.h> r5 = r9.f67189e
            int r5 = r5.size()
            if (r5 != 0) goto L_0x0020
            rd.c r5 = p382rd.C16384c.InBody
            r9.mo79144U0(r5)
        L_0x0020:
            r5 = 0
        L_0x0021:
            if (r0 < r2) goto L_0x016c
            java.util.ArrayList<qd.h> r6 = r9.f67189e
            java.lang.Object r6 = r6.get(r0)
            qd.h r6 = (p373qd.C16293h) r6
            if (r0 != r2) goto L_0x0034
            boolean r5 = r9.f66966y
            if (r5 == 0) goto L_0x0033
            qd.h r6 = r9.f66959r
        L_0x0033:
            r5 = 1
        L_0x0034:
            if (r6 == 0) goto L_0x003b
            java.lang.String r6 = r6.mo78885z0()
            goto L_0x003d
        L_0x003b:
            java.lang.String r6 = ""
        L_0x003d:
            r6.hashCode()
            int r7 = r6.hashCode()
            r8 = -1
            switch(r7) {
                case -1644953643: goto L_0x00f9;
                case -1321546630: goto L_0x00ee;
                case -906021636: goto L_0x00e3;
                case -636197633: goto L_0x00d8;
                case 3696: goto L_0x00cd;
                case 3700: goto L_0x00c2;
                case 3710: goto L_0x00b7;
                case 3029410: goto L_0x00ac;
                case 3198432: goto L_0x009e;
                case 3213227: goto L_0x0090;
                case 110115790: goto L_0x0082;
                case 110157846: goto L_0x0074;
                case 110277346: goto L_0x0066;
                case 110326868: goto L_0x0058;
                case 552573414: goto L_0x004a;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0103
        L_0x004a:
            java.lang.String r7 = "caption"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0054
            goto L_0x0103
        L_0x0054:
            r8 = 14
            goto L_0x0103
        L_0x0058:
            java.lang.String r7 = "thead"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0062
            goto L_0x0103
        L_0x0062:
            r8 = 13
            goto L_0x0103
        L_0x0066:
            java.lang.String r7 = "tfoot"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0070
            goto L_0x0103
        L_0x0070:
            r8 = 12
            goto L_0x0103
        L_0x0074:
            java.lang.String r7 = "tbody"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x007e
            goto L_0x0103
        L_0x007e:
            r8 = 11
            goto L_0x0103
        L_0x0082:
            java.lang.String r7 = "table"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x008c
            goto L_0x0103
        L_0x008c:
            r8 = 10
            goto L_0x0103
        L_0x0090:
            java.lang.String r7 = "html"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009a
            goto L_0x0103
        L_0x009a:
            r8 = 9
            goto L_0x0103
        L_0x009e:
            java.lang.String r7 = "head"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00a8
            goto L_0x0103
        L_0x00a8:
            r8 = 8
            goto L_0x0103
        L_0x00ac:
            java.lang.String r7 = "body"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00b5
            goto L_0x0103
        L_0x00b5:
            r8 = 7
            goto L_0x0103
        L_0x00b7:
            java.lang.String r7 = "tr"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00c0
            goto L_0x0103
        L_0x00c0:
            r8 = 6
            goto L_0x0103
        L_0x00c2:
            java.lang.String r7 = "th"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00cb
            goto L_0x0103
        L_0x00cb:
            r8 = 5
            goto L_0x0103
        L_0x00cd:
            java.lang.String r7 = "td"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00d6
            goto L_0x0103
        L_0x00d6:
            r8 = 4
            goto L_0x0103
        L_0x00d8:
            java.lang.String r7 = "colgroup"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00e1
            goto L_0x0103
        L_0x00e1:
            r8 = 3
            goto L_0x0103
        L_0x00e3:
            java.lang.String r7 = "select"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00ec
            goto L_0x0103
        L_0x00ec:
            r8 = 2
            goto L_0x0103
        L_0x00ee:
            java.lang.String r7 = "template"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00f7
            goto L_0x0103
        L_0x00f7:
            r8 = 1
            goto L_0x0103
        L_0x00f9:
            java.lang.String r7 = "frameset"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r8 = 0
        L_0x0103:
            switch(r8) {
                case 0: goto L_0x0167;
                case 1: goto L_0x015a;
                case 2: goto L_0x0154;
                case 3: goto L_0x014e;
                case 4: goto L_0x013a;
                case 5: goto L_0x013a;
                case 6: goto L_0x0134;
                case 7: goto L_0x012e;
                case 8: goto L_0x0126;
                case 9: goto L_0x0119;
                case 10: goto L_0x0113;
                case 11: goto L_0x010d;
                case 12: goto L_0x010d;
                case 13: goto L_0x010d;
                case 14: goto L_0x0107;
                default: goto L_0x0106;
            }
        L_0x0106:
            goto L_0x0142
        L_0x0107:
            rd.c r0 = p382rd.C16384c.InCaption
            r9.mo79144U0(r0)
            goto L_0x016c
        L_0x010d:
            rd.c r0 = p382rd.C16384c.InTableBody
            r9.mo79144U0(r0)
            goto L_0x016c
        L_0x0113:
            rd.c r0 = p382rd.C16384c.InTable
            r9.mo79144U0(r0)
            goto L_0x016c
        L_0x0119:
            qd.h r0 = r9.f66957p
            if (r0 != 0) goto L_0x0120
            rd.c r0 = p382rd.C16384c.BeforeHead
            goto L_0x0122
        L_0x0120:
            rd.c r0 = p382rd.C16384c.AfterHead
        L_0x0122:
            r9.mo79144U0(r0)
            goto L_0x016c
        L_0x0126:
            if (r5 != 0) goto L_0x0142
            rd.c r0 = p382rd.C16384c.InHead
            r9.mo79144U0(r0)
            goto L_0x016c
        L_0x012e:
            rd.c r0 = p382rd.C16384c.InBody
            r9.mo79144U0(r0)
            goto L_0x016c
        L_0x0134:
            rd.c r0 = p382rd.C16384c.InRow
            r9.mo79144U0(r0)
            goto L_0x016c
        L_0x013a:
            if (r5 != 0) goto L_0x0142
            rd.c r0 = p382rd.C16384c.InCell
            r9.mo79144U0(r0)
            goto L_0x016c
        L_0x0142:
            if (r5 == 0) goto L_0x014a
            rd.c r0 = p382rd.C16384c.InBody
            r9.mo79144U0(r0)
            goto L_0x016c
        L_0x014a:
            int r0 = r0 + -1
            goto L_0x0021
        L_0x014e:
            rd.c r0 = p382rd.C16384c.InColumnGroup
            r9.mo79144U0(r0)
            goto L_0x016c
        L_0x0154:
            rd.c r0 = p382rd.C16384c.InSelect
            r9.mo79144U0(r0)
            goto L_0x016c
        L_0x015a:
            rd.c r0 = r9.mo79181x()
            java.lang.String r2 = "Bug: no template insertion mode on stack!"
            p351od.C15852c.m95480i(r0, r2)
            r9.mo79144U0(r0)
            goto L_0x016c
        L_0x0167:
            rd.c r0 = p382rd.C16384c.InFrameset
            r9.mo79144U0(r0)
        L_0x016c:
            rd.c r0 = r9.f66954m
            if (r0 == r4) goto L_0x0171
            goto L_0x0172
        L_0x0171:
            r1 = 0
        L_0x0172:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p382rd.C16383b.mo79134O0():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo79135P(String str, String[] strArr) {
        return m98182S(str, f66946A, strArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo79136P0(C16301k kVar) {
        this.f66958q = kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo79137Q(String[] strArr) {
        return m98183T(strArr, f66946A, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo79138Q0(boolean z) {
        this.f66965x = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public boolean mo79139R(String str) {
        for (int size = this.f67189e.size() - 1; size >= 0; size--) {
            String z0 = this.f67189e.get(size).mo78885z0();
            if (z0.equals(str)) {
                return true;
            }
            if (!C16171b.m97073d(z0, f66950E)) {
                return false;
            }
        }
        C15852c.m95472a("Should not be reachable");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void mo79140R0(C16293h hVar) {
        this.f66957p = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public C16384c mo79141S0() {
        return this.f66954m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public int mo79142T0() {
        return this.f66961t.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public boolean mo79143U(String str) {
        return m98182S(str, f66949D, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void mo79144U0(C16384c cVar) {
        this.f66954m = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public C16293h mo79145V(C16416i.C16424h hVar) {
        if (hVar.mo79257E() && !hVar.f67083n.isEmpty() && hVar.f67083n.mo78802q(this.f67192h) > 0) {
            mo79298d("Dropped duplicate attribute(s) in tag [%s]", hVar.f67074e);
        }
        if (hVar.mo79258F()) {
            C16293h a0 = mo79149a0(hVar);
            this.f67189e.add(a0);
            this.f67187c.mo79294x(C16429k.Data);
            this.f67187c.mo79284n(this.f66963v.mo79233o().mo79260H(a0.mo78859H0()));
            return a0;
        }
        C16293h hVar2 = new C16293h(mo79305n(hVar.mo79259G(), this.f67192h), (String) null, this.f67192h.mo79195c(hVar.f67083n));
        m98184X(hVar2, hVar);
        return hVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo79146W(C16293h hVar) {
        m98185e0(hVar, (C16416i) null);
        this.f67189e.add(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo79147Y(C16416i.C16419c cVar) {
        C16303m mVar;
        C16293h a = mo79296a();
        String z0 = a.mo78885z0();
        String u = cVar.mo79239u();
        if (cVar.mo79226h()) {
            mVar = new C16285c(u);
        } else if (mo79157h0(z0)) {
            mVar = new C16287e(u);
        } else {
            mVar = new C16308p(u);
        }
        a.mo78862Y(mVar);
        mo79300g(mVar, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo79148Z(C16416i.C16420d dVar) {
        m98185e0(new C16286d(dVar.mo79243w()), dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public C16293h mo79149a0(C16416i.C16424h hVar) {
        C16415h n = mo79305n(hVar.mo79259G(), this.f67192h);
        C16293h hVar2 = new C16293h(n, (String) null, this.f67192h.mo79195c(hVar.f67083n));
        m98185e0(hVar2, hVar);
        if (hVar.mo79258F()) {
            if (!n.mo79212h()) {
                n.mo79217q();
            } else if (!n.mo79208e()) {
                this.f67187c.mo79290t("Tag [%s] cannot be self closing; not a void tag", n.mo79215n());
            }
        }
        return hVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public C16301k mo79150b0(C16416i.C16424h hVar, boolean z, boolean z2) {
        C16301k kVar = new C16301k(mo79305n(hVar.mo79259G(), this.f67192h), (String) null, this.f67192h.mo79195c(hVar.f67083n));
        if (!z2) {
            mo79136P0(kVar);
        } else if (!mo79171r0("template")) {
            mo79136P0(kVar);
        }
        m98185e0(kVar, hVar);
        if (z) {
            this.f67189e.add(kVar);
        }
        return kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C16413f mo79151c() {
        return C16413f.f67036c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo79152c0(C16303m mVar) {
        C16293h hVar;
        C16293h I = mo79122I("table");
        boolean z = false;
        if (I == null) {
            hVar = this.f67189e.get(0);
        } else if (I.mo78857G() != null) {
            hVar = I.mo78857G();
            z = true;
        } else {
            hVar = mo79166p(I);
        }
        if (z) {
            C15852c.m95479h(I);
            I.mo78865c0(mVar);
            return;
        }
        hVar.mo78862Y(mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo79153d0() {
        this.f66960s.add((Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo79154e(Reader reader, String str, C16414g gVar) {
        super.mo79154e(reader, str, gVar);
        this.f66954m = C16384c.Initial;
        this.f66955n = null;
        this.f66956o = false;
        this.f66957p = null;
        this.f66958q = null;
        this.f66959r = null;
        this.f66960s = new ArrayList<>();
        this.f66961t = new ArrayList<>();
        this.f66962u = new ArrayList();
        this.f66963v = new C16416i.C16423g();
        this.f66964w = true;
        this.f66965x = false;
        this.f66966y = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo79155f0(C16293h hVar, C16293h hVar2) {
        int lastIndexOf = this.f67189e.lastIndexOf(hVar);
        C15852c.m95474c(lastIndexOf != -1);
        this.f67189e.add(lastIndexOf + 1, hVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public C16293h mo79156g0(String str) {
        C16293h hVar = new C16293h(mo79305n(str, this.f67192h), (String) null);
        mo79146W(hVar);
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public boolean mo79157h0(String str) {
        return str.equals("script") || str.equals("style");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo79158i(C16416i iVar) {
        this.f67191g = iVar;
        return this.f66954m.mo79187n(iVar, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public boolean mo79159i0() {
        return this.f66965x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public boolean mo79160j0() {
        return this.f66966y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public boolean mo79161k0(C16293h hVar) {
        return m98188s0(this.f66960s, hVar);
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ boolean mo79162l(String str, C16283b bVar) {
        return super.mo79162l(str, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public boolean mo79163m0(C16293h hVar) {
        return C16171b.m97073d(hVar.mo78885z0(), f66953H);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public C16293h mo79164n0() {
        if (this.f66960s.size() <= 0) {
            return null;
        }
        ArrayList<C16293h> arrayList = this.f66960s;
        return arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void mo79165o0() {
        this.f66955n = this.f66954m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C16293h mo79166p(C16293h hVar) {
        for (int size = this.f67189e.size() - 1; size >= 0; size--) {
            if (this.f67189e.get(size) == hVar) {
                return this.f67189e.get(size - 1);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void mo79167p0(C16293h hVar) {
        if (!this.f66956o) {
            String a = hVar.mo78821a("href");
            if (a.length() != 0) {
                this.f67190f = a;
                this.f66956o = true;
                this.f67188d.mo78901P(a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo79168q(C16293h hVar) {
        int size = this.f66960s.size() - 1;
        int i = size - 12;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        while (size >= i) {
            C16293h hVar2 = this.f66960s.get(size);
            if (hVar2 != null) {
                if (m98186l0(hVar, hVar2)) {
                    i2++;
                }
                if (i2 == 3) {
                    this.f66960s.remove(size);
                    return;
                }
                size--;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo79169q0() {
        this.f66962u = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000c, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo79170r() {
        /*
            r1 = this;
        L_0x0000:
            java.util.ArrayList<qd.h> r0 = r1.f66960s
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x000e
            qd.h r0 = r1.mo79125J0()
            if (r0 != 0) goto L_0x0000
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p382rd.C16383b.mo79170r():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public boolean mo79171r0(String str) {
        return mo79122I(str) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo79172t() {
        m98187s("tbody", "tfoot", "thead", "template");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public boolean mo79173t0(C16293h hVar) {
        return m98188s0(this.f67189e, hVar);
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.f67191g + ", state=" + this.f66954m + ", currentElement=" + mo79296a() + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo79175u() {
        m98187s("table", "template");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public C16384c mo79176u0() {
        return this.f66955n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo79177v() {
        m98187s("tr", "template");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public C16293h mo79178v0() {
        return this.f67189e.remove(this.f67189e.size() - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo79179w(String str) {
        mo79110C(str);
        if (!str.equals(mo79296a().mo78885z0())) {
            mo79183y(mo79141S0());
        }
        mo79182x0(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo79180w0(String str) {
        int size = this.f67189e.size() - 1;
        while (size >= 0 && !this.f67189e.get(size).mo78885z0().equals(str)) {
            this.f67189e.remove(size);
            size--;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C16384c mo79181x() {
        if (this.f66961t.size() <= 0) {
            return null;
        }
        ArrayList<C16384c> arrayList = this.f66961t;
        return arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public C16293h mo79182x0(String str) {
        for (int size = this.f67189e.size() - 1; size >= 0; size--) {
            C16293h hVar = this.f67189e.get(size);
            this.f67189e.remove(size);
            if (hVar.mo78885z0().equals(str)) {
                C16416i iVar = this.f67191g;
                if (iVar instanceof C16416i.C16423g) {
                    mo79299f(hVar, iVar);
                }
                return hVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo79183y(C16384c cVar) {
        if (this.f67185a.mo79199a().mo79191c()) {
            this.f67185a.mo79199a().add(new C16411d(this.f67186b, "Unexpected %s token [%s] when in state [%s]", this.f67191g.mo79236s(), this.f67191g, cVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo79184y0(String... strArr) {
        int size = this.f67189e.size() - 1;
        while (size >= 0) {
            this.f67189e.remove(size);
            if (!C16171b.m97073d(this.f67189e.get(size).mo78885z0(), strArr)) {
                size--;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo79185z(boolean z) {
        this.f66964w = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public C16384c mo79186z0() {
        if (this.f66961t.size() <= 0) {
            return null;
        }
        ArrayList<C16384c> arrayList = this.f66961t;
        return arrayList.remove(arrayList.size() - 1);
    }
}
