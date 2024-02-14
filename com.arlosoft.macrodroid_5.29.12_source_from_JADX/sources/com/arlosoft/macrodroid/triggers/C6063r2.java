package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.r2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6063r2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FailedLoginTrigger f14333a;

    /* renamed from: c */
    public final /* synthetic */ Spinner f14334c;

    /* renamed from: d */
    public final /* synthetic */ Spinner f14335d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f14336f;

    public /* synthetic */ C6063r2(FailedLoginTrigger failedLoginTrigger, Spinner spinner, Spinner spinner2, AppCompatDialog appCompatDialog) {
        this.f14333a = failedLoginTrigger;
        this.f14334c = spinner;
        this.f14335d = spinner2;
        this.f14336f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14333a.m22143l3(this.f14334c, this.f14335d, this.f14336f, view);
    }
}
