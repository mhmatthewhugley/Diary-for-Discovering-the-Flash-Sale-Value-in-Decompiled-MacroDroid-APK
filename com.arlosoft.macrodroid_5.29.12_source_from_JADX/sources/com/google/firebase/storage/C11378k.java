package com.google.firebase.storage;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.TaskListenerImpl;

/* renamed from: com.google.firebase.storage.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11378k implements TaskListenerImpl.OnRaise {

    /* renamed from: a */
    public final /* synthetic */ StorageTask f55508a;

    public /* synthetic */ C11378k(StorageTask storageTask) {
        this.f55508a = storageTask;
    }

    /* renamed from: a */
    public final void mo63694a(Object obj, Object obj2) {
        this.f55508a.m77456h0((OnCanceledListener) obj, (StorageTask.ProvideError) obj2);
    }
}
