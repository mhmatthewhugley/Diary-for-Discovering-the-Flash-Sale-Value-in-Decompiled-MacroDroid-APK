package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.triggers.x6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6188x6 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f14712a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f14713b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14714c;

    public /* synthetic */ C6188x6(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f14712a = radioButton;
        this.f14713b = radioButton2;
        this.f14714c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SMSSentTrigger.m23061y3(this.f14712a, this.f14713b, this.f14714c, compoundButton, z);
    }
}
