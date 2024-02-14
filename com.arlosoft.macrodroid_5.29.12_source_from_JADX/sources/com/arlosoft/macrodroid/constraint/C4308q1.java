package com.arlosoft.macrodroid.constraint;

import android.view.View;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.constraint.q1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4308q1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LogicConstraint f10961a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f10962c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f10963d;

    public /* synthetic */ C4308q1(LogicConstraint logicConstraint, AppCompatDialog appCompatDialog, CheckBox checkBox) {
        this.f10961a = logicConstraint;
        this.f10962c = appCompatDialog;
        this.f10963d = checkBox;
    }

    public final void onClick(View view) {
        this.f10961a.m16688k3(this.f10962c, this.f10963d, view);
    }
}
