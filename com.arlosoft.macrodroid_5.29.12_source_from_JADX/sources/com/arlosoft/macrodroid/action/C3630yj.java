package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.yj */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3630yj implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ShareLocationAction f9648a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9649c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9650d;

    public /* synthetic */ C3630yj(ShareLocationAction shareLocationAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9648a = shareLocationAction;
        this.f9649c = activity;
        this.f9650d = eVar;
    }

    public final void onClick(View view) {
        this.f9648a.m12885D4(this.f9649c, this.f9650d, view);
    }
}
