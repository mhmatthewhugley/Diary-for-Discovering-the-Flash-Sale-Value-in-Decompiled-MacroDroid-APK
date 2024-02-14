package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaht implements zzaip {

    /* renamed from: a */
    private final zzahc f24677a;

    /* renamed from: b */
    private final zzee f24678b = new zzee(new byte[10], 10);

    /* renamed from: c */
    private int f24679c = 0;

    /* renamed from: d */
    private int f24680d;

    /* renamed from: e */
    private zzel f24681e;

    /* renamed from: f */
    private boolean f24682f;

    /* renamed from: g */
    private boolean f24683g;

    /* renamed from: h */
    private boolean f24684h;

    /* renamed from: i */
    private int f24685i;

    /* renamed from: j */
    private int f24686j;

    /* renamed from: k */
    private boolean f24687k;

    public zzaht(zzahc zzahc) {
        this.f24677a = zzahc;
    }

    /* renamed from: d */
    private final void m41484d(int i) {
        this.f24679c = i;
        this.f24680d = 0;
    }

    /* renamed from: e */
    private final boolean m41485e(zzef zzef, @Nullable byte[] bArr, int i) {
        int min = Math.min(zzef.mo45233i(), i - this.f24680d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzef.mo45231g(min);
        } else {
            zzef.mo45226b(bArr, this.f24680d, min);
        }
        int i2 = this.f24680d + min;
        this.f24680d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo41498a() {
        this.f24679c = 0;
        this.f24680d = 0;
        this.f24684h = false;
        this.f24677a.mo41467b();
    }

    /* renamed from: b */
    public final void mo41499b(zzel zzel, zzzl zzzl, zzaio zzaio) {
        this.f24681e = zzel;
        this.f24677a.mo41469d(zzzl, zzaio);
    }

    /* renamed from: c */
    public final void mo41500c(zzef zzef, int i) throws zzbu {
        long j;
        zzef zzef2 = zzef;
        zzdd.m47208b(this.f24681e);
        int i2 = -1;
        int i3 = 2;
        if ((i & 1) != 0) {
            int i4 = this.f24679c;
            if (!(i4 == 0 || i4 == 1)) {
                if (i4 != 2) {
                    int i5 = this.f24686j;
                    if (i5 != -1) {
                        zzdw.m48255e("PesReader", "Unexpected start indicator: expected " + i5 + " more bytes");
                    }
                    this.f24677a.mo41466a();
                } else {
                    zzdw.m48255e("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            m41484d(1);
        }
        int i6 = i;
        while (zzef.mo45233i() > 0) {
            int i7 = this.f24679c;
            if (i7 != 0) {
                int i8 = 0;
                if (i7 != 1) {
                    if (i7 != i3) {
                        int i9 = zzef.mo45233i();
                        int i10 = this.f24686j;
                        if (i10 != i2) {
                            i8 = i9 - i10;
                        }
                        if (i8 > 0) {
                            i9 -= i8;
                            zzef2.mo45229e(zzef.mo45235k() + i9);
                        }
                        this.f24677a.mo41468c(zzef2);
                        int i11 = this.f24686j;
                        if (i11 != i2) {
                            int i12 = i11 - i9;
                            this.f24686j = i12;
                            if (i12 == 0) {
                                this.f24677a.mo41466a();
                                m41484d(1);
                            }
                        }
                    } else {
                        if (m41485e(zzef2, this.f24678b.f33777a, Math.min(10, this.f24685i)) && m41485e(zzef2, (byte[]) null, this.f24685i)) {
                            this.f24678b.mo45203h(0);
                            if (this.f24682f) {
                                this.f24678b.mo45205j(4);
                                int c = this.f24678b.mo45198c(3);
                                this.f24678b.mo45205j(1);
                                int c2 = this.f24678b.mo45198c(15);
                                this.f24678b.mo45205j(1);
                                long c3 = ((long) (c2 << 15)) | (((long) c) << 30) | ((long) this.f24678b.mo45198c(15));
                                this.f24678b.mo45205j(1);
                                if (!this.f24684h && this.f24683g) {
                                    this.f24678b.mo45205j(4);
                                    int c4 = this.f24678b.mo45198c(3);
                                    this.f24678b.mo45205j(1);
                                    int c5 = this.f24678b.mo45198c(15);
                                    this.f24678b.mo45205j(1);
                                    int c6 = this.f24678b.mo45198c(15);
                                    this.f24678b.mo45205j(1);
                                    this.f24681e.mo45357b((((long) c4) << 30) | ((long) (c5 << 15)) | ((long) c6));
                                    this.f24684h = true;
                                }
                                j = this.f24681e.mo45357b(c3);
                            } else {
                                j = -9223372036854775807L;
                            }
                            i6 |= true != this.f24687k ? 0 : 4;
                            this.f24677a.mo41470e(j, i6);
                            m41484d(3);
                            i2 = -1;
                        }
                    }
                } else if (m41485e(zzef2, this.f24678b.f33777a, 9)) {
                    int i13 = 0;
                    this.f24678b.mo45203h(0);
                    int c7 = this.f24678b.mo45198c(24);
                    if (c7 != 1) {
                        zzdw.m48255e("PesReader", "Unexpected start code prefix: " + c7);
                        i2 = -1;
                        this.f24686j = -1;
                    } else {
                        this.f24678b.mo45205j(8);
                        int c8 = this.f24678b.mo45198c(16);
                        this.f24678b.mo45205j(5);
                        this.f24687k = this.f24678b.mo45207l();
                        this.f24678b.mo45205j(2);
                        this.f24682f = this.f24678b.mo45207l();
                        this.f24683g = this.f24678b.mo45207l();
                        this.f24678b.mo45205j(6);
                        int c9 = this.f24678b.mo45198c(8);
                        this.f24685i = c9;
                        if (c8 == 0) {
                            this.f24686j = -1;
                        } else {
                            int i14 = (c8 - 3) - c9;
                            this.f24686j = i14;
                            if (i14 < 0) {
                                zzdw.m48255e("PesReader", "Found negative packet payload size: " + i14);
                                i2 = -1;
                                this.f24686j = -1;
                                i13 = 2;
                            }
                        }
                        i2 = -1;
                        i13 = 2;
                    }
                    m41484d(i13);
                } else {
                    i2 = -1;
                }
            } else {
                zzef2.mo45231g(zzef.mo45233i());
            }
            i3 = 2;
        }
    }
}
