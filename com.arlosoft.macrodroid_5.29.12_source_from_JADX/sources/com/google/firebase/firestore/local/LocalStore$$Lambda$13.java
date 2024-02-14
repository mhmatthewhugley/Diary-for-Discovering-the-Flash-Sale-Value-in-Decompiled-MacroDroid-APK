package com.google.firebase.firestore.local;

import com.google.firebase.firestore.util.Supplier;

/* compiled from: LocalStore */
final /* synthetic */ class LocalStore$$Lambda$13 implements Supplier {

    /* renamed from: a */
    private final LocalStore f54204a;

    /* renamed from: b */
    private final String f54205b;

    private LocalStore$$Lambda$13(LocalStore localStore, String str) {
        this.f54204a = localStore;
        this.f54205b = str;
    }

    /* renamed from: a */
    public static Supplier m75376a(LocalStore localStore, String str) {
        return new LocalStore$$Lambda$13(localStore, str);
    }

    public Object get() {
        return this.f54204a.f54187h.mo62578d(this.f54205b);
    }
}
