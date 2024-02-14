package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.z4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6210z4 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MediaButtonPressedTrigger f14767a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14768c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f14769d;

    /* renamed from: f */
    public final /* synthetic */ RadioButton f14770f;

    /* renamed from: g */
    public final /* synthetic */ AppCompatDialog f14771g;

    public /* synthetic */ C6210z4(MediaButtonPressedTrigger mediaButtonPressedTrigger, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, AppCompatDialog appCompatDialog) {
        this.f14767a = mediaButtonPressedTrigger;
        this.f14768c = radioButton;
        this.f14769d = radioButton2;
        this.f14770f = radioButton3;
        this.f14771g = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14767a.m22679p3(this.f14768c, this.f14769d, this.f14770f, this.f14771g, view);
    }
}
