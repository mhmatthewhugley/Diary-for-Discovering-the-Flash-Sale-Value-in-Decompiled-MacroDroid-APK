package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final /* synthetic */ class zabk implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f3364a;

    public /* synthetic */ zabk(Handler handler) {
        this.f3364a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f3364a.post(runnable);
    }
}
