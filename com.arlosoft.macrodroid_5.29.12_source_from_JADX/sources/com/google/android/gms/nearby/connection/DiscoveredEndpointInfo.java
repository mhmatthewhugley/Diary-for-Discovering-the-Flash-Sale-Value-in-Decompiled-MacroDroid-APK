package com.google.android.gms.nearby.connection;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class DiscoveredEndpointInfo {

    /* renamed from: a */
    private final String f47430a;

    /* renamed from: b */
    private final String f47431b;
    @Nullable

    /* renamed from: c */
    private final BluetoothDevice f47432c;

    /* renamed from: d */
    private final byte[] f47433d;

    /* synthetic */ DiscoveredEndpointInfo(String str, String str2, BluetoothDevice bluetoothDevice, byte[] bArr, zzm zzm) {
        this.f47430a = str;
        this.f47431b = str2;
        this.f47432c = bluetoothDevice;
        this.f47433d = bArr;
    }

    @NonNull
    /* renamed from: a */
    public String mo55668a() {
        return this.f47431b;
    }
}
