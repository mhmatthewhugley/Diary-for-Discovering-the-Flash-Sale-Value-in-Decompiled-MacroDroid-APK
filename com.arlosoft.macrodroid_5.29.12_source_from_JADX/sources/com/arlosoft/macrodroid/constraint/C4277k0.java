package com.arlosoft.macrodroid.constraint;

import android.hardware.SensorEventListener;
import android.view.View;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.constraint.k0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4277k0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AppCompatDialog f10888a;

    /* renamed from: c */
    public final /* synthetic */ SensorEventListener f10889c;

    public /* synthetic */ C4277k0(AppCompatDialog appCompatDialog, SensorEventListener sensorEventListener) {
        this.f10888a = appCompatDialog;
        this.f10889c = sensorEventListener;
    }

    public final void onClick(View view) {
        FaceUpDownConstraint.m16473x3(this.f10888a, this.f10889c, view);
    }
}
