package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.e9 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5914e9 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WeatherTrigger f14024a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14025c;

    /* renamed from: d */
    public final /* synthetic */ EditText f14026d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f14027f;

    public /* synthetic */ C5914e9(WeatherTrigger weatherTrigger, RadioButton radioButton, EditText editText, AppCompatDialog appCompatDialog) {
        this.f14024a = weatherTrigger;
        this.f14025c = radioButton;
        this.f14026d = editText;
        this.f14027f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14024a.m23570C3(this.f14025c, this.f14026d, this.f14027f, view);
    }
}
