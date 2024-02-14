package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: RemoteStore */
final /* synthetic */ class RemoteStore$$Lambda$2 implements Consumer {

    /* renamed from: a */
    private final RemoteStore f54667a;

    /* renamed from: b */
    private final AsyncQueue f54668b;

    private RemoteStore$$Lambda$2(RemoteStore remoteStore, AsyncQueue asyncQueue) {
        this.f54667a = remoteStore;
        this.f54668b = asyncQueue;
    }

    /* renamed from: a */
    public static Consumer m76365a(RemoteStore remoteStore, AsyncQueue asyncQueue) {
        return new RemoteStore$$Lambda$2(remoteStore, asyncQueue);
    }

    public void accept(Object obj) {
        this.f54668b.mo63152h(RemoteStore$$Lambda$3.m76366a(this.f54667a));
    }
}
