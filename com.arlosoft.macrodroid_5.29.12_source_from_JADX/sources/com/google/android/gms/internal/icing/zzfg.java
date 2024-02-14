package com.google.android.gms.internal.icing;

import java.util.ListIterator;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzfg implements ListIterator<String> {

    /* renamed from: a */
    final ListIterator<String> f40972a;

    /* renamed from: c */
    final /* synthetic */ int f40973c;

    /* renamed from: d */
    final /* synthetic */ zzfi f40974d;

    zzfg(zzfi zzfi, int i) {
        this.f40974d = zzfi;
        this.f40973c = i;
        this.f40972a = zzfi.f40977a.listIterator(i);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f40972a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f40972a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f40972a.next();
    }

    public final int nextIndex() {
        return this.f40972a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f40972a.previous();
    }

    public final int previousIndex() {
        return this.f40972a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
