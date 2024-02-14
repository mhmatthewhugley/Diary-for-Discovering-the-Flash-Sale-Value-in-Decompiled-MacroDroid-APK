package p382rd;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p351od.C15852c;
import p373qd.C16283b;
import p373qd.C16288f;
import p373qd.C16293h;
import p373qd.C16303m;
import p373qd.C16306o;
import p382rd.C16416i;

/* renamed from: rd.l */
/* compiled from: TreeBuilder */
abstract class C16497l {

    /* renamed from: a */
    protected C16414g f67185a;

    /* renamed from: b */
    C16382a f67186b;

    /* renamed from: c */
    C16427j f67187c;

    /* renamed from: d */
    protected C16288f f67188d;

    /* renamed from: e */
    protected ArrayList<C16293h> f67189e;

    /* renamed from: f */
    protected String f67190f;

    /* renamed from: g */
    protected C16416i f67191g;

    /* renamed from: h */
    protected C16413f f67192h;

    /* renamed from: i */
    protected Map<String, C16415h> f67193i;

    /* renamed from: j */
    private C16416i.C16424h f67194j = new C16416i.C16424h();

    /* renamed from: k */
    private C16416i.C16423g f67195k = new C16416i.C16423g();

    /* renamed from: l */
    private boolean f67196l;

    C16497l() {
    }

    /* renamed from: o */
    private void m98515o(C16303m mVar, C16416i iVar, boolean z) {
        int q;
        if (this.f67196l && iVar != null && (q = iVar.mo79234q()) != -1) {
            C16306o.C16307a aVar = new C16306o.C16307a(q, this.f67186b.mo79063C(q), this.f67186b.mo79085f(q));
            int f = iVar.mo79224f();
            new C16306o(aVar, new C16306o.C16307a(f, this.f67186b.mo79063C(f), this.f67186b.mo79085f(f))).mo78916a(mVar, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C16293h mo79296a() {
        int size = this.f67189e.size();
        return size > 0 ? this.f67189e.get(size - 1) : this.f67188d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo79297b(String str) {
        C16293h a;
        if (this.f67189e.size() == 0 || (a = mo79296a()) == null || !a.mo78885z0().equals(str)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract C16413f mo79151c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo79298d(String str, Object... objArr) {
        C16412e a = this.f67185a.mo79199a();
        if (a.mo79191c()) {
            a.add(new C16411d(this.f67186b, str, objArr));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo79154e(Reader reader, String str, C16414g gVar) {
        C15852c.m95480i(reader, "String input must not be null");
        C15852c.m95480i(str, "BaseURI must not be null");
        C15852c.m95479h(gVar);
        C16288f fVar = new C16288f(str);
        this.f67188d = fVar;
        fVar.mo78834N0(gVar);
        this.f67185a = gVar;
        this.f67192h = gVar.mo79202f();
        this.f67186b = new C16382a(reader);
        this.f67196l = gVar.mo79201d();
        this.f67186b.mo79079U(gVar.mo79200c() || this.f67196l);
        this.f67191g = null;
        this.f67187c = new C16427j(this.f67186b, gVar.mo79199a());
        this.f67189e = new ArrayList<>(32);
        this.f67193i = new HashMap();
        this.f67190f = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo79299f(C16303m mVar, C16416i iVar) {
        m98515o(mVar, iVar, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo79300g(C16303m mVar, C16416i iVar) {
        m98515o(mVar, iVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C16288f mo79301h(Reader reader, String str, C16414g gVar) {
        mo79154e(reader, str, gVar);
        mo79304m();
        this.f67186b.mo79083d();
        this.f67186b = null;
        this.f67187c = null;
        this.f67189e = null;
        this.f67193i = null;
        return this.f67188d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract boolean mo79158i(C16416i iVar);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo79302j(String str) {
        C16416i iVar = this.f67191g;
        C16416i.C16423g gVar = this.f67195k;
        if (iVar == gVar) {
            return mo79158i(new C16416i.C16423g().mo79260H(str));
        }
        return mo79158i(gVar.mo79233o().mo79260H(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo79303k(String str) {
        C16416i.C16424h hVar = this.f67194j;
        if (this.f67191g == hVar) {
            return mo79158i(new C16416i.C16424h().mo79260H(str));
        }
        return mo79158i(hVar.mo79233o().mo79260H(str));
    }

    /* renamed from: l */
    public boolean mo79162l(String str, C16283b bVar) {
        C16416i.C16424h hVar = this.f67194j;
        if (this.f67191g == hVar) {
            return mo79158i(new C16416i.C16424h().mo79253N(str, bVar));
        }
        hVar.mo79233o();
        hVar.mo79253N(str, bVar);
        return mo79158i(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo79304m() {
        C16416i w;
        C16427j jVar = this.f67187c;
        C16416i.C16426j jVar2 = C16416i.C16426j.EOF;
        do {
            w = jVar.mo79293w();
            mo79158i(w);
            w.mo79233o();
        } while (w.f67061a != jVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C16415h mo79305n(String str, C16413f fVar) {
        C16415h hVar = this.f67193i.get(str);
        if (hVar != null) {
            return hVar;
        }
        C16415h r = C16415h.m98338r(str, fVar);
        this.f67193i.put(str, r);
        return r;
    }
}
