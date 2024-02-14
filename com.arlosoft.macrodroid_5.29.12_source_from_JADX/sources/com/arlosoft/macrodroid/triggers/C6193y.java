package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.triggers.y */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6193y implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ApplicationLaunchedTrigger f14722a;

    /* renamed from: c */
    public final /* synthetic */ Activity f14723c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f14724d;

    public /* synthetic */ C6193y(ApplicationLaunchedTrigger applicationLaunchedTrigger, Activity activity, C4023j0.C4028e eVar) {
        this.f14722a = applicationLaunchedTrigger;
        this.f14723c = activity;
        this.f14724d = eVar;
    }

    public final void onClick(View view) {
        this.f14722a.m21524a4(this.f14723c, this.f14724d, view);
    }
}
