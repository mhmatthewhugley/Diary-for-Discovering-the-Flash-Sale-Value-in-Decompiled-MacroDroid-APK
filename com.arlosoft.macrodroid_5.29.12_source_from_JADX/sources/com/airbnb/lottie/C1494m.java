package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import p001a0.C0006d;

/* renamed from: com.airbnb.lottie.m */
/* compiled from: LottieTask */
public class C1494m<T> {

    /* renamed from: e */
    public static Executor f1014e = Executors.newCachedThreadPool();

    /* renamed from: a */
    private final Set<C1489h<T>> f1015a;

    /* renamed from: b */
    private final Set<C1489h<Throwable>> f1016b;

    /* renamed from: c */
    private final Handler f1017c;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public volatile C1493l<T> f1018d;

    /* renamed from: com.airbnb.lottie.m$a */
    /* compiled from: LottieTask */
    class C1495a implements Runnable {
        C1495a() {
        }

        public void run() {
            if (C1494m.this.f1018d != null) {
                C1493l a = C1494m.this.f1018d;
                if (a.mo17162b() != null) {
                    C1494m.this.m889i(a.mo17162b());
                } else {
                    C1494m.this.m887g(a.mo17161a());
                }
            }
        }
    }

    /* renamed from: com.airbnb.lottie.m$b */
    /* compiled from: LottieTask */
    private class C1496b extends FutureTask<C1493l<T>> {
        C1496b(Callable<C1493l<T>> callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            if (!isCancelled()) {
                try {
                    C1494m.this.m890l((C1493l) get());
                } catch (InterruptedException | ExecutionException e) {
                    C1494m.this.m890l(new C1493l(e));
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C1494m(Callable<C1493l<T>> callable) {
        this(callable, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public synchronized void m887g(Throwable th) {
        ArrayList<C1489h> arrayList = new ArrayList<>(this.f1016b);
        if (arrayList.isEmpty()) {
            C0006d.m33d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (C1489h onResult : arrayList) {
            onResult.onResult(th);
        }
    }

    /* renamed from: h */
    private void m888h() {
        this.f1017c.post(new C1495a());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public synchronized void m889i(T t) {
        for (C1489h onResult : new ArrayList(this.f1015a)) {
            onResult.onResult(t);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m890l(@Nullable C1493l<T> lVar) {
        if (this.f1018d == null) {
            this.f1018d = lVar;
            m888h();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: e */
    public synchronized C1494m<T> mo17165e(C1489h<Throwable> hVar) {
        if (!(this.f1018d == null || this.f1018d.mo17161a() == null)) {
            hVar.onResult(this.f1018d.mo17161a());
        }
        this.f1016b.add(hVar);
        return this;
    }

    /* renamed from: f */
    public synchronized C1494m<T> mo17166f(C1489h<T> hVar) {
        if (!(this.f1018d == null || this.f1018d.mo17162b() == null)) {
            hVar.onResult(this.f1018d.mo17162b());
        }
        this.f1015a.add(hVar);
        return this;
    }

    /* renamed from: j */
    public synchronized C1494m<T> mo17167j(C1489h<Throwable> hVar) {
        this.f1016b.remove(hVar);
        return this;
    }

    /* renamed from: k */
    public synchronized C1494m<T> mo17168k(C1489h<T> hVar) {
        this.f1015a.remove(hVar);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    C1494m(Callable<C1493l<T>> callable, boolean z) {
        this.f1015a = new LinkedHashSet(1);
        this.f1016b = new LinkedHashSet(1);
        this.f1017c = new Handler(Looper.getMainLooper());
        this.f1018d = null;
        if (z) {
            try {
                m890l(callable.call());
            } catch (Throwable th) {
                m890l(new C1493l(th));
            }
        } else {
            f1014e.execute(new C1496b(callable));
        }
    }
}
