package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.kd */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3198kd implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ PebbleAction f8592a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f8593c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8594d;

    /* renamed from: f */
    public final /* synthetic */ Spinner f8595f;

    /* renamed from: g */
    public final /* synthetic */ Spinner f8596g;

    /* renamed from: o */
    public final /* synthetic */ AppCompatDialog f8597o;

    public /* synthetic */ C3198kd(PebbleAction pebbleAction, RadioButton radioButton, EditText editText, Spinner spinner, Spinner spinner2, AppCompatDialog appCompatDialog) {
        this.f8592a = pebbleAction;
        this.f8593c = radioButton;
        this.f8594d = editText;
        this.f8595f = spinner;
        this.f8596g = spinner2;
        this.f8597o = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f8592a.m11812P3(this.f8593c, this.f8594d, this.f8595f, this.f8596g, this.f8597o, view);
    }
}
