package com.google.mlkit.p229nl.translate.internal;

import com.google.android.gms.internal.mlkit_translate.zznx;
import com.google.android.gms.internal.mlkit_translate.zzps;
import com.google.android.gms.internal.mlkit_translate.zzpu;
import com.google.android.gms.internal.mlkit_translate.zzqf;
import com.google.mlkit.common.sdkinternal.MlKitContext;

/* renamed from: com.google.mlkit.nl.translate.internal.zzr */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzr {

    /* renamed from: a */
    private final zzps f56537a;

    /* renamed from: b */
    private final zzpu f56538b;

    public zzr() {
        zzps b = zzqf.m62200b("translate");
        zzpu a = zzpu.m62170a(MlKitContext.m79040c().mo64554b());
        this.f56537a = b;
        this.f56538b = a;
    }

    /* renamed from: a */
    public final zzt mo64689a(zznx zznx) {
        return new zzt(this.f56537a, this.f56538b, zznx, (zzs) null);
    }
}
