package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3128i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AddCalendarEntryAction f8453a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8454c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8455d;

    public /* synthetic */ C3128i(AddCalendarEntryAction addCalendarEntryAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8453a = addCalendarEntryAction;
        this.f8454c = activity;
        this.f8455d = eVar;
    }

    public final void onClick(View view) {
        this.f8453a.m9670C3(this.f8454c, this.f8455d, view);
    }
}
