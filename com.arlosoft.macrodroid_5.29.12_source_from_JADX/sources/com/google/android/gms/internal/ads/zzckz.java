package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzckz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f28820a;

    /* renamed from: c */
    final /* synthetic */ String f28821c;

    /* renamed from: d */
    final /* synthetic */ long f28822d;

    /* renamed from: f */
    final /* synthetic */ zzclb f28823f;

    zzckz(zzclb zzclb, String str, String str2, long j) {
        this.f28823f = zzclb;
        this.f28820a = str;
        this.f28821c = str2;
        this.f28822d = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        hashMap.put("src", this.f28820a);
        hashMap.put("cachedSrc", this.f28821c);
        hashMap.put("totalDuration", Long.toString(this.f28822d));
        zzclb.m45658h(this.f28823f, "onPrecacheEvent", hashMap);
    }
}
