package com.google.android.gms.internal.places;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzcv {

    /* renamed from: c */
    private static final zzcv f45348c = new zzcv();

    /* renamed from: a */
    private final zzcz f45349a = new zzbx();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, zzda<?>> f45350b = new ConcurrentHashMap();

    private zzcv() {
    }

    /* renamed from: a */
    public static zzcv m63517a() {
        return f45348c;
    }

    /* renamed from: b */
    public final <T> zzda<T> mo53547b(Class<T> cls) {
        zzbd.m63344e(cls, "messageType");
        zzda<T> zzda = (zzda) this.f45350b.get(cls);
        if (zzda != null) {
            return zzda;
        }
        zzda<T> a = this.f45349a.mo53502a(cls);
        zzbd.m63344e(cls, "messageType");
        zzbd.m63344e(a, "schema");
        zzda<T> putIfAbsent = this.f45350b.putIfAbsent(cls, a);
        return putIfAbsent != null ? putIfAbsent : a;
    }

    /* renamed from: c */
    public final <T> zzda<T> mo53548c(T t) {
        return mo53547b(t.getClass());
    }
}
