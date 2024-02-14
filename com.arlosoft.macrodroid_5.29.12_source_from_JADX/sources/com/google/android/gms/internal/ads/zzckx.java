package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzckx implements Runnable {

    /* renamed from: A */
    final /* synthetic */ zzclb f28806A;

    /* renamed from: a */
    final /* synthetic */ String f28807a;

    /* renamed from: c */
    final /* synthetic */ String f28808c;

    /* renamed from: d */
    final /* synthetic */ int f28809d;

    /* renamed from: f */
    final /* synthetic */ int f28810f;

    /* renamed from: g */
    final /* synthetic */ long f28811g;

    /* renamed from: o */
    final /* synthetic */ long f28812o;

    /* renamed from: p */
    final /* synthetic */ boolean f28813p;

    /* renamed from: s */
    final /* synthetic */ int f28814s;

    /* renamed from: z */
    final /* synthetic */ int f28815z;

    zzckx(zzclb zzclb, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.f28806A = zzclb;
        this.f28807a = str;
        this.f28808c = str2;
        this.f28809d = i;
        this.f28810f = i2;
        this.f28811g = j;
        this.f28812o = j2;
        this.f28813p = z;
        this.f28814s = i3;
        this.f28815z = i4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.f28807a);
        hashMap.put("cachedSrc", this.f28808c);
        hashMap.put("bytesLoaded", Integer.toString(this.f28809d));
        hashMap.put("totalBytes", Integer.toString(this.f28810f));
        hashMap.put("bufferedDuration", Long.toString(this.f28811g));
        hashMap.put("totalDuration", Long.toString(this.f28812o));
        hashMap.put("cacheReady", true != this.f28813p ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f28814s));
        hashMap.put("playerPreparedCount", Integer.toString(this.f28815z));
        zzclb.m45658h(this.f28806A, "onPrecacheEvent", hashMap);
    }
}
