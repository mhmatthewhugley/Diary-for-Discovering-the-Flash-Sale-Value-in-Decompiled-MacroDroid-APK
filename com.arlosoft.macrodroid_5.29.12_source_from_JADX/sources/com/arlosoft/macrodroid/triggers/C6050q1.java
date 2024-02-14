package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.triggers.q1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6050q1 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CallBasedTrigger f14312a;

    /* renamed from: c */
    public final /* synthetic */ List f14313c;

    public /* synthetic */ C6050q1(CallBasedTrigger callBasedTrigger, List list) {
        this.f14312a = callBasedTrigger;
        this.f14313c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14312a.m21867y3(this.f14313c, dialogInterface, i);
    }
}
