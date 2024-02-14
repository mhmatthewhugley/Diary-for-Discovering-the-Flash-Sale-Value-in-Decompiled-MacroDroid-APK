package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.o2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3299o2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CloseApplicationAction f8819a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8820c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8821d;

    public /* synthetic */ C3299o2(CloseApplicationAction closeApplicationAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8819a = closeApplicationAction;
        this.f8820c = activity;
        this.f8821d = eVar;
    }

    public final void onClick(View view) {
        this.f8819a.m10125E3(this.f8820c, this.f8821d, view);
    }
}
