package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.action.q0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3355q0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AndroidWearAction f8941a;

    /* renamed from: c */
    public final /* synthetic */ String[] f8942c;

    /* renamed from: d */
    public final /* synthetic */ String[] f8943d;

    public /* synthetic */ C3355q0(AndroidWearAction androidWearAction, String[] strArr, String[] strArr2) {
        this.f8941a = androidWearAction;
        this.f8942c = strArr;
        this.f8943d = strArr2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8941a.m9812w4(this.f8942c, this.f8943d, dialogInterface, i);
    }
}
