package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import com.arlosoft.macrodroid.constraint.Constraint;

/* renamed from: com.arlosoft.macrodroid.action.u2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3504u2 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ConditionAction f9323a;

    /* renamed from: c */
    public final /* synthetic */ String[] f9324c;

    /* renamed from: d */
    public final /* synthetic */ Activity f9325d;

    /* renamed from: f */
    public final /* synthetic */ Constraint f9326f;

    public /* synthetic */ C3504u2(ConditionAction conditionAction, String[] strArr, Activity activity, Constraint constraint) {
        this.f9323a = conditionAction;
        this.f9324c = strArr;
        this.f9325d = activity;
        this.f9326f = constraint;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9323a.m10162F3(this.f9324c, this.f9325d, this.f9326f, dialogInterface, i);
    }
}
