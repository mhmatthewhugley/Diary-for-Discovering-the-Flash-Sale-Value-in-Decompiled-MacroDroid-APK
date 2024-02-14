package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.firebase.crashlytics.internal.common.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1876g implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f5040a;

    public /* synthetic */ C1876g(CountDownLatch countDownLatch) {
        this.f5040a = countDownLatch;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        return this.f5040a.countDown();
    }
}
