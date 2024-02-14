package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.hardware.SensorEventListener;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.constraint.k1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4278k1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LightLevelConstraint f10890a;

    /* renamed from: c */
    public final /* synthetic */ EditText f10891c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f10892d;

    /* renamed from: f */
    public final /* synthetic */ SensorEventListener f10893f;

    /* renamed from: g */
    public final /* synthetic */ Activity f10894g;

    public /* synthetic */ C4278k1(LightLevelConstraint lightLevelConstraint, EditText editText, AppCompatDialog appCompatDialog, SensorEventListener sensorEventListener, Activity activity) {
        this.f10890a = lightLevelConstraint;
        this.f10891c = editText;
        this.f10892d = appCompatDialog;
        this.f10893f = sensorEventListener;
        this.f10894g = activity;
    }

    public final void onClick(View view) {
        this.f10890a.m16653o3(this.f10891c, this.f10892d, this.f10893f, this.f10894g, view);
    }
}
