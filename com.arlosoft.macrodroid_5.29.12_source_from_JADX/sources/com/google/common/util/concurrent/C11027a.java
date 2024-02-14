package com.google.common.util.concurrent;

import com.google.common.base.Supplier;

/* renamed from: com.google.common.util.concurrent.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11027a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Supplier f53709a;

    /* renamed from: c */
    public final /* synthetic */ Runnable f53710c;

    public /* synthetic */ C11027a(Supplier supplier, Runnable runnable) {
        this.f53709a = supplier;
        this.f53710c = runnable;
    }

    public final void run() {
        Callables.m74055d(this.f53709a, this.f53710c);
    }
}
