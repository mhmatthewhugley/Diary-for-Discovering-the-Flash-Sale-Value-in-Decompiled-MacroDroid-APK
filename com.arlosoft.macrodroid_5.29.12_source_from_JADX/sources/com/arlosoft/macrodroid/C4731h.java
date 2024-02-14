package com.arlosoft.macrodroid;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

/* renamed from: com.arlosoft.macrodroid.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4731h implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ConfigureNotificationBarActivity f11888a;

    /* renamed from: b */
    public final /* synthetic */ View f11889b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f11890c;

    public /* synthetic */ C4731h(ConfigureNotificationBarActivity configureNotificationBarActivity, View view, ViewGroup viewGroup) {
        this.f11888a = configureNotificationBarActivity;
        this.f11889b = view;
        this.f11890c = viewGroup;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f11888a.m9405V1(this.f11889b, this.f11890c, compoundButton, z);
    }
}
