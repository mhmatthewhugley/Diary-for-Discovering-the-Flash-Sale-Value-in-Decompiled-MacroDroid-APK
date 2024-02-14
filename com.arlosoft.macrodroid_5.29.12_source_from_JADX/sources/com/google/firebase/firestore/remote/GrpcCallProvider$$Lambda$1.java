package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p292io.grpc.C12930o0;
import p292io.grpc.C12972r0;

/* compiled from: GrpcCallProvider */
final /* synthetic */ class GrpcCallProvider$$Lambda$1 implements Continuation {

    /* renamed from: a */
    private final GrpcCallProvider f54615a;

    /* renamed from: b */
    private final C12972r0 f54616b;

    private GrpcCallProvider$$Lambda$1(GrpcCallProvider grpcCallProvider, C12972r0 r0Var) {
        this.f54615a = grpcCallProvider;
        this.f54616b = r0Var;
    }

    /* renamed from: b */
    public static Continuation m76231b(GrpcCallProvider grpcCallProvider, C12972r0 r0Var) {
        return new GrpcCallProvider$$Lambda$1(grpcCallProvider, r0Var);
    }

    /* renamed from: a */
    public Object mo21119a(Task task) {
        return Tasks.m66667f(((C12930o0) task.mo23715p()).mo69115h(this.f54616b, this.f54615a.f54610c));
    }
}
