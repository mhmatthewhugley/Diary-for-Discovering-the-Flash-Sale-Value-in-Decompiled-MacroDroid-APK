package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.ta */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3476ta implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationAction f9264a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9265c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9266d;

    public /* synthetic */ C3476ta(NotificationAction notificationAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9264a = notificationAction;
        this.f9265c = activity;
        this.f9266d = eVar;
    }

    public final void onClick(View view) {
        this.f9264a.m11538V3(this.f9265c, this.f9266d, view);
    }
}
