package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfzk implements zzfzp {

    /* renamed from: c */
    static final zzfzp f36605c = new zzfzk((Object) null);

    /* renamed from: d */
    private static final Logger f36606d = Logger.getLogger(zzfzk.class.getName());

    /* renamed from: a */
    private final Object f36607a;

    zzfzk(Object obj) {
        this.f36607a = obj;
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get() {
        return this.f36607a;
    }

    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        Objects.requireNonNull(timeUnit);
        return this.f36607a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    /* renamed from: q */
    public final void mo43580q(Runnable runnable, Executor executor) {
        zzfsx.m50938c(runnable, "Runnable was null.");
        zzfsx.m50938c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f36606d;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f36607a + "]]";
    }
}
