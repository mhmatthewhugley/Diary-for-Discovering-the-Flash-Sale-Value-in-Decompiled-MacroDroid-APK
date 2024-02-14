package com.arlosoft.macrodroid.triggers;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.triggers.e8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5913e8 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ VariableTrigger f14014a;

    /* renamed from: b */
    public final /* synthetic */ Spinner f14015b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14016c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f14017d;

    /* renamed from: e */
    public final /* synthetic */ EditText f14018e;

    /* renamed from: f */
    public final /* synthetic */ Button f14019f;

    /* renamed from: g */
    public final /* synthetic */ LinearLayout f14020g;

    /* renamed from: h */
    public final /* synthetic */ EditText f14021h;

    /* renamed from: i */
    public final /* synthetic */ Button f14022i;

    /* renamed from: j */
    public final /* synthetic */ RadioButton f14023j;

    public /* synthetic */ C5913e8(VariableTrigger variableTrigger, Spinner spinner, RadioButton radioButton, RadioButton radioButton2, EditText editText, Button button, LinearLayout linearLayout, EditText editText2, Button button2, RadioButton radioButton3) {
        this.f14014a = variableTrigger;
        this.f14015b = spinner;
        this.f14016c = radioButton;
        this.f14017d = radioButton2;
        this.f14018e = editText;
        this.f14019f = button;
        this.f14020g = linearLayout;
        this.f14021h = editText2;
        this.f14022i = button2;
        this.f14023j = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f14014a.m23438l4(this.f14015b, this.f14016c, this.f14017d, this.f14018e, this.f14019f, this.f14020g, this.f14021h, this.f14022i, this.f14023j, compoundButton, z);
    }
}
