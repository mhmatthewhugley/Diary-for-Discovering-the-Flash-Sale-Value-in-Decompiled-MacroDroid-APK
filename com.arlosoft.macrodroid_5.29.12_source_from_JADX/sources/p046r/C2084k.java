package p046r;

import java.util.List;
import p001a0.C0009g;
import p012b0.C1397a;
import p012b0.C1399c;
import p012b0.C1400d;

/* renamed from: r.k */
/* compiled from: ScaleKeyframeAnimation */
public class C2084k extends C2079f<C1400d> {

    /* renamed from: i */
    private final C1400d f6449i = new C1400d();

    public C2084k(List<C1397a<C1400d>> list) {
        super(list);
    }

    /* renamed from: p */
    public C1400d mo24149i(C1397a<C1400d> aVar, float f) {
        T t;
        T t2 = aVar.f715b;
        if (t2 == null || (t = aVar.f716c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C1400d dVar = (C1400d) t2;
        C1400d dVar2 = (C1400d) t;
        C1399c<A> cVar = this.f6428e;
        if (cVar != null) {
            C1400d dVar3 = (C1400d) cVar.mo16819b(aVar.f720g, aVar.f721h.floatValue(), dVar, dVar2, f, mo24146e(), mo24147f());
            if (dVar3 != null) {
                return dVar3;
            }
        }
        this.f6449i.mo16824d(C0009g.m68k(dVar.mo16822b(), dVar2.mo16822b(), f), C0009g.m68k(dVar.mo16823c(), dVar2.mo16823c(), f));
        return this.f6449i;
    }
}
