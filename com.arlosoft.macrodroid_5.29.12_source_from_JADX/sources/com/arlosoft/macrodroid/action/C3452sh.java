package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/* renamed from: com.arlosoft.macrodroid.action.sh */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3452sh implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f9192a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f9193b;

    /* renamed from: c */
    public final /* synthetic */ RadioGroup f9194c;

    public /* synthetic */ C3452sh(RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup) {
        this.f9192a = radioButton;
        this.f9193b = radioButton2;
        this.f9194c = radioGroup;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SetQuickSettingsStateAction.m12576A3(this.f9192a, this.f9193b, this.f9194c, compoundButton, z);
    }
}
