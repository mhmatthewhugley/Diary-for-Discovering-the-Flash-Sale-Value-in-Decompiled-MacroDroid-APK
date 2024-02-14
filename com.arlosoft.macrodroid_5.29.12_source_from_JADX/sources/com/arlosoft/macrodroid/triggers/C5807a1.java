package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.triggers.a1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5807a1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CalendarTrigger f13761a;

    /* renamed from: c */
    public final /* synthetic */ Activity f13762c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f13763d;

    public /* synthetic */ C5807a1(CalendarTrigger calendarTrigger, Activity activity, C4023j0.C4028e eVar) {
        this.f13761a = calendarTrigger;
        this.f13762c = activity;
        this.f13763d = eVar;
    }

    public final void onClick(View view) {
        this.f13761a.m21764I3(this.f13762c, this.f13763d, view);
    }
}
