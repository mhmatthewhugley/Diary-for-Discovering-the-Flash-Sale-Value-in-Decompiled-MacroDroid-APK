package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import com.arlosoft.macrodroid.triggers.Trigger;

/* renamed from: com.arlosoft.macrodroid.action.dq */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3014dq implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String[] f8215a;

    /* renamed from: c */
    public final /* synthetic */ Trigger f8216c;

    /* renamed from: d */
    public final /* synthetic */ WaitUntilTriggerAction f8217d;

    /* renamed from: f */
    public final /* synthetic */ Activity f8218f;

    public /* synthetic */ C3014dq(String[] strArr, Trigger trigger, WaitUntilTriggerAction waitUntilTriggerAction, Activity activity) {
        this.f8215a = strArr;
        this.f8216c = trigger;
        this.f8217d = waitUntilTriggerAction;
        this.f8218f = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        WaitUntilTriggerAction.m13786E3(this.f8215a, this.f8216c, this.f8217d, this.f8218f, dialogInterface, i);
    }
}
