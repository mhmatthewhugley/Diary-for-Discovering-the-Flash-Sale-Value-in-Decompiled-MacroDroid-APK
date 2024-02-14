package com.google.firebase.firestore.core;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Listener;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: FirestoreClient */
final /* synthetic */ class FirestoreClient$$Lambda$2 implements Listener {

    /* renamed from: a */
    private final FirestoreClient f5906a;

    /* renamed from: b */
    private final AtomicBoolean f5907b;

    /* renamed from: c */
    private final TaskCompletionSource f5908c;

    /* renamed from: d */
    private final AsyncQueue f5909d;

    /* renamed from: a */
    public void mo23881a(Object obj) {
        FirestoreClient.m8088n(this.f5906a, this.f5907b, this.f5908c, this.f5909d, (User) obj);
    }
}
