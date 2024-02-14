package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.ao */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2927ao implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ UDPCommandAction f8010a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8011c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8012d;

    public /* synthetic */ C2927ao(UDPCommandAction uDPCommandAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8010a = uDPCommandAction;
        this.f8011c = activity;
        this.f8012d = eVar;
    }

    public final void onClick(View view) {
        this.f8010a.m13476w3(this.f8011c, this.f8012d, view);
    }
}
