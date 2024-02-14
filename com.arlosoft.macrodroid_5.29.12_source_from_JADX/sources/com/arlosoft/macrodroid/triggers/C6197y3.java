package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.y3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6197y3 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ IncomingSMSTrigger f14731a;

    /* renamed from: c */
    public final /* synthetic */ EditText f14732c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f14733d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f14734f;

    public /* synthetic */ C6197y3(IncomingSMSTrigger incomingSMSTrigger, EditText editText, CheckBox checkBox, AppCompatDialog appCompatDialog) {
        this.f14731a = incomingSMSTrigger;
        this.f14732c = editText;
        this.f14733d = checkBox;
        this.f14734f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14731a.m22372a4(this.f14732c, this.f14733d, this.f14734f, view);
    }
}
