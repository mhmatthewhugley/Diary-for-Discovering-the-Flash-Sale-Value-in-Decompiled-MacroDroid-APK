package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzecl implements zzgxi {

    /* renamed from: a */
    private final zzgxv f33690a;

    /* renamed from: b */
    private final zzgxv f33691b;

    /* renamed from: c */
    private final zzgxv f33692c;

    /* renamed from: d */
    private final zzgxv f33693d;

    /* renamed from: e */
    private final zzgxv f33694e;

    /* renamed from: f */
    private final zzgxv f33695f;

    /* renamed from: g */
    private final zzgxv f33696g;

    public zzecl(zzgxv zzgxv, zzgxv zzgxv2, zzgxv zzgxv3, zzgxv zzgxv4, zzgxv zzgxv5, zzgxv zzgxv6, zzgxv zzgxv7) {
        this.f33690a = zzgxv;
        this.f33691b = zzgxv2;
        this.f33692c = zzgxv3;
        this.f33693d = zzgxv4;
        this.f33694e = zzgxv5;
        this.f33695f = zzgxv6;
        this.f33696g = zzgxv7;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a = ((zzcos) this.f33690a).mo44226a();
        zzfef a2 = ((zzdcr) this.f33691b).mo44567a();
        zzebl a3 = ((zzebm) this.f33692c).zzb();
        zzfzq zzfzq = zzchc.f28456a;
        zzgxq.m53658b(zzfzq);
        return new zzeck(a, a2, a3, zzfzq, (ScheduledExecutorService) this.f33694e.zzb(), (zzefo) this.f33695f.zzb(), (zzfju) this.f33696g.zzb());
    }
}
