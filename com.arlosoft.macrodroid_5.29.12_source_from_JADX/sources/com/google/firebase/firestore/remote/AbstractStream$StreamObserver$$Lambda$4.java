package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.AbstractStream;
import p292io.grpc.C12537b1;

/* compiled from: AbstractStream */
final /* synthetic */ class AbstractStream$StreamObserver$$Lambda$4 implements Runnable {

    /* renamed from: a */
    private final AbstractStream.StreamObserver f54541a;

    /* renamed from: c */
    private final C12537b1 f54542c;

    private AbstractStream$StreamObserver$$Lambda$4(AbstractStream.StreamObserver streamObserver, C12537b1 b1Var) {
        this.f54541a = streamObserver;
        this.f54542c = b1Var;
    }

    /* renamed from: a */
    public static Runnable m76157a(AbstractStream.StreamObserver streamObserver, C12537b1 b1Var) {
        return new AbstractStream$StreamObserver$$Lambda$4(streamObserver, b1Var);
    }

    public void run() {
        AbstractStream.StreamObserver.m76146d(this.f54541a, this.f54542c);
    }
}
