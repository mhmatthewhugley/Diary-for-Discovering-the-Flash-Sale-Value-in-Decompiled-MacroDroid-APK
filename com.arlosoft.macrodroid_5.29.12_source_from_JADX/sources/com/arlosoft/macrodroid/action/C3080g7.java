package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.g7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3080g7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Spinner f8358a;

    /* renamed from: c */
    public final /* synthetic */ Spinner f8359c;

    /* renamed from: d */
    public final /* synthetic */ JsonParseAction f8360d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f8361f;

    public /* synthetic */ C3080g7(Spinner spinner, Spinner spinner2, JsonParseAction jsonParseAction, AppCompatDialog appCompatDialog) {
        this.f8358a = spinner;
        this.f8359c = spinner2;
        this.f8360d = jsonParseAction;
        this.f8361f = appCompatDialog;
    }

    public final void onClick(View view) {
        JsonParseAction.m11105s3(this.f8358a, this.f8359c, this.f8360d, this.f8361f, view);
    }
}
