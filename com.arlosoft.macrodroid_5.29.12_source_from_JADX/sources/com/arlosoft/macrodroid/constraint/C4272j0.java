package com.arlosoft.macrodroid.constraint;

import android.content.DialogInterface;
import android.hardware.SensorEventListener;

/* renamed from: com.arlosoft.macrodroid.constraint.j0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4272j0 implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ SensorEventListener f10875a;

    public /* synthetic */ C4272j0(SensorEventListener sensorEventListener) {
        this.f10875a = sensorEventListener;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        FaceUpDownConstraint.s_sensorManager.unregisterListener(this.f10875a);
    }
}
