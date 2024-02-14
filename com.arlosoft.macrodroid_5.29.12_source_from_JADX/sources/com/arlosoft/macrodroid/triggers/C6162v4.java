package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.v4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6162v4 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LocationTrigger f14645a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14646c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f14647d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f14648f;

    public /* synthetic */ C6162v4(LocationTrigger locationTrigger, RadioButton radioButton, CheckBox checkBox, AppCompatDialog appCompatDialog) {
        this.f14645a = locationTrigger;
        this.f14646c = radioButton;
        this.f14647d = checkBox;
        this.f14648f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14645a.m22610q3(this.f14646c, this.f14647d, this.f14648f, view);
    }
}
