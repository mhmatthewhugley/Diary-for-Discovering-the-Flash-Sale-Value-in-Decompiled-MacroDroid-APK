package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfhm implements zzfzp {

    /* renamed from: a */
    private final Object f35779a;

    /* renamed from: c */
    private final String f35780c;

    /* renamed from: d */
    private final zzfzp f35781d;

    @VisibleForTesting(otherwise = 3)
    public zzfhm(Object obj, String str, zzfzp zzfzp) {
        this.f35779a = obj;
        this.f35780c = str;
        this.f35781d = zzfzp;
    }

    /* renamed from: a */
    public final Object mo45730a() {
        return this.f35779a;
    }

    /* renamed from: b */
    public final String mo45731b() {
        return this.f35780c;
    }

    public final boolean cancel(boolean z) {
        return this.f35781d.cancel(z);
    }

    public final Object get() throws InterruptedException, ExecutionException {
        return this.f35781d.get();
    }

    public final boolean isCancelled() {
        return this.f35781d.isCancelled();
    }

    public final boolean isDone() {
        return this.f35781d.isDone();
    }

    /* renamed from: q */
    public final void mo43580q(Runnable runnable, Executor executor) {
        this.f35781d.mo43580q(runnable, executor);
    }

    public final String toString() {
        String str = this.f35780c;
        int identityHashCode = System.identityHashCode(this);
        return str + "@" + identityHashCode;
    }

    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f35781d.get(j, timeUnit);
    }
}
