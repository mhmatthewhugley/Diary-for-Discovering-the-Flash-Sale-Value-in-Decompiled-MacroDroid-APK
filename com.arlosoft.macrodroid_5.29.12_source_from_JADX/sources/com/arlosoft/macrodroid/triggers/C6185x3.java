package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.triggers.x3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6185x3 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ IncomingSMSTrigger f14703a;

    /* renamed from: c */
    public final /* synthetic */ Activity f14704c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f14705d;

    public /* synthetic */ C6185x3(IncomingSMSTrigger incomingSMSTrigger, Activity activity, C4023j0.C4028e eVar) {
        this.f14703a = incomingSMSTrigger;
        this.f14704c = activity;
        this.f14705d = eVar;
    }

    public final void onClick(View view) {
        this.f14703a.m22371Z3(this.f14704c, this.f14705d, view);
    }
}
