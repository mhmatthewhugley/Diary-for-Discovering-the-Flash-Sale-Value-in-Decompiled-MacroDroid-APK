package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcky implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f28816a;

    /* renamed from: c */
    final /* synthetic */ String f28817c;

    /* renamed from: d */
    final /* synthetic */ int f28818d;

    /* renamed from: f */
    final /* synthetic */ zzclb f28819f;

    zzcky(zzclb zzclb, String str, String str2, int i) {
        this.f28819f = zzclb;
        this.f28816a = str;
        this.f28817c = str2;
        this.f28818d = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        hashMap.put("src", this.f28816a);
        hashMap.put("cachedSrc", this.f28817c);
        hashMap.put("totalBytes", Integer.toString(this.f28818d));
        zzclb.m45658h(this.f28819f, "onPrecacheEvent", hashMap);
    }
}
