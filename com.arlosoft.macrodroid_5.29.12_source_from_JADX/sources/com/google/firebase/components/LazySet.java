package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class LazySet<T> implements Provider<Set<T>> {

    /* renamed from: a */
    private volatile Set<Provider<T>> f4794a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    private volatile Set<T> f4795b = null;

    LazySet(Collection<Provider<T>> collection) {
        this.f4794a.addAll(collection);
    }

    /* renamed from: b */
    static LazySet<?> m6442b(Collection<Provider<?>> collection) {
        return new LazySet<>((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m6443d() {
        for (Provider<T> provider : this.f4794a) {
            this.f4795b.add(provider.get());
        }
        this.f4794a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo22922a(Provider<T> provider) {
        if (this.f4795b == null) {
            this.f4794a.add(provider);
        } else {
            this.f4795b.add(provider.get());
        }
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.f4795b == null) {
            synchronized (this) {
                if (this.f4795b == null) {
                    this.f4795b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m6443d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f4795b);
    }
}
