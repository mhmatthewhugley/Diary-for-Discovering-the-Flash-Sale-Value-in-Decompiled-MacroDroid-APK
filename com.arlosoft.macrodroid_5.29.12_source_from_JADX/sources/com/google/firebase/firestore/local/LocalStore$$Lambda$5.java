package com.google.firebase.firestore.local;

import com.google.protobuf.ByteString;

/* compiled from: LocalStore */
final /* synthetic */ class LocalStore$$Lambda$5 implements Runnable {

    /* renamed from: a */
    private final LocalStore f54218a;

    /* renamed from: c */
    private final ByteString f54219c;

    private LocalStore$$Lambda$5(LocalStore localStore, ByteString byteString) {
        this.f54218a = localStore;
        this.f54219c = byteString;
    }

    /* renamed from: a */
    public static Runnable m75382a(LocalStore localStore, ByteString byteString) {
        return new LocalStore$$Lambda$5(localStore, byteString);
    }

    public void run() {
        this.f54218a.f54181b.mo62676i(this.f54219c);
    }
}
