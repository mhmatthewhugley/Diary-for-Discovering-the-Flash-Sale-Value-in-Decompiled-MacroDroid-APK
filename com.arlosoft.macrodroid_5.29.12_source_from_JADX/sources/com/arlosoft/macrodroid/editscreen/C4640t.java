package com.arlosoft.macrodroid.editscreen;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.editscreen.t */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4640t implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditMacroActivity f11710a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f11711c;

    /* renamed from: d */
    public final /* synthetic */ EditText f11712d;

    public /* synthetic */ C4640t(EditMacroActivity editMacroActivity, AppCompatDialog appCompatDialog, EditText editText) {
        this.f11710a = editMacroActivity;
        this.f11711c = appCompatDialog;
        this.f11712d = editText;
    }

    public final void onClick(View view) {
        EditMacroActivity.m17948y3(this.f11710a, this.f11711c, this.f11712d, view);
    }
}
