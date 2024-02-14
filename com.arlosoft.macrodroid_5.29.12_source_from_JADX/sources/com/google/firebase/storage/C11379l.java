package com.google.firebase.storage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.TaskListenerImpl;

/* renamed from: com.google.firebase.storage.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11379l implements TaskListenerImpl.OnRaise {

    /* renamed from: a */
    public final /* synthetic */ StorageTask f55509a;

    public /* synthetic */ C11379l(StorageTask storageTask) {
        this.f55509a = storageTask;
    }

    /* renamed from: a */
    public final void mo63694a(Object obj, Object obj2) {
        this.f55509a.m77455g0((OnCompleteListener) obj, (StorageTask.ProvideError) obj2);
    }
}
