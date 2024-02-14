package com.arlosoft.macrodroid.constraint;

import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.constraint.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4276k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ BrightnessConstraint f10882a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f10883c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f10884d;

    /* renamed from: f */
    public final /* synthetic */ CheckBox f10885f;

    /* renamed from: g */
    public final /* synthetic */ CheckBox f10886g;

    /* renamed from: o */
    public final /* synthetic */ AppCompatDialog f10887o;

    public /* synthetic */ C4276k(BrightnessConstraint brightnessConstraint, RadioButton radioButton, RadioButton radioButton2, CheckBox checkBox, CheckBox checkBox2, AppCompatDialog appCompatDialog) {
        this.f10882a = brightnessConstraint;
        this.f10883c = radioButton;
        this.f10884d = radioButton2;
        this.f10885f = checkBox;
        this.f10886g = checkBox2;
        this.f10887o = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f10882a.m16249m3(this.f10883c, this.f10884d, this.f10885f, this.f10886g, this.f10887o, view);
    }
}
