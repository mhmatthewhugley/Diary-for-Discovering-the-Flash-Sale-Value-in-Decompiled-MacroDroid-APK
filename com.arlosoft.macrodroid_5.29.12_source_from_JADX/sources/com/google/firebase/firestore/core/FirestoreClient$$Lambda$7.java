package com.google.firebase.firestore.core;

/* compiled from: FirestoreClient */
final /* synthetic */ class FirestoreClient$$Lambda$7 implements Runnable {

    /* renamed from: a */
    private final FirestoreClient f5915a;

    /* renamed from: c */
    private final QueryListener f5916c;

    private FirestoreClient$$Lambda$7(FirestoreClient firestoreClient, QueryListener queryListener) {
        this.f5915a = firestoreClient;
        this.f5916c = queryListener;
    }

    /* renamed from: a */
    public static Runnable m8101a(FirestoreClient firestoreClient, QueryListener queryListener) {
        return new FirestoreClient$$Lambda$7(firestoreClient, queryListener);
    }

    public void run() {
        this.f5915a.f5879i.mo23856g(this.f5916c);
    }
}
