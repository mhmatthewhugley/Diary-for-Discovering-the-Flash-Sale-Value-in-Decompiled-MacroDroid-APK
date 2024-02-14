package com.arlosoft.macrodroid.constraint;

import android.view.View;
import android.widget.TextView;

/* renamed from: com.arlosoft.macrodroid.constraint.s0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4317s0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ GeofenceConstraint f10982a;

    /* renamed from: c */
    public final /* synthetic */ TextView f10983c;

    public /* synthetic */ C4317s0(GeofenceConstraint geofenceConstraint, TextView textView) {
        this.f10982a = geofenceConstraint;
        this.f10983c = textView;
    }

    public final void onClick(View view) {
        GeofenceConstraint.m16505r3(this.f10982a, this.f10983c, view);
    }
}
