package com.google.firebase.firestore.local;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.util.Supplier;
import java.util.List;
import java.util.Set;

/* compiled from: LocalStore */
final /* synthetic */ class LocalStore$$Lambda$2 implements Supplier {

    /* renamed from: a */
    private final LocalStore f54210a;

    /* renamed from: b */
    private final Set f54211b;

    /* renamed from: c */
    private final List f54212c;

    /* renamed from: d */
    private final Timestamp f54213d;

    private LocalStore$$Lambda$2(LocalStore localStore, Set set, List list, Timestamp timestamp) {
        this.f54210a = localStore;
        this.f54211b = set;
        this.f54212c = list;
        this.f54213d = timestamp;
    }

    /* renamed from: a */
    public static Supplier m75379a(LocalStore localStore, Set set, List list, Timestamp timestamp) {
        return new LocalStore$$Lambda$2(localStore, set, list, timestamp);
    }

    public Object get() {
        return LocalStore.m75334F(this.f54210a, this.f54211b, this.f54212c, this.f54213d);
    }
}
