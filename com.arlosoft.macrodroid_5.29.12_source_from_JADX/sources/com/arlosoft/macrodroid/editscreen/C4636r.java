package com.arlosoft.macrodroid.editscreen;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.editscreen.r */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4636r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditMacroActivity f11701a;

    /* renamed from: c */
    public final /* synthetic */ EditText f11702c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f11703d;

    public /* synthetic */ C4636r(EditMacroActivity editMacroActivity, EditText editText, AppCompatDialog appCompatDialog) {
        this.f11701a = editMacroActivity;
        this.f11702c = editText;
        this.f11703d = appCompatDialog;
    }

    public final void onClick(View view) {
        EditMacroActivity.m17946x4(this.f11701a, this.f11702c, this.f11703d, view);
    }
}
