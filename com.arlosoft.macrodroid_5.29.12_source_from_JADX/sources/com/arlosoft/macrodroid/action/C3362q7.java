package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.q7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3362q7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ KillBackgroundAppAction f8955a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8956c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8957d;

    public /* synthetic */ C3362q7(KillBackgroundAppAction killBackgroundAppAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8955a = killBackgroundAppAction;
        this.f8956c = activity;
        this.f8957d = eVar;
    }

    public final void onClick(View view) {
        this.f8955a.m11163x3(this.f8956c, this.f8957d, view);
    }
}
