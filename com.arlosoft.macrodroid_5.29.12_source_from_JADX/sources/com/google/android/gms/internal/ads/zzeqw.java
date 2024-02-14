package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeqw implements zzeve {
    @VisibleForTesting

    /* renamed from: a */
    final zzcfy f34733a;
    @VisibleForTesting

    /* renamed from: b */
    AppSetIdClient f34734b;

    /* renamed from: c */
    private final ScheduledExecutorService f34735c;

    /* renamed from: d */
    private final zzfzq f34736d;

    /* renamed from: e */
    private final Context f34737e;

    zzeqw(Context context, zzcfy zzcfy, ScheduledExecutorService scheduledExecutorService, zzfzq zzfzq) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27224q2)).booleanValue()) {
            this.f34734b = AppSet.m3109a(context);
        }
        this.f34737e = context;
        this.f34733a = zzcfy;
        this.f34735c = scheduledExecutorService;
        this.f34736d = zzfzq;
    }

    public final int zza() {
        return 11;
    }

    public final zzfzp zzb() {
        Task<AppSetIdInfo> task;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27184m2)).booleanValue()) {
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27234r2)).booleanValue()) {
                if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27194n2)).booleanValue()) {
                    return zzfzg.m51418m(zzfqc.m50773a(this.f34734b.mo20736h()), zzeqt.f34730a, zzchc.f28461f);
                }
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27224q2)).booleanValue()) {
                    task = zzffh.m50086a(this.f34737e);
                } else {
                    task = this.f34734b.mo20736h();
                }
                if (task == null) {
                    return zzfzg.m51414i(new zzeqx((String) null, -1));
                }
                zzfzp n = zzfzg.m51419n(zzfqc.m50773a(task), zzequ.f34731a, zzchc.f28461f);
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27204o2)).booleanValue()) {
                    n = zzfzg.m51420o(n, ((Long) zzay.m1924c().mo42663b(zzbjc.f27214p2)).longValue(), TimeUnit.MILLISECONDS, this.f34735c);
                }
                return zzfzg.m51411f(n, Exception.class, new zzeqv(this), this.f34736d);
            }
        }
        return zzfzg.m51414i(new zzeqx((String) null, -1));
    }
}
