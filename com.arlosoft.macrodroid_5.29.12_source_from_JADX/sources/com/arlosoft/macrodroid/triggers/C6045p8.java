package com.arlosoft.macrodroid.triggers;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.triggers.p8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6045p8 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ VariableTrigger f14292a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f14293b;

    /* renamed from: c */
    public final /* synthetic */ EditText f14294c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f14295d;

    /* renamed from: e */
    public final /* synthetic */ Spinner f14296e;

    /* renamed from: f */
    public final /* synthetic */ EditText f14297f;

    /* renamed from: g */
    public final /* synthetic */ Button f14298g;

    /* renamed from: h */
    public final /* synthetic */ LinearLayout f14299h;

    /* renamed from: i */
    public final /* synthetic */ Button f14300i;

    /* renamed from: j */
    public final /* synthetic */ RadioButton f14301j;

    public /* synthetic */ C6045p8(VariableTrigger variableTrigger, RadioButton radioButton, EditText editText, RadioButton radioButton2, Spinner spinner, EditText editText2, Button button, LinearLayout linearLayout, Button button2, RadioButton radioButton3) {
        this.f14292a = variableTrigger;
        this.f14293b = radioButton;
        this.f14294c = editText;
        this.f14295d = radioButton2;
        this.f14296e = spinner;
        this.f14297f = editText2;
        this.f14298g = button;
        this.f14299h = linearLayout;
        this.f14300i = button2;
        this.f14301j = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f14292a.m23442n4(this.f14293b, this.f14294c, this.f14295d, this.f14296e, this.f14297f, this.f14298g, this.f14299h, this.f14300i, this.f14301j, compoundButton, z);
    }
}
