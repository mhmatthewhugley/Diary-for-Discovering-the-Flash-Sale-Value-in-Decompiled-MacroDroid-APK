package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.storage.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11374g implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ StorageTask f55472a;

    /* renamed from: c */
    public final /* synthetic */ Continuation f55473c;

    /* renamed from: d */
    public final /* synthetic */ TaskCompletionSource f55474d;

    /* renamed from: f */
    public final /* synthetic */ CancellationTokenSource f55475f;

    public /* synthetic */ C11374g(StorageTask storageTask, Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource) {
        this.f55472a = storageTask;
        this.f55473c = continuation;
        this.f55474d = taskCompletionSource;
        this.f55475f = cancellationTokenSource;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        this.f55472a.m77451c0(this.f55473c, this.f55474d, this.f55475f, task);
    }
}
