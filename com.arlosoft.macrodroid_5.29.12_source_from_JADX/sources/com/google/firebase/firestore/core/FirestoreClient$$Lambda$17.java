package com.google.firebase.firestore.core;

import com.google.firebase.firestore.EventListener;

/* compiled from: FirestoreClient */
final /* synthetic */ class FirestoreClient$$Lambda$17 implements Runnable {

    /* renamed from: a */
    private final FirestoreClient f5902a;

    /* renamed from: c */
    private final EventListener f5903c;

    private FirestoreClient$$Lambda$17(FirestoreClient firestoreClient, EventListener eventListener) {
        this.f5902a = firestoreClient;
        this.f5903c = eventListener;
    }

    /* renamed from: a */
    public static Runnable m8098a(FirestoreClient firestoreClient, EventListener eventListener) {
        return new FirestoreClient$$Lambda$17(firestoreClient, eventListener);
    }

    public void run() {
        this.f5902a.f5879i.mo23857h(this.f5903c);
    }
}
