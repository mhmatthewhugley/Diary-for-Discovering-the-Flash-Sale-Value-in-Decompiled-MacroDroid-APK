package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzguc implements Iterator {

    /* renamed from: a */
    final Iterator f37292a;

    /* renamed from: c */
    final /* synthetic */ zzgud f37293c;

    zzguc(zzgud zzgud) {
        this.f37293c = zzgud;
        this.f37292a = zzgud.f37294a.iterator();
    }

    public final boolean hasNext() {
        return this.f37292a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f37292a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
