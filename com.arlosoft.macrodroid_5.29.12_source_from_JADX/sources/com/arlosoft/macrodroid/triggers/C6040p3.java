package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.triggers.p3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6040p3 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f14278a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f14279b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14280c;

    public /* synthetic */ C6040p3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f14278a = radioButton;
        this.f14279b = radioButton2;
        this.f14280c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        IncomingSMSTrigger.m22358M3(this.f14278a, this.f14279b, this.f14280c, compoundButton, z);
    }
}
