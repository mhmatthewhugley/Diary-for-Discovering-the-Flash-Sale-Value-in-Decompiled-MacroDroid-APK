package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

public final class AbsoluteCornerSize implements CornerSize {

    /* renamed from: a */
    private final float f49972a;

    public AbsoluteCornerSize(float f) {
        this.f49972a = f;
    }

    /* renamed from: a */
    public float mo58627a(@NonNull RectF rectF) {
        return this.f49972a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AbsoluteCornerSize) && this.f49972a == ((AbsoluteCornerSize) obj).f49972a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f49972a)});
    }
}
