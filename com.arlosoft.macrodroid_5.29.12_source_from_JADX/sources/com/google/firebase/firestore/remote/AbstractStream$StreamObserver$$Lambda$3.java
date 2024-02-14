package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.AbstractStream;

/* compiled from: AbstractStream */
final /* synthetic */ class AbstractStream$StreamObserver$$Lambda$3 implements Runnable {

    /* renamed from: a */
    private final AbstractStream.StreamObserver f54540a;

    private AbstractStream$StreamObserver$$Lambda$3(AbstractStream.StreamObserver streamObserver) {
        this.f54540a = streamObserver;
    }

    /* renamed from: a */
    public static Runnable m76156a(AbstractStream.StreamObserver streamObserver) {
        return new AbstractStream$StreamObserver$$Lambda$3(streamObserver);
    }

    public void run() {
        AbstractStream.StreamObserver.m76149g(this.f54540a);
    }
}
