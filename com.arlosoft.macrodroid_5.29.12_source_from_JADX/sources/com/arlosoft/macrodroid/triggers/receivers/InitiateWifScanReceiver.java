package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import p148q0.C8151a;

public class InitiateWifScanReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            ((WifiManager) context.getApplicationContext().getSystemService("wifi")).startScan();
        } catch (SecurityException e) {
            C8151a.m33873n(e);
        }
    }
}
