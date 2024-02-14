package com.arlosoft.macrodroid.homescreen;

import android.content.Context;
import android.widget.CompoundButton;

/* renamed from: com.arlosoft.macrodroid.homescreen.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4750f implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Context f11934a;

    /* renamed from: b */
    public final /* synthetic */ HomeFragment f11935b;

    public /* synthetic */ C4750f(Context context, HomeFragment homeFragment) {
        this.f11934a = context;
        this.f11935b = homeFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        HomeFragment.m18334B0(this.f11934a, this.f11935b, compoundButton, z);
    }
}
