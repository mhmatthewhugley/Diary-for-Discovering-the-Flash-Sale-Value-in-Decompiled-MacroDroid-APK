package com.arlosoft.macrodroid.constraint;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.constraint.x1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4343x1 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ MacroDroidVariableConstraint f11065a;

    /* renamed from: b */
    public final /* synthetic */ Spinner f11066b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f11067c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f11068d;

    /* renamed from: e */
    public final /* synthetic */ EditText f11069e;

    /* renamed from: f */
    public final /* synthetic */ Button f11070f;

    /* renamed from: g */
    public final /* synthetic */ LinearLayout f11071g;

    /* renamed from: h */
    public final /* synthetic */ EditText f11072h;

    /* renamed from: i */
    public final /* synthetic */ Button f11073i;

    /* renamed from: j */
    public final /* synthetic */ RadioButton f11074j;

    public /* synthetic */ C4343x1(MacroDroidVariableConstraint macroDroidVariableConstraint, Spinner spinner, RadioButton radioButton, RadioButton radioButton2, EditText editText, Button button, LinearLayout linearLayout, EditText editText2, Button button2, RadioButton radioButton3) {
        this.f11065a = macroDroidVariableConstraint;
        this.f11066b = spinner;
        this.f11067c = radioButton;
        this.f11068d = radioButton2;
        this.f11069e = editText;
        this.f11070f = button;
        this.f11071g = linearLayout;
        this.f11072h = editText2;
        this.f11073i = button2;
        this.f11074j = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f11065a.m16717E3(this.f11066b, this.f11067c, this.f11068d, this.f11069e, this.f11070f, this.f11071g, this.f11072h, this.f11073i, this.f11074j, compoundButton, z);
    }
}
