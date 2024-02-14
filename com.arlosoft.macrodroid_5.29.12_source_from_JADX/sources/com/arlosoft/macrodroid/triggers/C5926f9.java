package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.f9 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5926f9 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WeatherTrigger f14044a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14045c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f14046d;

    /* renamed from: f */
    public final /* synthetic */ RadioButton f14047f;

    /* renamed from: g */
    public final /* synthetic */ RadioButton f14048g;

    /* renamed from: o */
    public final /* synthetic */ RadioButton f14049o;

    /* renamed from: p */
    public final /* synthetic */ AppCompatDialog f14050p;

    public /* synthetic */ C5926f9(WeatherTrigger weatherTrigger, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioButton radioButton5, AppCompatDialog appCompatDialog) {
        this.f14044a = weatherTrigger;
        this.f14045c = radioButton;
        this.f14046d = radioButton2;
        this.f14047f = radioButton3;
        this.f14048g = radioButton4;
        this.f14049o = radioButton5;
        this.f14050p = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14044a.m23568A3(this.f14045c, this.f14046d, this.f14047f, this.f14048g, this.f14049o, this.f14050p, view);
    }
}
