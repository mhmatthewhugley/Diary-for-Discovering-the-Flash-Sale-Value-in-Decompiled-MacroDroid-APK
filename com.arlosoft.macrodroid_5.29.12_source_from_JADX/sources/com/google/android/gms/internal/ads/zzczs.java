package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzczs {

    /* renamed from: a */
    private final Executor f31918a;

    /* renamed from: b */
    private final ScheduledExecutorService f31919b;

    /* renamed from: c */
    private final zzfzp f31920c;

    /* renamed from: d */
    private volatile boolean f31921d = true;

    public zzczs(Executor executor, ScheduledExecutorService scheduledExecutorService, zzfzp zzfzp) {
        this.f31918a = executor;
        this.f31919b = scheduledExecutorService;
        this.f31920c = zzfzp;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m47085b(zzczs zzczs, List list, zzfzc zzfzc) {
        if (list == null || list.isEmpty()) {
            zzczs.f31918a.execute(new zzczm(zzfzc));
            return;
        }
        zzfzp i = zzfzg.m51414i((Object) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i = zzfzg.m51419n(zzfzg.m51412g(i, Throwable.class, new zzczn(zzfzc), zzczs.f31918a), new zzczo(zzczs, zzfzc, (zzfzp) it.next()), zzczs.f31918a);
        }
        zzfzg.m51423r(i, new zzczr(zzczs, zzfzc), zzczs.f31918a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzfzp mo44504a(zzfzc zzfzc, zzfzp zzfzp, zzcze zzcze) throws Exception {
        if (zzcze != null) {
            zzfzc.mo20700c(zzcze);
        }
        return zzfzg.m51420o(zzfzp, ((Long) zzble.f27496b.mo42728e()).longValue(), TimeUnit.MILLISECONDS, this.f31919b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo44505d() {
        this.f31921d = false;
    }

    /* renamed from: e */
    public final void mo44506e(zzfzc zzfzc) {
        zzfzg.m51423r(this.f31920c, new zzczq(this, zzfzc), this.f31918a);
    }

    /* renamed from: f */
    public final boolean mo44507f() {
        return this.f31921d;
    }
}
