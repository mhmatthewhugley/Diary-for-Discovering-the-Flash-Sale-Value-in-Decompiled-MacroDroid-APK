package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.firebase.messaging.y */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11324y implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f55173a;

    /* renamed from: c */
    public final /* synthetic */ ScheduledExecutorService f55174c;

    /* renamed from: d */
    public final /* synthetic */ FirebaseMessaging f55175d;

    /* renamed from: f */
    public final /* synthetic */ Metadata f55176f;

    /* renamed from: g */
    public final /* synthetic */ GmsRpc f55177g;

    public /* synthetic */ C11324y(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc) {
        this.f55173a = context;
        this.f55174c = scheduledExecutorService;
        this.f55175d = firebaseMessaging;
        this.f55176f = metadata;
        this.f55177g = gmsRpc;
    }

    public final Object call() {
        return TopicsSubscriber.m77053j(this.f55173a, this.f55174c, this.f55175d, this.f55176f, this.f55177g);
    }
}
