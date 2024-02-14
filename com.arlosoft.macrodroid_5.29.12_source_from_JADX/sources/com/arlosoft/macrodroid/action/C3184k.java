package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3184k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AddCalendarEntryAction f8569a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8570c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8571d;

    public /* synthetic */ C3184k(AddCalendarEntryAction addCalendarEntryAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8569a = addCalendarEntryAction;
        this.f8570c = activity;
        this.f8571d = eVar;
    }

    public final void onClick(View view) {
        this.f8569a.m9672E3(this.f8570c, this.f8571d, view);
    }
}
