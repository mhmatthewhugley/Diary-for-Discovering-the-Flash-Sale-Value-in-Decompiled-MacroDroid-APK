package com.google.firebase.firestore.local;

import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.local.LocalStore;

/* compiled from: LocalStore */
final /* synthetic */ class LocalStore$$Lambda$8 implements Runnable {

    /* renamed from: a */
    private final LocalStore f54225a;

    /* renamed from: c */
    private final LocalStore.AllocateQueryHolder f54226c;

    /* renamed from: d */
    private final Target f54227d;

    private LocalStore$$Lambda$8(LocalStore localStore, LocalStore.AllocateQueryHolder allocateQueryHolder, Target target) {
        this.f54225a = localStore;
        this.f54226c = allocateQueryHolder;
        this.f54227d = target;
    }

    /* renamed from: a */
    public static Runnable m75385a(LocalStore localStore, LocalStore.AllocateQueryHolder allocateQueryHolder, Target target) {
        return new LocalStore$$Lambda$8(localStore, allocateQueryHolder, target);
    }

    public void run() {
        LocalStore.m75341s(this.f54225a, this.f54226c, this.f54227d);
    }
}
