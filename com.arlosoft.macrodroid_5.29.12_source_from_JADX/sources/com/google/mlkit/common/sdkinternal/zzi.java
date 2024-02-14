package com.google.mlkit.common.sdkinternal;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzi implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Runnable f56409a;

    public /* synthetic */ zzi(Runnable runnable) {
        this.f56409a = runnable;
    }

    public final void run() {
        MlKitThreadPool.m79046d(this.f56409a);
    }
}
