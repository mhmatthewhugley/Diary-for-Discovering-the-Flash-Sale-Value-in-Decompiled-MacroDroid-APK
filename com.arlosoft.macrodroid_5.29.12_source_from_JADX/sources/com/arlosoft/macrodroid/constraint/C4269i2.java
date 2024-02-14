package com.arlosoft.macrodroid.constraint;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.constraint.i2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4269i2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f10870a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f10871b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f10872c;

    public /* synthetic */ C4269i2(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f10870a = radioButton;
        this.f10871b = radioButton2;
        this.f10872c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        NotificationPresentConstraint.m16862I3(this.f10870a, this.f10871b, this.f10872c, compoundButton, z);
    }
}
