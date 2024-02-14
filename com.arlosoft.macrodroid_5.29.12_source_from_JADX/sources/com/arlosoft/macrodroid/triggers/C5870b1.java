package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.triggers.b1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5870b1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CalendarTrigger f13929a;

    /* renamed from: c */
    public final /* synthetic */ Activity f13930c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f13931d;

    public /* synthetic */ C5870b1(CalendarTrigger calendarTrigger, Activity activity, C4023j0.C4028e eVar) {
        this.f13929a = calendarTrigger;
        this.f13930c = activity;
        this.f13931d = eVar;
    }

    public final void onClick(View view) {
        this.f13929a.m21762G3(this.f13930c, this.f13931d, view);
    }
}
