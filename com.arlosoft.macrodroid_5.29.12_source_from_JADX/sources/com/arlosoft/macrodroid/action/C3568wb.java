package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.wb */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3568wb implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OpenWebPageAction f9482a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9483c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9484d;

    public /* synthetic */ C3568wb(OpenWebPageAction openWebPageAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9482a = openWebPageAction;
        this.f9483c = activity;
        this.f9484d = eVar;
    }

    public final void onClick(View view) {
        this.f9482a.m11706v3(this.f9483c, this.f9484d, view);
    }
}
