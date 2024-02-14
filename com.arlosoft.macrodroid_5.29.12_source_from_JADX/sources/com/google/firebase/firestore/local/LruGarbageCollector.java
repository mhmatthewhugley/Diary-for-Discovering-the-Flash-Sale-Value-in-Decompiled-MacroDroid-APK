package com.google.firebase.firestore.local;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Logger;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

public class LruGarbageCollector {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final long f54237c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final long f54238d;

    /* renamed from: a */
    private final LruDelegate f54239a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Params f54240b;

    public static class Params {

        /* renamed from: a */
        final long f54241a;

        /* renamed from: b */
        final int f54242b;

        /* renamed from: c */
        final int f54243c;

        Params(long j, int i, int i2) {
            this.f54241a = j;
            this.f54242b = i;
            this.f54243c = i2;
        }

        /* renamed from: a */
        public static Params m75413a(long j) {
            return new Params(j, 10, 1000);
        }
    }

    public static class Results {

        /* renamed from: a */
        private final boolean f54244a;

        /* renamed from: b */
        private final int f54245b;

        /* renamed from: c */
        private final int f54246c;

        /* renamed from: d */
        private final int f54247d;

        Results(boolean z, int i, int i2, int i3) {
            this.f54244a = z;
            this.f54245b = i;
            this.f54246c = i2;
            this.f54247d = i3;
        }

        /* renamed from: a */
        static Results m75414a() {
            return new Results(false, 0, 0, 0);
        }
    }

    private static class RollingSequenceNumberBuffer {

        /* renamed from: c */
        private static final Comparator<Long> f54248c = LruGarbageCollector$RollingSequenceNumberBuffer$$Lambda$1.m75422a();

        /* renamed from: a */
        private final PriorityQueue<Long> f54249a;

        /* renamed from: b */
        private final int f54250b;

        RollingSequenceNumberBuffer(int i) {
            this.f54250b = i;
            this.f54249a = new PriorityQueue<>(i, f54248c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo62652a(Long l) {
            if (this.f54249a.size() < this.f54250b) {
                this.f54249a.add(l);
            } else if (l.longValue() < this.f54249a.peek().longValue()) {
                this.f54249a.poll();
                this.f54249a.add(l);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo62653b() {
            return this.f54249a.peek().longValue();
        }
    }

    public class Scheduler implements GarbageCollectionScheduler {

        /* renamed from: a */
        private final AsyncQueue f54251a;

        /* renamed from: b */
        private final LocalStore f54252b;

        /* renamed from: c */
        private boolean f54253c = false;
        @Nullable

        /* renamed from: d */
        private AsyncQueue.DelayedTask f54254d;

        public Scheduler(AsyncQueue asyncQueue, LocalStore localStore) {
            this.f54251a = asyncQueue;
            this.f54252b = localStore;
        }

        /* renamed from: a */
        static /* synthetic */ void m75418a(Scheduler scheduler) {
            scheduler.f54252b.mo62614h(LruGarbageCollector.this);
            scheduler.f54253c = true;
            scheduler.m75419b();
        }

        /* renamed from: b */
        private void m75419b() {
            this.f54254d = this.f54251a.mo63151g(AsyncQueue.TimerId.GARBAGE_COLLECTION, this.f54253c ? LruGarbageCollector.f54238d : LruGarbageCollector.f54237c, LruGarbageCollector$Scheduler$$Lambda$1.m75423a(this));
        }

        public void start() {
            if (LruGarbageCollector.this.f54240b.f54241a != -1) {
                m75419b();
            }
        }

        public void stop() {
            AsyncQueue.DelayedTask delayedTask = this.f54254d;
            if (delayedTask != null) {
                delayedTask.mo63157e();
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f54237c = timeUnit.toMillis(1);
        f54238d = timeUnit.toMillis(5);
    }

    LruGarbageCollector(LruDelegate lruDelegate, Params params) {
        this.f54239a = lruDelegate;
        this.f54240b = params;
    }

    /* renamed from: l */
    private Results m75405l(SparseArray<?> sparseArray) {
        long currentTimeMillis = System.currentTimeMillis();
        int d = mo62645d(this.f54240b.f54242b);
        if (d > this.f54240b.f54243c) {
            Logger.m76508a("LruGarbageCollector", "Capping sequence numbers to collect down to the maximum of " + this.f54240b.f54243c + " from " + d, new Object[0]);
            d = this.f54240b.f54243c;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        long g = mo62648g(d);
        long currentTimeMillis3 = System.currentTimeMillis();
        int k = mo62651k(g, sparseArray);
        long currentTimeMillis4 = System.currentTimeMillis();
        int j = mo62650j(g);
        long currentTimeMillis5 = System.currentTimeMillis();
        if (Logger.m76510c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("LRU Garbage Collection:\n" + "\tCounted targets in " + (currentTimeMillis2 - currentTimeMillis) + "ms\n");
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "\tDetermined least recently used %d sequence numbers in %dms\n", new Object[]{Integer.valueOf(d), Long.valueOf(currentTimeMillis3 - currentTimeMillis2)}));
            Logger.m76508a("LruGarbageCollector", ((sb.toString() + String.format(locale, "\tRemoved %d targets in %dms\n", new Object[]{Integer.valueOf(k), Long.valueOf(currentTimeMillis4 - currentTimeMillis3)})) + String.format(locale, "\tRemoved %d documents in %dms\n", new Object[]{Integer.valueOf(j), Long.valueOf(currentTimeMillis5 - currentTimeMillis4)})) + String.format(locale, "Total Duration: %dms", new Object[]{Long.valueOf(currentTimeMillis5 - currentTimeMillis)}), new Object[0]);
        }
        return new Results(true, d, k, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo62645d(int i) {
        return (int) ((((float) i) / 100.0f) * ((float) this.f54239a.mo62644m()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Results mo62646e(SparseArray<?> sparseArray) {
        if (this.f54240b.f54241a == -1) {
            Logger.m76508a("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
            return Results.m75414a();
        }
        long f = mo62647f();
        if (f >= this.f54240b.f54241a) {
            return m75405l(sparseArray);
        }
        Logger.m76508a("LruGarbageCollector", "Garbage collection skipped; Cache size " + f + " is lower than threshold " + this.f54240b.f54241a, new Object[0]);
        return Results.m75414a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo62647f() {
        return this.f54239a.mo62638a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public long mo62648g(int i) {
        if (i == 0) {
            return -1;
        }
        RollingSequenceNumberBuffer rollingSequenceNumberBuffer = new RollingSequenceNumberBuffer(i);
        this.f54239a.mo62643k(LruGarbageCollector$$Lambda$1.m75420a(rollingSequenceNumberBuffer));
        this.f54239a.mo62639b(LruGarbageCollector$$Lambda$2.m75421a(rollingSequenceNumberBuffer));
        return rollingSequenceNumberBuffer.mo62653b();
    }

    /* renamed from: i */
    public Scheduler mo62649i(AsyncQueue asyncQueue, LocalStore localStore) {
        return new Scheduler(asyncQueue, localStore);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo62650j(long j) {
        return this.f54239a.mo62641e(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo62651k(long j, SparseArray<?> sparseArray) {
        return this.f54239a.mo62642f(j, sparseArray);
    }
}
