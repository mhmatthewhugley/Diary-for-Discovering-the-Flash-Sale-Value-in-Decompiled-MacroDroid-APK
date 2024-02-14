package p046r;

import java.util.List;
import p001a0.C0009g;
import p012b0.C1397a;
import p012b0.C1399c;

/* renamed from: r.c */
/* compiled from: FloatKeyframeAnimation */
public class C2076c extends C2079f<Float> {
    public C2076c(List<C1397a<Float>> list) {
        super(list);
    }

    /* renamed from: p */
    public float mo24164p() {
        return mo24165q(mo24143b(), mo24145d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public float mo24165q(C1397a<Float> aVar, float f) {
        if (aVar.f715b == null || aVar.f716c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C1399c<A> cVar = this.f6428e;
        if (cVar != null) {
            Float f2 = (Float) cVar.mo16819b(aVar.f720g, aVar.f721h.floatValue(), aVar.f715b, aVar.f716c, f, mo24146e(), mo24147f());
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        return C0009g.m68k(aVar.mo16813f(), aVar.mo16810c(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Float mo24149i(C1397a<Float> aVar, float f) {
        return Float.valueOf(mo24165q(aVar, f));
    }
}
