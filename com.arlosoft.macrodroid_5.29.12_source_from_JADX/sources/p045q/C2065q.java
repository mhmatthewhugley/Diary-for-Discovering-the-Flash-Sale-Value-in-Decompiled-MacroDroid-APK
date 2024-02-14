package p045q;

import android.graphics.Path;
import com.airbnb.lottie.C1472f;
import java.util.List;
import p046r.C2068a;
import p050v.C2130l;
import p050v.C2133o;
import p050v.C2138q;
import p051w.C2140a;

/* renamed from: q.q */
/* compiled from: ShapeContent */
public class C2065q implements C2060m, C2068a.C2070b {

    /* renamed from: a */
    private final Path f6405a = new Path();

    /* renamed from: b */
    private final String f6406b;

    /* renamed from: c */
    private final boolean f6407c;

    /* renamed from: d */
    private final C1472f f6408d;

    /* renamed from: e */
    private final C2068a<?, Path> f6409e;

    /* renamed from: f */
    private boolean f6410f;

    /* renamed from: g */
    private C2048b f6411g = new C2048b();

    public C2065q(C1472f fVar, C2140a aVar, C2133o oVar) {
        this.f6406b = oVar.mo24318b();
        this.f6407c = oVar.mo24320d();
        this.f6408d = fVar;
        C2068a<C2130l, Path> a = oVar.mo24319c().mo24228a();
        this.f6409e = a;
        aVar.mo24347i(a);
        a.mo24142a(this);
    }

    /* renamed from: c */
    private void m8531c() {
        this.f6410f = false;
        this.f6408d.invalidateSelf();
    }

    /* renamed from: a */
    public void mo24123a() {
        m8531c();
    }

    /* renamed from: b */
    public void mo24124b(List<C2049c> list, List<C2049c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C2049c cVar = list.get(i);
            if (cVar instanceof C2067s) {
                C2067s sVar = (C2067s) cVar;
                if (sVar.mo24140i() == C2138q.C2139a.SIMULTANEOUSLY) {
                    this.f6411g.mo24129a(sVar);
                    sVar.mo24136c(this);
                }
            }
        }
    }

    public Path getPath() {
        if (this.f6410f) {
            return this.f6405a;
        }
        this.f6405a.reset();
        if (this.f6407c) {
            this.f6410f = true;
            return this.f6405a;
        }
        this.f6405a.set(this.f6409e.mo24148h());
        this.f6405a.setFillType(Path.FillType.EVEN_ODD);
        this.f6411g.mo24130b(this.f6405a);
        this.f6410f = true;
        return this.f6405a;
    }
}
