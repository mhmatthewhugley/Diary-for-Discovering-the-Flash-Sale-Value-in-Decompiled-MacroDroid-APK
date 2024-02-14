package p373qd;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p351od.C15850a;
import p351od.C15852c;
import p364pd.C16170a;
import p364pd.C16171b;
import p373qd.C16288f;
import p382rd.C16415h;
import p391sd.C16530a;
import p391sd.C16532b;
import p391sd.C16533c;
import p391sd.C16538d;
import p391sd.C16539e;

/* renamed from: qd.h */
/* compiled from: Element */
public class C16293h extends C16303m {

    /* renamed from: A */
    private static final String f66669A = C16283b.m97686M("baseUri");

    /* renamed from: s */
    private static final List<C16293h> f66670s = Collections.emptyList();

    /* renamed from: z */
    private static final Pattern f66671z = Pattern.compile("\\s+");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C16415h f66672f;

    /* renamed from: g */
    private WeakReference<List<C16293h>> f66673g;

    /* renamed from: o */
    List<C16303m> f66674o;

    /* renamed from: p */
    C16283b f66675p;

    /* renamed from: qd.h$a */
    /* compiled from: Element */
    class C16294a implements C16539e {

        /* renamed from: a */
        final /* synthetic */ StringBuilder f66676a;

        C16294a(StringBuilder sb) {
            this.f66676a = sb;
        }

        /* renamed from: a */
        public void mo78886a(C16303m mVar, int i) {
            if (mVar instanceof C16308p) {
                C16293h.m97782b0(this.f66676a, (C16308p) mVar);
            } else if (mVar instanceof C16293h) {
                C16293h hVar = (C16293h) mVar;
                if (this.f66676a.length() <= 0) {
                    return;
                }
                if ((hVar.mo78883u0() || hVar.f66672f.mo79215n().equals("br")) && !C16308p.m97913c0(this.f66676a)) {
                    this.f66676a.append(' ');
                }
            }
        }

        /* renamed from: b */
        public void mo78887b(C16303m mVar, int i) {
            if ((mVar instanceof C16293h) && ((C16293h) mVar).mo78883u0() && (mVar.mo78915x() instanceof C16308p) && !C16308p.m97913c0(this.f66676a)) {
                this.f66676a.append(' ');
            }
        }
    }

    /* renamed from: qd.h$b */
    /* compiled from: Element */
    private static final class C16295b extends C15850a<C16303m> {
        private final C16293h owner;

        C16295b(C16293h hVar, int i) {
            super(i);
            this.owner = hVar;
        }

        /* renamed from: c */
        public void mo75627c() {
            this.owner.mo78884z();
        }
    }

    public C16293h(C16415h hVar, String str, C16283b bVar) {
        C15852c.m95479h(hVar);
        this.f66674o = C16303m.f66695d;
        this.f66675p = bVar;
        this.f66672f = hVar;
        if (str != null) {
            mo78901P(str);
        }
    }

