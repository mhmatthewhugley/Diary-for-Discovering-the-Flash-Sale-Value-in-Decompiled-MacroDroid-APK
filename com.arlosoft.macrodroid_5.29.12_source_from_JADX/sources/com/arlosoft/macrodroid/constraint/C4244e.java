package com.arlosoft.macrodroid.constraint;

import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.constraint.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4244e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ BatteryLevelConstraint f10824a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f10825c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f10826d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f10827f;

    public /* synthetic */ C4244e(BatteryLevelConstraint batteryLevelConstraint, RadioButton radioButton, RadioButton radioButton2, AppCompatDialog appCompatDialog) {
        this.f10824a = batteryLevelConstraint;
        this.f10825c = radioButton;
        this.f10826d = radioButton2;
        this.f10827f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f10824a.m16186l3(this.f10825c, this.f10826d, this.f10827f, view);
    }
}
