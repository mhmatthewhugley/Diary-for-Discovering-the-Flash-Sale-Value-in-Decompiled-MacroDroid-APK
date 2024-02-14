package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.triggers.ta */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6144ta implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WifiSSIDTrigger f14606a;

    /* renamed from: c */
    public final /* synthetic */ Activity f14607c;

    public /* synthetic */ C6144ta(WifiSSIDTrigger wifiSSIDTrigger, Activity activity) {
        this.f14606a = wifiSSIDTrigger;
        this.f14607c = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14606a.m23776H3(this.f14607c, dialogInterface, i);
    }
}
