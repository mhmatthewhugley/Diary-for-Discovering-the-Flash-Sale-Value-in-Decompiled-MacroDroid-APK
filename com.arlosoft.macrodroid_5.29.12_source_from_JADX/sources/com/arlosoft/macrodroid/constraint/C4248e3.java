package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.constraint.e3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4248e3 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f10833a;

    /* renamed from: c */
    public final /* synthetic */ SunsetSunriseConstraint f10834c;

    public /* synthetic */ C4248e3(Activity activity, SunsetSunriseConstraint sunsetSunriseConstraint) {
        this.f10833a = activity;
        this.f10834c = sunsetSunriseConstraint;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SunsetSunriseConstraint.m17045j3(this.f10833a, this.f10834c, dialogInterface, i);
    }
}
