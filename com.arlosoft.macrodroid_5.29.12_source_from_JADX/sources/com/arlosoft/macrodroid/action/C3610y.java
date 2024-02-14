package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;

/* renamed from: com.arlosoft.macrodroid.action.y */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3610y implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AndroidWearAction f9598a;

    /* renamed from: c */
    public final /* synthetic */ int f9599c;

    /* renamed from: d */
    public final /* synthetic */ Activity f9600d;

    public /* synthetic */ C3610y(AndroidWearAction androidWearAction, int i, Activity activity) {
        this.f9598a = androidWearAction;
        this.f9599c = i;
        this.f9600d = activity;
    }

    public final void onClick(View view) {
        this.f9598a.m9778c4(this.f9599c, this.f9600d, view);
    }
}
