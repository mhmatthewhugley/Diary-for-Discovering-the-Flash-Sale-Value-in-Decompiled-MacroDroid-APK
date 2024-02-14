package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.va */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3539va implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationAction f9411a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9412c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9413d;

    public /* synthetic */ C3539va(NotificationAction notificationAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9411a = notificationAction;
        this.f9412c = activity;
        this.f9413d = eVar;
    }

    public final void onClick(View view) {
        this.f9411a.m11534R3(this.f9412c, this.f9413d, view);
    }
}
