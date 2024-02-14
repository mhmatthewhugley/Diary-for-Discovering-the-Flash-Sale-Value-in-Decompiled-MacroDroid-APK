package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.constraint.v */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4331v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f11026a;

    /* renamed from: c */
    public final /* synthetic */ C4023j0.C4028e f11027c;

    /* renamed from: d */
    public final /* synthetic */ ClipboardConstraint f11028d;

    public /* synthetic */ C4331v(Activity activity, C4023j0.C4028e eVar, ClipboardConstraint clipboardConstraint) {
        this.f11026a = activity;
        this.f11027c = eVar;
        this.f11028d = clipboardConstraint;
    }

    public final void onClick(View view) {
        ClipboardConstraint.m16334n3(this.f11026a, this.f11027c, this.f11028d, view);
    }
}
