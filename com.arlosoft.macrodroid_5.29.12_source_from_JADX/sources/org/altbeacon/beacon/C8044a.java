package org.altbeacon.beacon;

import android.bluetooth.BluetoothDevice;

/* renamed from: org.altbeacon.beacon.a */
/* compiled from: AltBeaconParser */
public class C8044a extends BeaconParser {
    public C8044a() {
        this.mHardwareAssistManufacturers = new int[]{280};
        mo38029u("m:2-3=beac,i:4-19,i:20-21,i:22-23,p:24-24,d:25-25");
        this.mIdentifier = "altbeacon";
    }

    /* renamed from: g */
    public Beacon mo38018g(byte[] bArr, int i, BluetoothDevice bluetoothDevice, long j) {
        return mo38019h(bArr, i, bluetoothDevice, j, new AltBeacon());
    }
}
