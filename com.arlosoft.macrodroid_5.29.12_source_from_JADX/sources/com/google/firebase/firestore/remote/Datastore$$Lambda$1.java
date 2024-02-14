package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: Datastore */
final /* synthetic */ class Datastore$$Lambda$1 implements Continuation {

    /* renamed from: a */
    private final Datastore f54563a;

    private Datastore$$Lambda$1(Datastore datastore) {
        this.f54563a = datastore;
    }

    /* renamed from: b */
    public static Continuation m76174b(Datastore datastore) {
        return new Datastore$$Lambda$1(datastore);
    }

    /* renamed from: a */
    public Object mo21119a(Task task) {
        return Datastore.m76168h(this.f54563a, task);
    }
}
