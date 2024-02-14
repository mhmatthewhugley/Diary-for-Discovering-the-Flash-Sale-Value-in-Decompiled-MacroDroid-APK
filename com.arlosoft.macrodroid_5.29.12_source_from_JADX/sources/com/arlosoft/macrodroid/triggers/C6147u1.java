package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.u1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6147u1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CallBasedTrigger f14610a;

    /* renamed from: c */
    public final /* synthetic */ EditText f14611c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f14612d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f14613f;

    public /* synthetic */ C6147u1(CallBasedTrigger callBasedTrigger, EditText editText, CheckBox checkBox, AppCompatDialog appCompatDialog) {
        this.f14610a = callBasedTrigger;
        this.f14611c = editText;
        this.f14612d = checkBox;
        this.f14613f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14610a.m21851B3(this.f14611c, this.f14612d, this.f14613f, view);
    }
}
