package com.google.android.gms.internal.places;

import java.util.ListIterator;

final class zzdw implements ListIterator<String> {

    /* renamed from: a */
    private ListIterator<String> f45392a;

    /* renamed from: c */
    private final /* synthetic */ int f45393c;

    /* renamed from: d */
    private final /* synthetic */ zzdt f45394d;

    zzdw(zzdt zzdt, int i) {
        this.f45394d = zzdt;
        this.f45393c = i;
        this.f45392a = zzdt.f45389a.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f45392a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f45392a.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f45392a.next();
    }

    public final int nextIndex() {
        return this.f45392a.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f45392a.previous();
    }

    public final int previousIndex() {
        return this.f45392a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
