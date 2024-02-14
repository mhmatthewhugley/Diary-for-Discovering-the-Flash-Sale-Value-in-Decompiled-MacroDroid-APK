package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.qe */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3369qe implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ RecordMicrophoneAction f8971a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8972c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8973d;

    public /* synthetic */ C3369qe(RecordMicrophoneAction recordMicrophoneAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8971a = recordMicrophoneAction;
        this.f8972c = activity;
        this.f8973d = eVar;
    }

    public final void onClick(View view) {
        this.f8971a.m12010F3(this.f8972c, this.f8973d, view);
    }
}
