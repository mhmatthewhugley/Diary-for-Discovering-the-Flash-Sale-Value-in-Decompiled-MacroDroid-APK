package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.action.hb */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3112hb implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f8422a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f8423b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f8424c;

    public /* synthetic */ C3112hb(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f8422a = radioButton;
        this.f8423b = radioButton2;
        this.f8424c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        NotificationInteractionAction.m11603B3(this.f8422a, this.f8423b, this.f8424c, compoundButton, z);
    }
}
