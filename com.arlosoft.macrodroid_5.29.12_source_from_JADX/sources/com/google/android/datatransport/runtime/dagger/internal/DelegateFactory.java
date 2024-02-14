package com.google.android.datatransport.runtime.dagger.internal;

import p287ia.C12478a;

public final class DelegateFactory<T> implements Factory<T> {

    /* renamed from: a */
    private C12478a<T> f1408a;

    public T get() {
        C12478a<T> aVar = this.f1408a;
        if (aVar != null) {
            return aVar.get();
        }
        throw new IllegalStateException();
    }
}
