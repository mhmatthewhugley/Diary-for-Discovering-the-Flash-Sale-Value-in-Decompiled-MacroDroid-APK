package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.action.gg */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3089gg implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetBluetoothAction f8376a;

    /* renamed from: c */
    public final /* synthetic */ String[] f8377c;

    /* renamed from: d */
    public final /* synthetic */ String[] f8378d;

    public /* synthetic */ C3089gg(SetBluetoothAction setBluetoothAction, String[] strArr, String[] strArr2) {
        this.f8376a = setBluetoothAction;
        this.f8377c = strArr;
        this.f8378d = strArr2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8376a.m12333z3(this.f8377c, this.f8378d, dialogInterface, i);
    }
}
