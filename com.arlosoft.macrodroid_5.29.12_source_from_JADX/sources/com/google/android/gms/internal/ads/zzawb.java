package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzawb implements zzavy {

    /* renamed from: a */
    private final zzbak f25972a;

    /* renamed from: b */
    private final int f25973b;

    /* renamed from: c */
    private final int f25974c;

    /* renamed from: d */
    private int f25975d;

    /* renamed from: e */
    private int f25976e;

    public zzawb(zzavv zzavv) {
        zzbak zzbak = zzavv.f25855P0;
        this.f25972a = zzbak;
        zzbak.mo42336v(12);
        this.f25974c = zzbak.mo42323i() & 255;
        this.f25973b = zzbak.mo42323i();
    }

    /* renamed from: a */
    public final boolean mo42138a() {
        return false;
    }

    public final int zza() {
        return this.f25973b;
    }

    public final int zzb() {
        int i = this.f25974c;
        if (i == 8) {
            return this.f25972a.mo42321g();
        }
        if (i == 16) {
            return this.f25972a.mo42324j();
        }
        int i2 = this.f25975d;
        this.f25975d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f25976e & 15;
        }
        int g = this.f25972a.mo42321g();
        this.f25976e = g;
        return (g & 240) >> 4;
    }
}
