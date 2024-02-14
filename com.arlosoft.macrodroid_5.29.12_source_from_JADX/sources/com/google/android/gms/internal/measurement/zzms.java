package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzms implements Iterator {

    /* renamed from: a */
    final Iterator f41734a;

    /* renamed from: c */
    final /* synthetic */ zzmt f41735c;

    zzms(zzmt zzmt) {
        this.f41735c = zzmt;
        this.f41734a = zzmt.f41736a.iterator();
    }

    public final boolean hasNext() {
        return this.f41734a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f41734a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
