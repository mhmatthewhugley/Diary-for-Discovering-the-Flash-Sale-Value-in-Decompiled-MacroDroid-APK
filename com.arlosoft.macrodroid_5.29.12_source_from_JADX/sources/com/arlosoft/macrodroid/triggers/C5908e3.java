package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.e3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5908e3 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ GeofenceTrigger f14006a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14007c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f14008d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f14009f;

    public /* synthetic */ C5908e3(GeofenceTrigger geofenceTrigger, RadioButton radioButton, CheckBox checkBox, AppCompatDialog appCompatDialog) {
        this.f14006a = geofenceTrigger;
        this.f14007c = radioButton;
        this.f14008d = checkBox;
        this.f14009f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14006a.m22268s3(this.f14007c, this.f14008d, this.f14009f, view);
    }
}
