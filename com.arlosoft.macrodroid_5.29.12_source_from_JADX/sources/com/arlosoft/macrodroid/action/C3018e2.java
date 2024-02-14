package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.action.e2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3018e2 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String[] f8230a;

    /* renamed from: c */
    public final /* synthetic */ ClearVariablesAction f8231c;

    public /* synthetic */ C3018e2(String[] strArr, ClearVariablesAction clearVariablesAction) {
        this.f8230a = strArr;
        this.f8231c = clearVariablesAction;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ClearVariablesAction.m10095m3(this.f8230a, this.f8231c, dialogInterface, i);
    }
}
