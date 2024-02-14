package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfiu implements zzfir {

    /* renamed from: a */
    private final zzfir f35855a;

    /* renamed from: b */
    private final Queue f35856b = new LinkedBlockingQueue();

    /* renamed from: c */
    private final int f35857c = ((Integer) zzay.m1924c().mo42663b(zzbjc.f27279v7)).intValue();

    /* renamed from: d */
    private final AtomicBoolean f35858d = new AtomicBoolean(false);

    public zzfiu(zzfir zzfir, ScheduledExecutorService scheduledExecutorService) {
        this.f35855a = zzfir;
        long intValue = (long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f27269u7)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new zzfit(this), intValue, intValue, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public static /* synthetic */ void m50239c(zzfiu zzfiu) {
        while (!zzfiu.f35856b.isEmpty()) {
            zzfiu.f35855a.mo45782a((zzfiq) zzfiu.f35856b.remove());
        }
    }

    /* renamed from: a */
    public final void mo45782a(zzfiq zzfiq) {
        if (this.f35856b.size() < this.f35857c) {
            this.f35856b.offer(zzfiq);
        } else if (!this.f35858d.getAndSet(true)) {
            Queue queue = this.f35856b;
            zzfiq b = zzfiq.m50227b("dropped_event");
            Map j = zzfiq.mo45781j();
            if (j.containsKey("action")) {
                b.mo45774a("dropped_action", (String) j.get("action"));
            }
            queue.offer(b);
        }
    }

    /* renamed from: b */
    public final String mo45783b(zzfiq zzfiq) {
        return this.f35855a.mo45783b(zzfiq);
    }
}
