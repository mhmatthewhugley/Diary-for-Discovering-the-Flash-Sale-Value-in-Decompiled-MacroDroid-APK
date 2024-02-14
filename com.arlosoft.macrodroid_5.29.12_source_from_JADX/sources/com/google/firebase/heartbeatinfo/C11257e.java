package com.google.firebase.heartbeatinfo;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.firebase.heartbeatinfo.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11257e implements ThreadFactory {

    /* renamed from: a */
    public static final /* synthetic */ C11257e f54820a = new C11257e();

    private /* synthetic */ C11257e() {
    }

    public final Thread newThread(Runnable runnable) {
        return DefaultHeartBeatController.m76549m(runnable);
    }
}
