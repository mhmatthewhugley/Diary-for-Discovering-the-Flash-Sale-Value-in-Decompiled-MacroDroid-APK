package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.triggers.a2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5808a2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CallMissedTrigger f13764a;

    /* renamed from: c */
    public final /* synthetic */ Activity f13765c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f13766d;

    public /* synthetic */ C5808a2(CallMissedTrigger callMissedTrigger, Activity activity, C4023j0.C4028e eVar) {
        this.f13764a = callMissedTrigger;
        this.f13765c = activity;
        this.f13766d = eVar;
    }

    public final void onClick(View view) {
        this.f13764a.m21904C3(this.f13765c, this.f13766d, view);
    }
}
