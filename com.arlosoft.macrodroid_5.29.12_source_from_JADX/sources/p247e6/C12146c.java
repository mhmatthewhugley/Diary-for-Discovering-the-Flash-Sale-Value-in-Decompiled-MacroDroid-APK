package p247e6;

import android.view.animation.Interpolator;

/* renamed from: e6.c */
/* compiled from: BasicSwapTargetTranslationInterpolator */
public class C12146c implements Interpolator {

    /* renamed from: a */
    private final float f58447a;

    /* renamed from: b */
    private final float f58448b;

    /* renamed from: c */
    private final float f58449c;

    public C12146c() {
        this(0.3f);
    }

    public float getInterpolation(float f) {
        if (Math.abs(f - 0.5f) < this.f58448b) {
            return (f - this.f58447a) * this.f58449c;
        }
        return f < 0.5f ? 0.0f : 1.0f;
    }

    public C12146c(float f) {
        if (f < 0.0f || f >= 0.5f) {
            throw new IllegalArgumentException("Invalid threshold range: " + f);
        }
        float f2 = 1.0f - (2.0f * f);
        this.f58447a = f;
        this.f58448b = 0.5f * f2;
        this.f58449c = 1.0f / f2;
    }
}
