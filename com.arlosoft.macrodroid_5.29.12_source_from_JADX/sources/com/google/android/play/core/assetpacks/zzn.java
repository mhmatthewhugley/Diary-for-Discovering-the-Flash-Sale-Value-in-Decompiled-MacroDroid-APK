package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final /* synthetic */ class zzn implements ThreadFactory {

    /* renamed from: a */
    public static final /* synthetic */ zzn f51630a = new zzn();

    private /* synthetic */ zzn() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
