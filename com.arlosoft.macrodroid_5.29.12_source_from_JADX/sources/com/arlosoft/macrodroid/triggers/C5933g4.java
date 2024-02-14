package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.triggers.g4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5933g4 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ IntentReceivedTrigger f14058a;

    /* renamed from: c */
    public final /* synthetic */ Spinner f14059c;

    public /* synthetic */ C5933g4(IntentReceivedTrigger intentReceivedTrigger, Spinner spinner) {
        this.f14058a = intentReceivedTrigger;
        this.f14059c = spinner;
    }

    public final void onClick(View view) {
        IntentReceivedTrigger.m22447s3(this.f14058a, this.f14059c, view);
    }
}
