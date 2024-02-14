package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeby implements zzgxi {

    /* renamed from: a */
    private final zzgxv f33661a;

    /* renamed from: b */
    private final zzgxv f33662b;

    public zzeby(zzgxv zzgxv, zzgxv zzgxv2) {
        this.f33661a = zzgxv;
        this.f33662b = zzgxv2;
    }

    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.m4929a((Context) this.f33661a.zzb()).mo21963f(((zzebt) this.f33662b).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
