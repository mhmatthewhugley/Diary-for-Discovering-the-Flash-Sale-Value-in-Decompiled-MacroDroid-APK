package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.core.OnlineState;
import com.google.firebase.firestore.remote.OnlineStateTracker;
import com.google.firebase.firestore.remote.RemoteStore;

/* compiled from: RemoteStore */
final /* synthetic */ class RemoteStore$$Lambda$1 implements OnlineStateTracker.OnlineStateCallback {

    /* renamed from: a */
    private final RemoteStore.RemoteStoreCallback f54666a;

    private RemoteStore$$Lambda$1(RemoteStore.RemoteStoreCallback remoteStoreCallback) {
        this.f54666a = remoteStoreCallback;
    }

    /* renamed from: b */
    public static OnlineStateTracker.OnlineStateCallback m76363b(RemoteStore.RemoteStoreCallback remoteStoreCallback) {
        return new RemoteStore$$Lambda$1(remoteStoreCallback);
    }

    /* renamed from: a */
    public void mo63048a(OnlineState onlineState) {
        this.f54666a.mo23898a(onlineState);
    }
}
