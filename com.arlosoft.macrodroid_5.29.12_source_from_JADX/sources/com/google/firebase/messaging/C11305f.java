package com.google.firebase.messaging;

import android.content.Intent;

/* renamed from: com.google.firebase.messaging.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11305f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FcmLifecycleCallbacks f55092a;

    /* renamed from: c */
    public final /* synthetic */ Intent f55093c;

    public /* synthetic */ C11305f(FcmLifecycleCallbacks fcmLifecycleCallbacks, Intent intent) {
        this.f55092a = fcmLifecycleCallbacks;
        this.f55093c = intent;
    }

    public final void run() {
        this.f55092a.m76844b(this.f55093c);
    }
}
