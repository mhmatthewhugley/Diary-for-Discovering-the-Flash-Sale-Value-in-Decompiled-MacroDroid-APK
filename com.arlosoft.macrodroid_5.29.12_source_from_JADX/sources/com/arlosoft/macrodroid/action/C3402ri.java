package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.ri */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3402ri implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetVariableAction f9049a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9050c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9051d;

    public /* synthetic */ C3402ri(SetVariableAction setVariableAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9049a = setVariableAction;
        this.f9050c = activity;
        this.f9051d = eVar;
    }

    public final void onClick(View view) {
        this.f9049a.m12684j4(this.f9050c, this.f9051d, view);
    }
}
