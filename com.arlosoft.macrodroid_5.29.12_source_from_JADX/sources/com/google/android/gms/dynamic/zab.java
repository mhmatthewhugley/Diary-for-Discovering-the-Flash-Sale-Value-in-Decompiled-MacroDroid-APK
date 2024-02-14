package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zab implements zah {

    /* renamed from: a */
    final /* synthetic */ Activity f4025a;

    /* renamed from: b */
    final /* synthetic */ Bundle f4026b;

    /* renamed from: c */
    final /* synthetic */ Bundle f4027c;

    /* renamed from: d */
    final /* synthetic */ DeferredLifecycleHelper f4028d;

    zab(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.f4028d = deferredLifecycleHelper;
        this.f4025a = activity;
        this.f4026b = bundle;
        this.f4027c = bundle2;
    }

    /* renamed from: a */
    public final int mo22050a() {
        return 0;
    }

    /* renamed from: b */
    public final void mo22051b(LifecycleDelegate lifecycleDelegate) {
        this.f4028d.f4015a.mo22046t0(this.f4025a, this.f4026b, this.f4027c);
    }
}
