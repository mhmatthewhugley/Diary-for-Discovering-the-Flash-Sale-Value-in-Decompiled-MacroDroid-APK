package com.arlosoft.macrodroid.app.base;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import dagger.android.C11986a;
import dagger.android.DispatchingAndroidInjector;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p404u8.C16667a;
import p413v8.C16726b;

/* compiled from: MacroDroidDaggerBaseActivity.kt */
public abstract class MacroDroidDaggerBaseActivity extends MacroDroidBaseActivity implements C16726b {

    /* renamed from: o */
    public DispatchingAndroidInjector<Fragment> f9915o;

    /* renamed from: p */
    public Map<Integer, View> f9916p = new LinkedHashMap();

    /* renamed from: Q1 */
    public final DispatchingAndroidInjector<Fragment> mo27318Q1() {
        DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector = this.f9915o;
        if (dispatchingAndroidInjector != null) {
            return dispatchingAndroidInjector;
        }
        C13706o.m87945v("dispatchingFragmentAndroidInjector");
        return null;
    }

    /* renamed from: h0 */
    public C11986a<Fragment> mo27312h0() {
        return mo27318Q1();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C16667a.m99103a(this);
        super.onCreate(bundle);
    }
}
