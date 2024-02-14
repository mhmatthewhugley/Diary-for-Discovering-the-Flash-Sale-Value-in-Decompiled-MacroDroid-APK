package com.google.firebase.firestore.util;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: AsyncQueue */
final /* synthetic */ class AsyncQueue$$Lambda$1 implements Runnable {

    /* renamed from: a */
    private final Callable f54742a;

    /* renamed from: c */
    private final Executor f54743c;

    /* renamed from: d */
    private final TaskCompletionSource f54744d;

    public void run() {
        AsyncQueue.m76448l(this.f54742a, this.f54743c, this.f54744d);
    }
}
