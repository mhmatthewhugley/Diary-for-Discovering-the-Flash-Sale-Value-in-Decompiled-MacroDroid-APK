package com.arlosoft.macrodroid.triggers;

import android.view.View;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.h0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5941h0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ BatteryTemperatureTrigger f14073a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f14074c;

    public /* synthetic */ C5941h0(BatteryTemperatureTrigger batteryTemperatureTrigger, AppCompatDialog appCompatDialog) {
        this.f14073a = batteryTemperatureTrigger;
        this.f14074c = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14073a.m21657r3(this.f14074c, view);
    }
}
