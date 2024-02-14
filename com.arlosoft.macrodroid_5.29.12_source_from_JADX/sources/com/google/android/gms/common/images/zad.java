package com.google.android.gms.common.images;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zad {

    /* renamed from: a */
    public final Uri f3565a;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zad)) {
            return false;
        }
        return Objects.m4470a(((zad) obj).f3565a, this.f3565a);
    }

    public final int hashCode() {
        return Objects.m4471b(this.f3565a);
    }
}
