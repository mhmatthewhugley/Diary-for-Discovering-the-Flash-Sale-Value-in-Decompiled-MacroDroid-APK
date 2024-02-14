package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.constraint.o2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4299o2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationPresentConstraint f10925a;

    /* renamed from: c */
    public final /* synthetic */ Activity f10926c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f10927d;

    public /* synthetic */ C4299o2(NotificationPresentConstraint notificationPresentConstraint, Activity activity, C4023j0.C4028e eVar) {
        this.f10925a = notificationPresentConstraint;
        this.f10926c = activity;
        this.f10927d = eVar;
    }

    public final void onClick(View view) {
        this.f10925a.m16858E3(this.f10926c, this.f10927d, view);
    }
}
