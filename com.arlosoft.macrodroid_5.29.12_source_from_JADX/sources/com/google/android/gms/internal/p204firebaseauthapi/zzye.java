package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzye */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class zzye {

    /* renamed from: a */
    zzxb f40645a;

    /* renamed from: b */
    ExecutorService f40646b;

    /* renamed from: a */
    public final Task mo50074a(zzyd zzyd) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f40646b.execute(new zzyc(this, zzyd, taskCompletionSource));
        return taskCompletionSource.mo56137a();
    }
}
