package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.mn */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3264mn implements View.OnClickListener {

    /* renamed from: A */
    public final /* synthetic */ CheckBox f8714A;

    /* renamed from: B */
    public final /* synthetic */ AppCompatDialog f8715B;

    /* renamed from: a */
    public final /* synthetic */ ToastAction f8716a;

    /* renamed from: c */
    public final /* synthetic */ CheckBox f8717c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f8718d;

    /* renamed from: f */
    public final /* synthetic */ EditText f8719f;

    /* renamed from: g */
    public final /* synthetic */ Spinner f8720g;

    /* renamed from: o */
    public final /* synthetic */ Spinner f8721o;

    /* renamed from: p */
    public final /* synthetic */ Spinner f8722p;

    /* renamed from: s */
    public final /* synthetic */ RadioButton f8723s;

    /* renamed from: z */
    public final /* synthetic */ CheckBox f8724z;

    public /* synthetic */ C3264mn(ToastAction toastAction, CheckBox checkBox, CheckBox checkBox2, EditText editText, Spinner spinner, Spinner spinner2, Spinner spinner3, RadioButton radioButton, CheckBox checkBox3, CheckBox checkBox4, AppCompatDialog appCompatDialog) {
        this.f8716a = toastAction;
        this.f8717c = checkBox;
        this.f8718d = checkBox2;
        this.f8719f = editText;
        this.f8720g = spinner;
        this.f8721o = spinner2;
        this.f8722p = spinner3;
        this.f8723s = radioButton;
        this.f8724z = checkBox3;
        this.f8714A = checkBox4;
        this.f8715B = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f8716a.m13393C3(this.f8717c, this.f8718d, this.f8719f, this.f8720g, this.f8721o, this.f8722p, this.f8723s, this.f8724z, this.f8714A, this.f8715B, view);
    }
}
