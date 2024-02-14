package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import p287ia.C12478a;

public final class ProviderOfLazy<T> implements C12478a<Lazy<T>> {

    /* renamed from: a */
    private final C12478a<T> f1417a;

    /* renamed from: a */
    public Lazy<T> get() {
        return DoubleCheck.m1329a(this.f1417a);
    }
}
