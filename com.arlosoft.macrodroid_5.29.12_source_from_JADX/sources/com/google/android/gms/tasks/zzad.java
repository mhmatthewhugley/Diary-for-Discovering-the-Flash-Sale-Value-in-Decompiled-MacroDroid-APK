package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzad<T> implements zzae<T> {

    /* renamed from: a */
    private final CountDownLatch f48001a = new CountDownLatch(1);

    private zzad() {
    }

    /* renamed from: a */
    public final void mo56142a() throws InterruptedException {
        this.f48001a.await();
    }

    /* renamed from: b */
    public final void mo22751b(T t) {
        this.f48001a.countDown();
    }

    /* renamed from: c */
    public final void mo22733c(@NonNull Exception exc) {
        this.f48001a.countDown();
    }

    /* renamed from: d */
    public final void mo30644d() {
        this.f48001a.countDown();
    }

    /* renamed from: e */
    public final boolean mo56143e(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f48001a.await(j, timeUnit);
    }

    /* synthetic */ zzad(zzac zzac) {
    }
}
