package com.arlosoft.macrodroid.utils;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.arlosoft.macrodroid.utils.t */
/* compiled from: Debouncer */
public class C6433t {

    /* renamed from: a */
    private final ScheduledExecutorService f15057a = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ConcurrentHashMap<Object, Future<?>> f15058b = new ConcurrentHashMap<>();

    /* renamed from: com.arlosoft.macrodroid.utils.t$a */
    /* compiled from: Debouncer */
    class C6434a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f15059a;

        /* renamed from: c */
        final /* synthetic */ Object f15060c;

        C6434a(Runnable runnable, Object obj) {
            this.f15059a = runnable;
            this.f15060c = obj;
        }

        public void run() {
            try {
                this.f15059a.run();
            } finally {
                C6433t.this.f15058b.remove(this.f15060c);
            }
        }
    }

    /* renamed from: b */
    public void mo32491b(Object obj, Runnable runnable, long j, TimeUnit timeUnit) {
        Future put = this.f15058b.put(obj, this.f15057a.schedule(new C6434a(runnable, obj), j, timeUnit));
        if (put != null) {
            put.cancel(true);
        }
    }
}
