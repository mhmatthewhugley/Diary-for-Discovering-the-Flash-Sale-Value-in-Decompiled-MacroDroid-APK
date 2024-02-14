package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5976k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ApplicationLaunchedTrigger f14141a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f14142c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f14143d;

    /* renamed from: f */
    public final /* synthetic */ RadioButton f14144f;

    /* renamed from: g */
    public final /* synthetic */ CheckBox f14145g;

    public /* synthetic */ C5976k(ApplicationLaunchedTrigger applicationLaunchedTrigger, AppCompatDialog appCompatDialog, CheckBox checkBox, RadioButton radioButton, CheckBox checkBox2) {
        this.f14141a = applicationLaunchedTrigger;
        this.f14142c = appCompatDialog;
        this.f14143d = checkBox;
        this.f14144f = radioButton;
        this.f14145g = checkBox2;
    }

    public final void onClick(View view) {
        this.f14141a.m21515R3(this.f14142c, this.f14143d, this.f14144f, this.f14145g, view);
    }
}
