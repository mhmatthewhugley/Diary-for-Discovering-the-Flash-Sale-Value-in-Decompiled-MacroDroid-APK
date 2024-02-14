package com.arlosoft.macrodroid.utils;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.arlosoft.macrodroid.utils.FragmentViewBindingDelegate;

/* renamed from: com.arlosoft.macrodroid.utils.d0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6373d0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ FragmentViewBindingDelegate f14967a;

    public /* synthetic */ C6373d0(FragmentViewBindingDelegate fragmentViewBindingDelegate) {
        this.f14967a = fragmentViewBindingDelegate;
    }

    public final void onChanged(Object obj) {
        FragmentViewBindingDelegate.C63581.m24578b(this.f14967a, (LifecycleOwner) obj);
    }
}
