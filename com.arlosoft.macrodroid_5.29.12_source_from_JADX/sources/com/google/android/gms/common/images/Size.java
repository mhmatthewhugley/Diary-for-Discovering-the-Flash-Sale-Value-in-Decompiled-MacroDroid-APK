package com.google.android.gms.common.images;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class Size {

    /* renamed from: a */
    private final int f3550a;

    /* renamed from: b */
    private final int f3551b;

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return this.f3550a == size.f3550a && this.f3551b == size.f3551b;
        }
    }

    public int hashCode() {
        int i = this.f3551b;
        int i2 = this.f3550a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    @NonNull
    public String toString() {
        int i = this.f3550a;
        int i2 = this.f3551b;
        return i + "x" + i2;
    }
}
