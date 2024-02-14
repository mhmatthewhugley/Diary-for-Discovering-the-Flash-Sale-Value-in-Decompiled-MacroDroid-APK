package com.google.firebase.storage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.TaskListenerImpl;

/* renamed from: com.google.firebase.storage.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11380m implements TaskListenerImpl.OnRaise {

    /* renamed from: a */
    public final /* synthetic */ StorageTask f55510a;

    public /* synthetic */ C11380m(StorageTask storageTask) {
        this.f55510a = storageTask;
    }

    /* renamed from: a */
    public final void mo63694a(Object obj, Object obj2) {
        this.f55510a.m77454f0((OnFailureListener) obj, (StorageTask.ProvideError) obj2);
    }
}
