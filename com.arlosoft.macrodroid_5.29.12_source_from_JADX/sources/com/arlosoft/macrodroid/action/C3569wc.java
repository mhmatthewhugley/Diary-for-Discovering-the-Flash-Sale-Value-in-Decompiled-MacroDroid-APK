package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.wc */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3569wc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ PebbleAction f9485a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f9486c;

    /* renamed from: d */
    public final /* synthetic */ EditText f9487d;

    /* renamed from: f */
    public final /* synthetic */ EditText f9488f;

    public /* synthetic */ C3569wc(PebbleAction pebbleAction, AppCompatDialog appCompatDialog, EditText editText, EditText editText2) {
        this.f9485a = pebbleAction;
        this.f9486c = appCompatDialog;
        this.f9487d = editText;
        this.f9488f = editText2;
    }

    public final void onClick(View view) {
        this.f9485a.m11803G3(this.f9486c, this.f9487d, this.f9488f, view);
    }
}
