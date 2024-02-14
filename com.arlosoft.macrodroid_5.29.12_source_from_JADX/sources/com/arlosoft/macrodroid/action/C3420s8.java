package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.s8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3420s8 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LogAction f9077a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9078c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9079d;

    public /* synthetic */ C3420s8(LogAction logAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9077a = logAction;
        this.f9078c = activity;
        this.f9079d = eVar;
    }

    public final void onClick(View view) {
        this.f9077a.m11316r3(this.f9078c, this.f9079d, view);
    }
}
