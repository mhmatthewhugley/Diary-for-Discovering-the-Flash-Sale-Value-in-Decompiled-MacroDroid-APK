package com.arlosoft.macrodroid.troubleshooting.problem;

import com.google.common.util.concurrent.ListenableFuture;
import p370qa.C16265l;

/* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6281i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ListenableFuture f14819a;

    /* renamed from: c */
    public final /* synthetic */ C16265l f14820c;

    public /* synthetic */ C6281i(ListenableFuture listenableFuture, C16265l lVar) {
        this.f14819a = listenableFuture;
        this.f14820c = lVar;
    }

    public final void run() {
        ProblemViewModel.m24332n(this.f14819a, this.f14820c);
    }
}
