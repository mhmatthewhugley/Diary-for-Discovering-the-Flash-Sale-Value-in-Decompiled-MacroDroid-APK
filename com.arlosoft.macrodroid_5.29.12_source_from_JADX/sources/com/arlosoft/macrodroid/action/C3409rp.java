package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.rp */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3409rp implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f9061a;

    /* renamed from: c */
    public final /* synthetic */ C4023j0.C4028e f9062c;

    /* renamed from: d */
    public final /* synthetic */ UIInteractionAction f9063d;

    public /* synthetic */ C3409rp(Activity activity, C4023j0.C4028e eVar, UIInteractionAction uIInteractionAction) {
        this.f9061a = activity;
        this.f9062c = eVar;
        this.f9063d = uIInteractionAction;
    }

    public final void onClick(View view) {
        UIInteractionAction.m13528R4(this.f9061a, this.f9062c, this.f9063d, view);
    }
}
