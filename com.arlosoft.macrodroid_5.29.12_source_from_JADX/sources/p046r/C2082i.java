package p046r;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p012b0.C1397a;
import p012b0.C1399c;

/* renamed from: r.i */
/* compiled from: PathKeyframeAnimation */
public class C2082i extends C2079f<PointF> {

    /* renamed from: i */
    private final PointF f6444i = new PointF();

    /* renamed from: j */
    private final float[] f6445j = new float[2];

    /* renamed from: k */
    private final PathMeasure f6446k = new PathMeasure();

    /* renamed from: l */
    private C2081h f6447l;

    public C2082i(List<? extends C1397a<PointF>> list) {
        super(list);
    }

    /* renamed from: p */
    public PointF mo24149i(C1397a<PointF> aVar, float f) {
        C2081h hVar = (C2081h) aVar;
        Path j = hVar.mo24175j();
        if (j == null) {
            return (PointF) aVar.f715b;
        }
        C1399c<A> cVar = this.f6428e;
        if (cVar != null) {
            PointF pointF = (PointF) cVar.mo16819b(hVar.f720g, hVar.f721h.floatValue(), hVar.f715b, hVar.f716c, mo24146e(), f, mo24147f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f6447l != hVar) {
            this.f6446k.setPath(j, false);
            this.f6447l = hVar;
        }
        PathMeasure pathMeasure = this.f6446k;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f6445j, (float[]) null);
        PointF pointF2 = this.f6444i;
        float[] fArr = this.f6445j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f6444i;
    }
}
