package com.arlosoft.macrodroid.triggers;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.triggers.o8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6033o8 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ VariableTrigger f14256a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f14257b;

    /* renamed from: c */
    public final /* synthetic */ EditText f14258c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f14259d;

    /* renamed from: e */
    public final /* synthetic */ EditText f14260e;

    /* renamed from: f */
    public final /* synthetic */ Button f14261f;

    /* renamed from: g */
    public final /* synthetic */ LinearLayout f14262g;

    /* renamed from: h */
    public final /* synthetic */ Spinner f14263h;

    /* renamed from: i */
    public final /* synthetic */ Button f14264i;

    /* renamed from: j */
    public final /* synthetic */ RadioButton f14265j;

    public /* synthetic */ C6033o8(VariableTrigger variableTrigger, RadioButton radioButton, EditText editText, RadioButton radioButton2, EditText editText2, Button button, LinearLayout linearLayout, Spinner spinner, Button button2, RadioButton radioButton3) {
        this.f14256a = variableTrigger;
        this.f14257b = radioButton;
        this.f14258c = editText;
        this.f14259d = radioButton2;
        this.f14260e = editText2;
        this.f14261f = button;
        this.f14262g = linearLayout;
        this.f14263h = spinner;
        this.f14264i = button2;
        this.f14265j = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f14256a.m23440m4(this.f14257b, this.f14258c, this.f14259d, this.f14260e, this.f14261f, this.f14262g, this.f14263h, this.f14264i, this.f14265j, compoundButton, z);
    }
}
