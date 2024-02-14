package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzexf implements zzeve {

    /* renamed from: a */
    final ScheduledExecutorService f35133a;

    /* renamed from: b */
    final Context f35134b;

    /* renamed from: c */
    final zzbzg f35135c;

    public zzexf(zzbzg zzbzg, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.f35135c = zzbzg;
        this.f35133a = scheduledExecutorService;
        this.f35134b = context;
    }

    public final int zza() {
        return 49;
    }

    public final zzfzp zzb() {
        return zzfzg.m51418m(zzfzg.m51420o(zzfzg.m51414i(new Bundle()), ((Long) zzay.m1924c().mo42663b(zzbjc.f27155j3)).longValue(), TimeUnit.MILLISECONDS, this.f35133a), zzexe.f35132a, zzchc.f28456a);
    }
}
