package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.messaging.w */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11322w implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ RequestDeduplicator f55170a;

    /* renamed from: b */
    public final /* synthetic */ String f55171b;

    public /* synthetic */ C11322w(RequestDeduplicator requestDeduplicator, String str) {
        this.f55170a = requestDeduplicator;
        this.f55171b = str;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        return this.f55170a.m76999c(this.f55171b, task);
    }
}
