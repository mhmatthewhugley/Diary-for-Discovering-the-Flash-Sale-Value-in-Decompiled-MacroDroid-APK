package p473rx.internal.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p468nf.C17195c;
import p473rx.internal.schedulers.C17365c;
import p473rx.internal.schedulers.C17374h;
import p473rx.internal.util.unsafe.C17396e;
import p473rx.internal.util.unsafe.C17417z;

/* renamed from: rx.internal.util.b */
/* compiled from: ObjectPool */
public abstract class C17376b<T> implements C17374h {

    /* renamed from: a */
    Queue<T> f69125a;

    /* renamed from: b */
    final int f69126b;

    /* renamed from: c */
    final int f69127c;

    /* renamed from: d */
    private final long f69128d;

    /* renamed from: e */
    private final AtomicReference<Future<?>> f69129e;

    /* renamed from: rx.internal.util.b$a */
    /* compiled from: ObjectPool */
    class C17377a implements Runnable {
        C17377a() {
        }

        public void run() {
            int size = C17376b.this.f69125a.size();
            C17376b bVar = C17376b.this;
            int i = 0;
            if (size < bVar.f69126b) {
                int i2 = bVar.f69127c - size;
                while (i < i2) {
                    C17376b bVar2 = C17376b.this;
                    bVar2.f69125a.add(bVar2.mo80695a());
                    i++;
                }
                return;
            }
            int i3 = bVar.f69127c;
            if (size > i3) {
                int i4 = size - i3;
                while (i < i4) {
                    C17376b.this.f69125a.poll();
                    i++;
                }
            }
        }
    }

    public C17376b() {
        this(0, 0, 67);
    }

    /* renamed from: b */
    private void m101129b(int i) {
        if (C17417z.m101181b()) {
            this.f69125a = new C17396e(Math.max(this.f69127c, 1024));
        } else {
            this.f69125a = new ConcurrentLinkedQueue();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.f69125a.add(mo80695a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo80695a();

    /* renamed from: c */
    public void mo80696c() {
        while (this.f69129e.get() == null) {
            ScheduledExecutorService a = C17365c.m101099a();
            try {
                C17377a aVar = new C17377a();
                long j = this.f69128d;
                ScheduledFuture<?> scheduleAtFixedRate = a.scheduleAtFixedRate(aVar, j, j, TimeUnit.SECONDS);
                if (!this.f69129e.compareAndSet((Object) null, scheduleAtFixedRate)) {
                    scheduleAtFixedRate.cancel(false);
                } else {
                    return;
                }
            } catch (RejectedExecutionException e) {
                C17195c.m100723g(e);
                return;
            }
        }
    }

    public void shutdown() {
        Future andSet = this.f69129e.getAndSet((Object) null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }

    private C17376b(int i, int i2, long j) {
        this.f69126b = i;
        this.f69127c = i2;
        this.f69128d = j;
        this.f69129e = new AtomicReference<>();
        m101129b(i);
        mo80696c();
    }
}
