package com.google.firebase.components;

import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

/* renamed from: com.google.firebase.components.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1826i implements Provider {

    /* renamed from: a */
    public final /* synthetic */ ComponentRegistrar f4820a;

    public /* synthetic */ C1826i(ComponentRegistrar componentRegistrar) {
        this.f4820a = componentRegistrar;
    }

    public final Object get() {
        return ComponentRuntime.Builder.m6406f(this.f4820a);
    }
}
