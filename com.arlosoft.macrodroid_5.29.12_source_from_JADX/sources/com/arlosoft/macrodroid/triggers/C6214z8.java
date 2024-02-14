package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.triggers.z8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6214z8 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WeatherTrigger f14777a;

    /* renamed from: c */
    public final /* synthetic */ Activity f14778c;

    public /* synthetic */ C6214z8(WeatherTrigger weatherTrigger, Activity activity) {
        this.f14777a = weatherTrigger;
        this.f14778c = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14777a.m23572E3(this.f14778c, dialogInterface, i);
    }
}
