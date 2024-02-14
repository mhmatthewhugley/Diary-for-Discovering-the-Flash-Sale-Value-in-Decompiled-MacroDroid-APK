package com.google.android.gms.nearby.connection;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzl {

    /* renamed from: a */
    private String f47486a;

    /* renamed from: b */
    private String f47487b;
    @Nullable

    /* renamed from: c */
    private BluetoothDevice f47488c;

    /* renamed from: d */
    private byte[] f47489d;

    /* renamed from: a */
    public final zzl mo55723a(BluetoothDevice bluetoothDevice) {
        this.f47488c = bluetoothDevice;
        this.f47487b = "__UNRECOGNIZED_BLUETOOTH_DEVICE__";
        this.f47489d = "__UNRECOGNIZED_BLUETOOTH_DEVICE__".getBytes();
        return this;
    }

    /* renamed from: b */
    public final zzl mo55724b(byte[] bArr) {
        this.f47489d = bArr;
        return this;
    }

    /* renamed from: c */
    public final zzl mo55725c(String str) {
        this.f47487b = str;
        return this;
    }

    /* renamed from: d */
    public final zzl mo55726d(String str) {
        this.f47486a = str;
        return this;
    }

    /* renamed from: e */
    public final DiscoveredEndpointInfo mo55727e() {
        return new DiscoveredEndpointInfo(this.f47486a, this.f47487b, this.f47488c, this.f47489d, (zzm) null);
    }
}
