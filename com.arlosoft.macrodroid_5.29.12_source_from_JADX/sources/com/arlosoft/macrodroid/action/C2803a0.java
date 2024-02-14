package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.a0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2803a0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AndroidWearAction f7711a;

    /* renamed from: c */
    public final /* synthetic */ Activity f7712c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f7713d;

    public /* synthetic */ C2803a0(AndroidWearAction androidWearAction, Activity activity, C4023j0.C4028e eVar) {
        this.f7711a = androidWearAction;
        this.f7712c = activity;
        this.f7713d = eVar;
    }

    public final void onClick(View view) {
        this.f7711a.m9788k4(this.f7712c, this.f7713d, view);
    }
}
