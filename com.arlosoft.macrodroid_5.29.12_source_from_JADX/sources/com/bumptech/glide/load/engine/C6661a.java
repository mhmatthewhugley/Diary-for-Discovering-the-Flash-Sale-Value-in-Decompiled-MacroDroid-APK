package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.C6701o;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p090f5.C7315j;
import p102h4.C7380e;
import p120k4.C7587c;

/* renamed from: com.bumptech.glide.load.engine.a */
/* compiled from: ActiveResources */
final class C6661a {

    /* renamed from: a */
    private final boolean f15494a;

    /* renamed from: b */
    private final Executor f15495b;
    @VisibleForTesting

    /* renamed from: c */
    final Map<C7380e, C6666d> f15496c;

    /* renamed from: d */
    private final ReferenceQueue<C6701o<?>> f15497d;

    /* renamed from: e */
    private C6701o.C6702a f15498e;

    /* renamed from: f */
    private volatile boolean f15499f;
    @Nullable

    /* renamed from: g */
    private volatile C6665c f15500g;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    /* compiled from: ActiveResources */
    class C6662a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a */
        /* compiled from: ActiveResources */
        class C6663a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Runnable f15501a;

            C6663a(Runnable runnable) {
                this.f15501a = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f15501a.run();
            }
        }

        C6662a() {
        }

        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new C6663a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    /* compiled from: ActiveResources */
    class C6664b implements Runnable {
        C6664b() {
        }

        public void run() {
            C6661a.this.mo32995b();
        }
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.a$c */
    /* compiled from: ActiveResources */
    interface C6665c {
        /* renamed from: a */
        void mo33003a();
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.a$d */
    /* compiled from: ActiveResources */
    static final class C6666d extends WeakReference<C6701o<?>> {

        /* renamed from: a */
        final C7380e f15504a;

        /* renamed from: b */
        final boolean f15505b;
        @Nullable

        /* renamed from: c */
        C7587c<?> f15506c;

        C6666d(@NonNull C7380e eVar, @NonNull C6701o<?> oVar, @NonNull ReferenceQueue<? super C6701o<?>> referenceQueue, boolean z) {
            super(oVar, referenceQueue);
            this.f15504a = (C7380e) C7315j.m30204d(eVar);
            this.f15506c = (!oVar.mo33105d() || !z) ? null : (C7587c) C7315j.m30204d(oVar.mo33104c());
            this.f15505b = oVar.mo33105d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo33004a() {
            this.f15506c = null;
            clear();
        }
    }

    C6661a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new C6662a()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo32994a(C7380e eVar, C6701o<?> oVar) {
        C6666d put = this.f15496c.put(eVar, new C6666d(eVar, oVar, this.f15497d, this.f15494a));
        if (put != null) {
            put.mo33004a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo32995b() {
        while (!this.f15499f) {
            try {
                mo32996c((C6666d) this.f15497d.remove());
                C6665c cVar = this.f15500g;
                if (cVar != null) {
                    cVar.mo33003a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo32996c(@NonNull C6666d dVar) {
        synchronized (this.f15498e) {
            synchronized (this) {
                this.f15496c.remove(dVar.f15504a);
                if (dVar.f15505b) {
                    C7587c<?> cVar = dVar.f15506c;
                    if (cVar != null) {
                        C6701o oVar = new C6701o(cVar, true, false);
                        oVar.mo33107f(dVar.f15504a, this.f15498e);
                        this.f15498e.mo33066c(dVar.f15504a, oVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo32997d(C7380e eVar) {
        C6666d remove = this.f15496c.remove(eVar);
        if (remove != null) {
            remove.mo33004a();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    @androidx.annotation.Nullable
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bumptech.glide.load.engine.C6701o<?> mo32998e(p102h4.C7380e r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<h4.e, com.bumptech.glide.load.engine.a$d> r0 = r1.f15496c     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.a$d r2 = (com.bumptech.glide.load.engine.C6661a.C6666d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.o r0 = (com.bumptech.glide.load.engine.C6701o) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo32996c(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C6661a.mo32998e(h4.e):com.bumptech.glide.load.engine.o");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo32999f(C6701o.C6702a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f15498e = aVar;
            }
        }
    }

    @VisibleForTesting
    C6661a(boolean z, Executor executor) {
        this.f15496c = new HashMap();
        this.f15497d = new ReferenceQueue<>();
        this.f15494a = z;
        this.f15495b = executor;
        executor.execute(new C6664b());
    }
}
