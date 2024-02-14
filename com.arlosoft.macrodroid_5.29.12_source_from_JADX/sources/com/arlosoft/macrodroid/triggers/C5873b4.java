package com.arlosoft.macrodroid.triggers;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.triggers.b4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5873b4 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f13937a;

    /* renamed from: b */
    public final /* synthetic */ Button f13938b;

    /* renamed from: c */
    public final /* synthetic */ Button f13939c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f13940d;

    /* renamed from: e */
    public final /* synthetic */ RadioButton f13941e;

    /* renamed from: f */
    public final /* synthetic */ RadioButton f13942f;

    public /* synthetic */ C5873b4(EditText editText, Button button, Button button2, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f13937a = editText;
        this.f13938b = button;
        this.f13939c = button2;
        this.f13940d = radioButton;
        this.f13941e = radioButton2;
        this.f13942f = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        IncomingSMSTrigger.m22364S3(this.f13937a, this.f13938b, this.f13939c, this.f13940d, this.f13941e, this.f13942f, compoundButton, z);
    }
}
