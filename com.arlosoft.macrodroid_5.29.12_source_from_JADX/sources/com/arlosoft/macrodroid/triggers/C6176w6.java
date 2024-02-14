package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.triggers.w6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6176w6 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f14687a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f14688b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14689c;

    public /* synthetic */ C6176w6(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f14687a = radioButton;
        this.f14688b = radioButton2;
        this.f14689c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SMSSentTrigger.m23060x3(this.f14687a, this.f14688b, this.f14689c, compoundButton, z);
    }
}
