package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.messaging.o */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11314o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FirebaseMessaging f55106a;

    /* renamed from: c */
    public final /* synthetic */ TaskCompletionSource f55107c;

    public /* synthetic */ C11314o(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.f55106a = firebaseMessaging;
        this.f55107c = taskCompletionSource;
    }

    public final void run() {
        this.f55106a.m76869y(this.f55107c);
    }
}
