package com.google.firebase.firestore.local;

/* compiled from: LocalStore */
final /* synthetic */ class LocalStore$$Lambda$1 implements Runnable {

    /* renamed from: a */
    private final LocalStore f54193a;

    private LocalStore$$Lambda$1(LocalStore localStore) {
        this.f54193a = localStore;
    }

    /* renamed from: a */
    public static Runnable m75372a(LocalStore localStore) {
        return new LocalStore$$Lambda$1(localStore);
    }

    public void run() {
        this.f54193a.f54181b.start();
    }
}
