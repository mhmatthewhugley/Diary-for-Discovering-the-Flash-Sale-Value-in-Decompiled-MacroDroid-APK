package com.arlosoft.macrodroid.constraint;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.constraint.v1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4333v1 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ MacroDroidVariableConstraint f11031a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f11032b;

    /* renamed from: c */
    public final /* synthetic */ EditText f11033c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f11034d;

    /* renamed from: e */
    public final /* synthetic */ EditText f11035e;

    /* renamed from: f */
    public final /* synthetic */ Button f11036f;

    /* renamed from: g */
    public final /* synthetic */ LinearLayout f11037g;

    /* renamed from: h */
    public final /* synthetic */ Spinner f11038h;

    /* renamed from: i */
    public final /* synthetic */ Button f11039i;

    /* renamed from: j */
    public final /* synthetic */ RadioButton f11040j;

    public /* synthetic */ C4333v1(MacroDroidVariableConstraint macroDroidVariableConstraint, RadioButton radioButton, EditText editText, RadioButton radioButton2, EditText editText2, Button button, LinearLayout linearLayout, Spinner spinner, Button button2, RadioButton radioButton3) {
        this.f11031a = macroDroidVariableConstraint;
        this.f11032b = radioButton;
        this.f11033c = editText;
        this.f11034d = radioButton2;
        this.f11035e = editText2;
        this.f11036f = button;
        this.f11037g = linearLayout;
        this.f11038h = spinner;
        this.f11039i = button2;
        this.f11040j = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f11031a.m16718F3(this.f11032b, this.f11033c, this.f11034d, this.f11035e, this.f11036f, this.f11037g, this.f11038h, this.f11039i, this.f11040j, compoundButton, z);
    }
}
