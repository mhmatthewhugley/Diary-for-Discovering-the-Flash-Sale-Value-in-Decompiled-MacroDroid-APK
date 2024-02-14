package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzt {

    /* renamed from: d */
    public static final zzt f38463d = new zzt(0, 0, 0);

    /* renamed from: e */
    public static final zzn f38464e = zzs.f38398a;

    /* renamed from: a */
    public final int f38465a = 0;

    /* renamed from: b */
    public final int f38466b;

    /* renamed from: c */
    public final int f38467c;

    public zzt(int i, int i2, int i3) {
        this.f38466b = i2;
        this.f38467c = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzt)) {
            return false;
        }
        zzt zzt = (zzt) obj;
        int i = zzt.f38465a;
        return this.f38466b == zzt.f38466b && this.f38467c == zzt.f38467c;
    }

    public final int hashCode() {
        return ((this.f38466b + 16337) * 31) + this.f38467c;
    }
}
