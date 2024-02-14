package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.messaging.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11299b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ EnhancedIntentService f55082a;

    /* renamed from: c */
    public final /* synthetic */ Intent f55083c;

    /* renamed from: d */
    public final /* synthetic */ TaskCompletionSource f55084d;

    public /* synthetic */ C11299b(EnhancedIntentService enhancedIntentService, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.f55082a = enhancedIntentService;
        this.f55083c = intent;
        this.f55084d = taskCompletionSource;
    }

    public final void run() {
        this.f55082a.m76819i(this.f55083c, this.f55084d);
    }
}
