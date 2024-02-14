package com.google.firebase.storage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.storage.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11375h implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f55476a;

    public /* synthetic */ C11375h(TaskCompletionSource taskCompletionSource) {
        this.f55476a = taskCompletionSource;
    }

    /* renamed from: c */
    public final void mo22733c(Exception exc) {
        this.f55476a.mo56138b(exc);
    }
}
