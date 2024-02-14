package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.AbstractStream;

/* compiled from: AbstractStream */
final /* synthetic */ class AbstractStream$StreamObserver$$Lambda$2 implements Runnable {

    /* renamed from: a */
    private final AbstractStream.StreamObserver f54538a;

    /* renamed from: c */
    private final Object f54539c;

    private AbstractStream$StreamObserver$$Lambda$2(AbstractStream.StreamObserver streamObserver, Object obj) {
        this.f54538a = streamObserver;
        this.f54539c = obj;
    }

    /* renamed from: a */
    public static Runnable m76155a(AbstractStream.StreamObserver streamObserver, Object obj) {
        return new AbstractStream$StreamObserver$$Lambda$2(streamObserver, obj);
    }

    public void run() {
        AbstractStream.StreamObserver.m76148f(this.f54538a, this.f54539c);
    }
}
