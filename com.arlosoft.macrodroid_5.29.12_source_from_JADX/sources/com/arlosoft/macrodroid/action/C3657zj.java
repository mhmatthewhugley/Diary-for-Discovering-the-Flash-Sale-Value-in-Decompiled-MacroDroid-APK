package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.zj */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3657zj implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ShareLocationAction f9701a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9702c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9703d;

    public /* synthetic */ C3657zj(ShareLocationAction shareLocationAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9701a = shareLocationAction;
        this.f9702c = activity;
        this.f9703d = eVar;
    }

    public final void onClick(View view) {
        this.f9701a.m12968x4(this.f9702c, this.f9703d, view);
    }
}
