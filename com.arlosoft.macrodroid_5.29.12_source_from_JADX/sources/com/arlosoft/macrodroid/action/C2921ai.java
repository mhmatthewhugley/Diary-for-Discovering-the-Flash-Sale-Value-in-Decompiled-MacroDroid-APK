package com.arlosoft.macrodroid.action;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.action.ai */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2921ai implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f7994a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f7995b;

    /* renamed from: c */
    public final /* synthetic */ Button f7996c;

    public /* synthetic */ C2921ai(EditText editText, RadioButton radioButton, Button button) {
        this.f7994a = editText;
        this.f7995b = radioButton;
        this.f7996c = button;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SetVariableAction.m12716z4(this.f7994a, this.f7995b, this.f7996c, compoundButton, z);
    }
}
