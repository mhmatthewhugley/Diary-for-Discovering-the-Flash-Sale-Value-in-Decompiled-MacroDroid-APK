package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzat implements Iterator {

    /* renamed from: a */
    final Iterator f46476a;

    /* renamed from: c */
    final /* synthetic */ zzau f46477c;

    zzat(zzau zzau) {
        this.f46477c = zzau;
        this.f46476a = zzau.f46478a.keySet().iterator();
    }

    /* renamed from: a */
    public final String next() {
        return (String) this.f46476a.next();
    }

    public final boolean hasNext() {
        return this.f46476a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
