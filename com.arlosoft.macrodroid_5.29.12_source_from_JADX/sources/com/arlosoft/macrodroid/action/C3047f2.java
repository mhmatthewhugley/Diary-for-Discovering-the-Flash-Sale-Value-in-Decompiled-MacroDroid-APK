package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import kotlin.jvm.internal.C13678a0;

/* renamed from: com.arlosoft.macrodroid.action.f2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3047f2 implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a */
    public final /* synthetic */ boolean[] f8311a;

    /* renamed from: b */
    public final /* synthetic */ C13678a0 f8312b;

    public /* synthetic */ C3047f2(boolean[] zArr, C13678a0 a0Var) {
        this.f8311a = zArr;
        this.f8312b = a0Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        ClearVariablesAction.m10094l3(this.f8311a, this.f8312b, dialogInterface, i, z);
    }
}
