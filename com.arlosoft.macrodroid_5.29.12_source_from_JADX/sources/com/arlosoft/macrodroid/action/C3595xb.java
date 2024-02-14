package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.xb */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3595xb implements View.OnClickListener {

    /* renamed from: A */
    public final /* synthetic */ Spinner f9561A;

    /* renamed from: B */
    public final /* synthetic */ CheckBox f9562B;

    /* renamed from: a */
    public final /* synthetic */ OpenWebPageAction f9563a;

    /* renamed from: c */
    public final /* synthetic */ CheckBox f9564c;

    /* renamed from: d */
    public final /* synthetic */ EditText f9565d;

    /* renamed from: f */
    public final /* synthetic */ CheckBox f9566f;

    /* renamed from: g */
    public final /* synthetic */ CheckBox f9567g;

    /* renamed from: o */
    public final /* synthetic */ AppCompatDialog f9568o;

    /* renamed from: p */
    public final /* synthetic */ CheckBox f9569p;

    /* renamed from: s */
    public final /* synthetic */ Spinner f9570s;

    /* renamed from: z */
    public final /* synthetic */ CheckBox f9571z;

    public /* synthetic */ C3595xb(OpenWebPageAction openWebPageAction, CheckBox checkBox, EditText editText, CheckBox checkBox2, CheckBox checkBox3, AppCompatDialog appCompatDialog, CheckBox checkBox4, Spinner spinner, CheckBox checkBox5, Spinner spinner2, CheckBox checkBox6) {
        this.f9563a = openWebPageAction;
        this.f9564c = checkBox;
        this.f9565d = editText;
        this.f9566f = checkBox2;
        this.f9567g = checkBox3;
        this.f9568o = appCompatDialog;
        this.f9569p = checkBox4;
        this.f9570s = spinner;
        this.f9571z = checkBox5;
        this.f9561A = spinner2;
        this.f9562B = checkBox6;
    }

    public final void onClick(View view) {
        this.f9563a.m11688B3(this.f9564c, this.f9565d, this.f9566f, this.f9567g, this.f9568o, this.f9569p, this.f9570s, this.f9571z, this.f9561A, this.f9562B, view);
    }
}
