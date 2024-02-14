package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.constraint.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4291n implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CalendarConstraint f10913a;

    /* renamed from: c */
    public final /* synthetic */ Activity f10914c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f10915d;

    public /* synthetic */ C4291n(CalendarConstraint calendarConstraint, Activity activity, C4023j0.C4028e eVar) {
        this.f10913a = calendarConstraint;
        this.f10914c = activity;
        this.f10915d = eVar;
    }

    public final void onClick(View view) {
        this.f10913a.m16273w3(this.f10914c, this.f10915d, view);
    }
}
