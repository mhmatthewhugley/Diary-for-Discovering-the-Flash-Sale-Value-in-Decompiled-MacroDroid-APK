package com.arlosoft.macrodroid.constraint;

import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.constraint.u3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4330u3 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ VolumeLevelConstraint f11022a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f11023c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f11024d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f11025f;

    public /* synthetic */ C4330u3(VolumeLevelConstraint volumeLevelConstraint, RadioButton radioButton, RadioButton radioButton2, AppCompatDialog appCompatDialog) {
        this.f11022a = volumeLevelConstraint;
        this.f11023c = radioButton;
        this.f11024d = radioButton2;
        this.f11025f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f11022a.m17177q3(this.f11023c, this.f11024d, this.f11025f, view);
    }
}
