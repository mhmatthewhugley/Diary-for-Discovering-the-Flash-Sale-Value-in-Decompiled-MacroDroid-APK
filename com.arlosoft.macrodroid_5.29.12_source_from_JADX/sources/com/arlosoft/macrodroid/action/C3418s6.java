package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.s6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3418s6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ForceMacroRunAction f9071a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9072c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9073d;

    public /* synthetic */ C3418s6(ForceMacroRunAction forceMacroRunAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9071a = forceMacroRunAction;
        this.f9072c = activity;
        this.f9073d = eVar;
    }

    public final void onClick(View view) {
        this.f9071a.m10857O3(this.f9072c, this.f9073d, view);
    }
}
