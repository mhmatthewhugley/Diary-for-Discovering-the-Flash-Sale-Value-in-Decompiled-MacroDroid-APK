package com.google.firebase.firestore.local;

import com.google.firebase.firestore.util.Supplier;

/* compiled from: LocalStore */
final /* synthetic */ class LocalStore$$Lambda$15 implements Supplier {

    /* renamed from: a */
    private final LocalStore f54208a;

    /* renamed from: b */
    private final LruGarbageCollector f54209b;

    private LocalStore$$Lambda$15(LocalStore localStore, LruGarbageCollector lruGarbageCollector) {
        this.f54208a = localStore;
        this.f54209b = lruGarbageCollector;
    }

    /* renamed from: a */
    public static Supplier m75378a(LocalStore localStore, LruGarbageCollector lruGarbageCollector) {
        return new LocalStore$$Lambda$15(localStore, lruGarbageCollector);
    }

    public Object get() {
        return this.f54209b.mo62646e(this.f54208a.f54188i);
    }
}
