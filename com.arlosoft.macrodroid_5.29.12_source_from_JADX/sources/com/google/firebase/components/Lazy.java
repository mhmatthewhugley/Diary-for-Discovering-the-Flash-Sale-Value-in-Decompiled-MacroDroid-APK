package com.google.firebase.components;

import com.google.firebase.inject.Provider;

public class Lazy<T> implements Provider<T> {

    /* renamed from: c */
    private static final Object f4791c = new Object();

    /* renamed from: a */
    private volatile Object f4792a = f4791c;

    /* renamed from: b */
    private volatile Provider<T> f4793b;

    public Lazy(Provider<T> provider) {
        this.f4793b = provider;
    }

    public T get() {
        T t = this.f4792a;
        T t2 = f4791c;
        if (t == t2) {
            synchronized (this) {
                t = this.f4792a;
                if (t == t2) {
                    t = this.f4793b.get();
                    this.f4792a = t;
                    this.f4793b = null;
                }
            }
        }
        return t;
    }
}
