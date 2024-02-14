package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.k4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3189k4 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DisableMacroAction f8577a;

    /* renamed from: c */
    public final /* synthetic */ EditText f8578c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f8579d;

    public /* synthetic */ C3189k4(DisableMacroAction disableMacroAction, EditText editText, AppCompatDialog appCompatDialog) {
        this.f8577a = disableMacroAction;
        this.f8578c = editText;
        this.f8579d = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f8577a.m10484v3(this.f8578c, this.f8579d, view);
    }
}
