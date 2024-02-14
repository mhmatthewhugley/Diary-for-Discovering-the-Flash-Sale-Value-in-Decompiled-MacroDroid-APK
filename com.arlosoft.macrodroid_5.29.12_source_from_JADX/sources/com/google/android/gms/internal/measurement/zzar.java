package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzar implements Iterator {

    /* renamed from: a */
    private int f41207a = 0;

    /* renamed from: c */
    final /* synthetic */ zzat f41208c;

    zzar(zzat zzat) {
        this.f41208c = zzat;
    }

    public final boolean hasNext() {
        return this.f41207a < this.f41208c.f41211a.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f41207a;
        if (i < this.f41208c.f41211a.length()) {
            this.f41207a = i + 1;
            return new zzat(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
