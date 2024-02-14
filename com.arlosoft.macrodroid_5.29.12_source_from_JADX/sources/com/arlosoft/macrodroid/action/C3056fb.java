package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.action.fb */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3056fb implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f8325a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f8326b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f8327c;

    public /* synthetic */ C3056fb(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f8325a = radioButton;
        this.f8326b = radioButton2;
        this.f8327c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        NotificationInteractionAction.m11625z3(this.f8325a, this.f8326b, this.f8327c, compoundButton, z);
    }
}
