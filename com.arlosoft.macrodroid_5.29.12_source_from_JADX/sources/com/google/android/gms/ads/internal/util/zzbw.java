package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbw {

    /* renamed from: a */
    final Map f2231a = new ConcurrentHashMap();

    /* renamed from: b */
    private final AtomicInteger f2232b = new AtomicInteger(0);

    /* renamed from: a */
    public final Bitmap mo20335a(Integer num) {
        return (Bitmap) this.f2231a.get(num);
    }
}
