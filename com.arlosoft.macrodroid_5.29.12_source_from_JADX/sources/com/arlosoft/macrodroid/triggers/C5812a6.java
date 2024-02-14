package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.triggers.a6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5812a6 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f13772a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f13773b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f13774c;

    public /* synthetic */ C5812a6(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f13772a = radioButton;
        this.f13773b = radioButton2;
        this.f13774c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        NotificationTrigger.m22822P3(this.f13772a, this.f13773b, this.f13774c, compoundButton, z);
    }
}
