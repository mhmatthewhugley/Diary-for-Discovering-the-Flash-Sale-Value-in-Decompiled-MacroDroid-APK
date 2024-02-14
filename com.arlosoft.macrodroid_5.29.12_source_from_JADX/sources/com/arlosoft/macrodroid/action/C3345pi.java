package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.pi */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3345pi implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetVariableAction f8920a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8921c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8922d;

    public /* synthetic */ C3345pi(SetVariableAction setVariableAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8920a = setVariableAction;
        this.f8921c = activity;
        this.f8922d = eVar;
    }

    public final void onClick(View view) {
        this.f8920a.m12688l4(this.f8921c, this.f8922d, view);
    }
}
