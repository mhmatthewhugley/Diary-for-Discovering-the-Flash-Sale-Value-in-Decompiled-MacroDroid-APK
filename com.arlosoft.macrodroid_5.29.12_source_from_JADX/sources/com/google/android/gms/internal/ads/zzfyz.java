package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzfyz extends zzfve implements Future {
    protected zzfyz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo45754b() {
        throw null;
    }

    public boolean cancel(boolean z) {
        return mo46614d().cancel(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Future mo46614d();

    public final Object get() throws InterruptedException, ExecutionException {
        return mo46614d().get();
    }

    public final boolean isCancelled() {
        return mo46614d().isCancelled();
    }

    public final boolean isDone() {
        return mo46614d().isDone();
    }

    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo46614d().get(j, timeUnit);
    }
}
