package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.z3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6209z3 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ IncomingSMSTrigger f14759a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14760c;

    /* renamed from: d */
    public final /* synthetic */ EditText f14761d;

    /* renamed from: f */
    public final /* synthetic */ RadioButton f14762f;

    /* renamed from: g */
    public final /* synthetic */ RadioButton f14763g;

    /* renamed from: o */
    public final /* synthetic */ CheckBox f14764o;

    /* renamed from: p */
    public final /* synthetic */ CheckBox f14765p;

    /* renamed from: s */
    public final /* synthetic */ AppCompatDialog f14766s;

    public /* synthetic */ C6209z3(IncomingSMSTrigger incomingSMSTrigger, RadioButton radioButton, EditText editText, RadioButton radioButton2, RadioButton radioButton3, CheckBox checkBox, CheckBox checkBox2, AppCompatDialog appCompatDialog) {
        this.f14759a = incomingSMSTrigger;
        this.f14760c = radioButton;
        this.f14761d = editText;
        this.f14762f = radioButton2;
        this.f14763g = radioButton3;
        this.f14764o = checkBox;
        this.f14765p = checkBox2;
        this.f14766s = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14759a.m22360O3(this.f14760c, this.f14761d, this.f14762f, this.f14763g, this.f14764o, this.f14765p, this.f14766s, view);
    }
}
