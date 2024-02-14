package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.constraint.o */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4296o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CalendarConstraint f10920a;

    /* renamed from: c */
    public final /* synthetic */ Activity f10921c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f10922d;

    public /* synthetic */ C4296o(CalendarConstraint calendarConstraint, Activity activity, C4023j0.C4028e eVar) {
        this.f10920a = calendarConstraint;
        this.f10921c = activity;
        this.f10922d = eVar;
    }

    public final void onClick(View view) {
        this.f10920a.m16271u3(this.f10921c, this.f10922d, view);
    }
}
