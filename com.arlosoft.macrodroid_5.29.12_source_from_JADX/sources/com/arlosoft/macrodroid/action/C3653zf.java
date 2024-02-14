package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.zf */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3653zf implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetAlarmClockAction f9695a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9696c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9697d;

    public /* synthetic */ C3653zf(SetAlarmClockAction setAlarmClockAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9695a = setAlarmClockAction;
        this.f9696c = activity;
        this.f9697d = eVar;
    }

    public final void onClick(View view) {
        this.f9695a.m12246C3(this.f9696c, this.f9697d, view);
    }
}
