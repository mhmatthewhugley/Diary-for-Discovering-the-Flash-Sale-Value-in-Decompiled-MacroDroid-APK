package com.arlosoft.macrodroid.constraint;

import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.constraint.r0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4312r0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ GeofenceConstraint f10970a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f10971c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f10972d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f10973f;

    public /* synthetic */ C4312r0(GeofenceConstraint geofenceConstraint, RadioButton radioButton, CheckBox checkBox, AppCompatDialog appCompatDialog) {
        this.f10970a = geofenceConstraint;
        this.f10971c = radioButton;
        this.f10972d = checkBox;
        this.f10973f = appCompatDialog;
    }

    public final void onClick(View view) {
        GeofenceConstraint.m16507t3(this.f10970a, this.f10971c, this.f10972d, this.f10973f, view);
    }
}
