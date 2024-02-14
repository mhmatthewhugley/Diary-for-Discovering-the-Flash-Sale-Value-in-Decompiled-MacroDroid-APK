package com.arlosoft.macrodroid.utils;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0736a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;
import p397ta.C16604c;
import p433xa.C16887m;

/* compiled from: FragmentViewBindingDelegate.kt */
public final class FragmentViewBindingDelegate<T extends ViewBinding> implements C16604c<Fragment, T> {

    /* renamed from: a */
    private final Fragment f14935a;

    /* renamed from: b */
    private final C16265l<View, T> f14936b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public T f14937c;

    public FragmentViewBindingDelegate(Fragment fragment, C16265l<? super View, ? extends T> lVar) {
        C13706o.m87929f(fragment, "fragment");
        C13706o.m87929f(lVar, "viewBindingFactory");
        this.f14935a = fragment;
        this.f14936b = lVar;
        fragment.getLifecycle().addObserver(new DefaultLifecycleObserver(this) {

            /* renamed from: a */
            private final Observer<LifecycleOwner> f14938a;

            /* renamed from: c */
            final /* synthetic */ FragmentViewBindingDelegate<T> f14939c;

            {
                this.f14939c = r2;
                this.f14938a = new C6373d0(r2);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static final void m24578b(FragmentViewBindingDelegate fragmentViewBindingDelegate, LifecycleOwner lifecycleOwner) {
                C13706o.m87929f(fragmentViewBindingDelegate, "this$0");
                if (lifecycleOwner != null) {
                    lifecycleOwner.getLifecycle().addObserver(new C6359x428c4a76(fragmentViewBindingDelegate));
                }
            }

            public void onCreate(LifecycleOwner lifecycleOwner) {
                C13706o.m87929f(lifecycleOwner, "owner");
                this.f14939c.mo32408d().getViewLifecycleOwnerLiveData().observeForever(this.f14938a);
            }

            public void onDestroy(LifecycleOwner lifecycleOwner) {
                C13706o.m87929f(lifecycleOwner, "owner");
                this.f14939c.mo32408d().getViewLifecycleOwnerLiveData().removeObserver(this.f14938a);
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
        });
    }

    /* renamed from: d */
    public final Fragment mo32408d() {
        return this.f14935a;
    }

    /* renamed from: e */
    public T mo32407a(Fragment fragment, C16887m<?> mVar) {
        C13706o.m87929f(fragment, "thisRef");
        C13706o.m87929f(mVar, "property");
        T t = this.f14937c;
        if (t != null) {
            return t;
        }
        Lifecycle lifecycle = this.f14935a.getViewLifecycleOwner().getLifecycle();
        C13706o.m87928e(lifecycle, "fragment.viewLifecycleOwner.lifecycle");
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
            C16265l<View, T> lVar = this.f14936b;
            View requireView = fragment.requireView();
            C13706o.m87928e(requireView, "thisRef.requireView()");
            T t2 = (ViewBinding) lVar.invoke(requireView);
            this.f14937c = t2;
            return t2;
        }
        throw new IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.");
    }
}
