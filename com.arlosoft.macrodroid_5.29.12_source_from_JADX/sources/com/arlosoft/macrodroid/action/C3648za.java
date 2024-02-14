package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.action.NotificationAction;
import com.arlosoft.macrodroid.action.data.NotificationActionButton;
import com.arlosoft.macrodroid.actionblock.common.ActionBlockData;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;

/* renamed from: com.arlosoft.macrodroid.action.za */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3648za implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationAction.C2546e f9684a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9685c;

    /* renamed from: d */
    public final /* synthetic */ ActionBlock f9686d;

    /* renamed from: f */
    public final /* synthetic */ ActionBlockData f9687f;

    /* renamed from: g */
    public final /* synthetic */ NotificationActionButton f9688g;

    public /* synthetic */ C3648za(NotificationAction.C2546e eVar, Activity activity, ActionBlock actionBlock, ActionBlockData actionBlockData, NotificationActionButton notificationActionButton) {
        this.f9684a = eVar;
        this.f9685c = activity;
        this.f9686d = actionBlock;
        this.f9687f = actionBlockData;
        this.f9688g = notificationActionButton;
    }

    public final void onClick(View view) {
        this.f9684a.m11598b(this.f9685c, this.f9686d, this.f9687f, this.f9688g, view);
    }
}
