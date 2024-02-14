package com.google.android.gms.internal.places;

final class zzbv extends zzbu {
    private zzbv() {
        super();
    }

    /* renamed from: e */
    private static <E> zzbh<E> m63389e(Object obj, long j) {
        return (zzbh) zzdy.m63667G(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53500a(Object obj, long j) {
        m63389e(obj, j).mo53475h2();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <E> void mo53501b(Object obj, Object obj2, long j) {
        zzbh e = m63389e(obj, j);
        zzbh e2 = m63389e(obj2, j);
        int size = e.size();
        int size2 = e2.size();
        if (size > 0 && size2 > 0) {
            if (!e.mo53474N()) {
                e = e.mo53396E(size2 + size);
            }
            e.addAll(e2);
        }
        if (size > 0) {
            e2 = e;
        }
        zzdy.m63682g(obj, j, e2);
    }
}
