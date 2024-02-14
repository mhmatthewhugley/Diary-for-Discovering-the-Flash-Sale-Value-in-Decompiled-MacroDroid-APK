package com.arlosoft.macrodroid.triggers;

import android.view.View;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.e0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5905e0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ BatteryLevelTrigger f14002a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f14003c;

    public /* synthetic */ C5905e0(BatteryLevelTrigger batteryLevelTrigger, AppCompatDialog appCompatDialog) {
        this.f14002a = batteryLevelTrigger;
        this.f14003c = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14002a.m21620r3(this.f14003c, view);
    }
}
