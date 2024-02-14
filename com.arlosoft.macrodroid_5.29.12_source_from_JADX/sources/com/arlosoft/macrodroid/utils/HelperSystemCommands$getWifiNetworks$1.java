package com.arlosoft.macrodroid.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.os.Bundle;
import com.arlosoft.macrodroid.utils.HelperSystemCommands;
import java.util.ArrayList;
import java.util.HashSet;
import p297ja.C13328m;

/* compiled from: HelperSystemCommands.kt */
public final class HelperSystemCommands$getWifiNetworks$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ HelperSystemCommands.C6360a f14943a;

    HelperSystemCommands$getWifiNetworks$1(HelperSystemCommands.C6360a aVar) {
        this.f14943a = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        Bundle resultExtras = getResultExtras(true);
        ArrayList parcelableArrayList = resultExtras != null ? resultExtras.getParcelableArrayList("wifi_network_list") : null;
        if (parcelableArrayList != null) {
            HelperSystemCommands.C6360a aVar = this.f14943a;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object next : parcelableArrayList) {
                WifiConfiguration wifiConfiguration = (WifiConfiguration) next;
                if (hashSet.add(new C13328m(wifiConfiguration.SSID, wifiConfiguration.BSSID))) {
                    arrayList.add(next);
                }
            }
            aVar.mo26545a(arrayList);
            return;
        }
        this.f14943a.mo26545a(C13614t.m87748j());
    }
}
