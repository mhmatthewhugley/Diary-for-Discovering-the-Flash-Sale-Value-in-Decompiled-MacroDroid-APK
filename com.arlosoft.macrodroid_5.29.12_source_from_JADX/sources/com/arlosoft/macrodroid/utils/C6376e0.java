package com.arlosoft.macrodroid.utils;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;

/* renamed from: com.arlosoft.macrodroid.utils.e0 */
/* compiled from: FragmentViewBindingDelegate.kt */
public final class C6376e0 {
    /* renamed from: a */
    public static final <T extends ViewBinding> FragmentViewBindingDelegate<T> m24622a(Fragment fragment, C16265l<? super View, ? extends T> lVar) {
        C13706o.m87929f(fragment, "<this>");
        C13706o.m87929f(lVar, "viewBindingFactory");
        return new FragmentViewBindingDelegate<>(fragment, lVar);
    }
}
