package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class CrashlyticsBackgroundWorker {

    /* renamed from: a */
    private final Executor f4897a;

    /* renamed from: b */
    private Task<Void> f4898b = Tasks.m66667f(null);

    /* renamed from: c */
    private final Object f4899c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ThreadLocal<Boolean> f4900d = new ThreadLocal<>();

    public CrashlyticsBackgroundWorker(Executor executor) {
        this.f4897a = executor;
        executor.execute(new Runnable() {
            public void run() {
                CrashlyticsBackgroundWorker.this.f4900d.set(Boolean.TRUE);
            }
        });
    }

    /* renamed from: d */
    private <T> Task<Void> m6606d(Task<T> task) {
        return task.mo23711l(this.f4897a, new Continuation<T, Void>() {
            /* renamed from: b */
            public Void mo21119a(@NonNull Task<T> task) throws Exception {
                return null;
            }
        });
    }

    /* renamed from: e */
    private boolean m6607e() {
        return Boolean.TRUE.equals(this.f4900d.get());
    }

    /* renamed from: f */
    private <T> Continuation<Void, T> m6608f(final Callable<T> callable) {
        return new Continuation<Void, T>() {
            /* renamed from: a */
            public T mo21119a(@NonNull Task<Void> task) throws Exception {
                return callable.call();
            }
        };
    }

    /* renamed from: b */
    public void mo22980b() {
        if (!m6607e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor mo22981c() {
        return this.f4897a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Task<Void> mo22982g(final Runnable runnable) {
        return mo22983h(new Callable<Void>() {
            /* renamed from: a */
            public Void call() throws Exception {
                runnable.run();
                return null;
            }
        });
    }

    /* renamed from: h */
    public <T> Task<T> mo22983h(Callable<T> callable) {
        Task<TContinuationResult> l;
        synchronized (this.f4899c) {
            l = this.f4898b.mo23711l(this.f4897a, m6608f(callable));
            this.f4898b = m6606d(l);
        }
        return l;
    }

    /* renamed from: i */
    public <T> Task<T> mo22984i(Callable<Task<T>> callable) {
        Task<TContinuationResult> n;
        synchronized (this.f4899c) {
            n = this.f4898b.mo23713n(this.f4897a, m6608f(callable));
            this.f4898b = m6606d(n);
        }
        return n;
    }
}
