package com.arlosoft.macrodroid.action;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ViewFlipper;

/* renamed from: com.arlosoft.macrodroid.action.eg */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3032eg implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ SetAlarmClockAction f8256a;

    /* renamed from: b */
    public final /* synthetic */ ViewFlipper f8257b;

    /* renamed from: c */
    public final /* synthetic */ Button f8258c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox[] f8259d;

    public /* synthetic */ C3032eg(SetAlarmClockAction setAlarmClockAction, ViewFlipper viewFlipper, Button button, CheckBox[] checkBoxArr) {
        this.f8256a = setAlarmClockAction;
        this.f8257b = viewFlipper;
        this.f8258c = button;
        this.f8259d = checkBoxArr;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f8256a.m12251H3(this.f8257b, this.f8258c, this.f8259d, compoundButton, z);
    }
}
