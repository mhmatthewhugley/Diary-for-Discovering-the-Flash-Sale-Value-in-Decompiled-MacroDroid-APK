package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzoq implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f38059a;

    public /* synthetic */ zzoq(Handler handler) {
        this.f38059a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f38059a.post(runnable);
    }
}
