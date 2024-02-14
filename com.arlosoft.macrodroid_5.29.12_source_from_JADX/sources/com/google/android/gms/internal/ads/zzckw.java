package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzckw implements Runnable {

    /* renamed from: A */
    final /* synthetic */ int f28795A;

    /* renamed from: B */
    final /* synthetic */ zzclb f28796B;

    /* renamed from: a */
    final /* synthetic */ String f28797a;

    /* renamed from: c */
    final /* synthetic */ String f28798c;

    /* renamed from: d */
    final /* synthetic */ long f28799d;

    /* renamed from: f */
    final /* synthetic */ long f28800f;

    /* renamed from: g */
    final /* synthetic */ long f28801g;

    /* renamed from: o */
    final /* synthetic */ long f28802o;

    /* renamed from: p */
    final /* synthetic */ long f28803p;

    /* renamed from: s */
    final /* synthetic */ boolean f28804s;

    /* renamed from: z */
    final /* synthetic */ int f28805z;

    zzckw(zzclb zzclb, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.f28796B = zzclb;
        this.f28797a = str;
        this.f28798c = str2;
        this.f28799d = j;
        this.f28800f = j2;
        this.f28801g = j3;
        this.f28802o = j4;
        this.f28803p = j5;
        this.f28804s = z;
        this.f28805z = i;
        this.f28795A = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.f28797a);
        hashMap.put("cachedSrc", this.f28798c);
        hashMap.put("bufferedDuration", Long.toString(this.f28799d));
        hashMap.put("totalDuration", Long.toString(this.f28800f));
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26838D1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f28801g));
            hashMap.put("qoeCachedBytes", Long.toString(this.f28802o));
            hashMap.put("totalBytes", Long.toString(this.f28803p));
            hashMap.put("reportTime", Long.toString(zzt.m2889b().mo21950a()));
        }
        hashMap.put("cacheReady", true != this.f28804s ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f28805z));
        hashMap.put("playerPreparedCount", Integer.toString(this.f28795A));
        zzclb.m45658h(this.f28796B, "onPrecacheEvent", hashMap);
    }
}
