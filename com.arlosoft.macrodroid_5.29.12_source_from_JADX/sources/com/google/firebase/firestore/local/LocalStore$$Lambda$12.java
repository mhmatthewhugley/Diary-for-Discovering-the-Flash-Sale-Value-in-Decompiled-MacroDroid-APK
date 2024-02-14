package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.bundle.NamedQuery;

/* compiled from: LocalStore */
final /* synthetic */ class LocalStore$$Lambda$12 implements Runnable {

    /* renamed from: a */
    private final LocalStore f54199a;

    /* renamed from: c */
    private final NamedQuery f54200c;

    /* renamed from: d */
    private final TargetData f54201d;

    /* renamed from: f */
    private final int f54202f;

    /* renamed from: g */
    private final ImmutableSortedSet f54203g;

    private LocalStore$$Lambda$12(LocalStore localStore, NamedQuery namedQuery, TargetData targetData, int i, ImmutableSortedSet immutableSortedSet) {
        this.f54199a = localStore;
        this.f54200c = namedQuery;
        this.f54201d = targetData;
        this.f54202f = i;
        this.f54203g = immutableSortedSet;
    }

    /* renamed from: a */
    public static Runnable m75375a(LocalStore localStore, NamedQuery namedQuery, TargetData targetData, int i, ImmutableSortedSet immutableSortedSet) {
        return new LocalStore$$Lambda$12(localStore, namedQuery, targetData, i, immutableSortedSet);
    }

    public void run() {
        LocalStore.m75331C(this.f54199a, this.f54200c, this.f54201d, this.f54202f, this.f54203g);
    }
}
