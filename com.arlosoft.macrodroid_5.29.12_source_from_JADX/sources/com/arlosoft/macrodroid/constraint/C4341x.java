package com.arlosoft.macrodroid.constraint;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.constraint.x */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4341x implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ClipboardConstraint f11058a;

    /* renamed from: c */
    public final /* synthetic */ EditText f11059c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f11060d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f11061f;

    public /* synthetic */ C4341x(ClipboardConstraint clipboardConstraint, EditText editText, CheckBox checkBox, AppCompatDialog appCompatDialog) {
        this.f11058a = clipboardConstraint;
        this.f11059c = editText;
        this.f11060d = checkBox;
        this.f11061f = appCompatDialog;
    }

    public final void onClick(View view) {
        ClipboardConstraint.m16331k3(this.f11058a, this.f11059c, this.f11060d, this.f11061f, view);
    }
}
