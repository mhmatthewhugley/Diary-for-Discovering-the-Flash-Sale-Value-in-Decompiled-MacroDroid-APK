package com.google.android.material.shape;

import androidx.annotation.NonNull;

public class RoundedCornerTreatment extends CornerTreatment {

    /* renamed from: a */
    float f50036a = -1.0f;

    /* renamed from: b */
    public void mo58633b(@NonNull ShapePath shapePath, float f, float f2, float f3) {
        shapePath.mo58746o(0.0f, f3 * f2, 180.0f, 180.0f - f);
        float f4 = f3 * 2.0f * f2;
        shapePath.mo58736a(0.0f, 0.0f, f4, f4, 180.0f, f);
    }
}
