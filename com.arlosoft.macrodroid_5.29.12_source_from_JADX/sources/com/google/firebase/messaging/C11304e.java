package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.messaging.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11304e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f55090a;

    /* renamed from: c */
    public final /* synthetic */ Intent f55091c;

    public /* synthetic */ C11304e(Context context, Intent intent) {
        this.f55090a = context;
        this.f55091c = intent;
    }

    public final Object call() {
        return Integer.valueOf(ServiceStarter.m77003b().mo63404g(this.f55090a, this.f55091c));
    }
}
