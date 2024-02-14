package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.Stream.StreamCallback;
import p292io.grpc.C12537b1;

public interface Stream<CallbackType extends StreamCallback> {

    public enum State {
        Initial,
        Starting,
        Open,
        Error,
        Backoff
    }

    public interface StreamCallback {
        /* renamed from: a */
        void mo63092a(C12537b1 b1Var);

        /* renamed from: b */
        void mo63093b();
    }
}
