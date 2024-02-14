package com.google.firebase.firestore.core;

import com.google.firebase.firestore.auth.User;

/* compiled from: FirestoreClient */
final /* synthetic */ class FirestoreClient$$Lambda$18 implements Runnable {

    /* renamed from: a */
    private final FirestoreClient f5904a;

    /* renamed from: c */
    private final User f5905c;

    private FirestoreClient$$Lambda$18(FirestoreClient firestoreClient, User user) {
        this.f5904a = firestoreClient;
        this.f5905c = user;
    }

    /* renamed from: a */
    public static Runnable m8099a(FirestoreClient firestoreClient, User user) {
        return new FirestoreClient$$Lambda$18(firestoreClient, user);
    }

    public void run() {
        FirestoreClient.m8087m(this.f5904a, this.f5905c);
    }
}
