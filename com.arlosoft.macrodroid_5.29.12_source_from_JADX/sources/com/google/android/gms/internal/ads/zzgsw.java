package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgsw {

    /* renamed from: c */
    private static final zzgsw f37241c = new zzgsw();

    /* renamed from: a */
    private final zzgti f37242a = new zzgsg();

    /* renamed from: b */
    private final ConcurrentMap f37243b = new ConcurrentHashMap();

    private zzgsw() {
    }

    /* renamed from: a */
    public static zzgsw m53178a() {
        return f37241c;
    }

    /* renamed from: b */
    public final zzgth mo47422b(Class cls) {
        zzgro.m53028f(cls, "messageType");
        zzgth zzgth = (zzgth) this.f37243b.get(cls);
        if (zzgth == null) {
            zzgth = this.f37242a.mo47396c(cls);
            zzgro.m53028f(cls, "messageType");
            zzgro.m53028f(zzgth, "schema");
            zzgth zzgth2 = (zzgth) this.f37243b.putIfAbsent(cls, zzgth);
            return zzgth2 == null ? zzgth : zzgth2;
        }
    }
}
