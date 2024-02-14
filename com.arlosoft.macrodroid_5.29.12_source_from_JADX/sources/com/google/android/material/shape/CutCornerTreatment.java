package com.google.android.material.shape;

import androidx.annotation.NonNull;

public class CutCornerTreatment extends CornerTreatment {

    /* renamed from: a */
    float f49975a = -1.0f;

    /* renamed from: b */
    public void mo58633b(@NonNull ShapePath shapePath, float f, float f2, float f3) {
        shapePath.mo58746o(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = (double) f3;
        double d2 = (double) f2;
        shapePath.mo58744m((float) (Math.sin(Math.toRadians((double) f)) * d * d2), (float) (Math.sin(Math.toRadians((double) (90.0f - f))) * d * d2));
    }
}
