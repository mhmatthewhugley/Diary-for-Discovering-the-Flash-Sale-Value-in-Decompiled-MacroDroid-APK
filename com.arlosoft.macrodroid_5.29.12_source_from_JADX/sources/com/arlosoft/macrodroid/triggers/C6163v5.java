package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.triggers.v5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6163v5 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationTrigger f14649a;

    /* renamed from: c */
    public final /* synthetic */ Activity f14650c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f14651d;

    public /* synthetic */ C6163v5(NotificationTrigger notificationTrigger, Activity activity, C4023j0.C4028e eVar) {
        this.f14649a = notificationTrigger;
        this.f14650c = activity;
        this.f14651d = eVar;
    }

    public final void onClick(View view) {
        this.f14649a.m22820N3(this.f14650c, this.f14651d, view);
    }
}
