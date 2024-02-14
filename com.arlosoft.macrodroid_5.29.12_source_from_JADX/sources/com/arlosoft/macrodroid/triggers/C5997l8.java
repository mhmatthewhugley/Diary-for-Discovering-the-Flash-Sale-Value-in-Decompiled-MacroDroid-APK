package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.triggers.l8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5997l8 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ VariableTrigger f14178a;

    /* renamed from: c */
    public final /* synthetic */ Activity f14179c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f14180d;

    public /* synthetic */ C5997l8(VariableTrigger variableTrigger, Activity activity, C4023j0.C4028e eVar) {
        this.f14178a = variableTrigger;
        this.f14179c = activity;
        this.f14180d = eVar;
    }

    public final void onClick(View view) {
        this.f14178a.m23454t4(this.f14179c, this.f14180d, view);
    }
}
