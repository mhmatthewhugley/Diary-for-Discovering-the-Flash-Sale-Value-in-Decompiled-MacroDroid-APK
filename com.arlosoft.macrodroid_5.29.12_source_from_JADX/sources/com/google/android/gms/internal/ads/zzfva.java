package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfva extends zzfvc {
    zzfva() {
        super((zzfva) null);
    }

    /* renamed from: j */
    static final zzfvc m51074j(int i) {
        return i < 0 ? zzfvc.f36464b : i > 0 ? zzfvc.f36465c : zzfvc.f36463a;
    }

    /* renamed from: a */
    public final int mo46394a() {
        return 0;
    }

    /* renamed from: b */
    public final zzfvc mo46395b(int i, int i2) {
        return m51074j(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    /* renamed from: c */
    public final zzfvc mo46396c(Object obj, Object obj2, Comparator comparator) {
        return m51074j(comparator.compare(obj, obj2));
    }

    /* renamed from: d */
    public final zzfvc mo46397d(boolean z, boolean z2) {
        return m51074j(zzfxr.m51253a(z, z2));
    }

    /* renamed from: e */
    public final zzfvc mo46398e(boolean z, boolean z2) {
        return m51074j(zzfxr.m51253a(false, false));
    }
}
