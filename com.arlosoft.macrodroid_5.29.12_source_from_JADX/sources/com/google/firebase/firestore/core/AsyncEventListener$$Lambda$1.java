package com.google.firebase.firestore.core;

import com.google.firebase.firestore.FirebaseFirestoreException;

/* compiled from: AsyncEventListener */
final /* synthetic */ class AsyncEventListener$$Lambda$1 implements Runnable {

    /* renamed from: a */
    private final AsyncEventListener f5815a;

    /* renamed from: c */
    private final Object f5816c;

    /* renamed from: d */
    private final FirebaseFirestoreException f5817d;

    private AsyncEventListener$$Lambda$1(AsyncEventListener asyncEventListener, Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        this.f5815a = asyncEventListener;
        this.f5816c = obj;
        this.f5817d = firebaseFirestoreException;
    }

    /* renamed from: a */
    public static Runnable m8016a(AsyncEventListener asyncEventListener, Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        return new AsyncEventListener$$Lambda$1(asyncEventListener, obj, firebaseFirestoreException);
    }

    public void run() {
        AsyncEventListener.m8013b(this.f5815a, this.f5816c, this.f5817d);
    }
}
