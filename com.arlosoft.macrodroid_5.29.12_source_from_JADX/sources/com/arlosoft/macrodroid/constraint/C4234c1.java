package com.arlosoft.macrodroid.constraint;

import android.content.DialogInterface;
import kotlin.jvm.internal.C13678a0;

/* renamed from: com.arlosoft.macrodroid.constraint.c1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4234c1 implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a */
    public final /* synthetic */ IsAdbHackedConstraint f10802a;

    /* renamed from: b */
    public final /* synthetic */ C13678a0 f10803b;

    public /* synthetic */ C4234c1(IsAdbHackedConstraint isAdbHackedConstraint, C13678a0 a0Var) {
        this.f10802a = isAdbHackedConstraint;
        this.f10803b = a0Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        IsAdbHackedConstraint.m16589l3(this.f10802a, this.f10803b, dialogInterface, i, z);
    }
}
