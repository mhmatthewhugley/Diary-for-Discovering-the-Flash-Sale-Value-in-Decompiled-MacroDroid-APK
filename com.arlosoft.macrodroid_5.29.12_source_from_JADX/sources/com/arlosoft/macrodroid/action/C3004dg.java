package com.arlosoft.macrodroid.action;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.action.dg */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3004dg implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ SetAlarmClockAction f8194a;

    /* renamed from: b */
    public final /* synthetic */ Button f8195b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f8196c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox[] f8197d;

    public /* synthetic */ C3004dg(SetAlarmClockAction setAlarmClockAction, Button button, RadioButton radioButton, CheckBox[] checkBoxArr) {
        this.f8194a = setAlarmClockAction;
        this.f8195b = button;
        this.f8196c = radioButton;
        this.f8197d = checkBoxArr;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f8194a.m12250G3(this.f8195b, this.f8196c, this.f8197d, compoundButton, z);
    }
}
