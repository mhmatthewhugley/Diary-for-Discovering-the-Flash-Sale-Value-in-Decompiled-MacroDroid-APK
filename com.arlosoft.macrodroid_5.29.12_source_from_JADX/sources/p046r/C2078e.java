package p046r;

import java.util.List;
import p001a0.C0009g;
import p012b0.C1397a;
import p012b0.C1399c;

/* renamed from: r.e */
/* compiled from: IntegerKeyframeAnimation */
public class C2078e extends C2079f<Integer> {
    public C2078e(List<C1397a<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int mo24168p() {
        return mo24169q(mo24143b(), mo24145d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo24169q(C1397a<Integer> aVar, float f) {
        if (aVar.f715b == null || aVar.f716c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C1399c<A> cVar = this.f6428e;
        if (cVar != null) {
            Integer num = (Integer) cVar.mo16819b(aVar.f720g, aVar.f721h.floatValue(), aVar.f715b, aVar.f716c, f, mo24146e(), mo24147f());
            if (num != null) {
                return num.intValue();
            }
        }
        return C0009g.m69l(aVar.mo16814g(), aVar.mo16811d(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer mo24149i(C1397a<Integer> aVar, float f) {
        return Integer.valueOf(mo24169q(aVar, f));
    }
}
