package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzad implements Iterator {

    /* renamed from: a */
    private int f41182a = 0;

    /* renamed from: c */
    final /* synthetic */ zzae f41183c;

    zzad(zzae zzae) {
        this.f41183c = zzae;
    }

    public final boolean hasNext() {
        return this.f41182a < this.f41183c.mo50714l();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f41182a < this.f41183c.mo50714l()) {
            zzae zzae = this.f41183c;
            int i = this.f41182a;
            this.f41182a = i + 1;
            return zzae.mo50715m(i);
        }
        int i2 = this.f41182a;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}
