package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.triggers.na */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6023na implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WifiConnectionTrigger f14242a;

    /* renamed from: c */
    public final /* synthetic */ String[] f14243c;

    public /* synthetic */ C6023na(WifiConnectionTrigger wifiConnectionTrigger, String[] strArr) {
        this.f14242a = wifiConnectionTrigger;
        this.f14243c = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14242a.m23748t3(this.f14243c, dialogInterface, i);
    }
}
