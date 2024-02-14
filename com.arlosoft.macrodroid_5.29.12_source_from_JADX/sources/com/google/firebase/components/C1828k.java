package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* renamed from: com.google.firebase.components.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1828k implements Deferred.DeferredHandler {

    /* renamed from: a */
    public final /* synthetic */ Deferred.DeferredHandler f4823a;

    /* renamed from: b */
    public final /* synthetic */ Deferred.DeferredHandler f4824b;

    public /* synthetic */ C1828k(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2) {
        this.f4823a = deferredHandler;
        this.f4824b = deferredHandler2;
    }

    /* renamed from: a */
    public final void mo22929a(Provider provider) {
        OptionalProvider.m6452h(this.f4823a, this.f4824b, provider);
    }
}
