package p012b0;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1463d;

/* renamed from: b0.a */
/* compiled from: Keyframe */
public class C1397a<T> {
    @Nullable

    /* renamed from: a */
    private final C1463d f714a;
    @Nullable

    /* renamed from: b */
    public final T f715b;
    @Nullable

    /* renamed from: c */
    public T f716c;
    @Nullable

    /* renamed from: d */
    public final Interpolator f717d;
    @Nullable

    /* renamed from: e */
    public final Interpolator f718e;
    @Nullable

    /* renamed from: f */
    public final Interpolator f719f;

    /* renamed from: g */
    public final float f720g;
    @Nullable

    /* renamed from: h */
    public Float f721h;

    /* renamed from: i */
    private float f722i;

    /* renamed from: j */
    private float f723j;

    /* renamed from: k */
    private int f724k;

    /* renamed from: l */
    private int f725l;

    /* renamed from: m */
    private float f726m;

    /* renamed from: n */
    private float f727n;

    /* renamed from: o */
    public PointF f728o;

    /* renamed from: p */
    public PointF f729p;

    public C1397a(C1463d dVar, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f, @Nullable Float f2) {
        this.f722i = -3987645.8f;
        this.f723j = -3987645.8f;
        this.f724k = 784923401;
        this.f725l = 784923401;
        this.f726m = Float.MIN_VALUE;
        this.f727n = Float.MIN_VALUE;
        this.f728o = null;
        this.f729p = null;
        this.f714a = dVar;
        this.f715b = t;
        this.f716c = t2;
        this.f717d = interpolator;
        this.f718e = null;
        this.f719f = null;
        this.f720g = f;
        this.f721h = f2;
    }

    /* renamed from: a */
    public boolean mo16808a(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        return f >= mo16812e() && f < mo16809b();
    }

    /* renamed from: b */
    public float mo16809b() {
        if (this.f714a == null) {
            return 1.0f;
        }
        if (this.f727n == Float.MIN_VALUE) {
            if (this.f721h == null) {
                this.f727n = 1.0f;
            } else {
                this.f727n = mo16812e() + ((this.f721h.floatValue() - this.f720g) / this.f714a.mo17056e());
            }
        }
        return this.f727n;
    }

    /* renamed from: c */
    public float mo16810c() {
        if (this.f723j == -3987645.8f) {
            this.f723j = ((Float) this.f716c).floatValue();
        }
        return this.f723j;
    }

    /* renamed from: d */
    public int mo16811d() {
        if (this.f725l == 784923401) {
            this.f725l = ((Integer) this.f716c).intValue();
        }
        return this.f725l;
    }

    /* renamed from: e */
    public float mo16812e() {
        C1463d dVar = this.f714a;
        if (dVar == null) {
            return 0.0f;
        }
        if (this.f726m == Float.MIN_VALUE) {
            this.f726m = (this.f720g - dVar.mo17066o()) / this.f714a.mo17056e();
        }
        return this.f726m;
    }

    /* renamed from: f */
    public float mo16813f() {
        if (this.f722i == -3987645.8f) {
            this.f722i = ((Float) this.f715b).floatValue();
        }
        return this.f722i;
    }

    /* renamed from: g */
    public int mo16814g() {
        if (this.f724k == 784923401) {
            this.f724k = ((Integer) this.f715b).intValue();
        }
        return this.f724k;
    }

    /* renamed from: h */
    public boolean mo16815h() {
        return this.f717d == null && this.f718e == null && this.f719f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f715b + ", endValue=" + this.f716c + ", startFrame=" + this.f720g + ", endFrame=" + this.f721h + ", interpolator=" + this.f717d + '}';
    }

    public C1397a(C1463d dVar, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f, @Nullable Float f2) {
        this.f722i = -3987645.8f;
        this.f723j = -3987645.8f;
        this.f724k = 784923401;
        this.f725l = 784923401;
        this.f726m = Float.MIN_VALUE;
        this.f727n = Float.MIN_VALUE;
        this.f728o = null;
        this.f729p = null;
        this.f714a = dVar;
        this.f715b = t;
        this.f716c = t2;
        this.f717d = null;
        this.f718e = interpolator;
        this.f719f = interpolator2;
        this.f720g = f;
        this.f721h = f2;
    }

    protected C1397a(C1463d dVar, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f, @Nullable Float f2) {
        this.f722i = -3987645.8f;
        this.f723j = -3987645.8f;
        this.f724k = 784923401;
        this.f725l = 784923401;
        this.f726m = Float.MIN_VALUE;
        this.f727n = Float.MIN_VALUE;
        this.f728o = null;
        this.f729p = null;
        this.f714a = dVar;
        this.f715b = t;
        this.f716c = t2;
        this.f717d = interpolator;
        this.f718e = interpolator2;
        this.f719f = interpolator3;
        this.f720g = f;
        this.f721h = f2;
    }

    public C1397a(T t) {
        this.f722i = -3987645.8f;
        this.f723j = -3987645.8f;
        this.f724k = 784923401;
        this.f725l = 784923401;
        this.f726m = Float.MIN_VALUE;
        this.f727n = Float.MIN_VALUE;
        this.f728o = null;
        this.f729p = null;
        this.f714a = null;
        this.f715b = t;
        this.f716c = t;
        this.f717d = null;
        this.f718e = null;
        this.f719f = null;
        this.f720g = Float.MIN_VALUE;
        this.f721h = Float.valueOf(Float.MAX_VALUE);
    }
}
