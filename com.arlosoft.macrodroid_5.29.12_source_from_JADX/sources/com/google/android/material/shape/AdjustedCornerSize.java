package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AdjustedCornerSize implements CornerSize {

    /* renamed from: a */
    private final CornerSize f49973a;

    /* renamed from: b */
    private final float f49974b;

    public AdjustedCornerSize(float f, @NonNull CornerSize cornerSize) {
        while (cornerSize instanceof AdjustedCornerSize) {
            cornerSize = ((AdjustedCornerSize) cornerSize).f49973a;
            f += ((AdjustedCornerSize) cornerSize).f49974b;
        }
        this.f49973a = cornerSize;
        this.f49974b = f;
    }

    /* renamed from: a */
    public float mo58627a(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f49973a.mo58627a(rectF) + this.f49974b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustedCornerSize)) {
            return false;
        }
        AdjustedCornerSize adjustedCornerSize = (AdjustedCornerSize) obj;
        if (!this.f49973a.equals(adjustedCornerSize.f49973a) || this.f49974b != adjustedCornerSize.f49974b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49973a, Float.valueOf(this.f49974b)});
    }
}
