package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.t6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6140t6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SMSSentTrigger f14595a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14596c;

    /* renamed from: d */
    public final /* synthetic */ EditText f14597d;

    /* renamed from: f */
    public final /* synthetic */ RadioButton f14598f;

    /* renamed from: g */
    public final /* synthetic */ RadioButton f14599g;

    /* renamed from: o */
    public final /* synthetic */ AppCompatDialog f14600o;

    public /* synthetic */ C6140t6(SMSSentTrigger sMSSentTrigger, RadioButton radioButton, EditText editText, RadioButton radioButton2, RadioButton radioButton3, AppCompatDialog appCompatDialog) {
        this.f14595a = sMSSentTrigger;
        this.f14596c = radioButton;
        this.f14597d = editText;
        this.f14598f = radioButton2;
        this.f14599g = radioButton3;
        this.f14600o = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14595a.m23062z3(this.f14596c, this.f14597d, this.f14598f, this.f14599g, this.f14600o, view);
    }
}
