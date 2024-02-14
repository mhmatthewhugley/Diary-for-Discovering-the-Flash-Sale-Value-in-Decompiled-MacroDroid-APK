package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;
import android.hardware.SensorEventListener;

/* renamed from: com.arlosoft.macrodroid.triggers.l4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5993l4 implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ SensorEventListener f14173a;

    public /* synthetic */ C5993l4(SensorEventListener sensorEventListener) {
        this.f14173a = sensorEventListener;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        LightSensorTrigger.s_sensorManager.unregisterListener(this.f14173a);
    }
}
