package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.action.hj */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3120hj implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetWifiAction f8441a;

    /* renamed from: c */
    public final /* synthetic */ String[] f8442c;

    /* renamed from: d */
    public final /* synthetic */ Integer[] f8443d;

    public /* synthetic */ C3120hj(SetWifiAction setWifiAction, String[] strArr, Integer[] numArr) {
        this.f8441a = setWifiAction;
        this.f8442c = strArr;
        this.f8443d = numArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8441a.m12842D3(this.f8442c, this.f8443d, dialogInterface, i);
    }
}
