package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.m2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6003m2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DialNumberTrigger f14186a;

    /* renamed from: c */
    public final /* synthetic */ EditText f14187c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f14188d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f14189f;

    public /* synthetic */ C6003m2(DialNumberTrigger dialNumberTrigger, EditText editText, RadioButton radioButton, AppCompatDialog appCompatDialog) {
        this.f14186a = dialNumberTrigger;
        this.f14187c = editText;
        this.f14188d = radioButton;
        this.f14189f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14186a.m22075j3(this.f14187c, this.f14188d, this.f14189f, view);
    }
}
