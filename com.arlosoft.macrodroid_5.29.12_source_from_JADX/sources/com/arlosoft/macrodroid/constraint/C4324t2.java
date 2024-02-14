package com.arlosoft.macrodroid.constraint;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.constraint.t2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4324t2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f11013a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f11014b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f11015c;

    public /* synthetic */ C4324t2(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f11013a = radioButton;
        this.f11014b = radioButton2;
        this.f11015c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        NotificationPresentConstraint.m16861H3(this.f11013a, this.f11014b, this.f11015c, compoundButton, z);
    }
}
