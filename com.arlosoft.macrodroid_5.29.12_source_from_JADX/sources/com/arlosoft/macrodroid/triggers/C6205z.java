package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.z */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6205z implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ApplicationLaunchedTrigger f14750a;

    /* renamed from: c */
    public final /* synthetic */ EditText f14751c;

    /* renamed from: d */
    public final /* synthetic */ Activity f14752d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f14753f;

    public /* synthetic */ C6205z(ApplicationLaunchedTrigger applicationLaunchedTrigger, EditText editText, Activity activity, AppCompatDialog appCompatDialog) {
        this.f14750a = applicationLaunchedTrigger;
        this.f14751c = editText;
        this.f14752d = activity;
        this.f14753f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14750a.m21525b4(this.f14751c, this.f14752d, this.f14753f, view);
    }
}
