package com.google.android.gms.internal.wearable;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzei implements Iterator {

    /* renamed from: a */
    final Iterator f45732a;

    /* renamed from: c */
    final /* synthetic */ zzej f45733c;

    zzei(zzej zzej) {
        this.f45733c = zzej;
        this.f45732a = zzej.f45734a.iterator();
    }

    public final boolean hasNext() {
        return this.f45732a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f45732a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
