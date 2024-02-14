package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.util.Supplier;

/* compiled from: LocalStore */
final /* synthetic */ class LocalStore$$Lambda$3 implements Supplier {

    /* renamed from: a */
    private final LocalStore f54214a;

    /* renamed from: b */
    private final MutationBatchResult f54215b;

    private LocalStore$$Lambda$3(LocalStore localStore, MutationBatchResult mutationBatchResult) {
        this.f54214a = localStore;
        this.f54215b = mutationBatchResult;
    }

    /* renamed from: a */
    public static Supplier m75380a(LocalStore localStore, MutationBatchResult mutationBatchResult) {
        return new LocalStore$$Lambda$3(localStore, mutationBatchResult);
    }

    public Object get() {
        return LocalStore.m75340r(this.f54214a, this.f54215b);
    }
}
