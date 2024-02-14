package com.google.android.gms.internal.icing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzem {

    /* renamed from: c */
    private static final zzem f40937c = new zzem();

    /* renamed from: a */
    private final zzeq f40938a = new zzdw();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, zzep<?>> f40939b = new ConcurrentHashMap();

    private zzem() {
    }

    /* renamed from: a */
    public static zzem m58920a() {
        return f40937c;
    }

    /* renamed from: b */
    public final <T> zzep<T> mo50362b(Class<T> cls) {
        zzdh.m58817b(cls, "messageType");
        zzep<T> zzep = (zzep) this.f40939b.get(cls);
        if (zzep == null) {
            zzep = this.f40938a.mo50341c(cls);
            zzdh.m58817b(cls, "messageType");
            zzdh.m58817b(zzep, "schema");
            zzep<T> putIfAbsent = this.f40939b.putIfAbsent(cls, zzep);
            return putIfAbsent == null ? zzep : putIfAbsent;
        }
    }
}
