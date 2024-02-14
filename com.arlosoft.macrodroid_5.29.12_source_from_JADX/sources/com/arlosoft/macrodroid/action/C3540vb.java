package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.action.vb */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3540vb implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OpenWebPageAction f9414a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9415c;

    /* renamed from: d */
    public final /* synthetic */ Spinner f9416d;

    public /* synthetic */ C3540vb(OpenWebPageAction openWebPageAction, Activity activity, Spinner spinner) {
        this.f9414a = openWebPageAction;
        this.f9415c = activity;
        this.f9416d = spinner;
    }

    public final void onClick(View view) {
        this.f9414a.m11707w3(this.f9415c, this.f9416d, view);
    }
}
