package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.nh */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3286nh implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetQuickSettingsStateAction f8783a;

    /* renamed from: c */
    public final /* synthetic */ CheckBox f8784c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f8785d;

    /* renamed from: f */
    public final /* synthetic */ CheckBox f8786f;

    /* renamed from: g */
    public final /* synthetic */ Activity f8787g;

    /* renamed from: o */
    public final /* synthetic */ RadioButton f8788o;

    /* renamed from: p */
    public final /* synthetic */ EditText f8789p;

    /* renamed from: s */
    public final /* synthetic */ AppCompatDialog f8790s;

    public /* synthetic */ C3286nh(SetQuickSettingsStateAction setQuickSettingsStateAction, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, Activity activity, RadioButton radioButton, EditText editText, AppCompatDialog appCompatDialog) {
        this.f8783a = setQuickSettingsStateAction;
        this.f8784c = checkBox;
        this.f8785d = checkBox2;
        this.f8786f = checkBox3;
        this.f8787g = activity;
        this.f8788o = radioButton;
        this.f8789p = editText;
        this.f8790s = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f8783a.m12582G3(this.f8784c, this.f8785d, this.f8786f, this.f8787g, this.f8788o, this.f8789p, this.f8790s, view);
    }
}
