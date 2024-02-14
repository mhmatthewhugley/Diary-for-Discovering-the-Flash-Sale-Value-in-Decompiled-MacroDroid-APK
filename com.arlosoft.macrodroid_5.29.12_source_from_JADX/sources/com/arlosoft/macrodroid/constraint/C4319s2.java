package com.arlosoft.macrodroid.constraint;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.constraint.s2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4319s2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f11003a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f11004b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f11005c;

    public /* synthetic */ C4319s2(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f11003a = radioButton;
        this.f11004b = radioButton2;
        this.f11005c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        NotificationPresentConstraint.m16860G3(this.f11003a, this.f11004b, this.f11005c, compoundButton, z);
    }
}
