package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.StorageTask;

/* renamed from: com.google.firebase.storage.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11376i implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ SuccessContinuation f55477a;

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f55478b;

    /* renamed from: c */
    public final /* synthetic */ CancellationTokenSource f55479c;

    public /* synthetic */ C11376i(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource) {
        this.f55477a = successContinuation;
        this.f55478b = taskCompletionSource;
        this.f55479c = cancellationTokenSource;
    }

    /* renamed from: b */
    public final void mo22751b(Object obj) {
        StorageTask.m77457i0(this.f55477a, this.f55478b, this.f55479c, (StorageTask.ProvideError) obj);
    }
}
