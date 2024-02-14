package com.google.android.gms.internal.wearable;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzan extends zzap {

    /* renamed from: a */
    private int f45538a = 0;

    /* renamed from: c */
    private final int f45539c;

    /* renamed from: d */
    final /* synthetic */ zzaw f45540d;

    zzan(zzaw zzaw) {
        this.f45540d = zzaw;
        this.f45539c = zzaw.mo53831f();
    }

    public final boolean hasNext() {
        return this.f45538a < this.f45539c;
    }

    public final byte zza() {
        int i = this.f45538a;
        if (i < this.f45539c) {
            this.f45538a = i + 1;
            return this.f45540d.mo53830d(i);
        }
        throw new NoSuchElementException();
    }
}
