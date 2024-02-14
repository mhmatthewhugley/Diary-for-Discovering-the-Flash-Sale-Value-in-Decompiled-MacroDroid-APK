package com.google.firebase.firestore.local;

import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.util.Supplier;

/* compiled from: LocalStore */
final /* synthetic */ class LocalStore$$Lambda$9 implements Supplier {

    /* renamed from: a */
    private final LocalStore f54228a;

    /* renamed from: b */
    private final BundleMetadata f54229b;

    private LocalStore$$Lambda$9(LocalStore localStore, BundleMetadata bundleMetadata) {
        this.f54228a = localStore;
        this.f54229b = bundleMetadata;
    }

    /* renamed from: a */
    public static Supplier m75386a(LocalStore localStore, BundleMetadata bundleMetadata) {
        return new LocalStore$$Lambda$9(localStore, bundleMetadata);
    }

    public Object get() {
        return LocalStore.m75346x(this.f54228a, this.f54229b);
    }
}
