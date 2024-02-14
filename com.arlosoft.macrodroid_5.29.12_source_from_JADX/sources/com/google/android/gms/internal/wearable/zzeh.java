package com.google.android.gms.internal.wearable;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzeh implements ListIterator {

    /* renamed from: a */
    final ListIterator f45729a;

    /* renamed from: c */
    final /* synthetic */ int f45730c;

    /* renamed from: d */
    final /* synthetic */ zzej f45731d;

    zzeh(zzej zzej, int i) {
        this.f45731d = zzej;
        this.f45730c = i;
        this.f45729a = zzej.f45734a.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f45729a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f45729a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f45729a.next();
    }

    public final int nextIndex() {
        return this.f45729a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f45729a.previous();
    }

    public final int previousIndex() {
        return this.f45729a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
