package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.triggers.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5988l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ApplicationLaunchedTrigger f14162a;

    /* renamed from: c */
    public final /* synthetic */ C10351d f14163c;

    /* renamed from: d */
    public final /* synthetic */ Activity f14164d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f14165f;

    public /* synthetic */ C5988l(ApplicationLaunchedTrigger applicationLaunchedTrigger, C10351d dVar, Activity activity, AppCompatDialog appCompatDialog) {
        this.f14162a = applicationLaunchedTrigger;
        this.f14163c = dVar;
        this.f14164d = activity;
        this.f14165f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14162a.m21512O3(this.f14163c, this.f14164d, this.f14165f, view);
    }
}
