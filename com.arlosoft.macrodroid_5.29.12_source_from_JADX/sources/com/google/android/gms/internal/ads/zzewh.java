package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzewh implements zzeve {

    /* renamed from: a */
    private final zzcfy f35077a;

    /* renamed from: b */
    private final String f35078b;

    /* renamed from: c */
    private final ScheduledExecutorService f35079c;

    /* renamed from: d */
    private final zzfzq f35080d;

    /* renamed from: e */
    private final zzbds f35081e;

    zzewh(String str, zzbds zzbds, zzcfy zzcfy, ScheduledExecutorService scheduledExecutorService, zzfzq zzfzq, byte[] bArr) {
        this.f35078b = str;
        this.f35081e = zzbds;
        this.f35077a = zzcfy;
        this.f35079c = scheduledExecutorService;
        this.f35080d = zzfzq;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzewi mo45492a(Exception exc) {
        this.f35077a.mo43503t(exc, "AppSetIdInfoGmscoreSignal");
        return new zzewi((String) null, -1);
    }

    public final int zza() {
        return 43;
    }

    public final zzfzp zzb() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27184m2)).booleanValue()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27234r2)).booleanValue()) {
                zzfzp n = zzfzg.m51419n(zzfqc.m50773a(Tasks.m66667f(null)), zzewf.f35075a, this.f35080d);
                if (((Boolean) zzbkh.f27392a.mo42728e()).booleanValue()) {
                    n = zzfzg.m51420o(n, ((Long) zzbkh.f27393b.mo42728e()).longValue(), TimeUnit.MILLISECONDS, this.f35079c);
                }
                return zzfzg.m51411f(n, Exception.class, new zzewg(this), this.f35080d);
            }
        }
        return zzfzg.m51414i(new zzewi((String) null, -1));
    }
}
