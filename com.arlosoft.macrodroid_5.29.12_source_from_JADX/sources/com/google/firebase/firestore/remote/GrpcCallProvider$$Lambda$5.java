package com.google.firebase.firestore.remote;

import java.util.concurrent.Callable;

/* compiled from: GrpcCallProvider */
final /* synthetic */ class GrpcCallProvider$$Lambda$5 implements Callable {

    /* renamed from: a */
    private final GrpcCallProvider f54623a;

    private GrpcCallProvider$$Lambda$5(GrpcCallProvider grpcCallProvider) {
        this.f54623a = grpcCallProvider;
    }

    /* renamed from: a */
    public static Callable m76236a(GrpcCallProvider grpcCallProvider) {
        return new GrpcCallProvider$$Lambda$5(grpcCallProvider);
    }

    public Object call() {
        return GrpcCallProvider.m76222g(this.f54623a);
    }
}
