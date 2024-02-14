package com.arlosoft.macrodroid.constraint;

import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.constraint.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4256g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ BatteryTemperatureConstraint f10844a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f10845c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f10846d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f10847f;

    public /* synthetic */ C4256g(BatteryTemperatureConstraint batteryTemperatureConstraint, RadioButton radioButton, RadioButton radioButton2, AppCompatDialog appCompatDialog) {
        this.f10844a = batteryTemperatureConstraint;
        this.f10845c = radioButton;
        this.f10846d = radioButton2;
        this.f10847f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f10844a.m16209k3(this.f10845c, this.f10846d, this.f10847f, view);
    }
}
