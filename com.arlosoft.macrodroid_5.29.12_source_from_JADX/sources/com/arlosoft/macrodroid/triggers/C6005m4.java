package com.arlosoft.macrodroid.triggers;

import android.hardware.SensorEventListener;
import android.view.View;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.m4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6005m4 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AppCompatDialog f14191a;

    /* renamed from: c */
    public final /* synthetic */ SensorEventListener f14192c;

    public /* synthetic */ C6005m4(AppCompatDialog appCompatDialog, SensorEventListener sensorEventListener) {
        this.f14191a = appCompatDialog;
        this.f14192c = sensorEventListener;
    }

    public final void onClick(View view) {
        LightSensorTrigger.m22552y3(this.f14191a, this.f14192c, view);
    }
}
