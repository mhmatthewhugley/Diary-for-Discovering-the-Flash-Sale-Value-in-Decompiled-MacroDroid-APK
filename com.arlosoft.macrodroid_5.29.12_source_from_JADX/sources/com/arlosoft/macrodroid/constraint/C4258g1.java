package com.arlosoft.macrodroid.constraint;

import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.NumberPicker;

/* renamed from: com.arlosoft.macrodroid.constraint.g1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4258g1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LastRunTimeConstraint f10849a;

    /* renamed from: c */
    public final /* synthetic */ NumberPicker f10850c;

    /* renamed from: d */
    public final /* synthetic */ NumberPicker f10851d;

    /* renamed from: f */
    public final /* synthetic */ NumberPicker f10852f;

    /* renamed from: g */
    public final /* synthetic */ AppCompatDialog f10853g;

    public /* synthetic */ C4258g1(LastRunTimeConstraint lastRunTimeConstraint, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, AppCompatDialog appCompatDialog) {
        this.f10849a = lastRunTimeConstraint;
        this.f10850c = numberPicker;
        this.f10851d = numberPicker2;
        this.f10852f = numberPicker3;
        this.f10853g = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f10849a.m16629r3(this.f10850c, this.f10851d, this.f10852f, this.f10853g, view);
    }
}
