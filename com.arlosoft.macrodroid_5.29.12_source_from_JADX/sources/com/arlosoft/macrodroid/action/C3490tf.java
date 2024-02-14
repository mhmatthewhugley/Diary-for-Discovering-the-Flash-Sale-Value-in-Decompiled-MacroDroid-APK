package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.action.tf */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3490tf implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetAlarmClockAction f9293a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9294c;

    public /* synthetic */ C3490tf(SetAlarmClockAction setAlarmClockAction, Activity activity) {
        this.f9293a = setAlarmClockAction;
        this.f9294c = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9293a.m12256M3(this.f9294c, dialogInterface, i);
    }
}
