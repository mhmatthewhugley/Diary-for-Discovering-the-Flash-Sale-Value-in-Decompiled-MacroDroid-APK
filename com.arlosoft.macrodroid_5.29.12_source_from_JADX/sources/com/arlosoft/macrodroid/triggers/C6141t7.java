package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.triggers.t7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6141t7 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SunriseSunsetTrigger f14601a;

    /* renamed from: c */
    public final /* synthetic */ Activity f14602c;

    public /* synthetic */ C6141t7(SunriseSunsetTrigger sunriseSunsetTrigger, Activity activity) {
        this.f14601a = sunriseSunsetTrigger;
        this.f14602c = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14601a.m23273m3(this.f14602c, dialogInterface, i);
    }
}
