package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.action.ub */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3513ub implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OpenWebPageAction f9350a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9351c;

    /* renamed from: d */
    public final /* synthetic */ Spinner f9352d;

    public /* synthetic */ C3513ub(OpenWebPageAction openWebPageAction, Activity activity, Spinner spinner) {
        this.f9350a = openWebPageAction;
        this.f9351c = activity;
        this.f9352d = spinner;
    }

    public final void onClick(View view) {
        this.f9350a.m11708x3(this.f9351c, this.f9352d, view);
    }
}
