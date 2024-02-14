package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.triggers.x1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6183x1 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CallMissedTrigger f14699a;

    /* renamed from: c */
    public final /* synthetic */ List f14700c;

    public /* synthetic */ C6183x1(CallMissedTrigger callMissedTrigger, List list) {
        this.f14699a = callMissedTrigger;
        this.f14700c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14699a.m21902A3(this.f14700c, dialogInterface, i);
    }
}
