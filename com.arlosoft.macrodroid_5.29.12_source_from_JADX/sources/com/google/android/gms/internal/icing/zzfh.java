package com.google.android.gms.internal.icing;

import java.util.Iterator;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzfh implements Iterator<String> {

    /* renamed from: a */
    final Iterator<String> f40975a;

    /* renamed from: c */
    final /* synthetic */ zzfi f40976c;

    zzfh(zzfi zzfi) {
        this.f40976c = zzfi;
        this.f40975a = zzfi.f40977a.iterator();
    }

    public final boolean hasNext() {
        return this.f40975a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f40975a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
