package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzdi implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f41369a = Executors.defaultThreadFactory();

    zzdi(zzef zzef) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f41369a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
