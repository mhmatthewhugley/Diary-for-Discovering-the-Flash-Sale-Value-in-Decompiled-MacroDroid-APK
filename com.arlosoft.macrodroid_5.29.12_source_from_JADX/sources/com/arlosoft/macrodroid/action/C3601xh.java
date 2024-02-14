package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.xh */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3601xh implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetVariableAction f9582a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9583c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9584d;

    public /* synthetic */ C3601xh(SetVariableAction setVariableAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9582a = setVariableAction;
        this.f9583c = activity;
        this.f9584d = eVar;
    }

    public final void onClick(View view) {
        this.f9582a.m12696p4(this.f9583c, this.f9584d, view);
    }
}
