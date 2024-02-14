package com.google.mlkit.common.sdkinternal;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzj implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ ThreadFactory f56410a;

    public /* synthetic */ zzj(ThreadFactory threadFactory) {
        this.f56410a = threadFactory;
    }

    public final Thread newThread(Runnable runnable) {
        return this.f56410a.newThread(new zzi(runnable));
    }
}
