package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.pp */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3352pp implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f8935a;

    /* renamed from: c */
    public final /* synthetic */ UIInteractionAction f8936c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8937d;

    public /* synthetic */ C3352pp(Activity activity, UIInteractionAction uIInteractionAction, C4023j0.C4028e eVar) {
        this.f8935a = activity;
        this.f8936c = uIInteractionAction;
        this.f8937d = eVar;
    }

    public final void onClick(View view) {
        UIInteractionAction.m13554e5(this.f8935a, this.f8936c, this.f8937d, view);
    }
}
