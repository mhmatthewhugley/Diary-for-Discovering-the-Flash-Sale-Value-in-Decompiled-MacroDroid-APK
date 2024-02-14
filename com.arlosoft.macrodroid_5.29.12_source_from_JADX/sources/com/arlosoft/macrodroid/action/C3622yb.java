package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.action.yb */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3622yb implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Spinner f9622a;

    /* renamed from: b */
    public final /* synthetic */ CheckBox f9623b;

    /* renamed from: c */
    public final /* synthetic */ Activity f9624c;

    public /* synthetic */ C3622yb(Spinner spinner, CheckBox checkBox, Activity activity) {
        this.f9622a = spinner;
        this.f9623b = checkBox;
        this.f9624c = activity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        OpenWebPageAction.m11710z3(this.f9622a, this.f9623b, this.f9624c, compoundButton, z);
    }
}
