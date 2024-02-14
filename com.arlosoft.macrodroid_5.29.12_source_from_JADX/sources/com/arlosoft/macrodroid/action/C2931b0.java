package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.b0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2931b0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AndroidWearAction f8017a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8018c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8019d;

    public /* synthetic */ C2931b0(AndroidWearAction androidWearAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8017a = androidWearAction;
        this.f8018c = activity;
        this.f8019d = eVar;
    }

    public final void onClick(View view) {
        this.f8017a.m9792m4(this.f8018c, this.f8019d, view);
    }
}
