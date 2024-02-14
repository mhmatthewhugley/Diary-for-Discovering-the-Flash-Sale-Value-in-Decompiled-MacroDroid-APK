package p373qd;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import org.jsoup.SerializationException;
import p351od.C15852c;
import p364pd.C16170a;
import p364pd.C16171b;
import p373qd.C16288f;

/* renamed from: qd.a */
/* compiled from: Attribute */
public class C16282a implements Map.Entry<String, String>, Cloneable {

    /* renamed from: f */
    private static final String[] f66634f = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: g */
    private static final Pattern f66635g = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");

    /* renamed from: o */
    private static final Pattern f66636o = Pattern.compile("[^-a-zA-Z0-9_:.]");

    /* renamed from: p */
    private static final Pattern f66637p = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* renamed from: s */
    private static final Pattern f66638s = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");

    /* renamed from: a */
    private String f66639a;

    /* renamed from: c */
    private String f66640c;

    /* renamed from: d */
    C16283b f66641d;

    public C16282a(String str, String str2, C16283b bVar) {
        C15852c.m95479h(str);
        String trim = str.trim();
        C15852c.m95478g(trim);
        this.f66639a = trim;
        this.f66640c = str2;
        this.f66641d = bVar;
    }

    /* renamed from: c */
    public static String m97674c(String str, C16288f.C16289a.C16290a aVar) {
        if (aVar == C16288f.C16289a.C16290a.xml) {
            Pattern pattern = f66635g;
            if (!pattern.matcher(str).matches()) {
                String replaceAll = f66636o.matcher(str).replaceAll("");
                if (pattern.matcher(replaceAll).matches()) {
                    return replaceAll;
                }
                return null;
            }
        }
        if (aVar == C16288f.C16289a.C16290a.html) {
            Pattern pattern2 = f66637p;
            if (!pattern2.matcher(str).matches()) {
                String replaceAll2 = f66638s.matcher(str).replaceAll("");
                if (pattern2.matcher(replaceAll2).matches()) {
                    return replaceAll2;
                }
                return null;
            }
        }
        return str;
    }

    /* renamed from: g */
    protected static void m97675g(String str, String str2, Appendable appendable, C16288f.C16289a aVar) throws IOException {
        String c = m97674c(str, aVar.mo78851n());
        if (c != null) {
            m97676h(c, str2, appendable, aVar);
        }
    }

    /* renamed from: h */
    static void m97676h(String str, String str2, Appendable appendable, C16288f.C16289a aVar) throws IOException {
        appendable.append(str);
        if (!m97678n(str, str2, aVar)) {
            appendable.append("=\"");
            C16296i.m97832e(appendable, C16283b.m97694o(str2), aVar, true, false, false, false);
            appendable.append('\"');
        }
    }

    /* renamed from: k */
    public static boolean m97677k(String str) {
        return Arrays.binarySearch(f66634f, C16170a.m97068a(str)) >= 0;
    }

    /* renamed from: n */
    protected static boolean m97678n(String str, String str2, C16288f.C16289a aVar) {
        return aVar.mo78851n() == C16288f.C16289a.C16290a.html && (str2 == null || ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && m97677k(str)));
    }

    /* renamed from: a */
    public C16282a clone() {
        try {
            return (C16282a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public String getKey() {
        return this.f66639a;
    }

    /* renamed from: d */
    public String getValue() {
        return C16283b.m97694o(this.f66640c);
    }

    /* renamed from: e */
    public String mo78777e() {
        StringBuilder b = C16171b.m97071b();
        try {
            mo78779f(b, new C16288f("").mo78833M0());
            return C16171b.m97079j(b);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C16282a aVar = (C16282a) obj;
        String str = this.f66639a;
        if (str == null ? aVar.f66639a != null : !str.equals(aVar.f66639a)) {
            return false;
        }
        String str2 = this.f66640c;
        String str3 = aVar.f66640c;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo78779f(Appendable appendable, C16288f.C16289a aVar) throws IOException {
        m97675g(this.f66639a, this.f66640c, appendable, aVar);
    }

    public int hashCode() {
        String str = this.f66639a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f66640c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: l */
    public String setValue(String str) {
        int J;
        String str2 = this.f66640c;
        C16283b bVar = this.f66641d;
        if (!(bVar == null || (J = bVar.mo78788J(this.f66639a)) == -1)) {
            str2 = this.f66641d.mo78803s(this.f66639a);
            this.f66641d.f66644d[J] = str;
        }
        this.f66640c = str;
        return C16283b.m97694o(str2);
    }

    public String toString() {
        return mo78777e();
    }
}
