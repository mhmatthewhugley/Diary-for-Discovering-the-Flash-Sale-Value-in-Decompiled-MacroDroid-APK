package com.arlosoft.macrodroid.constraint;

import android.content.DialogInterface;
import android.widget.TextView;

/* renamed from: com.arlosoft.macrodroid.constraint.p0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4302p0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ GeofenceConstraint f10941a;

    /* renamed from: c */
    public final /* synthetic */ String[] f10942c;

    /* renamed from: d */
    public final /* synthetic */ int[] f10943d;

    /* renamed from: f */
    public final /* synthetic */ TextView f10944f;

    public /* synthetic */ C4302p0(GeofenceConstraint geofenceConstraint, String[] strArr, int[] iArr, TextView textView) {
        this.f10941a = geofenceConstraint;
        this.f10942c = strArr;
        this.f10943d = iArr;
        this.f10944f = textView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        GeofenceConstraint.m16512y3(this.f10941a, this.f10942c, this.f10943d, this.f10944f, dialogInterface, i);
    }
}
