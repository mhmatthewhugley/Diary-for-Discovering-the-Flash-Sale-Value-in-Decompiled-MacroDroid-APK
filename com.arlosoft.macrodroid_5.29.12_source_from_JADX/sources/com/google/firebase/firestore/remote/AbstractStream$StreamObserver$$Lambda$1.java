package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.AbstractStream;
import p292io.grpc.C12960q0;

/* compiled from: AbstractStream */
final /* synthetic */ class AbstractStream$StreamObserver$$Lambda$1 implements Runnable {

    /* renamed from: a */
    private final AbstractStream.StreamObserver f54536a;

    /* renamed from: c */
    private final C12960q0 f54537c;

    private AbstractStream$StreamObserver$$Lambda$1(AbstractStream.StreamObserver streamObserver, C12960q0 q0Var) {
        this.f54536a = streamObserver;
        this.f54537c = q0Var;
    }

    /* renamed from: a */
    public static Runnable m76154a(AbstractStream.StreamObserver streamObserver, C12960q0 q0Var) {
        return new AbstractStream$StreamObserver$$Lambda$1(streamObserver, q0Var);
    }

    public void run() {
        AbstractStream.StreamObserver.m76147e(this.f54536a, this.f54537c);
    }
}
