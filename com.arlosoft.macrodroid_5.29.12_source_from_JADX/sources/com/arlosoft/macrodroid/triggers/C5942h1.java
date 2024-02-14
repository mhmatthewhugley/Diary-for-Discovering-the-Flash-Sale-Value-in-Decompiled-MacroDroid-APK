package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.triggers.h1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5942h1 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CallActiveTrigger f14075a;

    /* renamed from: c */
    public final /* synthetic */ List f14076c;

    public /* synthetic */ C5942h1(CallActiveTrigger callActiveTrigger, List list) {
        this.f14075a = callActiveTrigger;
        this.f14076c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14075a.m21805E3(this.f14076c, dialogInterface, i);
    }
}
