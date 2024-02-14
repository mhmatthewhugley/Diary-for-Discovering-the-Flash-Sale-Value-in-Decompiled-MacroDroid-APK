package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

class OptionalProvider<T> implements Provider<T>, Deferred<T> {

    /* renamed from: c */
    private static final Deferred.DeferredHandler<Object> f4796c = C1829l.f4825a;

    /* renamed from: d */
    private static final Provider<Object> f4797d = C1830m.f4826a;
    @GuardedBy("this")

    /* renamed from: a */
    private Deferred.DeferredHandler<T> f4798a;

    /* renamed from: b */
    private volatile Provider<T> f4799b;

    private OptionalProvider(Deferred.DeferredHandler<T> deferredHandler, Provider<T> provider) {
        this.f4798a = deferredHandler;
        this.f4799b = provider;
    }

    /* renamed from: e */
    static <T> OptionalProvider<T> m6449e() {
        return new OptionalProvider<>(f4796c, f4797d);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m6450f(Provider provider) {
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Object m6451g() {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m6452h(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        deferredHandler.mo22929a(provider);
        deferredHandler2.mo22929a(provider);
    }

    /* renamed from: i */
    static <T> OptionalProvider<T> m6453i(Provider<T> provider) {
        return new OptionalProvider<>((Deferred.DeferredHandler) null, provider);
    }

    /* renamed from: a */
    public void mo22924a(@NonNull Deferred.DeferredHandler<T> deferredHandler) {
        Provider<T> provider;
        Provider<T> provider2 = this.f4799b;
        Provider<Object> provider3 = f4797d;
        if (provider2 != provider3) {
            deferredHandler.mo22929a(provider2);
            return;
        }
        Provider<T> provider4 = null;
        synchronized (this) {
            provider = this.f4799b;
            if (provider != provider3) {
                provider4 = provider;
            } else {
                this.f4798a = new C1828k(this.f4798a, deferredHandler);
            }
        }
        if (provider4 != null) {
            deferredHandler.mo22929a(provider);
        }
    }

    public T get() {
        return this.f4799b.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo22925j(Provider<T> provider) {
        Deferred.DeferredHandler<T> deferredHandler;
        if (this.f4799b == f4797d) {
            synchronized (this) {
                deferredHandler = this.f4798a;
                this.f4798a = null;
                this.f4799b = provider;
            }
            deferredHandler.mo22929a(provider);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
