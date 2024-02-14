package com.google.firebase.firestore.remote;

import p292io.grpc.C12537b1;
import p292io.grpc.C12960q0;

interface IncomingStreamObserver<RespT> {
    /* renamed from: a */
    void mo63003a(C12537b1 b1Var);

    /* renamed from: b */
    void mo63004b();

    /* renamed from: c */
    void mo63005c(C12960q0 q0Var);

    void onNext(RespT respt);
}
