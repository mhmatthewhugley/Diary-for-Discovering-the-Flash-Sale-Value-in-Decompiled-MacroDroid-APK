package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.triggers.t1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6135t1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CallBasedTrigger f14588a;

    /* renamed from: c */
    public final /* synthetic */ Activity f14589c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f14590d;

    public /* synthetic */ C6135t1(CallBasedTrigger callBasedTrigger, Activity activity, C4023j0.C4028e eVar) {
        this.f14588a = callBasedTrigger;
        this.f14589c = activity;
        this.f14590d = eVar;
    }

    public final void onClick(View view) {
        this.f14588a.m21850A3(this.f14589c, this.f14590d, view);
    }
}
