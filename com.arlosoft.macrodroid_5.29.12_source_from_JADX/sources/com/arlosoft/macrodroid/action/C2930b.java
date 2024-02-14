package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import kotlin.jvm.internal.C13678a0;

/* renamed from: com.arlosoft.macrodroid.action.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2930b implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a */
    public final /* synthetic */ boolean[] f8015a;

    /* renamed from: b */
    public final /* synthetic */ C13678a0 f8016b;

    public /* synthetic */ C2930b(boolean[] zArr, C13678a0 a0Var) {
        this.f8015a = zArr;
        this.f8016b = a0Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        AccessibilityServiceAction.m9575r3(this.f8015a, this.f8016b, dialogInterface, i, z);
    }
}
