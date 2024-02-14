package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.t6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3472t6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ForceMacroRunAction f9252a;

    /* renamed from: c */
    public final /* synthetic */ CheckBox f9253c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f9254d;

    /* renamed from: f */
    public final /* synthetic */ CheckBox f9255f;

    /* renamed from: g */
    public final /* synthetic */ AppCompatDialog f9256g;

    public /* synthetic */ C3472t6(ForceMacroRunAction forceMacroRunAction, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, AppCompatDialog appCompatDialog) {
        this.f9252a = forceMacroRunAction;
        this.f9253c = checkBox;
        this.f9254d = checkBox2;
        this.f9255f = checkBox3;
        this.f9256g = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9252a.m10850H3(this.f9253c, this.f9254d, this.f9255f, this.f9256g, view);
    }
}
