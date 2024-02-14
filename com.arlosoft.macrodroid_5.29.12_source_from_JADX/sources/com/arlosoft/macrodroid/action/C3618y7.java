package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.y7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3618y7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LaunchActivityAction f9614a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9615c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9616d;

    public /* synthetic */ C3618y7(LaunchActivityAction launchActivityAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9614a = launchActivityAction;
        this.f9615c = activity;
        this.f9616d = eVar;
    }

    public final void onClick(View view) {
        this.f9614a.m11177A3(this.f9615c, this.f9616d, view);
    }
}
