package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzmr implements ListIterator {

    /* renamed from: a */
    final ListIterator f41731a;

    /* renamed from: c */
    final /* synthetic */ int f41732c;

    /* renamed from: d */
    final /* synthetic */ zzmt f41733d;

    zzmr(zzmt zzmt, int i) {
        this.f41733d = zzmt;
        this.f41732c = i;
        this.f41731a = zzmt.f41736a.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f41731a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f41731a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f41731a.next();
    }

    public final int nextIndex() {
        return this.f41731a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f41731a.previous();
    }

    public final int previousIndex() {
        return this.f41731a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
