package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfzr implements Executor {

    /* renamed from: a */
    final /* synthetic */ Executor f36610a;

    /* renamed from: c */
    final /* synthetic */ zzfxx f36611c;

    zzfzr(Executor executor, zzfxx zzfxx) {
        this.f36610a = executor;
        this.f36611c = zzfxx;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f36610a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f36611c.mo46081g(e);
        }
    }
}
