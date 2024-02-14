package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzewn implements zzeve {

    /* renamed from: a */
    private final Context f35092a;

    /* renamed from: b */
    private final zzcfy f35093b;

    /* renamed from: c */
    private final ScheduledExecutorService f35094c;

    /* renamed from: d */
    private final Executor f35095d;

    /* renamed from: e */
    private final String f35096e;

    /* renamed from: f */
    private final zzcfp f35097f;

    public zzewn(zzcfp zzcfp, int i, Context context, zzcfy zzcfy, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.f35097f = zzcfp;
        this.f35092a = context;
        this.f35093b = zzcfy;
        this.f35094c = scheduledExecutorService;
        this.f35095d = executor;
        this.f35096e = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzewo mo45493a(Exception exc) {
        this.f35093b.mo43503t(exc, "AttestationTokenSignal");
        return null;
    }

    public final int zza() {
        return 44;
    }

    public final zzfzp zzb() {
        return zzfzg.m51411f((zzfyx) zzfzg.m51420o(zzfzg.m51418m(zzfyx.m51389C(zzfzg.m51417l(new zzewk(this), this.f35095d)), zzewl.f35090a, this.f35095d), ((Long) zzay.m1924c().mo42663b(zzbjc.f26957P0)).longValue(), TimeUnit.MILLISECONDS, this.f35094c), Exception.class, new zzewm(this), zzfzw.m51438b());
    }
}
