package com.google.android.gms.cloudmessaging;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class zzy implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f3019a;

    public /* synthetic */ zzy(TaskCompletionSource taskCompletionSource) {
        this.f3019a = taskCompletionSource;
    }

    public final void run() {
        if (this.f3019a.mo56140d(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }
}
