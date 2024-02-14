package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzas implements Iterator {

    /* renamed from: a */
    private int f41209a = 0;

    /* renamed from: c */
    final /* synthetic */ zzat f41210c;

    zzas(zzat zzat) {
        this.f41210c = zzat;
    }

    public final boolean hasNext() {
        return this.f41209a < this.f41210c.f41211a.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f41209a;
        zzat zzat = this.f41210c;
        if (i < zzat.f41211a.length()) {
            String h = zzat.f41211a;
            this.f41209a = i + 1;
            return new zzat(String.valueOf(h.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
