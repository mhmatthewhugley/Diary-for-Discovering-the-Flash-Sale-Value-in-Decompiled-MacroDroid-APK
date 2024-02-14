package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.common.util.BiConsumer;

/* renamed from: com.google.firebase.remoteconfig.internal.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11353h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiConsumer f55300a;

    /* renamed from: c */
    public final /* synthetic */ String f55301c;

    /* renamed from: d */
    public final /* synthetic */ ConfigContainer f55302d;

    public /* synthetic */ C11353h(BiConsumer biConsumer, String str, ConfigContainer configContainer) {
        this.f55300a = biConsumer;
        this.f55301c = str;
        this.f55302d = configContainer;
    }

    public final void run() {
        this.f55300a.mo21949a(this.f55301c, this.f55302d);
    }
}
