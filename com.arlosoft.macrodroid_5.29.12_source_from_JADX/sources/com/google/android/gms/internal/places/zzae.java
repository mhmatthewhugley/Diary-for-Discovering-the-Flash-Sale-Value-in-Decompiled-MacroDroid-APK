package com.google.android.gms.internal.places;

final class zzae {

    /* renamed from: a */
    private final zzaj f45154a;

    /* renamed from: b */
    private final byte[] f45155b;

    private zzae(int i) {
        byte[] bArr = new byte[i];
        this.f45155b = bArr;
        this.f45154a = zzaj.m63142y(bArr);
    }

    /* renamed from: a */
    public final zzw mo53307a() {
        if (this.f45154a.mo53336b() == 0) {
            return new zzag(this.f45155b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: b */
    public final zzaj mo53308b() {
        return this.f45154a;
    }

    /* synthetic */ zzae(int i, zzv zzv) {
        this(i);
    }
}
