package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.f1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3046f1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ClearAppDataAction f8308a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8309c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8310d;

    public /* synthetic */ C3046f1(ClearAppDataAction clearAppDataAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8308a = clearAppDataAction;
        this.f8309c = activity;
        this.f8310d = eVar;
    }

    public final void onClick(View view) {
        this.f8308a.m9966y3(this.f8309c, this.f8310d, view);
    }
}
