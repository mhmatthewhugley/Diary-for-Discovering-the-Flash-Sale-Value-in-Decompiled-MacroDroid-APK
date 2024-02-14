package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.d7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2994d7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Spinner f8179a;

    /* renamed from: c */
    public final /* synthetic */ Spinner f8180c;

    /* renamed from: d */
    public final /* synthetic */ JsonOutputAction f8181d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f8182f;

    public /* synthetic */ C2994d7(Spinner spinner, Spinner spinner2, JsonOutputAction jsonOutputAction, AppCompatDialog appCompatDialog) {
        this.f8179a = spinner;
        this.f8180c = spinner2;
        this.f8181d = jsonOutputAction;
        this.f8182f = appCompatDialog;
    }

    public final void onClick(View view) {
        JsonOutputAction.m11072t3(this.f8179a, this.f8180c, this.f8181d, this.f8182f, view);
    }
}
