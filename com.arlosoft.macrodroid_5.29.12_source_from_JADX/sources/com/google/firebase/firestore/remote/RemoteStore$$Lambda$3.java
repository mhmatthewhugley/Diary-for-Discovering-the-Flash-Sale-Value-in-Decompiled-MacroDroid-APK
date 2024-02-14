package com.google.firebase.firestore.remote;

/* compiled from: RemoteStore */
final /* synthetic */ class RemoteStore$$Lambda$3 implements Runnable {

    /* renamed from: a */
    private final RemoteStore f54669a;

    private RemoteStore$$Lambda$3(RemoteStore remoteStore) {
        this.f54669a = remoteStore;
    }

    /* renamed from: a */
    public static Runnable m76366a(RemoteStore remoteStore) {
        return new RemoteStore$$Lambda$3(remoteStore);
    }

    public void run() {
        RemoteStore.m76309B(this.f54669a);
    }
}
