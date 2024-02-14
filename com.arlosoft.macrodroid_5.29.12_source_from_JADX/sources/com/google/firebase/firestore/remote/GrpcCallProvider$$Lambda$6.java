package com.google.firebase.firestore.remote;

import p292io.grpc.C12930o0;

/* compiled from: GrpcCallProvider */
final /* synthetic */ class GrpcCallProvider$$Lambda$6 implements Runnable {

    /* renamed from: a */
    private final GrpcCallProvider f54624a;

    /* renamed from: c */
    private final C12930o0 f54625c;

    private GrpcCallProvider$$Lambda$6(GrpcCallProvider grpcCallProvider, C12930o0 o0Var) {
        this.f54624a = grpcCallProvider;
        this.f54625c = o0Var;
    }

    /* renamed from: a */
    public static Runnable m76237a(GrpcCallProvider grpcCallProvider, C12930o0 o0Var) {
        return new GrpcCallProvider$$Lambda$6(grpcCallProvider, o0Var);
    }

    public void run() {
        this.f54624a.m76227l(this.f54625c);
    }
}
