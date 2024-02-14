package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.triggers.v6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6164v6 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f14652a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f14653b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14654c;

    public /* synthetic */ C6164v6(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f14652a = radioButton;
        this.f14653b = radioButton2;
        this.f14654c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SMSSentTrigger.m23059w3(this.f14652a, this.f14653b, this.f14654c, compoundButton, z);
    }
}
