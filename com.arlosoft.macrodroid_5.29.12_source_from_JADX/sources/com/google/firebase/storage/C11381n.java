package com.google.firebase.storage;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.TaskListenerImpl;

/* renamed from: com.google.firebase.storage.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11381n implements TaskListenerImpl.OnRaise {

    /* renamed from: a */
    public final /* synthetic */ StorageTask f55511a;

    public /* synthetic */ C11381n(StorageTask storageTask) {
        this.f55511a = storageTask;
    }

    /* renamed from: a */
    public final void mo63694a(Object obj, Object obj2) {
        this.f55511a.m77453e0((OnSuccessListener) obj, (StorageTask.ProvideError) obj2);
    }
}
