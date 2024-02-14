package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.triggers.h2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5943h2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ClipboardChangeTrigger f14077a;

    /* renamed from: c */
    public final /* synthetic */ Activity f14078c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f14079d;

    public /* synthetic */ C5943h2(ClipboardChangeTrigger clipboardChangeTrigger, Activity activity, C4023j0.C4028e eVar) {
        this.f14077a = clipboardChangeTrigger;
        this.f14078c = activity;
        this.f14079d = eVar;
    }

    public final void onClick(View view) {
        this.f14077a.m21988r3(this.f14078c, this.f14079d, view);
    }
}
