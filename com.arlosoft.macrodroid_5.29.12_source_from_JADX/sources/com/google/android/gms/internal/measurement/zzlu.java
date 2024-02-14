package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzlu {

    /* renamed from: c */
    private static final zzlu f41694c = new zzlu();

    /* renamed from: a */
    private final zzly f41695a = new zzle();

    /* renamed from: b */
    private final ConcurrentMap f41696b = new ConcurrentHashMap();

    private zzlu() {
    }

    /* renamed from: a */
    public static zzlu m60679a() {
        return f41694c;
    }

    /* renamed from: b */
    public final zzlx mo51518b(Class cls) {
        zzkn.m60543f(cls, "messageType");
        zzlx zzlx = (zzlx) this.f41696b.get(cls);
        if (zzlx == null) {
            zzlx = this.f41695a.mo51493c(cls);
            zzkn.m60543f(cls, "messageType");
            zzkn.m60543f(zzlx, "schema");
            zzlx zzlx2 = (zzlx) this.f41696b.putIfAbsent(cls, zzlx);
            return zzlx2 == null ? zzlx : zzlx2;
        }
    }
}
