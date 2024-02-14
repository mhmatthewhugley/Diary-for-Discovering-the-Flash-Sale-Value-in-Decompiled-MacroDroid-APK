package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.action.zb */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3649zb implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Spinner f9689a;

    /* renamed from: b */
    public final /* synthetic */ CheckBox f9690b;

    /* renamed from: c */
    public final /* synthetic */ Activity f9691c;

    public /* synthetic */ C3649zb(Spinner spinner, CheckBox checkBox, Activity activity) {
        this.f9689a = spinner;
        this.f9690b = checkBox;
        this.f9691c = activity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        OpenWebPageAction.m11709y3(this.f9689a, this.f9690b, this.f9691c, compoundButton, z);
    }
}
