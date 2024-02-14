package com.google.android.datatransport.runtime.dagger.internal;

import p287ia.C12478a;

public final class SingleCheck<T> implements C12478a<T> {

    /* renamed from: c */
    private static final Object f1421c = new Object();

    /* renamed from: a */
    private volatile C12478a<T> f1422a;

    /* renamed from: b */
    private volatile Object f1423b;

    public T get() {
        T t = this.f1423b;
        if (t != f1421c) {
            return t;
        }
        C12478a<T> aVar = this.f1422a;
        if (aVar == null) {
            return this.f1423b;
        }
        T t2 = aVar.get();
        this.f1423b = t2;
        this.f1422a = null;
        return t2;
    }
}
