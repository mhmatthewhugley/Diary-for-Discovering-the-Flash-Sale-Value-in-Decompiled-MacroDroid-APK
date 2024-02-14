package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class zzv implements Continuation {

    /* renamed from: a */
    public static final /* synthetic */ zzv f3014a = new zzv();

    private /* synthetic */ zzv() {
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        if (task.mo23719t()) {
            return (Bundle) task.mo23715p();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(task.mo23714o());
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.mo23714o());
    }
}
