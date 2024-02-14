package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;
import java.util.List;
import kotlin.jvm.internal.C13684d0;
import p081e1.C7264a;

/* renamed from: com.arlosoft.macrodroid.triggers.p0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6037p0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ BluetoothBeaconTrigger f14272a;

    /* renamed from: c */
    public final /* synthetic */ List f14273c;

    /* renamed from: d */
    public final /* synthetic */ C7264a f14274d;

    /* renamed from: f */
    public final /* synthetic */ C13684d0 f14275f;

    public /* synthetic */ C6037p0(BluetoothBeaconTrigger bluetoothBeaconTrigger, List list, C7264a aVar, C13684d0 d0Var) {
        this.f14272a = bluetoothBeaconTrigger;
        this.f14273c = list;
        this.f14274d = aVar;
        this.f14275f = d0Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BluetoothBeaconTrigger.m21707x3(this.f14272a, this.f14273c, this.f14274d, this.f14275f, dialogInterface, i);
    }
}
