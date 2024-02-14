package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.qi */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3373qi implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetVariableAction f8978a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8979c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8980d;

    public /* synthetic */ C3373qi(SetVariableAction setVariableAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8978a = setVariableAction;
        this.f8979c = activity;
        this.f8980d = eVar;
    }

    public final void onClick(View view) {
        this.f8978a.m12692n4(this.f8979c, this.f8980d, view);
    }
}
