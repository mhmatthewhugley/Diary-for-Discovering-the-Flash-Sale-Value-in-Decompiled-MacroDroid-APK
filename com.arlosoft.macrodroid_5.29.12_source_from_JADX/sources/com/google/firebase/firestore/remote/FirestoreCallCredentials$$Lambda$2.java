package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.OnFailureListener;
import p292io.grpc.C12530b;

/* compiled from: FirestoreCallCredentials */
final /* synthetic */ class FirestoreCallCredentials$$Lambda$2 implements OnFailureListener {

    /* renamed from: a */
    private final C12530b.C12531a f54576a;

    private FirestoreCallCredentials$$Lambda$2(C12530b.C12531a aVar) {
        this.f54576a = aVar;
    }

    /* renamed from: a */
    public static OnFailureListener m76185a(C12530b.C12531a aVar) {
        return new FirestoreCallCredentials$$Lambda$2(aVar);
    }

    /* renamed from: c */
    public void mo22733c(Exception exc) {
        FirestoreCallCredentials.m76181c(this.f54576a, exc);
    }
}
