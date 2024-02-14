package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.si */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3453si implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetVariableAction f9195a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9196c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9197d;

    public /* synthetic */ C3453si(SetVariableAction setVariableAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9195a = setVariableAction;
        this.f9196c = activity;
        this.f9197d = eVar;
    }

    public final void onClick(View view) {
        this.f9195a.m12712x4(this.f9196c, this.f9197d, view);
    }
}
