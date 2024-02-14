package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.ua */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3512ua implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationAction f9347a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9348c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9349d;

    public /* synthetic */ C3512ua(NotificationAction notificationAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9347a = notificationAction;
        this.f9348c = activity;
        this.f9349d = eVar;
    }

    public final void onClick(View view) {
        this.f9347a.m11546d4(this.f9348c, this.f9349d, view);
    }
}
