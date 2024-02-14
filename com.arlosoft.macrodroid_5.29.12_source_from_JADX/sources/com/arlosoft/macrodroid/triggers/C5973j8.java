package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;
import java.util.ArrayList;

/* renamed from: com.arlosoft.macrodroid.triggers.j8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5973j8 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ VariableTrigger f14131a;

    /* renamed from: c */
    public final /* synthetic */ int f14132c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f14133d;

    public /* synthetic */ C5973j8(VariableTrigger variableTrigger, int i, ArrayList arrayList) {
        this.f14131a = variableTrigger;
        this.f14132c = i;
        this.f14133d = arrayList;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14131a.m23434j4(this.f14132c, this.f14133d, dialogInterface, i);
    }
}
