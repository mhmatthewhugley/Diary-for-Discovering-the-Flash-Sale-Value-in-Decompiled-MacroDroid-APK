package com.google.firebase.firestore.remote;

import p292io.grpc.C12930o0;

/* compiled from: GrpcCallProvider */
final /* synthetic */ class GrpcCallProvider$$Lambda$7 implements Runnable {

    /* renamed from: a */
    private final GrpcCallProvider f54626a;

    /* renamed from: c */
    private final C12930o0 f54627c;

    private GrpcCallProvider$$Lambda$7(GrpcCallProvider grpcCallProvider, C12930o0 o0Var) {
        this.f54626a = grpcCallProvider;
        this.f54627c = o0Var;
    }

    /* renamed from: a */
    public static Runnable m76238a(GrpcCallProvider grpcCallProvider, C12930o0 o0Var) {
        return new GrpcCallProvider$$Lambda$7(grpcCallProvider, o0Var);
    }

    public void run() {
        this.f54626a.m76227l(this.f54627c);
    }
}
