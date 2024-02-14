package com.google.firebase.messaging;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.messaging.v */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11321v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f55167a;

    /* renamed from: c */
    public final /* synthetic */ boolean f55168c;

    /* renamed from: d */
    public final /* synthetic */ TaskCompletionSource f55169d;

    public /* synthetic */ C11321v(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        this.f55167a = context;
        this.f55168c = z;
        this.f55169d = taskCompletionSource;
    }

    public final void run() {
        ProxyNotificationInitializer.m76987d(this.f55167a, this.f55168c, this.f55169d);
    }
}
