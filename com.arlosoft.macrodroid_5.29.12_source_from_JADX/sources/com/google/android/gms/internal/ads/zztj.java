package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zztj {

    /* renamed from: a */
    public final int f38499a;

    /* renamed from: b */
    public final boolean f38500b;

    public zztj(int i, boolean z) {
        this.f38499a = i;
        this.f38500b = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zztj.class == obj.getClass()) {
            zztj zztj = (zztj) obj;
            return this.f38499a == zztj.f38499a && this.f38500b == zztj.f38500b;
        }
    }

    public final int hashCode() {
        return (this.f38499a * 31) + (this.f38500b ? 1 : 0);
    }
}
