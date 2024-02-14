package com.google.firebase.firestore.remote;

import p292io.grpc.C12930o0;

/* compiled from: GrpcCallProvider */
final /* synthetic */ class GrpcCallProvider$$Lambda$3 implements Runnable {

    /* renamed from: a */
    private final GrpcCallProvider f54619a;

    /* renamed from: c */
    private final C12930o0 f54620c;

    private GrpcCallProvider$$Lambda$3(GrpcCallProvider grpcCallProvider, C12930o0 o0Var) {
        this.f54619a = grpcCallProvider;
        this.f54620c = o0Var;
    }

    /* renamed from: a */
    public static Runnable m76234a(GrpcCallProvider grpcCallProvider, C12930o0 o0Var) {
        return new GrpcCallProvider$$Lambda$3(grpcCallProvider, o0Var);
    }

    public void run() {
        this.f54619a.f54609b.mo63152h(GrpcCallProvider$$Lambda$7.m76238a(this.f54619a, this.f54620c));
    }
}
