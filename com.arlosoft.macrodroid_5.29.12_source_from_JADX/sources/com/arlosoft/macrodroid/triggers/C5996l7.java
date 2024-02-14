package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.triggers.l7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5996l7 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ StopwatchTrigger f14176a;

    /* renamed from: c */
    public final /* synthetic */ List f14177c;

    public /* synthetic */ C5996l7(StopwatchTrigger stopwatchTrigger, List list) {
        this.f14176a = stopwatchTrigger;
        this.f14177c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14176a.m23243y3(this.f14177c, dialogInterface, i);
    }
}
