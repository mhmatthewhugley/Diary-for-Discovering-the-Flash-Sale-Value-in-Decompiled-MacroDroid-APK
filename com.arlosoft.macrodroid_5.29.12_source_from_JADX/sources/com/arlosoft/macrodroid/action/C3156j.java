package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3156j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AddCalendarEntryAction f8511a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8512c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8513d;

    public /* synthetic */ C3156j(AddCalendarEntryAction addCalendarEntryAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8511a = addCalendarEntryAction;
        this.f8512c = activity;
        this.f8513d = eVar;
    }

    public final void onClick(View view) {
        this.f8511a.m9674G3(this.f8512c, this.f8513d, view);
    }
}
