package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.location.places.PlacePhotoMetadata;

public final class zzap implements PlacePhotoMetadata {

    /* renamed from: a */
    private final String f45980a;

    /* renamed from: c */
    private final int f45981c;

    /* renamed from: d */
    private final int f45982d;

    /* renamed from: f */
    private final CharSequence f45983f;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzap)) {
            return false;
        }
        zzap zzap = (zzap) obj;
        return zzap.f45981c == this.f45981c && zzap.f45982d == this.f45982d && Objects.m4470a(zzap.f45980a, this.f45980a) && Objects.m4470a(zzap.f45983f, this.f45983f);
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f45981c), Integer.valueOf(this.f45982d), this.f45980a, this.f45983f);
    }
}
