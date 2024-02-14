package com.arlosoft.macrodroid.app.base;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import dagger.android.C11986a;
import dagger.android.DispatchingAndroidInjector;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p404u8.C16667a;
import p413v8.C16726b;

/* compiled from: AppCompatDaggerBaseActivity.kt */
public abstract class AppCompatDaggerBaseActivity extends AppCompatActivity implements C16726b {

    /* renamed from: d */
    public DispatchingAndroidInjector<Fragment> f9910d;

    /* renamed from: f */
    public Map<Integer, View> f9911f = new LinkedHashMap();

    /* renamed from: K1 */
    public final DispatchingAndroidInjector<Fragment> mo27311K1() {
        DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector = this.f9910d;
        if (dispatchingAndroidInjector != null) {
            return dispatchingAndroidInjector;
        }
        C13706o.m87945v("dispatchingFragmentAndroidInjector");
        return null;
    }

    /* renamed from: h0 */
    public C11986a<Fragment> mo27312h0() {
        return mo27311K1();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C16667a.m99103a(this);
        super.onCreate(bundle);
    }
}
