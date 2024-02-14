package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzckv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f28790a;

    /* renamed from: c */
    final /* synthetic */ String f28791c;

    /* renamed from: d */
    final /* synthetic */ int f28792d;

    /* renamed from: f */
    final /* synthetic */ int f28793f;

    /* renamed from: g */
    final /* synthetic */ zzclb f28794g;

    zzckv(zzclb zzclb, String str, String str2, int i, int i2, boolean z) {
        this.f28794g = zzclb;
        this.f28790a = str;
        this.f28791c = str2;
        this.f28792d = i;
        this.f28793f = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.f28790a);
        hashMap.put("cachedSrc", this.f28791c);
        hashMap.put("bytesLoaded", Integer.toString(this.f28792d));
        hashMap.put("totalBytes", Integer.toString(this.f28793f));
        hashMap.put("cacheReady", "0");
        zzclb.m45658h(this.f28794g, "onPrecacheEvent", hashMap);
    }
}
