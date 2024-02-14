package p046r;

import android.graphics.PointF;
import java.util.List;
import p012b0.C1397a;
import p012b0.C1399c;

/* renamed from: r.j */
/* compiled from: PointKeyframeAnimation */
public class C2083j extends C2079f<PointF> {

    /* renamed from: i */
    private final PointF f6448i = new PointF();

    public C2083j(List<C1397a<PointF>> list) {
        super(list);
    }

    /* renamed from: p */
    public PointF mo24149i(C1397a<PointF> aVar, float f) {
        return mo24150j(aVar, f, f, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public PointF mo24150j(C1397a<PointF> aVar, float f, float f2, float f3) {
        T t;
        T t2 = aVar.f715b;
        if (t2 == null || (t = aVar.f716c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t2;
        PointF pointF2 = (PointF) t;
        C1399c<A> cVar = this.f6428e;
        if (cVar != null) {
            PointF pointF3 = (PointF) cVar.mo16819b(aVar.f720g, aVar.f721h.floatValue(), pointF, pointF2, f, mo24146e(), mo24147f());
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.f6448i;
        float f4 = pointF.x;
        float f5 = f4 + (f2 * (pointF2.x - f4));
        float f6 = pointF.y;
        pointF4.set(f5, f6 + (f3 * (pointF2.y - f6)));
        return this.f6448i;
    }
}
