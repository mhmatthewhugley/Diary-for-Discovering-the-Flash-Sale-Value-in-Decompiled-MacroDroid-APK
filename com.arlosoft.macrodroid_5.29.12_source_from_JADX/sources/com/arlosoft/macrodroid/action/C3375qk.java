package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.qk */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3375qk implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ShellScriptAction f8983a;

    /* renamed from: c */
    public final /* synthetic */ CheckBox f8984c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8985d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f8986f;

    /* renamed from: g */
    public final /* synthetic */ RadioButton f8987g;

    /* renamed from: o */
    public final /* synthetic */ CheckBox f8988o;

    /* renamed from: p */
    public final /* synthetic */ Spinner f8989p;

    /* renamed from: s */
    public final /* synthetic */ Activity f8990s;

    public /* synthetic */ C3375qk(ShellScriptAction shellScriptAction, CheckBox checkBox, EditText editText, AppCompatDialog appCompatDialog, RadioButton radioButton, CheckBox checkBox2, Spinner spinner, Activity activity) {
        this.f8983a = shellScriptAction;
        this.f8984c = checkBox;
        this.f8985d = editText;
        this.f8986f = appCompatDialog;
        this.f8987g = radioButton;
        this.f8988o = checkBox2;
        this.f8989p = spinner;
        this.f8990s = activity;
    }

    public final void onClick(View view) {
        ShellScriptAction.m12998C3(this.f8983a, this.f8984c, this.f8985d, this.f8986f, this.f8987g, this.f8988o, this.f8989p, this.f8990s, view);
    }
}
