package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzk {

    /* renamed from: c */
    public static final zzk f37728c = new zzk(0, 0, 1, 1, 0, (zzj) null);

    /* renamed from: d */
    public static final zzn f37729d = zze.f33517a;

    /* renamed from: a */
    public final int f37730a = 1;
    @Nullable

    /* renamed from: b */
    private zzi f37731b;

    /* synthetic */ zzk(int i, int i2, int i3, int i4, int i5, zzj zzj) {
    }

    @RequiresApi(21)
    /* renamed from: a */
    public final zzi mo47767a() {
        if (this.f37731b == null) {
            this.f37731b = new zzi(this, (zzh) null);
        }
        return this.f37731b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzk.class != obj.getClass()) {
            return false;
        }
        zzk zzk = (zzk) obj;
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }
}
