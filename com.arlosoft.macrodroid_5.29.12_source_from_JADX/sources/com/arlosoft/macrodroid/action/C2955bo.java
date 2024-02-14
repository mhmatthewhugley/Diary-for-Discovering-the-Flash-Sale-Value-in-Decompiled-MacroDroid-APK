package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.bo */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2955bo implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ UDPCommandAction f8072a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8073c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8074d;

    public /* synthetic */ C2955bo(UDPCommandAction uDPCommandAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8072a = uDPCommandAction;
        this.f8073c = activity;
        this.f8074d = eVar;
    }

    public final void onClick(View view) {
        this.f8072a.m13478y3(this.f8073c, this.f8074d, view);
    }
}
