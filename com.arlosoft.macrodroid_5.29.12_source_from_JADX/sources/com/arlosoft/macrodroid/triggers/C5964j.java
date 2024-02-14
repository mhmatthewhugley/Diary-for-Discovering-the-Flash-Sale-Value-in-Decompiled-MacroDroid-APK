package com.arlosoft.macrodroid.triggers;

import android.view.View;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5964j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ApplicationLaunchedTrigger f14121a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f14122c;

    public /* synthetic */ C5964j(ApplicationLaunchedTrigger applicationLaunchedTrigger, AppCompatDialog appCompatDialog) {
        this.f14121a = applicationLaunchedTrigger;
        this.f14122c = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14121a.m21513P3(this.f14122c, view);
    }
}
