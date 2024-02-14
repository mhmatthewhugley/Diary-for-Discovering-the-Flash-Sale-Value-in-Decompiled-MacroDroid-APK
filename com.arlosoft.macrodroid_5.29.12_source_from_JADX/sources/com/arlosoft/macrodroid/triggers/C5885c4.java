package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.triggers.c4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5885c4 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f13977a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f13978b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f13979c;

    public /* synthetic */ C5885c4(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f13977a = radioButton;
        this.f13978b = radioButton2;
        this.f13979c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        IncomingSMSTrigger.m22365T3(this.f13977a, this.f13978b, this.f13979c, compoundButton, z);
    }
}
