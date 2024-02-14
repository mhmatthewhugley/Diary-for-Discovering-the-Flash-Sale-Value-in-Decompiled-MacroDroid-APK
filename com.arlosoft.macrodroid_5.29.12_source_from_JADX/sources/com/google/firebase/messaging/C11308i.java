package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.messaging.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11308i implements SuccessContinuation {

    /* renamed from: a */
    public final /* synthetic */ String f55098a;

    public /* synthetic */ C11308i(String str) {
        this.f55098a = str;
    }

    /* renamed from: a */
    public final Task mo21121a(Object obj) {
        return ((TopicsSubscriber) obj).mo63438u(this.f55098a);
    }
}
