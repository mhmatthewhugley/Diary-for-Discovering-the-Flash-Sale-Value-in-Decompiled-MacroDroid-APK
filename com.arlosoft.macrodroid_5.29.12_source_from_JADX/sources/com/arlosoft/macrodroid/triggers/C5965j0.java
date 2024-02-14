package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.triggers.j0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5965j0 implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ BluetoothBeaconTrigger f14123a;

    public /* synthetic */ C5965j0(BluetoothBeaconTrigger bluetoothBeaconTrigger) {
        this.f14123a = bluetoothBeaconTrigger;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        BluetoothBeaconTrigger.m21708y3(this.f14123a, dialogInterface);
    }
}
