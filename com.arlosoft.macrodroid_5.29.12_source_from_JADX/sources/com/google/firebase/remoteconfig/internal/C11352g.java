package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

/* renamed from: com.google.firebase.remoteconfig.internal.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11352g implements SuccessContinuation {

    /* renamed from: a */
    public final /* synthetic */ ConfigFetchHandler.FetchResponse f55299a;

    public /* synthetic */ C11352g(ConfigFetchHandler.FetchResponse fetchResponse) {
        this.f55299a = fetchResponse;
    }

    /* renamed from: a */
    public final Task mo21121a(Object obj) {
        return Tasks.m66667f(this.f55299a);
    }
}
