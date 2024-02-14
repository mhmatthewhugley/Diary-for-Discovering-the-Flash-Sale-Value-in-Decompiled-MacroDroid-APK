package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.triggers.m8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6009m8 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ VariableTrigger f14196a;

    /* renamed from: c */
    public final /* synthetic */ Activity f14197c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f14198d;

    public /* synthetic */ C6009m8(VariableTrigger variableTrigger, Activity activity, C4023j0.C4028e eVar) {
        this.f14196a = variableTrigger;
        this.f14197c = activity;
        this.f14198d = eVar;
    }

    public final void onClick(View view) {
        this.f14196a.m23446p4(this.f14197c, this.f14198d, view);
    }
}
