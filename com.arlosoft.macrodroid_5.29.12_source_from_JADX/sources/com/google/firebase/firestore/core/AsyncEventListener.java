package com.google.firebase.firestore.core;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import java.util.concurrent.Executor;

public class AsyncEventListener<T> implements EventListener<T> {

    /* renamed from: a */
    private final Executor f5812a;

    /* renamed from: b */
    private final EventListener<T> f5813b;

    /* renamed from: c */
    private volatile boolean f5814c;

    /* renamed from: b */
    static /* synthetic */ void m8013b(AsyncEventListener asyncEventListener, Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        if (!asyncEventListener.f5814c) {
            asyncEventListener.f5813b.mo23672a(obj, firebaseFirestoreException);
        }
    }

    /* renamed from: a */
    public void mo23672a(@Nullable T t, @Nullable FirebaseFirestoreException firebaseFirestoreException) {
        this.f5812a.execute(AsyncEventListener$$Lambda$1.m8016a(this, t, firebaseFirestoreException));
    }

    /* renamed from: c */
    public void mo23808c() {
        this.f5814c = true;
    }
}
