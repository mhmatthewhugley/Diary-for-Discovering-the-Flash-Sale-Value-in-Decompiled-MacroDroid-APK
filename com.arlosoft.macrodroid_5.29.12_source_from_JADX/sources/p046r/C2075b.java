package p046r;

import java.util.List;
import p001a0.C0004b;
import p001a0.C0009g;
import p012b0.C1397a;
import p012b0.C1399c;

/* renamed from: r.b */
/* compiled from: ColorKeyframeAnimation */
public class C2075b extends C2079f<Integer> {
    public C2075b(List<C1397a<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int mo24161p() {
        return mo24162q(mo24143b(), mo24145d());
    }

    /* renamed from: q */
    public int mo24162q(C1397a<Integer> aVar, float f) {
        T t = aVar.f715b;
        if (t == null || aVar.f716c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) t).intValue();
        int intValue2 = ((Integer) aVar.f716c).intValue();
        C1399c<A> cVar = this.f6428e;
        if (cVar != null) {
            Integer num = (Integer) cVar.mo16819b(aVar.f720g, aVar.f721h.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, mo24146e(), mo24147f());
            if (num != null) {
                return num.intValue();
            }
        }
        return C0004b.m24c(C0009g.m60c(f, 0.0f, 1.0f), intValue, intValue2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer mo24149i(C1397a<Integer> aVar, float f) {
        return Integer.valueOf(mo24162q(aVar, f));
    }
}
