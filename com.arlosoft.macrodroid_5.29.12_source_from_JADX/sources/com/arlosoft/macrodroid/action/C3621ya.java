package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.action.NotificationAction;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;

/* renamed from: com.arlosoft.macrodroid.action.ya */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3621ya implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationAction.C2543c f9619a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9620c;

    /* renamed from: d */
    public final /* synthetic */ ActionBlock f9621d;

    public /* synthetic */ C3621ya(NotificationAction.C2543c cVar, Activity activity, ActionBlock actionBlock) {
        this.f9619a = cVar;
        this.f9620c = activity;
        this.f9621d = actionBlock;
    }

    public final void onClick(View view) {
        this.f9619a.m11595b(this.f9620c, this.f9621d, view);
    }
}
