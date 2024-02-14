package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgub implements ListIterator {

    /* renamed from: a */
    final ListIterator f37289a;

    /* renamed from: c */
    final /* synthetic */ int f37290c;

    /* renamed from: d */
    final /* synthetic */ zzgud f37291d;

    zzgub(zzgud zzgud, int i) {
        this.f37291d = zzgud;
        this.f37290c = i;
        this.f37289a = zzgud.f37294a.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f37289a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f37289a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f37289a.next();
    }

    public final int nextIndex() {
        return this.f37289a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f37289a.previous();
    }

    public final int previousIndex() {
        return this.f37289a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
