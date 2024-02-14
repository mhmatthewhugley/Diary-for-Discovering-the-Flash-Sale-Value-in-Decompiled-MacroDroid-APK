package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzebt implements zzgxi {

    /* renamed from: a */
    private final zzgxv f33658a;

    public zzebt(zzgxv zzgxv) {
        this.f33658a = zzgxv;
    }

    /* renamed from: a */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.f33658a.zzb()).getApplicationInfo();
        zzgxq.m53658b(applicationInfo);
        return applicationInfo;
    }
}
