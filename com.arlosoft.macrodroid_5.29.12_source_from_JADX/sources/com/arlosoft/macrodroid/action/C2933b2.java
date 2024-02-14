package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.action.b2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2933b2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f8022a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f8023b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f8024c;

    public /* synthetic */ C2933b2(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f8022a = radioButton;
        this.f8023b = radioButton2;
        this.f8024c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ClearNotificationsAction.m10057E3(this.f8022a, this.f8023b, this.f8024c, compoundButton, z);
    }
}
