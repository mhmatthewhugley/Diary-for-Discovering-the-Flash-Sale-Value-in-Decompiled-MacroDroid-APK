package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.np */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3294np implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f8810a;

    /* renamed from: c */
    public final /* synthetic */ UIInteractionAction f8811c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8812d;

    public /* synthetic */ C3294np(Activity activity, UIInteractionAction uIInteractionAction, C4023j0.C4028e eVar) {
        this.f8810a = activity;
        this.f8811c = uIInteractionAction;
        this.f8812d = eVar;
    }

    public final void onClick(View view) {
        UIInteractionAction.m13550c5(this.f8810a, this.f8811c, this.f8812d, view);
    }
}
