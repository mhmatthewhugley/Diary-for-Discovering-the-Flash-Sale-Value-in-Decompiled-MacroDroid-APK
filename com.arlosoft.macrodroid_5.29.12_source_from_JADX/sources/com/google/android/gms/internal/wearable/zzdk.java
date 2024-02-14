package com.google.android.gms.internal.wearable;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzdk {

    /* renamed from: c */
    private static final zzdk f45693c = new zzdk();

    /* renamed from: a */
    private final zzdo f45694a = new zzcu();

    /* renamed from: b */
    private final ConcurrentMap f45695b = new ConcurrentHashMap();

    private zzdk() {
    }

    /* renamed from: a */
    public static zzdk m64336a() {
        return f45693c;
    }

    /* renamed from: b */
    public final zzdn mo54003b(Class cls) {
        zzcd.m64227f(cls, "messageType");
        zzdn zzdn = (zzdn) this.f45695b.get(cls);
        if (zzdn == null) {
            zzdn = this.f45694a.mo53981c(cls);
            zzcd.m64227f(cls, "messageType");
            zzcd.m64227f(zzdn, "schema");
            zzdn zzdn2 = (zzdn) this.f45695b.putIfAbsent(cls, zzdn);
            return zzdn2 == null ? zzdn : zzdn2;
        }
    }
}
