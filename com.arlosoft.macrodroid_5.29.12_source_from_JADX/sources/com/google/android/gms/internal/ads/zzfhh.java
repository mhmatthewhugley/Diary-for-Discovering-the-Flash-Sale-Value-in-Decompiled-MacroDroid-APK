package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfhh implements zzgxi {

    /* renamed from: a */
    private final zzgxv f35777a;

    public zzfhh(zzgxv zzgxv) {
        this.f35777a = zzgxv;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfpy.m50764a();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.f35777a.zzb()));
        zzgxq.m53658b(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
