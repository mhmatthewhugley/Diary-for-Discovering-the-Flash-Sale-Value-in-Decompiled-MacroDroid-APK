package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;

public class CornerTreatment {
    @Deprecated
    /* renamed from: a */
    public void mo58632a(float f, float f2, @NonNull ShapePath shapePath) {
    }

    /* renamed from: b */
    public void mo58633b(@NonNull ShapePath shapePath, float f, float f2, float f3) {
        mo58632a(f, f2, shapePath);
    }

    /* renamed from: c */
    public void mo58634c(@NonNull ShapePath shapePath, float f, float f2, @NonNull RectF rectF, @NonNull CornerSize cornerSize) {
        mo58633b(shapePath, f, f2, cornerSize.mo58627a(rectF));
    }
}
