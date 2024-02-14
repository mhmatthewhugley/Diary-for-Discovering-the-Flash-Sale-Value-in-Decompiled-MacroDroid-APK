package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import java.util.concurrent.Callable;

/* renamed from: com.google.common.util.concurrent.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11028b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Supplier f53711a;

    /* renamed from: c */
    public final /* synthetic */ Callable f53712c;

    public /* synthetic */ C11028b(Supplier supplier, Callable callable) {
        this.f53711a = supplier;
        this.f53712c = callable;
    }

    public final Object call() {
        return Callables.m74054c(this.f53711a, this.f53712c);
    }
}
