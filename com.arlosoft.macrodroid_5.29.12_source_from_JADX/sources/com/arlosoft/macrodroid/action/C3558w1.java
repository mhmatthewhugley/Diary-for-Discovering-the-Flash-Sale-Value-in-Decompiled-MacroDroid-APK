package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.w1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3558w1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ClearNotificationsAction f9458a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9459c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9460d;

    public /* synthetic */ C3558w1(ClearNotificationsAction clearNotificationsAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9458a = clearNotificationsAction;
        this.f9459c = activity;
        this.f9460d = eVar;
    }

    public final void onClick(View view) {
        this.f9458a.m10054B3(this.f9459c, this.f9460d, view);
    }
}
