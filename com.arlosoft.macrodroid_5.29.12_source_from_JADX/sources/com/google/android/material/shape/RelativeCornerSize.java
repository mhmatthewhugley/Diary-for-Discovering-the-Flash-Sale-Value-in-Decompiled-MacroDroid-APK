package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import java.util.Arrays;

public final class RelativeCornerSize implements CornerSize {

    /* renamed from: a */
    private final float f50035a;

    public RelativeCornerSize(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        this.f50035a = f;
    }

    /* renamed from: a */
    public float mo58627a(@NonNull RectF rectF) {
        return this.f50035a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof RelativeCornerSize) && this.f50035a == ((RelativeCornerSize) obj).f50035a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f50035a)});
    }
}
