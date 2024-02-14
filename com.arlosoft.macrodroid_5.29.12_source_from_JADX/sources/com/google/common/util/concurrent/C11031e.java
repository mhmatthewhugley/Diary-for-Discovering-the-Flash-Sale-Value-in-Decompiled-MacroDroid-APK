package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* renamed from: com.google.common.util.concurrent.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11031e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Callable f53717a;

    public /* synthetic */ C11031e(Callable callable) {
        this.f53717a = callable;
    }

    public final void run() {
        WrappingExecutorService.m74368b(this.f53717a);
    }
}
