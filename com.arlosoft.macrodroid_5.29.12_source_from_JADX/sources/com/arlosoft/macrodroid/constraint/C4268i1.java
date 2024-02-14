package com.arlosoft.macrodroid.constraint;

import android.content.DialogInterface;
import android.hardware.SensorEventListener;

/* renamed from: com.arlosoft.macrodroid.constraint.i1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4268i1 implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ SensorEventListener f10869a;

    public /* synthetic */ C4268i1(SensorEventListener sensorEventListener) {
        this.f10869a = sensorEventListener;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        LightLevelConstraint.s_sensorManager.unregisterListener(this.f10869a);
    }
}
