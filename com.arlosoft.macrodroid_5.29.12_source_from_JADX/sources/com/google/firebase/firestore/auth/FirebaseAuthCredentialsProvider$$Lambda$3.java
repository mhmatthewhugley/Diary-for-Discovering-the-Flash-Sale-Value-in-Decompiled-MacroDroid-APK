package com.google.firebase.firestore.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: FirebaseAuthCredentialsProvider */
final /* synthetic */ class FirebaseAuthCredentialsProvider$$Lambda$3 implements Continuation {

    /* renamed from: a */
    private final FirebaseAuthCredentialsProvider f5769a;

    /* renamed from: b */
    private final int f5770b;

    private FirebaseAuthCredentialsProvider$$Lambda$3(FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider, int i) {
        this.f5769a = firebaseAuthCredentialsProvider;
        this.f5770b = i;
    }

    /* renamed from: b */
    public static Continuation m7938b(FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider, int i) {
        return new FirebaseAuthCredentialsProvider$$Lambda$3(firebaseAuthCredentialsProvider, i);
    }

    /* renamed from: a */
    public Object mo21119a(Task task) {
        return FirebaseAuthCredentialsProvider.m7930d(this.f5769a, this.f5770b, task);
    }
}
