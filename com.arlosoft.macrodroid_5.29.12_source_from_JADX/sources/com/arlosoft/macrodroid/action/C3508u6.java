package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.u6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3508u6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ForceMacroRunAction f9341a;

    /* renamed from: c */
    public final /* synthetic */ EditText f9342c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f9343d;

    public /* synthetic */ C3508u6(ForceMacroRunAction forceMacroRunAction, EditText editText, AppCompatDialog appCompatDialog) {
        this.f9341a = forceMacroRunAction;
        this.f9342c = editText;
        this.f9343d = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9341a.m10853K3(this.f9342c, this.f9343d, view);
    }
}
