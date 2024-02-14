package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzewj implements zzgxi {

    /* renamed from: a */
    private final zzgxv f35084a;

    /* renamed from: b */
    private final zzgxv f35085b;

    /* renamed from: c */
    private final zzgxv f35086c;

    /* renamed from: d */
    private final zzgxv f35087d;

    /* renamed from: e */
    private final zzgxv f35088e;

    public zzewj(zzgxv zzgxv, zzgxv zzgxv2, zzgxv zzgxv3, zzgxv zzgxv4, zzgxv zzgxv5) {
        this.f35084a = zzgxv;
        this.f35085b = zzgxv2;
        this.f35086c = zzgxv3;
        this.f35087d = zzgxv4;
        this.f35088e = zzgxv5;
    }

    /* renamed from: a */
    public static zzewh m49548a(String str, zzbds zzbds, zzcfy zzcfy, ScheduledExecutorService scheduledExecutorService, zzfzq zzfzq) {
        return new zzewh(str, zzbds, zzcfy, scheduledExecutorService, zzfzq, (byte[]) null);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfzq zzfzq = zzchc.f28456a;
        zzgxq.m53658b(zzfzq);
        return new zzewh(((zzexj) this.f35084a).mo45506a(), new zzbds(), (zzcfy) this.f35086c.zzb(), (ScheduledExecutorService) this.f35087d.zzb(), zzfzq, (byte[]) null);
    }
}
