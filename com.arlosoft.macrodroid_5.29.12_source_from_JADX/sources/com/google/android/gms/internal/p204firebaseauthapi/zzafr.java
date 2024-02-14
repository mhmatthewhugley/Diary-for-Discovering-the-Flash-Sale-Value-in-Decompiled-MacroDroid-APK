package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzafr implements Iterator {

    /* renamed from: a */
    final Iterator f39846a;

    /* renamed from: c */
    final /* synthetic */ zzafs f39847c;

    zzafr(zzafs zzafs) {
        this.f39847c = zzafs;
        this.f39846a = zzafs.f39848a.iterator();
    }

    public final boolean hasNext() {
        return this.f39846a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f39846a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
