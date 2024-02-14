package com.google.firebase.firestore.remote;

import p292io.grpc.C12930o0;

/* compiled from: GrpcCallProvider */
final /* synthetic */ class GrpcCallProvider$$Lambda$2 implements Runnable {

    /* renamed from: a */
    private final GrpcCallProvider f54617a;

    /* renamed from: c */
    private final C12930o0 f54618c;

    private GrpcCallProvider$$Lambda$2(GrpcCallProvider grpcCallProvider, C12930o0 o0Var) {
        this.f54617a = grpcCallProvider;
        this.f54618c = o0Var;
    }

    /* renamed from: a */
    public static Runnable m76233a(GrpcCallProvider grpcCallProvider, C12930o0 o0Var) {
        return new GrpcCallProvider$$Lambda$2(grpcCallProvider, o0Var);
    }

    public void run() {
        GrpcCallProvider.m76223h(this.f54617a, this.f54618c);
    }
}
