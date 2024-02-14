package p048t;

import android.graphics.PointF;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: t.a */
/* compiled from: CubicCurveData */
public class C2092a {

    /* renamed from: a */
    private final PointF f6484a;

    /* renamed from: b */
    private final PointF f6485b;

    /* renamed from: c */
    private final PointF f6486c;

    public C2092a() {
        this.f6484a = new PointF();
        this.f6485b = new PointF();
        this.f6486c = new PointF();
    }

    /* renamed from: a */
    public PointF mo24200a() {
        return this.f6484a;
    }

    /* renamed from: b */
    public PointF mo24201b() {
        return this.f6485b;
    }

    /* renamed from: c */
    public PointF mo24202c() {
        return this.f6486c;
    }

    /* renamed from: d */
    public void mo24203d(float f, float f2) {
        this.f6484a.set(f, f2);
    }

    /* renamed from: e */
    public void mo24204e(float f, float f2) {
        this.f6485b.set(f, f2);
    }

    /* renamed from: f */
    public void mo24205f(float f, float f2) {
        this.f6486c.set(f, f2);
    }

    public C2092a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f6484a = pointF;
        this.f6485b = pointF2;
        this.f6486c = pointF3;
    }
}
