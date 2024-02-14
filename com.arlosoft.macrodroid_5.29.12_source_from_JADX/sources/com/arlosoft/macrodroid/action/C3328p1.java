package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.p1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3328p1 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ClearCallLogAction f8893a;

    /* renamed from: c */
    public final /* synthetic */ List f8894c;

    public /* synthetic */ C3328p1(ClearCallLogAction clearCallLogAction, List list) {
        this.f8893a = clearCallLogAction;
        this.f8894c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8893a.m9994y3(this.f8894c, dialogInterface, i);
    }
}
