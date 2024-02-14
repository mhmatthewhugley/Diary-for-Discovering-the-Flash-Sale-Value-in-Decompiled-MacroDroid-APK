package p328mc;

import android.view.animation.Interpolator;

/* renamed from: mc.b */
/* compiled from: LookupTableInterpolator */
abstract class C15729b implements Interpolator {

    /* renamed from: a */
    private final float[] f65077a;

    /* renamed from: b */
    private final float f65078b;

    public C15729b(float[] fArr) {
        this.f65077a = fArr;
        this.f65078b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f65077a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f65078b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f65077a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
