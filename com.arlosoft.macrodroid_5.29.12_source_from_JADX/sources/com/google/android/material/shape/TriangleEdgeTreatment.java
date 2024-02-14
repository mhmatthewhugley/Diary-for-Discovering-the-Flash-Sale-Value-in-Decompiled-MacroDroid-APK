package com.google.android.material.shape;

import androidx.annotation.NonNull;

public class TriangleEdgeTreatment extends EdgeTreatment {

    /* renamed from: a */
    private final float f50117a;

    /* renamed from: b */
    private final boolean f50118b;

    /* renamed from: b */
    public void mo56905b(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        shapePath.mo58744m(f2 - (this.f50117a * f3), 0.0f);
        shapePath.mo58744m(f2, (this.f50118b ? this.f50117a : -this.f50117a) * f3);
        shapePath.mo58744m(f2 + (this.f50117a * f3), 0.0f);
        shapePath.mo58744m(f, 0.0f);
    }
}
