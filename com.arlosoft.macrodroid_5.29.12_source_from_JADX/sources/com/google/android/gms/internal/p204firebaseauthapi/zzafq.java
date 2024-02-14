package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzafq implements ListIterator {

    /* renamed from: a */
    final ListIterator f39843a;

    /* renamed from: c */
    final /* synthetic */ int f39844c;

    /* renamed from: d */
    final /* synthetic */ zzafs f39845d;

    zzafq(zzafs zzafs, int i) {
        this.f39845d = zzafs;
        this.f39844c = i;
        this.f39843a = zzafs.f39848a.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f39843a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f39843a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f39843a.next();
    }

    public final int nextIndex() {
        return this.f39843a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f39843a.previous();
    }

    public final int previousIndex() {
        return this.f39843a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
