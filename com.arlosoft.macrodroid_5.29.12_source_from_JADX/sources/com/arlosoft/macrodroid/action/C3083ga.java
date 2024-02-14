package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.ga */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3083ga implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MakeCallAction f8364a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8365c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8366d;

    public /* synthetic */ C3083ga(MakeCallAction makeCallAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8364a = makeCallAction;
        this.f8365c = activity;
        this.f8366d = eVar;
    }

    public final void onClick(View view) {
        this.f8364a.m11484u3(this.f8365c, this.f8366d, view);
    }
}
