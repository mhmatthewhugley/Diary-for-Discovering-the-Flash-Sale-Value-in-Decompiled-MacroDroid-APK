package p046r;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Collections;
import p012b0.C1397a;
import p012b0.C1399c;

/* renamed from: r.m */
/* compiled from: SplitDimensionPathKeyframeAnimation */
public class C2086m extends C2068a<PointF, PointF> {

    /* renamed from: i */
    private final PointF f6452i = new PointF();

    /* renamed from: j */
    private final PointF f6453j = new PointF();

    /* renamed from: k */
    private final C2068a<Float, Float> f6454k;

    /* renamed from: l */
    private final C2068a<Float, Float> f6455l;
    @Nullable

    /* renamed from: m */
    protected C1399c<Float> f6456m;
    @Nullable

    /* renamed from: n */
    protected C1399c<Float> f6457n;

    public C2086m(C2068a<Float, Float> aVar, C2068a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f6454k = aVar;
        this.f6455l = aVar2;
        mo24153m(mo24147f());
    }

    /* renamed from: m */
    public void mo24153m(float f) {
        this.f6454k.mo24153m(f);
        this.f6455l.mo24153m(f);
        this.f6452i.set(this.f6454k.mo24148h().floatValue(), this.f6455l.mo24148h().floatValue());
        for (int i = 0; i < this.f6424a.size(); i++) {
            this.f6424a.get(i).mo24123a();
        }
    }

    /* renamed from: p */
    public PointF mo24148h() {
        return mo24149i((C1397a<PointF>) null, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public PointF mo24149i(C1397a<PointF> aVar, float f) {
        Float f2;
        C1397a<Float> b;
        float f3;
        C1397a<Float> b2;
        float f4;
        Float f5 = null;
        if (this.f6456m == null || (b2 = this.f6454k.mo24143b()) == null) {
            f2 = null;
        } else {
            float d = this.f6454k.mo24145d();
            Float f6 = b2.f721h;
            C1399c<Float> cVar = this.f6456m;
            float f7 = b2.f720g;
            if (f6 == null) {
                f4 = f7;
            } else {
                f4 = f6.floatValue();
            }
            f2 = cVar.mo16819b(f7, f4, b2.f715b, b2.f716c, f, f, d);
        }
        if (!(this.f6457n == null || (b = this.f6455l.mo24143b()) == null)) {
            float d2 = this.f6455l.mo24145d();
            Float f8 = b.f721h;
            C1399c<Float> cVar2 = this.f6457n;
            float f9 = b.f720g;
            if (f8 == null) {
                f3 = f9;
            } else {
                f3 = f8.floatValue();
            }
            f5 = cVar2.mo16819b(f9, f3, b.f715b, b.f716c, f, f, d2);
        }
        if (f2 == null) {
            this.f6453j.set(this.f6452i.x, 0.0f);
        } else {
            this.f6453j.set(f2.floatValue(), 0.0f);
        }
        if (f5 == null) {
            PointF pointF = this.f6453j;
            pointF.set(pointF.x, this.f6452i.y);
        } else {
            PointF pointF2 = this.f6453j;
            pointF2.set(pointF2.x, f5.floatValue());
        }
        return this.f6453j;
    }

    /* renamed from: r */
    public void mo24183r(@Nullable C1399c<Float> cVar) {
        C1399c<Float> cVar2 = this.f6456m;
        if (cVar2 != null) {
            cVar2.mo16820c((C2068a<?, ?>) null);
        }
        this.f6456m = cVar;
        if (cVar != null) {
            cVar.mo16820c(this);
        }
    }

    /* renamed from: s */
    public void mo24184s(@Nullable C1399c<Float> cVar) {
        C1399c<Float> cVar2 = this.f6457n;
        if (cVar2 != null) {
            cVar2.mo16820c((C2068a<?, ?>) null);
        }
        this.f6457n = cVar;
        if (cVar != null) {
            cVar.mo16820c(this);
        }
    }
}
