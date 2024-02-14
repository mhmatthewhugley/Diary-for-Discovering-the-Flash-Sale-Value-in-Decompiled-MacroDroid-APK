package com.arlosoft.macrodroid.utils;

import androidx.lifecycle.C0736a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.utils.FragmentViewBindingDelegate$1$viewLifecycleOwnerLiveDataObserver$1$1 */
/* compiled from: FragmentViewBindingDelegate.kt */
public final class C6359x428c4a76 implements DefaultLifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ FragmentViewBindingDelegate<T> f14940a;

    C6359x428c4a76(FragmentViewBindingDelegate<T> fragmentViewBindingDelegate) {
        this.f14940a = fragmentViewBindingDelegate;
    }

    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C0736a.m539a(this, lifecycleOwner);
    }

    public void onDestroy(LifecycleOwner lifecycleOwner) {
        C13706o.m87929f(lifecycleOwner, "owner");
        this.f14940a.f14937c = null;
    }

    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C0736a.m541c(this, lifecycleOwner);
    }

    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C0736a.m542d(this, lifecycleOwner);
    }

    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C0736a.m543e(this, lifecycleOwner);
    }

    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C0736a.m544f(this, lifecycleOwner);
    }
}
