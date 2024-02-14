package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.triggers.p5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6042p5 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f14283a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f14284b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14285c;

    public /* synthetic */ C6042p5(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f14283a = radioButton;
        this.f14284b = radioButton2;
        this.f14285c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        NotificationTrigger.m22824R3(this.f14283a, this.f14284b, this.f14285c, compoundButton, z);
    }
}
