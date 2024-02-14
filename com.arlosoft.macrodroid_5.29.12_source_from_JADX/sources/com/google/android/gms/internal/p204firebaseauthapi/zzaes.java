package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaes */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaes {

    /* renamed from: c */
    private static final zzaes f39805c = new zzaes();

    /* renamed from: a */
    private final zzaex f39806a = new zzaec();

    /* renamed from: b */
    private final ConcurrentMap f39807b = new ConcurrentHashMap();

    private zzaes() {
    }

    /* renamed from: a */
    public static zzaes m56608a() {
        return f39805c;
    }

    /* renamed from: b */
    public final zzaew mo49150b(Class cls) {
        zzadl.m56462f(cls, "messageType");
        zzaew zzaew = (zzaew) this.f39807b.get(cls);
        if (zzaew == null) {
            zzaew = this.f39806a.mo49124c(cls);
            zzadl.m56462f(cls, "messageType");
            zzadl.m56462f(zzaew, "schema");
            zzaew zzaew2 = (zzaew) this.f39807b.putIfAbsent(cls, zzaew);
            return zzaew2 == null ? zzaew : zzaew2;
        }
    }
}