    /* renamed from: B0 */
    static boolean m97778B0(C16303m mVar) {
        if (mVar instanceof C16293h) {
            C16293h hVar = (C16293h) mVar;
            int i = 0;
            while (!hVar.f66672f.mo79216o()) {
                hVar = hVar.mo78857G();
                i++;
                if (i < 6) {
                    if (hVar == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: D0 */
    private static String m97779D0(C16293h hVar, String str) {
        while (hVar != null) {
            C16283b bVar = hVar.f66675p;
            if (bVar != null && bVar.mo78807u(str)) {
                return hVar.f66675p.mo78803s(str);
            }
            hVar = hVar.mo78857G();
        }
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public static void m97782b0(StringBuilder sb, C16308p pVar) {
        String a0 = pVar.mo78923a0();
        if (m97778B0(pVar.f66696a) || (pVar instanceof C16285c)) {
            sb.append(a0);
        } else {
            C16171b.m97070a(sb, a0, C16308p.m97913c0(sb));
        }
    }

    /* renamed from: v0 */
    private boolean m97783v0(C16288f.C16289a aVar) {
        return this.f66672f.mo79204b() || (mo78857G() != null && mo78857G().mo78858G0().mo79204b()) || aVar.mo78848h();
    }

    /* renamed from: x0 */
    private boolean m97784x0(C16288f.C16289a aVar) {
        return mo78858G0().mo79211g() && (mo78857G() == null || mo78857G().mo78883u0()) && mo78898J() != null && !aVar.mo78848h();
    }

    /* renamed from: A0 */
    public final C16293h mo78857G() {
        return (C16293h) this.f66696a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo78813C(Appendable appendable, int i, C16288f.C16289a aVar) throws IOException {
        if (mo78856F0(aVar)) {
            if (!(appendable instanceof StringBuilder)) {
                mo78914v(appendable, i, aVar);
            } else if (((StringBuilder) appendable).length() > 0) {
                mo78914v(appendable, i, aVar);
            }
        }
        appendable.append('<').append(mo78859H0());
        C16283b bVar = this.f66675p;
        if (bVar != null) {
            bVar.mo78787D(appendable, aVar);
        }
        if (!this.f66674o.isEmpty() || !this.f66672f.mo79214l()) {
            appendable.append('>');
        } else if (aVar.mo78851n() != C16288f.C16289a.C16290a.html || !this.f66672f.mo79208e()) {
            appendable.append(" />");
        } else {
            appendable.append('>');
        }
    }

    /* renamed from: C0 */
    public C16293h mo78861O() {
        return (C16293h) super.mo78861O();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo78814D(Appendable appendable, int i, C16288f.C16289a aVar) throws IOException {
        if (!this.f66674o.isEmpty() || !this.f66672f.mo79214l()) {
            if (aVar.mo78850l() && !this.f66674o.isEmpty() && (this.f66672f.mo79204b() || (aVar.mo78848h() && (this.f66674o.size() > 1 || (this.f66674o.size() == 1 && (this.f66674o.get(0) instanceof C16293h)))))) {
                mo78914v(appendable, i, aVar);
            }
            appendable.append("</").append(mo78859H0()).append('>');
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F0 */
    public boolean mo78856F0(C16288f.C16289a aVar) {
        return aVar.mo78850l() && m97783v0(aVar) && !m97784x0(aVar);
    }

    /* renamed from: G0 */
    public C16415h mo78858G0() {
        return this.f66672f;
    }

    /* renamed from: H0 */
    public String mo78859H0() {
        return this.f66672f.mo79205c();
    }

    /* renamed from: I0 */
    public String mo78860I0() {
        StringBuilder b = C16171b.m97071b();
        C16538d.m98664a(new C16294a(b), this);
        return C16171b.m97079j(b).trim();
    }

    /* renamed from: Y */
    public C16293h mo78862Y(C16303m mVar) {
        C15852c.m95479h(mVar);
        mo78900N(mVar);
        mo78878r();
        this.f66674o.add(mVar);
        mVar.mo78903S(this.f66674o.size() - 1);
        return this;
    }

    /* renamed from: Z */
    public C16293h mo78863Z(Collection<? extends C16303m> collection) {
        mo78882t0(-1, collection);
        return this;
    }

    /* renamed from: a0 */
    public C16293h mo78864a0(String str) {
        C16293h hVar = new C16293h(C16415h.m98338r(str, C16305n.m97911b(this).mo79202f()), mo78824f());
        mo78862Y(hVar);
        return hVar;
    }

    /* renamed from: c0 */
    public C16293h mo78865c0(C16303m mVar) {
        return (C16293h) super.mo78908g(mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public List<C16293h> mo78866d0() {
        List<C16293h> list;
        if (mo78825k() == 0) {
            return f66670s;
        }
        WeakReference<List<C16293h>> weakReference = this.f66673g;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.f66674o.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            C16303m mVar = this.f66674o.get(i);
            if (mVar instanceof C16293h) {
                arrayList.add((C16293h) mVar);
            }
        }
        this.f66673g = new WeakReference<>(arrayList);
        return arrayList;
    }

    /* renamed from: e */
    public C16283b mo78867e() {
        if (this.f66675p == null) {
            this.f66675p = new C16283b();
        }
        return this.f66675p;
    }

    /* renamed from: e0 */
    public C16293h mo78818n() {
        return (C16293h) super.clone();
    }

    /* renamed from: f */
    public String mo78824f() {
        return m97779D0(this, f66669A);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public C16293h mo78874o(C16303m mVar) {
        C16293h hVar = (C16293h) super.mo78874o(mVar);
        C16283b bVar = this.f66675p;
        hVar.f66675p = bVar != null ? bVar.clone() : null;
        C16295b bVar2 = new C16295b(hVar, this.f66674o.size());
        hVar.f66674o = bVar2;
        bVar2.addAll(this.f66674o);
        return hVar;
    }

    /* renamed from: g0 */
    public C16293h mo78826q() {
        this.f66674o.clear();
        return this;
    }

    /* renamed from: i0 */
    public C16293h mo78870i0(String str) {
        C15852c.m95478g(str);
        C16532b a = C16530a.m98653a(new C16533c.C16536c(str), this);
        if (a.size() > 0) {
            return (C16293h) a.get(0);
        }
        return null;
    }

    /* renamed from: j0 */
    public C16532b mo78871j0(String str) {
        C15852c.m95478g(str);
        return C16530a.m98653a(new C16533c.C16534a(str.trim()), this);
    }

    /* renamed from: k */
    public int mo78825k() {
        return this.f66674o.size();
    }

    /* renamed from: k0 */
    public C16532b mo78872k0(String str) {
        C15852c.m95478g(str);
        return C16530a.m98653a(new C16533c.C16535b(str), this);
    }

    /* renamed from: m0 */
    public C16532b mo78873m0(String str) {
        C15852c.m95478g(str);
        return C16530a.m98653a(new C16533c.C16537d(C16170a.m97069b(str)), this);
    }

    /* renamed from: o0 */
    public boolean mo78875o0(String str) {
        C16283b bVar = this.f66675p;
        if (bVar == null) {
            return false;
        }
        String t = bVar.mo78805t("class");
        int length = t.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(t);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(t.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else if (i2 - i == length2 && t.regionMatches(true, i, str, 0, length2)) {
                        return true;
                    } else {
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return t.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo78876p(String str) {
        mo78867e().mo78790R(f66669A, str);
    }

    /* renamed from: p0 */
    public <T extends Appendable> T mo78877p0(T t) {
        int size = this.f66674o.size();
        for (int i = 0; i < size; i++) {
            this.f66674o.get(i).mo78895B(t);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public List<C16303m> mo78878r() {
        if (this.f66674o == C16303m.f66695d) {
            this.f66674o = new C16295b(this, 4);
        }
        return this.f66674o;
    }

    /* renamed from: r0 */
    public String mo78879r0() {
        StringBuilder b = C16171b.m97071b();
        mo78877p0(b);
        String j = C16171b.m97079j(b);
        return C16305n.m97910a(this).mo78850l() ? j.trim() : j;
    }

    /* renamed from: s0 */
    public String mo78880s0() {
        C16283b bVar = this.f66675p;
        return bVar != null ? bVar.mo78805t("id") : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo78881t() {
        return this.f66675p != null;
    }

    /* renamed from: t0 */
    public C16293h mo78882t0(int i, Collection<? extends C16303m> collection) {
        C15852c.m95480i(collection, "Children collection to be inserted must not be null.");
        int k = mo78825k();
        if (i < 0) {
            i += k + 1;
        }
        C15852c.m95475d(i >= 0 && i <= k, "Insert position out of bounds.");
        mo78906b(i, (C16303m[]) new ArrayList(collection).toArray(new C16303m[0]));
        return this;
    }

    /* renamed from: u0 */
    public boolean mo78883u0() {
        return this.f66672f.mo79207d();
    }

    /* renamed from: y */
    public String mo78819y() {
        return this.f66672f.mo79205c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo78884z() {
        super.mo78884z();
        this.f66673g = null;
    }

    /* renamed from: z0 */
    public String mo78885z0() {
        return this.f66672f.mo79215n();
    }

    public C16293h(C16415h hVar, String str) {
        this(hVar, str, (C16283b) null);
    }
}
