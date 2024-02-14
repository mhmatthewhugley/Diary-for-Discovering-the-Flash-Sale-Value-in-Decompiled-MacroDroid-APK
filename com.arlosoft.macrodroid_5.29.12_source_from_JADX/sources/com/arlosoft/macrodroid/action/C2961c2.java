package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.action.c2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2961c2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f8085a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f8086b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f8087c;

    public /* synthetic */ C2961c2(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f8085a = radioButton;
        this.f8086b = radioButton2;
        this.f8087c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ClearNotificationsAction.m10058F3(this.f8085a, this.f8086b, this.f8087c, compoundButton, z);
    }
}
