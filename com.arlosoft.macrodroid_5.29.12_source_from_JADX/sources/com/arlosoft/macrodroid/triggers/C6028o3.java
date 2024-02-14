package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.triggers.o3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6028o3 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f14248a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f14249b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14250c;

    public /* synthetic */ C6028o3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f14248a = radioButton;
        this.f14249b = radioButton2;
        this.f14250c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        IncomingSMSTrigger.m22359N3(this.f14248a, this.f14249b, this.f14250c, compoundButton, z);
    }
}
