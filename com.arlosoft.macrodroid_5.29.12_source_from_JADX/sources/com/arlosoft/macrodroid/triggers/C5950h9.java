package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.h9 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5950h9 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WeatherTrigger f14092a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14093c;

    /* renamed from: d */
    public final /* synthetic */ Spinner f14094d;

    /* renamed from: f */
    public final /* synthetic */ EditText f14095f;

    /* renamed from: g */
    public final /* synthetic */ AppCompatDialog f14096g;

    public /* synthetic */ C5950h9(WeatherTrigger weatherTrigger, RadioButton radioButton, Spinner spinner, EditText editText, AppCompatDialog appCompatDialog) {
        this.f14092a = weatherTrigger;
        this.f14093c = radioButton;
        this.f14094d = spinner;
        this.f14095f = editText;
        this.f14096g = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14092a.m23594y3(this.f14093c, this.f14094d, this.f14095f, this.f14096g, view);
    }
}
