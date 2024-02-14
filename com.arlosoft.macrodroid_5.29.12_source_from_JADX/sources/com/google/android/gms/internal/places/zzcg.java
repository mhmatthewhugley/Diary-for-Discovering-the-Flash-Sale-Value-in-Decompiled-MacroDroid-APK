package com.google.android.gms.internal.places;

import java.util.Iterator;
import java.util.Map;

final class zzcg implements zzcd {
    zzcg() {
    }

    /* renamed from: a */
    public final int mo53511a(int i, Object obj, Object obj2) {
        zzce zzce = (zzce) obj;
        if (zzce.isEmpty()) {
            return 0;
        }
        Iterator it = zzce.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final Object mo53512b(Object obj, Object obj2) {
        zzce zzce = (zzce) obj;
        zzce zzce2 = (zzce) obj2;
        if (!zzce2.isEmpty()) {
            if (!zzce.mo53519a()) {
                zzce = zzce.mo53523e();
            }
            zzce.mo53521c(zzce2);
        }
        return zzce;
    }

    /* renamed from: c */
    public final zzcb<?, ?> mo53513c(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: d */
    public final Object mo53514d(Object obj) {
        ((zzce) obj).mo53520b();
        return obj;
    }

    /* renamed from: e */
    public final Object mo53515e(Object obj) {
        return zzce.m63420d().mo53523e();
    }

    /* renamed from: f */
    public final boolean mo53516f(Object obj) {
        return !((zzce) obj).mo53519a();
    }

    /* renamed from: g */
    public final Map<?, ?> mo53517g(Object obj) {
        return (zzce) obj;
    }

    /* renamed from: h */
    public final Map<?, ?> mo53518h(Object obj) {
        return (zzce) obj;
    }
}
