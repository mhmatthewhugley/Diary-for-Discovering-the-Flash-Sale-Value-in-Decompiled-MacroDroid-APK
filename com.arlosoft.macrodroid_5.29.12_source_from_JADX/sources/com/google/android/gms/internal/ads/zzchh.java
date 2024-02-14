package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzchh implements zzfzp {

    /* renamed from: a */
    private final zzfzy f28465a = zzfzy.m51441C();

    /* renamed from: b */
    private static final boolean m45248b(boolean z) {
        if (!z) {
            zzt.m2904q().mo43502s(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo43574c(@Nullable Object obj) {
        boolean f = this.f28465a.mo46080f(obj);
        m45248b(f);
        return f;
    }

    public boolean cancel(boolean z) {
        return this.f28465a.cancel(z);
    }

    /* renamed from: d */
    public final boolean mo43575d(Throwable th) {
        boolean g = this.f28465a.mo46081g(th);
        m45248b(g);
        return g;
    }

    public final Object get() throws ExecutionException, InterruptedException {
        return this.f28465a.get();
    }

    public final boolean isCancelled() {
        return this.f28465a.isCancelled();
    }

    public final boolean isDone() {
        return this.f28465a.isDone();
    }

    /* renamed from: q */
    public final void mo43580q(Runnable runnable, Executor executor) {
        this.f28465a.mo43580q(runnable, executor);
    }

    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f28465a.get(j, timeUnit);
    }
}
