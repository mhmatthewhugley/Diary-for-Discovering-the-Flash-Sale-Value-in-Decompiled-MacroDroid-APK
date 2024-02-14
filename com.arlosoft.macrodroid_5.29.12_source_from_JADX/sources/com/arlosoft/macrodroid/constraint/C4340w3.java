package com.arlosoft.macrodroid.constraint;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.constraint.w3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4340w3 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WifiConstraint f11056a;

    /* renamed from: c */
    public final /* synthetic */ String[] f11057c;

    public /* synthetic */ C4340w3(WifiConstraint wifiConstraint, String[] strArr) {
        this.f11056a = wifiConstraint;
        this.f11057c = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11056a.m17214w3(this.f11057c, dialogInterface, i);
    }
}
