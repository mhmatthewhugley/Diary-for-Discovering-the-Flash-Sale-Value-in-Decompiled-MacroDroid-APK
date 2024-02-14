package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.vg */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3545vg implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetHotspotAction f9422a;

    /* renamed from: c */
    public final /* synthetic */ CheckBox f9423c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f9424d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f9425f;

    /* renamed from: g */
    public final /* synthetic */ RadioButton f9426g;

    /* renamed from: o */
    public final /* synthetic */ RadioButton f9427o;

    /* renamed from: p */
    public final /* synthetic */ Activity f9428p;

    public /* synthetic */ C3545vg(SetHotspotAction setHotspotAction, CheckBox checkBox, CheckBox checkBox2, AppCompatDialog appCompatDialog, RadioButton radioButton, RadioButton radioButton2, Activity activity) {
        this.f9422a = setHotspotAction;
        this.f9423c = checkBox;
        this.f9424d = checkBox2;
        this.f9425f = appCompatDialog;
        this.f9426g = radioButton;
        this.f9427o = radioButton2;
        this.f9428p = activity;
    }

    public final void onClick(View view) {
        this.f9422a.m12425u3(this.f9423c, this.f9424d, this.f9425f, this.f9426g, this.f9427o, this.f9428p, view);
    }
}
