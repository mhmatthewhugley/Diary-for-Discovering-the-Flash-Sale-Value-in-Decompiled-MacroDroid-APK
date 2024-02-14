package com.google.android.gms.internal.places;

final class zzak extends zzai {

    /* renamed from: d */
    private final byte[] f45166d;

    /* renamed from: e */
    private final boolean f45167e;

    /* renamed from: f */
    private int f45168f;

    /* renamed from: g */
    private int f45169g;

    /* renamed from: h */
    private int f45170h;

    /* renamed from: i */
    private int f45171i;

    /* renamed from: j */
    private int f45172j;

    private zzak(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f45172j = Integer.MAX_VALUE;
        this.f45166d = bArr;
        this.f45168f = i2 + i;
        this.f45170h = i;
        this.f45171i = i;
        this.f45167e = z;
    }

    /* renamed from: a */
    public final int mo53319a() {
        return this.f45170h - this.f45171i;
    }

    /* renamed from: d */
    public final int mo53320d(int i) throws zzbk {
        if (i >= 0) {
            int a = i + mo53319a();
            int i2 = this.f45172j;
            if (a <= i2) {
                this.f45172j = a;
                int i3 = this.f45168f + this.f45169g;
                this.f45168f = i3;
                int i4 = i3 - this.f45171i;
                if (i4 > a) {
                    int i5 = i4 - a;
                    this.f45169g = i5;
                    this.f45168f = i3 - i5;
                } else {
                    this.f45169g = 0;
                }
                return i2;
            }
            throw zzbk.m63362a();
        }
        throw zzbk.m63363b();
    }
}
