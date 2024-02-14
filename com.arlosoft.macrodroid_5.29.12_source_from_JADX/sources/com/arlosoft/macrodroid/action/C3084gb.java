package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.action.gb */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3084gb implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f8367a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f8368b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f8369c;

    public /* synthetic */ C3084gb(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f8367a = radioButton;
        this.f8368b = radioButton2;
        this.f8369c = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        NotificationInteractionAction.m11602A3(this.f8367a, this.f8368b, this.f8369c, compoundButton, z);
    }
}
