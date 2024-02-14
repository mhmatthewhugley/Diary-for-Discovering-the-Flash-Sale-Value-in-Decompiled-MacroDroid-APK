package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.hardware.SensorEventListener;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.n4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6017n4 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LightSensorTrigger f14210a;

    /* renamed from: c */
    public final /* synthetic */ EditText f14211c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f14212d;

    /* renamed from: f */
    public final /* synthetic */ SensorEventListener f14213f;

    /* renamed from: g */
    public final /* synthetic */ Activity f14214g;

    public /* synthetic */ C6017n4(LightSensorTrigger lightSensorTrigger, EditText editText, AppCompatDialog appCompatDialog, SensorEventListener sensorEventListener, Activity activity) {
        this.f14210a = lightSensorTrigger;
        this.f14211c = editText;
        this.f14212d = appCompatDialog;
        this.f14213f = sensorEventListener;
        this.f14214g = activity;
    }

    public final void onClick(View view) {
        this.f14210a.m22551x3(this.f14211c, this.f14212d, this.f14213f, this.f14214g, view);
    }
}
