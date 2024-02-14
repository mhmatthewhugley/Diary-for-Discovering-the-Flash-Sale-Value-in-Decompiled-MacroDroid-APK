package com.google.android.gms.internal.consent_sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class zzcc implements Executor {

    /* renamed from: a */
    private final AtomicInteger f39409a = new AtomicInteger(1);

    /* renamed from: c */
    private final ThreadPoolExecutor f39410c;

    /* renamed from: d */
    private WeakReference<Thread> f39411d = new WeakReference<>((Object) null);

    zzcc(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcb(this, "Google consent worker"));
        this.f39410c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public final /* synthetic */ Thread mo48714a(String str, Runnable runnable) {
        int andIncrement = this.f39409a.getAndIncrement();
        StringBuilder sb = new StringBuilder(34);
        sb.append("Google consent worker #");
        sb.append(andIncrement);
        Thread thread = new Thread(runnable, sb.toString());
        this.f39411d = new WeakReference<>(thread);
        return thread;
    }

    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f39411d.get()) {
            runnable.run();
        } else {
            this.f39410c.execute(runnable);
        }
    }
}
