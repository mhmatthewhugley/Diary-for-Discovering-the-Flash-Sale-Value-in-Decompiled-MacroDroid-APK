package com.arlosoft.macrodroid.triggers;

import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.triggers.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5928g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ApplicationInstalledRemovedTrigger f14052a;

    /* renamed from: c */
    public final /* synthetic */ C10351d f14053c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f14054d;

    public /* synthetic */ C5928g(ApplicationInstalledRemovedTrigger applicationInstalledRemovedTrigger, C10351d dVar, AppCompatDialog appCompatDialog) {
        this.f14052a = applicationInstalledRemovedTrigger;
        this.f14053c = dVar;
        this.f14054d = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14052a.m21478v3(this.f14053c, this.f14054d, view);
    }
}
