package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.messaging.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11301c implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ Context f55086a;

    /* renamed from: b */
    public final /* synthetic */ Intent f55087b;

    public /* synthetic */ C11301c(Context context, Intent intent) {
        this.f55086a = context;
        this.f55087b = intent;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        return FcmBroadcastProcessor.m76833h(this.f55086a, this.f55087b, task);
    }
}
