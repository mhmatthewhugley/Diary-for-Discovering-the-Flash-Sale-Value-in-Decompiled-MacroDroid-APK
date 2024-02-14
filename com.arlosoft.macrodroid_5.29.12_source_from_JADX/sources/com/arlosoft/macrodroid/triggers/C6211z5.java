package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.triggers.z5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6211z5 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f14772a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f14773b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14774c;

    public /* synthetic */ C6211z5(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f14772a = radioButton;
        this.f14773b = radioButton2;
        this.f14774c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        NotificationTrigger.m22823Q3(this.f14772a, this.f14773b, this.f14774c, compoundButton, z);
    }
}
