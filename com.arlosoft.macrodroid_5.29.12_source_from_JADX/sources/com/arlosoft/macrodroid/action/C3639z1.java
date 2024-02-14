package com.arlosoft.macrodroid.action;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.action.z1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3639z1 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f9662a;

    /* renamed from: b */
    public final /* synthetic */ Button f9663b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f9664c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f9665d;

    /* renamed from: e */
    public final /* synthetic */ RadioButton f9666e;

    public /* synthetic */ C3639z1(EditText editText, Button button, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f9662a = editText;
        this.f9663b = button;
        this.f9664c = radioButton;
        this.f9665d = radioButton2;
        this.f9666e = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ClearNotificationsAction.m10055C3(this.f9662a, this.f9663b, this.f9664c, this.f9665d, this.f9666e, compoundButton, z);
    }
}
