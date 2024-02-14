package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.v6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3535v6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ForceMacroRunAction f9405a;

    /* renamed from: c */
    public final /* synthetic */ EditText f9406c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f9407d;

    public /* synthetic */ C3535v6(ForceMacroRunAction forceMacroRunAction, EditText editText, AppCompatDialog appCompatDialog) {
        this.f9405a = forceMacroRunAction;
        this.f9406c = editText;
        this.f9407d = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9405a.m10858P3(this.f9406c, this.f9407d, view);
    }
}
