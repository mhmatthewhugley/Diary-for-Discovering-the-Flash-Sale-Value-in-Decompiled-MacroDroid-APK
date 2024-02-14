package com.google.firebase.installations;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;

/* renamed from: com.google.firebase.installations.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11270a implements Provider {

    /* renamed from: a */
    public final /* synthetic */ FirebaseApp f54860a;

    public /* synthetic */ C11270a(FirebaseApp firebaseApp) {
        this.f54860a = firebaseApp;
    }

    public final Object get() {
        return FirebaseInstallations.m76620y(this.f54860a);
    }
}
