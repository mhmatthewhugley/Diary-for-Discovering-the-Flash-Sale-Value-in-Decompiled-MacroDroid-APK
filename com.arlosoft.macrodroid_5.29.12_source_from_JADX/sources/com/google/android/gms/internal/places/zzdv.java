package com.google.android.gms.internal.places;

import java.util.Iterator;

final class zzdv implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f45390a;

    /* renamed from: c */
    private final /* synthetic */ zzdt f45391c;

    zzdv(zzdt zzdt) {
        this.f45391c = zzdt;
        this.f45390a = zzdt.f45389a.iterator();
    }

    public final boolean hasNext() {
        return this.f45390a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f45390a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
