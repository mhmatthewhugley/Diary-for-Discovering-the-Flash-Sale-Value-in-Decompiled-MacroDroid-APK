package com.google.android.gms.internal.icing;

import java.util.NoSuchElementException;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzbx extends zzbz {

    /* renamed from: a */
    private int f40788a = 0;

    /* renamed from: c */
    private final int f40789c;

    /* renamed from: d */
    final /* synthetic */ zzcf f40790d;

    zzbx(zzcf zzcf) {
        this.f40790d = zzcf;
        this.f40789c = zzcf.mo50214f();
    }

    public final boolean hasNext() {
        return this.f40788a < this.f40789c;
    }

    public final byte zza() {
        int i = this.f40788a;
        if (i < this.f40789c) {
            this.f40788a = i + 1;
            return this.f40790d.mo50213d(i);
        }
        throw new NoSuchElementException();
    }
}
