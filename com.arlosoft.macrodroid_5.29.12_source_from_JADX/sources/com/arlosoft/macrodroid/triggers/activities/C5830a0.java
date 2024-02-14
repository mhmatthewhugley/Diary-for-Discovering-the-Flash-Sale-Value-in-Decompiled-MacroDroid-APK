package com.arlosoft.macrodroid.triggers.activities;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

/* renamed from: com.arlosoft.macrodroid.triggers.activities.a0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5830a0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ CheckBox[] f13830a;

    /* renamed from: b */
    public final /* synthetic */ Button f13831b;

    public /* synthetic */ C5830a0(CheckBox[] checkBoxArr, Button button) {
        this.f13830a = checkBoxArr;
        this.f13831b = button;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        TimerTriggerConfigureActivity.m23909N1(this.f13830a, this.f13831b, compoundButton, z);
    }
}
