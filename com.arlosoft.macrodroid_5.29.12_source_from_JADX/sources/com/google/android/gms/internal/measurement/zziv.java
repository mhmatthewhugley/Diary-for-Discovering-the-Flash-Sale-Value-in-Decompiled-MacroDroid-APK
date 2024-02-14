package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zziv extends zzix {

    /* renamed from: a */
    private int f41535a = 0;

    /* renamed from: c */
    private final int f41536c;

    /* renamed from: d */
    final /* synthetic */ zzje f41537d;

    zziv(zzje zzje) {
        this.f41537d = zzje;
        this.f41536c = zzje.mo51336f();
    }

    public final boolean hasNext() {
        return this.f41535a < this.f41536c;
    }

    public final byte zza() {
        int i = this.f41535a;
        if (i < this.f41536c) {
            this.f41535a = i + 1;
            return this.f41537d.mo51335d(i);
        }
        throw new NoSuchElementException();
    }
}
