package com.arlosoft.macrodroid.constraint;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.constraint.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4266i implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ BluetoothConstraint f10865a;

    /* renamed from: c */
    public final /* synthetic */ String[] f10866c;

    /* renamed from: d */
    public final /* synthetic */ String[] f10867d;

    public /* synthetic */ C4266i(BluetoothConstraint bluetoothConstraint, String[] strArr, String[] strArr2) {
        this.f10865a = bluetoothConstraint;
        this.f10866c = strArr;
        this.f10867d = strArr2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10865a.m16226p3(this.f10866c, this.f10867d, dialogInterface, i);
    }
}
