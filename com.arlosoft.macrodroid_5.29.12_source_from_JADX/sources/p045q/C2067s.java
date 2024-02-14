package p045q;

import java.util.ArrayList;
import java.util.List;
import p046r.C2068a;
import p050v.C2138q;
import p051w.C2140a;

/* renamed from: q.s */
/* compiled from: TrimPathContent */
public class C2067s implements C2049c, C2068a.C2070b {

    /* renamed from: a */
    private final String f6417a;

    /* renamed from: b */
    private final boolean f6418b;

    /* renamed from: c */
    private final List<C2068a.C2070b> f6419c = new ArrayList();

    /* renamed from: d */
    private final C2138q.C2139a f6420d;

    /* renamed from: e */
    private final C2068a<?, Float> f6421e;

    /* renamed from: f */
    private final C2068a<?, Float> f6422f;

    /* renamed from: g */
    private final C2068a<?, Float> f6423g;

    public C2067s(C2140a aVar, C2138q qVar) {
        this.f6417a = qVar.mo24335c();
        this.f6418b = qVar.mo24339g();
        this.f6420d = qVar.mo24338f();
        C2068a<Float, Float> a = qVar.mo24337e().mo24228a();
        this.f6421e = a;
        C2068a<Float, Float> a2 = qVar.mo24334b().mo24228a();
        this.f6422f = a2;
        C2068a<Float, Float> a3 = qVar.mo24336d().mo24228a();
        this.f6423g = a3;
        aVar.mo24347i(a);
        aVar.mo24347i(a2);
        aVar.mo24347i(a3);
        a.mo24142a(this);
        a2.mo24142a(this);
        a3.mo24142a(this);
    }

    /* renamed from: a */
    public void mo24123a() {
        for (int i = 0; i < this.f6419c.size(); i++) {
            this.f6419c.get(i).mo24123a();
        }
    }

    /* renamed from: b */
    public void mo24124b(List<C2049c> list, List<C2049c> list2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo24136c(C2068a.C2070b bVar) {
        this.f6419c.add(bVar);
    }

    /* renamed from: d */
    public C2068a<?, Float> mo24137d() {
        return this.f6422f;
    }

    /* renamed from: f */
    public C2068a<?, Float> mo24138f() {
        return this.f6423g;
    }

    /* renamed from: h */
    public C2068a<?, Float> mo24139h() {
        return this.f6421e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C2138q.C2139a mo24140i() {
        return this.f6420d;
    }

    /* renamed from: j */
    public boolean mo24141j() {
        return this.f6418b;
    }
}
