package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zad implements zah {

    /* renamed from: a */
    final /* synthetic */ FrameLayout f4031a;

    /* renamed from: b */
    final /* synthetic */ LayoutInflater f4032b;

    /* renamed from: c */
    final /* synthetic */ ViewGroup f4033c;

    /* renamed from: d */
    final /* synthetic */ Bundle f4034d;

    /* renamed from: e */
    final /* synthetic */ DeferredLifecycleHelper f4035e;

    zad(DeferredLifecycleHelper deferredLifecycleHelper, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f4035e = deferredLifecycleHelper;
        this.f4031a = frameLayout;
        this.f4032b = layoutInflater;
        this.f4033c = viewGroup;
        this.f4034d = bundle;
    }

    /* renamed from: a */
    public final int mo22050a() {
        return 2;
    }

    /* renamed from: b */
    public final void mo22051b(LifecycleDelegate lifecycleDelegate) {
        this.f4031a.removeAllViews();
        this.f4031a.addView(this.f4035e.f4015a.mo22047u0(this.f4032b, this.f4033c, this.f4034d));
    }
}
