package com.arlosoft.macrodroid.constraint;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.constraint.v0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4332v0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InvocationMethodConstraint f11029a;

    /* renamed from: c */
    public final /* synthetic */ boolean[] f11030c;

    public /* synthetic */ C4332v0(InvocationMethodConstraint invocationMethodConstraint, boolean[] zArr) {
        this.f11029a = invocationMethodConstraint;
        this.f11030c = zArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        InvocationMethodConstraint.m16550k3(this.f11029a, this.f11030c, dialogInterface, i);
    }
}
