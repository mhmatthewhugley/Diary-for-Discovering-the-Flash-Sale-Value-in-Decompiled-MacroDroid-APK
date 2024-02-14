package com.arlosoft.macrodroid.constraint;

import android.hardware.SensorEventListener;
import android.view.View;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.constraint.j1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4273j1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AppCompatDialog f10876a;

    /* renamed from: c */
    public final /* synthetic */ SensorEventListener f10877c;

    public /* synthetic */ C4273j1(AppCompatDialog appCompatDialog, SensorEventListener sensorEventListener) {
        this.f10876a = appCompatDialog;
        this.f10877c = sensorEventListener;
    }

    public final void onClick(View view) {
        LightLevelConstraint.m16654p3(this.f10876a, this.f10877c, view);
    }
}
