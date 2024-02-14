package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaaj {

    /* renamed from: a */
    public final zzaam f23734a;

    /* renamed from: b */
    public final zzaam f23735b;

    public zzaaj(zzaam zzaam, zzaam zzaam2) {
        this.f23734a = zzaam;
        this.f23735b = zzaam2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaaj.class == obj.getClass()) {
            zzaaj zzaaj = (zzaaj) obj;
            return this.f23734a.equals(zzaaj.f23734a) && this.f23735b.equals(zzaaj.f23735b);
        }
    }

    public final int hashCode() {
        return (this.f23734a.hashCode() * 31) + this.f23735b.hashCode();
    }

    public final String toString() {
        String obj = this.f23734a.toString();
        String concat = this.f23734a.equals(this.f23735b) ? "" : ", ".concat(this.f23735b.toString());
        return "[" + obj + concat + "]";
    }
}
