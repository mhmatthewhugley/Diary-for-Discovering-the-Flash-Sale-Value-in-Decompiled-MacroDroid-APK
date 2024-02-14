package com.google.firebase.firestore.local;

import com.google.firebase.firestore.bundle.BundleMetadata;

/* compiled from: LocalStore */
final /* synthetic */ class LocalStore$$Lambda$10 implements Runnable {

    /* renamed from: a */
    private final LocalStore f54194a;

    /* renamed from: c */
    private final BundleMetadata f54195c;

    private LocalStore$$Lambda$10(LocalStore localStore, BundleMetadata bundleMetadata) {
        this.f54194a = localStore;
        this.f54195c = bundleMetadata;
    }

    /* renamed from: a */
    public static Runnable m75373a(LocalStore localStore, BundleMetadata bundleMetadata) {
        return new LocalStore$$Lambda$10(localStore, bundleMetadata);
    }

    public void run() {
        this.f54194a.f54187h.mo62576b(this.f54195c);
    }
}
