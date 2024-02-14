package com.google.firebase.firestore.local;

import com.google.firebase.firestore.util.Supplier;

/* compiled from: LocalStore */
final /* synthetic */ class LocalStore$$Lambda$4 implements Supplier {

    /* renamed from: a */
    private final LocalStore f54216a;

    /* renamed from: b */
    private final int f54217b;

    private LocalStore$$Lambda$4(LocalStore localStore, int i) {
        this.f54216a = localStore;
        this.f54217b = i;
    }

    /* renamed from: a */
    public static Supplier m75381a(LocalStore localStore, int i) {
        return new LocalStore$$Lambda$4(localStore, i);
    }

    public Object get() {
        return LocalStore.m75348z(this.f54216a, this.f54217b);
    }
}
