package com.google.firebase.firestore.local;

/* compiled from: LocalStore */
final /* synthetic */ class LocalStore$$Lambda$14 implements Runnable {

    /* renamed from: a */
    private final LocalStore f54206a;

    /* renamed from: c */
    private final int f54207c;

    private LocalStore$$Lambda$14(LocalStore localStore, int i) {
        this.f54206a = localStore;
        this.f54207c = i;
    }

    /* renamed from: a */
    public static Runnable m75377a(LocalStore localStore, int i) {
        return new LocalStore$$Lambda$14(localStore, i);
    }

    public void run() {
        LocalStore.m75329A(this.f54206a, this.f54207c);
    }
}
