package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.triggers.y0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6194y0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ BluetoothTrigger f14725a;

    /* renamed from: c */
    public final /* synthetic */ String[] f14726c;

    /* renamed from: d */
    public final /* synthetic */ String[] f14727d;

    public /* synthetic */ C6194y0(BluetoothTrigger bluetoothTrigger, String[] strArr, String[] strArr2) {
        this.f14725a = bluetoothTrigger;
        this.f14726c = strArr;
        this.f14727d = strArr2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14725a.m21729o3(this.f14726c, this.f14727d, dialogInterface, i);
    }
}
