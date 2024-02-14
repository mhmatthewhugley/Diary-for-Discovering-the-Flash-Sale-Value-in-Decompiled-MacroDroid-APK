package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzecf {

    /* renamed from: a */
    private final ScheduledExecutorService f33671a;

    /* renamed from: b */
    private final zzfzq f33672b;

    /* renamed from: c */
    private final zzecw f33673c;

    /* renamed from: d */
    private final zzgxc f33674d;

    public zzecf(ScheduledExecutorService scheduledExecutorService, zzfzq zzfzq, zzecw zzecw, zzgxc zzgxc) {
        this.f33671a = scheduledExecutorService;
        this.f33672b = zzfzq;
        this.f33673c = zzecw;
        this.f33674d = zzgxc;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzfzp mo45164a(zzcbc zzcbc, int i, Throwable th) throws Exception {
        return ((zzeek) this.f33674d.zzb()).mo45213Lb(zzcbc, i);
    }

    /* renamed from: b */
    public final zzfzp mo45165b(zzcbc zzcbc) {
        zzfzp zzfzp;
        String str = zzcbc.f28125f;
        zzt.m2905r();
        if (zzs.m2748V(str)) {
            zzfzp = zzfzg.m51413h(new zzedj(1));
        } else {
            zzecw zzecw = this.f33673c;
            synchronized (zzecw.f33722c) {
                if (zzecw.f33723d) {
                    zzfzp = zzecw.f33721a;
                } else {
                    zzecw.f33723d = true;
                    zzecw.f33725g = zzcbc;
                    zzecw.f33726o.mo21655v();
                    zzecw.f33721a.mo43580q(new zzecv(zzecw), zzchc.f28461f);
                    zzfzp = zzecw.f33721a;
                }
            }
        }
        int callingUid = Binder.getCallingUid();
        zzfyx C = zzfyx.m51389C(zzfzp);
        long intValue = (long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f26851E4)).intValue();
        return zzfzg.m51412g((zzfyx) zzfzg.m51420o(C, intValue, TimeUnit.SECONDS, this.f33671a), Throwable.class, new zzece(this, zzcbc, callingUid), this.f33672b);
    }
}
