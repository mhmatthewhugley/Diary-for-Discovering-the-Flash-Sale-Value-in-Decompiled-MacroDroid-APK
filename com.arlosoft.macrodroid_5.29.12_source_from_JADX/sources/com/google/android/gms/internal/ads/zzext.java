package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzext implements zzeve {

    /* renamed from: a */
    private final zzcfy f35151a;

    /* renamed from: b */
    private final boolean f35152b;

    /* renamed from: c */
    private final boolean f35153c;

    /* renamed from: d */
    private final ScheduledExecutorService f35154d;

    /* renamed from: e */
    private final zzfzq f35155e;

    /* renamed from: f */
    private final String f35156f;

    /* renamed from: g */
    private final zzcfn f35157g;

    zzext(zzcfy zzcfy, boolean z, boolean z2, zzcfn zzcfn, zzfzq zzfzq, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.f35151a = zzcfy;
        this.f35152b = z;
        this.f35153c = z2;
        this.f35157g = zzcfn;
        this.f35155e = zzfzq;
        this.f35156f = str;
        this.f35154d = scheduledExecutorService;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzexu mo45511a(Exception exc) {
        this.f35151a.mo43503t(exc, "TrustlessTokenSignal");
        return null;
    }

    public final int zza() {
        return 50;
    }

    public final zzfzp zzb() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27188m6)).booleanValue() && this.f35153c) {
            return zzfzg.m51414i((Object) null);
        }
        if (!this.f35152b) {
            return zzfzg.m51414i((Object) null);
        }
        return zzfzg.m51411f(zzfzg.m51420o(zzfzg.m51418m(zzfzg.m51414i((Object) null), zzexr.f35149a, this.f35155e), ((Long) zzblf.f27500c.mo42728e()).longValue(), TimeUnit.MILLISECONDS, this.f35154d), Exception.class, new zzexs(this), this.f35155e);
    }
}
