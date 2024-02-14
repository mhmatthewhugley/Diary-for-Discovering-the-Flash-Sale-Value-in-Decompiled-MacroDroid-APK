package com.google.android.material.shape;

import androidx.annotation.NonNull;

public final class MarkerEdgeTreatment extends EdgeTreatment {

    /* renamed from: a */
    private final float f49982a;

    public MarkerEdgeTreatment(float f) {
        this.f49982a = f - 0.001f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo58635a() {
        return true;
    }

    /* renamed from: b */
    public void mo56905b(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        float sqrt = (float) ((((double) this.f49982a) * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.f49982a, 2.0d) - Math.pow((double) sqrt, 2.0d));
        shapePath.mo58745n(f2 - sqrt, ((float) (-((((double) this.f49982a) * Math.sqrt(2.0d)) - ((double) this.f49982a)))) + sqrt2);
        shapePath.mo58744m(f2, (float) (-((((double) this.f49982a) * Math.sqrt(2.0d)) - ((double) this.f49982a))));
        shapePath.mo58744m(f2 + sqrt, ((float) (-((((double) this.f49982a) * Math.sqrt(2.0d)) - ((double) this.f49982a)))) + sqrt2);
    }
}
