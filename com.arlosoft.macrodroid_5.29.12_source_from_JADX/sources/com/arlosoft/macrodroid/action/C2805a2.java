package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.action.a2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2805a2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f7717a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f7718b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f7719c;

    public /* synthetic */ C2805a2(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f7717a = radioButton;
        this.f7718b = radioButton2;
        this.f7719c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ClearNotificationsAction.m10056D3(this.f7717a, this.f7718b, this.f7719c, compoundButton, z);
    }
}
