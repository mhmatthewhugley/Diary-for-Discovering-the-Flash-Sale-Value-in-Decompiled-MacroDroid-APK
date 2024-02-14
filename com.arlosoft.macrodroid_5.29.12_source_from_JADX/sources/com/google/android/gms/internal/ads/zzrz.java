package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzrz {

    /* renamed from: d */
    private static final AtomicLong f38394d = new AtomicLong();

    /* renamed from: a */
    public final zzfc f38395a;

    /* renamed from: b */
    public final Uri f38396b;

    /* renamed from: c */
    public final Map f38397c;

    public zzrz(long j, zzfc zzfc, Uri uri, Map map, long j2, long j3, long j4) {
        this.f38395a = zzfc;
        this.f38396b = uri;
        this.f38397c = map;
    }

    /* renamed from: a */
    public static long m54830a() {
        return f38394d.getAndIncrement();
    }
}
