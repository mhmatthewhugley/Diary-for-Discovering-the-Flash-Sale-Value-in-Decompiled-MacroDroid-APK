package com.google.firebase.storage;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.storage.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11373f implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ StorageTask f55469a;

    /* renamed from: c */
    public final /* synthetic */ Continuation f55470c;

    /* renamed from: d */
    public final /* synthetic */ TaskCompletionSource f55471d;

    public /* synthetic */ C11373f(StorageTask storageTask, Continuation continuation, TaskCompletionSource taskCompletionSource) {
        this.f55469a = storageTask;
        this.f55470c = continuation;
        this.f55471d = taskCompletionSource;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        this.f55469a.m77450b0(this.f55470c, this.f55471d, task);
    }
}
