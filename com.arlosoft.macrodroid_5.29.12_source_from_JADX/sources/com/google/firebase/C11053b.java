package com.google.firebase;

import android.content.Context;
import com.google.firebase.inject.Provider;

/* renamed from: com.google.firebase.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11053b implements Provider {

    /* renamed from: a */
    public final /* synthetic */ FirebaseApp f53887a;

    /* renamed from: b */
    public final /* synthetic */ Context f53888b;

    public /* synthetic */ C11053b(FirebaseApp firebaseApp, Context context) {
        this.f53887a = firebaseApp;
        this.f53888b = context;
    }

    public final Object get() {
        return this.f53887a.m74389x(this.f53888b);
    }
}
