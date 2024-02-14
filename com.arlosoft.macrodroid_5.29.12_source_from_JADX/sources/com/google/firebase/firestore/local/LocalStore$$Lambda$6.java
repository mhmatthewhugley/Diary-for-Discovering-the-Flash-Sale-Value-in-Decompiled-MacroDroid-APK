package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.RemoteEvent;
import com.google.firebase.firestore.util.Supplier;

/* compiled from: LocalStore */
final /* synthetic */ class LocalStore$$Lambda$6 implements Supplier {

    /* renamed from: a */
    private final LocalStore f54220a;

    /* renamed from: b */
    private final RemoteEvent f54221b;

    /* renamed from: c */
    private final SnapshotVersion f54222c;

    private LocalStore$$Lambda$6(LocalStore localStore, RemoteEvent remoteEvent, SnapshotVersion snapshotVersion) {
        this.f54220a = localStore;
        this.f54221b = remoteEvent;
        this.f54222c = snapshotVersion;
    }

    /* renamed from: a */
    public static Supplier m75383a(LocalStore localStore, RemoteEvent remoteEvent, SnapshotVersion snapshotVersion) {
        return new LocalStore$$Lambda$6(localStore, remoteEvent, snapshotVersion);
    }

    public Object get() {
        return LocalStore.m75343u(this.f54220a, this.f54221b, this.f54222c);
    }
}
