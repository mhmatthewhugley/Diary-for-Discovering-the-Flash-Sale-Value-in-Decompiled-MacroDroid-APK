package com.google.mlkit.common.sdkinternal;

import java.util.Deque;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzk implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Runnable f56411a;

    public /* synthetic */ zzk(Runnable runnable) {
        this.f56411a = runnable;
    }

    public final void run() {
        MlKitThreadPool.m79047e((Deque) MlKitThreadPool.f56302c.get(), this.f56411a);
    }
}
