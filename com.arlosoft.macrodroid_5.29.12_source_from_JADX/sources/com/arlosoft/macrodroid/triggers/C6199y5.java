package com.arlosoft.macrodroid.triggers;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.triggers.y5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6199y5 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f14736a;

    /* renamed from: b */
    public final /* synthetic */ Button f14737b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14738c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f14739d;

    /* renamed from: e */
    public final /* synthetic */ RadioButton f14740e;

    public /* synthetic */ C6199y5(EditText editText, Button button, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f14736a = editText;
        this.f14737b = button;
        this.f14738c = radioButton;
        this.f14739d = radioButton2;
        this.f14740e = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        NotificationTrigger.m22821O3(this.f14736a, this.f14737b, this.f14738c, this.f14739d, this.f14740e, compoundButton, z);
    }
}
