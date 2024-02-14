package p382rd;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.HashMap;
import java.util.Map;
import p351od.C15852c;
import p364pd.C16170a;

/* renamed from: rd.h */
/* compiled from: Tag */
public class C16415h implements Cloneable {

    /* renamed from: A */
    private static final Map<String, C16415h> f67044A = new HashMap();

    /* renamed from: B */
    private static final String[] f67045B;

    /* renamed from: C */
    private static final String[] f67046C = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA, "bdi", "s", "strike", "nobr"};

    /* renamed from: D */
    private static final String[] f67047D = {"meta", "link", "base", TypedValues.Attributes.S_FRAME, "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};

    /* renamed from: E */
    private static final String[] f67048E = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};

    /* renamed from: F */
    private static final String[] f67049F = {"pre", "plaintext", "title", "textarea"};

    /* renamed from: G */
    private static final String[] f67050G = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};

    /* renamed from: H */
    private static final String[] f67051H = {"input", "keygen", "object", "select", "textarea"};

    /* renamed from: a */
    private String f67052a;

    /* renamed from: c */
    private String f67053c;

    /* renamed from: d */
    private boolean f67054d = true;

    /* renamed from: f */
    private boolean f67055f = true;

    /* renamed from: g */
    private boolean f67056g = false;

    /* renamed from: o */
    private boolean f67057o = false;

    /* renamed from: p */
    private boolean f67058p = false;

    /* renamed from: s */
    private boolean f67059s = false;

    /* renamed from: z */
    private boolean f67060z = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", TypedValues.Attributes.S_FRAME, "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        f67045B = strArr;
        for (String hVar : strArr) {
            m98337p(new C16415h(hVar));
        }
        for (String hVar2 : f67046C) {
            C16415h hVar3 = new C16415h(hVar2);
            hVar3.f67054d = false;
            hVar3.f67055f = false;
            m98337p(hVar3);
        }
        for (String str : f67047D) {
            C16415h hVar4 = f67044A.get(str);
            C15852c.m95479h(hVar4);
            hVar4.f67056g = true;
        }
        for (String str2 : f67048E) {
            C16415h hVar5 = f67044A.get(str2);
            C15852c.m95479h(hVar5);
            hVar5.f67055f = false;
        }
        for (String str3 : f67049F) {
            C16415h hVar6 = f67044A.get(str3);
            C15852c.m95479h(hVar6);
            hVar6.f67058p = true;
        }
        for (String str4 : f67050G) {
            C16415h hVar7 = f67044A.get(str4);
            C15852c.m95479h(hVar7);
            hVar7.f67059s = true;
        }
        for (String str5 : f67051H) {
            C16415h hVar8 = f67044A.get(str5);
            C15852c.m95479h(hVar8);
            hVar8.f67060z = true;
        }
    }

    private C16415h(String str) {
        this.f67052a = str;
        this.f67053c = C16170a.m97068a(str);
    }

    /* renamed from: k */
    public static boolean m98336k(String str) {
        return f67044A.containsKey(str);
    }

    /* renamed from: p */
    private static void m98337p(C16415h hVar) {
        f67044A.put(hVar.f67052a, hVar);
    }

    /* renamed from: r */
    public static C16415h m98338r(String str, C16413f fVar) {
        C15852c.m95479h(str);
        Map<String, C16415h> map = f67044A;
        C16415h hVar = map.get(str);
        if (hVar != null) {
            return hVar;
        }
        String d = fVar.mo79196d(str);
        C15852c.m95478g(d);
        String a = C16170a.m97068a(d);
        C16415h hVar2 = map.get(a);
        if (hVar2 == null) {
            C16415h hVar3 = new C16415h(d);
            hVar3.f67054d = false;
            return hVar3;
        } else if (!fVar.mo79198f() || d.equals(a)) {
            return hVar2;
        } else {
            C16415h a2 = hVar2.clone();
            a2.f67052a = d;
            return a2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C16415h clone() {
        try {
            return (C16415h) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public boolean mo79204b() {
        return this.f67055f;
    }

    /* renamed from: c */
    public String mo79205c() {
        return this.f67052a;
    }

    /* renamed from: d */
    public boolean mo79207d() {
        return this.f67054d;
    }

    /* renamed from: e */
    public boolean mo79208e() {
        return this.f67056g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16415h)) {
            return false;
        }
        C16415h hVar = (C16415h) obj;
        if (this.f67052a.equals(hVar.f67052a) && this.f67056g == hVar.f67056g && this.f67055f == hVar.f67055f && this.f67054d == hVar.f67054d && this.f67058p == hVar.f67058p && this.f67057o == hVar.f67057o && this.f67059s == hVar.f67059s && this.f67060z == hVar.f67060z) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo79210f() {
        return this.f67059s;
    }

    /* renamed from: g */
    public boolean mo79211g() {
        return !this.f67054d;
    }

    /* renamed from: h */
    public boolean mo79212h() {
        return f67044A.containsKey(this.f67052a);
    }

    public int hashCode() {
        return (((((((((((((this.f67052a.hashCode() * 31) + (this.f67054d ? 1 : 0)) * 31) + (this.f67055f ? 1 : 0)) * 31) + (this.f67056g ? 1 : 0)) * 31) + (this.f67057o ? 1 : 0)) * 31) + (this.f67058p ? 1 : 0)) * 31) + (this.f67059s ? 1 : 0)) * 31) + (this.f67060z ? 1 : 0);
    }

    /* renamed from: l */
    public boolean mo79214l() {
        return this.f67056g || this.f67057o;
    }

    /* renamed from: n */
    public String mo79215n() {
        return this.f67053c;
    }

    /* renamed from: o */
    public boolean mo79216o() {
        return this.f67058p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C16415h mo79217q() {
        this.f67057o = true;
        return this;
    }

    public String toString() {
        return this.f67052a;
    }
}
