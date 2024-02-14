package com.google.android.gms.internal.places;

public abstract class zzai {

    /* renamed from: a */
    private int f45156a;

    /* renamed from: b */
    private int f45157b;

    /* renamed from: c */
    private boolean f45158c;

    private zzai() {
        this.f45156a = 100;
        this.f45157b = Integer.MAX_VALUE;
        this.f45158c = false;
    }

    /* renamed from: b */
    public static long m63091b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: c */
    static zzai m63092c(byte[] bArr, int i, int i2, boolean z) {
        zzak zzak = new zzak(bArr, 0, i2, false);
        try {
            zzak.mo53320d(i2);
            return zzak;
        } catch (zzbk e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static int m63093e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract int mo53319a();

    /* renamed from: d */
    public abstract int mo53320d(int i) throws zzbk;
}
