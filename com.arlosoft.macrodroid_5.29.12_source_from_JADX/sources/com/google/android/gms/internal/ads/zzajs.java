package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzajs implements Executor {

    /* renamed from: a */
    final /* synthetic */ Handler f24854a;

    zzajs(zzaju zzaju, Handler handler) {
        this.f24854a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f24854a.post(runnable);
    }
}
