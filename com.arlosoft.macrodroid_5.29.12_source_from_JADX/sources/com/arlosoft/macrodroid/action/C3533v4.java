package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.v4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3533v4 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ExportMacrosAction f9398a;

    /* renamed from: c */
    public final /* synthetic */ EditText f9399c;

    /* renamed from: d */
    public final /* synthetic */ TextView f9400d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f9401f;

    public /* synthetic */ C3533v4(ExportMacrosAction exportMacrosAction, EditText editText, TextView textView, AppCompatDialog appCompatDialog) {
        this.f9398a = exportMacrosAction;
        this.f9399c = editText;
        this.f9400d = textView;
        this.f9401f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9398a.m10624q3(this.f9399c, this.f9400d, this.f9401f, view);
    }
}
