package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.yh */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3628yh implements View.OnClickListener {

    /* renamed from: A */
    public final /* synthetic */ CheckBox f9634A;

    /* renamed from: B */
    public final /* synthetic */ AppCompatDialog f9635B;

    /* renamed from: a */
    public final /* synthetic */ SetVariableAction f9636a;

    /* renamed from: c */
    public final /* synthetic */ EditText f9637c;

    /* renamed from: d */
    public final /* synthetic */ EditText f9638d;

    /* renamed from: f */
    public final /* synthetic */ CheckBox f9639f;

    /* renamed from: g */
    public final /* synthetic */ CheckBox f9640g;

    /* renamed from: o */
    public final /* synthetic */ CheckBox f9641o;

    /* renamed from: p */
    public final /* synthetic */ CheckBox f9642p;

    /* renamed from: s */
    public final /* synthetic */ EditText f9643s;

    /* renamed from: z */
    public final /* synthetic */ EditText f9644z;

    public /* synthetic */ C3628yh(SetVariableAction setVariableAction, EditText editText, EditText editText2, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, EditText editText3, EditText editText4, CheckBox checkBox5, AppCompatDialog appCompatDialog) {
        this.f9636a = setVariableAction;
        this.f9637c = editText;
        this.f9638d = editText2;
        this.f9639f = checkBox;
        this.f9640g = checkBox2;
        this.f9641o = checkBox3;
        this.f9642p = checkBox4;
        this.f9643s = editText3;
        this.f9644z = editText4;
        this.f9634A = checkBox5;
        this.f9635B = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9636a.m12700r4(this.f9637c, this.f9638d, this.f9639f, this.f9640g, this.f9641o, this.f9642p, this.f9643s, this.f9644z, this.f9634A, this.f9635B, view);
    }
}
