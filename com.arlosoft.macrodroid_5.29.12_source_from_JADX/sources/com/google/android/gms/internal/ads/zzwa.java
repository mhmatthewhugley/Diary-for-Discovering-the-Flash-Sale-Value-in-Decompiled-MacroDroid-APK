package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzwa {

    /* renamed from: a */
    public final int f38761a;

    /* renamed from: b */
    public final zzkc[] f38762b;

    /* renamed from: c */
    public final zzvt[] f38763c;

    /* renamed from: d */
    public final zzcy f38764d;
    @Nullable

    /* renamed from: e */
    public final Object f38765e;

    public zzwa(zzkc[] zzkcArr, zzvt[] zzvtArr, zzcy zzcy, @Nullable Object obj) {
        this.f38762b = zzkcArr;
        this.f38763c = (zzvt[]) zzvtArr.clone();
        this.f38764d = zzcy;
        this.f38765e = obj;
        this.f38761a = zzkcArr.length;
    }

    /* renamed from: a */
    public final boolean mo48329a(@Nullable zzwa zzwa, int i) {
        if (zzwa != null && zzen.m49181t(this.f38762b[i], zzwa.f38762b[i]) && zzen.m49181t(this.f38763c[i], zzwa.f38763c[i])) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo48330b(int i) {
        return this.f38762b[i] != null;
    }
}
