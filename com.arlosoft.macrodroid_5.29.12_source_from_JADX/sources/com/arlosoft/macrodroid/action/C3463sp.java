package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.sp */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3463sp implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f9239a;

    /* renamed from: c */
    public final /* synthetic */ C4023j0.C4028e f9240c;

    /* renamed from: d */
    public final /* synthetic */ UIInteractionAction f9241d;

    public /* synthetic */ C3463sp(Activity activity, C4023j0.C4028e eVar, UIInteractionAction uIInteractionAction) {
        this.f9239a = activity;
        this.f9240c = eVar;
        this.f9241d = uIInteractionAction;
    }

    public final void onClick(View view) {
        UIInteractionAction.m13583u4(this.f9239a, this.f9240c, this.f9241d, view);
    }
}
