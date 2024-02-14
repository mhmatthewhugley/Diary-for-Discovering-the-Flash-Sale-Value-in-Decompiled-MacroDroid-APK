package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.yf */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3626yf implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetAlarmClockAction f9630a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9631c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9632d;

    public /* synthetic */ C3626yf(SetAlarmClockAction setAlarmClockAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9630a = setAlarmClockAction;
        this.f9631c = activity;
        this.f9632d = eVar;
    }

    public final void onClick(View view) {
        this.f9630a.m12254K3(this.f9631c, this.f9632d, view);
    }
}
