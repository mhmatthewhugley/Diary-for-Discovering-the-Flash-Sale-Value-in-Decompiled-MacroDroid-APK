package com.google.android.gms.internal.places;

import java.util.NoSuchElementException;

final class zzv extends zzx {

    /* renamed from: a */
    private int f45471a = 0;

    /* renamed from: c */
    private final int f45472c;

    /* renamed from: d */
    private final /* synthetic */ zzw f45473d;

    zzv(zzw zzw) {
        this.f45473d = zzw;
        this.f45472c = zzw.size();
    }

    /* renamed from: f */
    public final byte mo53305f() {
        int i = this.f45471a;
        if (i < this.f45472c) {
            this.f45471a = i + 1;
            return this.f45473d.mo53318u(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f45471a < this.f45472c;
    }
}
