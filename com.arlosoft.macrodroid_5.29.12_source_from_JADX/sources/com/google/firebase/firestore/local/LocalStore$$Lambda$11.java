package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.util.Supplier;

/* compiled from: LocalStore */
final /* synthetic */ class LocalStore$$Lambda$11 implements Supplier {

    /* renamed from: a */
    private final LocalStore f54196a;

    /* renamed from: b */
    private final ImmutableSortedMap f54197b;

    /* renamed from: c */
    private final TargetData f54198c;

    private LocalStore$$Lambda$11(LocalStore localStore, ImmutableSortedMap immutableSortedMap, TargetData targetData) {
        this.f54196a = localStore;
        this.f54197b = immutableSortedMap;
        this.f54198c = targetData;
    }

    /* renamed from: a */
    public static Supplier m75374a(LocalStore localStore, ImmutableSortedMap immutableSortedMap, TargetData targetData) {
        return new LocalStore$$Lambda$11(localStore, immutableSortedMap, targetData);
    }

    public Object get() {
        return LocalStore.m75342t(this.f54196a, this.f54197b, this.f54198c);
    }
}
