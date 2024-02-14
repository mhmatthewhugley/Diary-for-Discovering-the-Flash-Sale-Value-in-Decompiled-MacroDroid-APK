package com.arlosoft.macrodroid.action;

import android.bluetooth.BluetoothAdapter;

/* renamed from: com.arlosoft.macrodroid.action.rf */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3399rf implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SetAirplaneModeAction f9045a;

    /* renamed from: c */
    public final /* synthetic */ BluetoothAdapter f9046c;

    public /* synthetic */ C3399rf(SetAirplaneModeAction setAirplaneModeAction, BluetoothAdapter bluetoothAdapter) {
        this.f9045a = setAirplaneModeAction;
        this.f9046c = bluetoothAdapter;
    }

    public final void run() {
        this.f9045a.m12204F3(this.f9046c);
    }
}
