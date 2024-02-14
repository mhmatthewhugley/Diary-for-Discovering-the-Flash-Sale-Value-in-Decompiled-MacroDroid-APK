package com.google.firebase.firestore.remote;

import p292io.grpc.C12930o0;

/* compiled from: GrpcCallProvider */
final /* synthetic */ class GrpcCallProvider$$Lambda$4 implements Runnable {

    /* renamed from: a */
    private final GrpcCallProvider f54621a;

    /* renamed from: c */
    private final C12930o0 f54622c;

    private GrpcCallProvider$$Lambda$4(GrpcCallProvider grpcCallProvider, C12930o0 o0Var) {
        this.f54621a = grpcCallProvider;
        this.f54622c = o0Var;
    }

    /* renamed from: a */
    public static Runnable m76235a(GrpcCallProvider grpcCallProvider, C12930o0 o0Var) {
        return new GrpcCallProvider$$Lambda$4(grpcCallProvider, o0Var);
    }

    public void run() {
        GrpcCallProvider.m76226k(this.f54621a, this.f54622c);
    }
}
