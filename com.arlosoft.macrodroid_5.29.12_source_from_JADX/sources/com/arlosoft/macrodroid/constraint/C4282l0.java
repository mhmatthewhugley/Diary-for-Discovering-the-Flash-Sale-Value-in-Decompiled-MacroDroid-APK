package com.arlosoft.macrodroid.constraint;

import android.hardware.SensorEventListener;
import android.view.View;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.constraint.l0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4282l0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FaceUpDownConstraint f10899a;

    /* renamed from: c */
    public final /* synthetic */ CheckBox[] f10900c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f10901d;

    /* renamed from: f */
    public final /* synthetic */ SensorEventListener f10902f;

    /* renamed from: g */
    public final /* synthetic */ CheckBox f10903g;

    public /* synthetic */ C4282l0(FaceUpDownConstraint faceUpDownConstraint, CheckBox[] checkBoxArr, AppCompatDialog appCompatDialog, SensorEventListener sensorEventListener, CheckBox checkBox) {
        this.f10899a = faceUpDownConstraint;
        this.f10900c = checkBoxArr;
        this.f10901d = appCompatDialog;
        this.f10902f = sensorEventListener;
        this.f10903g = checkBox;
    }

    public final void onClick(View view) {
        this.f10899a.m16472w3(this.f10900c, this.f10901d, this.f10902f, this.f10903g, view);
    }
}
