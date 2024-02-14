package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.bb */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2942bb implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f8040a;

    /* renamed from: c */
    public final /* synthetic */ C4023j0.C4028e f8041c;

    /* renamed from: d */
    public final /* synthetic */ NotificationInteractionAction f8042d;

    public /* synthetic */ C2942bb(Activity activity, C4023j0.C4028e eVar, NotificationInteractionAction notificationInteractionAction) {
        this.f8040a = activity;
        this.f8041c = eVar;
        this.f8042d = notificationInteractionAction;
    }

    public final void onClick(View view) {
        NotificationInteractionAction.m11607F3(this.f8040a, this.f8041c, this.f8042d, view);
    }
}
