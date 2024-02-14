package com.arlosoft.macrodroid.constraint;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.constraint.w1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4338w1 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ MacroDroidVariableConstraint f11045a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f11046b;

    /* renamed from: c */
    public final /* synthetic */ EditText f11047c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f11048d;

    /* renamed from: e */
    public final /* synthetic */ Spinner f11049e;

    /* renamed from: f */
    public final /* synthetic */ EditText f11050f;

    /* renamed from: g */
    public final /* synthetic */ Button f11051g;

    /* renamed from: h */
    public final /* synthetic */ LinearLayout f11052h;

    /* renamed from: i */
    public final /* synthetic */ Button f11053i;

    /* renamed from: j */
    public final /* synthetic */ RadioButton f11054j;

    public /* synthetic */ C4338w1(MacroDroidVariableConstraint macroDroidVariableConstraint, RadioButton radioButton, EditText editText, RadioButton radioButton2, Spinner spinner, EditText editText2, Button button, LinearLayout linearLayout, Button button2, RadioButton radioButton3) {
        this.f11045a = macroDroidVariableConstraint;
        this.f11046b = radioButton;
        this.f11047c = editText;
        this.f11048d = radioButton2;
        this.f11049e = spinner;
        this.f11050f = editText2;
        this.f11051g = button;
        this.f11052h = linearLayout;
        this.f11053i = button2;
        this.f11054j = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f11045a.m16719G3(this.f11046b, this.f11047c, this.f11048d, this.f11049e, this.f11050f, this.f11051g, this.f11052h, this.f11053i, this.f11054j, compoundButton, z);
    }
}
