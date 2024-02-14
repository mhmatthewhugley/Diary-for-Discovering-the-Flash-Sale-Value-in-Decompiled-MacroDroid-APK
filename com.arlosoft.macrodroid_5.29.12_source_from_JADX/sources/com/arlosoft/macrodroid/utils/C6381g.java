package com.arlosoft.macrodroid.utils;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothProfile;
import android.content.Context;

/* renamed from: com.arlosoft.macrodroid.utils.g */
/* compiled from: BluetoothA2DPRequester */
public class C6381g implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    private final C6382a f14972a;

    /* renamed from: com.arlosoft.macrodroid.utils.g$a */
    /* compiled from: BluetoothA2DPRequester */
    public interface C6382a {
        /* renamed from: K */
        void mo25593K(BluetoothA2dp bluetoothA2dp);
    }

    public C6381g(C6382a aVar) {
        this.f14972a = aVar;
    }

    /* renamed from: a */
    public void mo32422a(Context context, BluetoothAdapter bluetoothAdapter) {
        bluetoothAdapter.getProfileProxy(context, this, 2);
    }

    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        C6382a aVar = this.f14972a;
        if (aVar != null) {
            aVar.mo25593K((BluetoothA2dp) bluetoothProfile);
        }
    }

    public void onServiceDisconnected(int i) {
    }
}
