package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
final class zza extends Thread {

    /* renamed from: a */
    final /* synthetic */ Map f1776a;

    zza(AdvertisingIdClient advertisingIdClient, Map map) {
        this.f1776a = map;
    }

    public final void run() {
        Map map = this.f1776a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        zzc.m1830a(buildUpon.build().toString());
    }
}
