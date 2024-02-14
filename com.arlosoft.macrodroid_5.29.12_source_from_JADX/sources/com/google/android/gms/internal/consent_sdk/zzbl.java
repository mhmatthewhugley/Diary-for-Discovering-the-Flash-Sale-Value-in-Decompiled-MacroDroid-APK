package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final /* synthetic */ class zzbl implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f39353a;

    public /* synthetic */ zzbl(Handler handler) {
        this.f39353a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f39353a.post(runnable);
    }
}
