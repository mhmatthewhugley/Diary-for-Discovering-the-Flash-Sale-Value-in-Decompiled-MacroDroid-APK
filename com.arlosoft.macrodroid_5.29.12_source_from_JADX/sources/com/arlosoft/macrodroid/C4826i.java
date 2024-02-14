package com.arlosoft.macrodroid;

import android.view.ViewGroup;
import android.widget.CompoundButton;

/* renamed from: com.arlosoft.macrodroid.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4826i implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ConfigureNotificationBarActivity f12136a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f12137b;

    /* renamed from: c */
    public final /* synthetic */ boolean f12138c;

    public /* synthetic */ C4826i(ConfigureNotificationBarActivity configureNotificationBarActivity, ViewGroup viewGroup, boolean z) {
        this.f12136a = configureNotificationBarActivity;
        this.f12137b = viewGroup;
        this.f12138c = z;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f12136a.m9410a2(this.f12137b, this.f12138c, compoundButton, z);
    }
}
