package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.triggers.k1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5978k1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CallActiveTrigger f14148a;

    /* renamed from: c */
    public final /* synthetic */ Activity f14149c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f14150d;

    public /* synthetic */ C5978k1(CallActiveTrigger callActiveTrigger, Activity activity, C4023j0.C4028e eVar) {
        this.f14148a = callActiveTrigger;
        this.f14149c = activity;
        this.f14150d = eVar;
    }

    public final void onClick(View view) {
        this.f14148a.m21807G3(this.f14149c, this.f14150d, view);
    }
}
