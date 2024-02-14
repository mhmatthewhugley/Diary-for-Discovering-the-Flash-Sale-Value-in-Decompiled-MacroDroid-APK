package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzem implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f34431a;

    public /* synthetic */ zzem(String str) {
        this.f34431a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f34431a);
    }
}
