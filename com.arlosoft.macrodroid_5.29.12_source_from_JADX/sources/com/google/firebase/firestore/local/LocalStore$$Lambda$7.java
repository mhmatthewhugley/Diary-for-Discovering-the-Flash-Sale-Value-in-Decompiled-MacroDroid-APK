package com.google.firebase.firestore.local;

import java.util.List;

/* compiled from: LocalStore */
final /* synthetic */ class LocalStore$$Lambda$7 implements Runnable {

    /* renamed from: a */
    private final LocalStore f54223a;

    /* renamed from: c */
    private final List f54224c;

    private LocalStore$$Lambda$7(LocalStore localStore, List list) {
        this.f54223a = localStore;
        this.f54224c = list;
    }

    /* renamed from: a */
    public static Runnable m75384a(LocalStore localStore, List list) {
        return new LocalStore$$Lambda$7(localStore, list);
    }

    public void run() {
        LocalStore.m75347y(this.f54223a, this.f54224c);
    }
}
