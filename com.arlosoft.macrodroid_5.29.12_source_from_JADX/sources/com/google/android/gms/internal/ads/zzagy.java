package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.android.p023dx.p026io.Opcodes;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzagy implements zzahc {

    /* renamed from: v */
    private static final byte[] f24487v = {73, 68, 51};

    /* renamed from: a */
    private final boolean f24488a;

    /* renamed from: b */
    private final zzee f24489b = new zzee(new byte[7], 7);

    /* renamed from: c */
    private final zzef f24490c = new zzef(Arrays.copyOf(f24487v, 10));
    @Nullable

    /* renamed from: d */
    private final String f24491d;

    /* renamed from: e */
    private String f24492e;

    /* renamed from: f */
    private zzaap f24493f;

    /* renamed from: g */
    private zzaap f24494g;

    /* renamed from: h */
    private int f24495h;

    /* renamed from: i */
    private int f24496i;

    /* renamed from: j */
    private int f24497j;

    /* renamed from: k */
    private boolean f24498k;

    /* renamed from: l */
    private boolean f24499l;

    /* renamed from: m */
    private int f24500m;

    /* renamed from: n */
    private int f24501n;

    /* renamed from: o */
    private int f24502o;

    /* renamed from: p */
    private boolean f24503p;

    /* renamed from: q */
    private long f24504q;

    /* renamed from: r */
    private int f24505r;

    /* renamed from: s */
    private long f24506s;

    /* renamed from: t */
    private zzaap f24507t;

    /* renamed from: u */
    private long f24508u;

    public zzagy(boolean z, @Nullable String str) {
        m41387h();
        this.f24500m = -1;
        this.f24501n = -1;
        this.f24504q = -9223372036854775807L;
        this.f24506s = -9223372036854775807L;
        this.f24488a = z;
        this.f24491d = str;
    }

    /* renamed from: f */
    public static boolean m41385f(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: g */
    private final void m41386g() {
        this.f24499l = false;
        m41387h();
    }

    /* renamed from: h */
    private final void m41387h() {
        this.f24495h = 0;
        this.f24496i = 0;
        this.f24497j = 256;
    }

    /* renamed from: i */
    private final void m41388i() {
        this.f24495h = 3;
        this.f24496i = 0;
    }

    /* renamed from: j */
    private final void m41389j(zzaap zzaap, long j, int i, int i2) {
        this.f24495h = 4;
        this.f24496i = i;
        this.f24507t = zzaap;
        this.f24508u = j;
        this.f24505r = i2;
    }

    /* renamed from: k */
    private final boolean m41390k(zzef zzef, byte[] bArr, int i) {
        int min = Math.min(zzef.mo45233i(), i - this.f24496i);
        zzef.mo45226b(bArr, this.f24496i, min);
        int i2 = this.f24496i + min;
        this.f24496i = i2;
        return i2 == i;
    }

    /* renamed from: l */
    private static final boolean m41391l(byte b, byte b2) {
        return m41385f((b2 & 255) | 65280);
    }

    /* renamed from: m */
    private static final boolean m41392m(zzef zzef, byte[] bArr, int i) {
        if (zzef.mo45233i() < i) {
            return false;
        }
        zzef.mo45226b(bArr, 0, i);
        return true;
    }

    /* renamed from: a */
    public final void mo41466a() {
    }

    /* renamed from: b */
    public final void mo41467b() {
        this.f24506s = -9223372036854775807L;
        m41386g();
    }

    /* renamed from: c */
    public final void mo41468c(zzef zzef) throws zzbu {
        int i;
        byte b;
        int i2;
        zzef zzef2 = zzef;
        Objects.requireNonNull(this.f24493f);
        int i3 = zzen.f34500a;
        while (zzef.mo45233i() > 0) {
            int i4 = this.f24495h;
            int i5 = 13;
            int i6 = 2;
            if (i4 == 0) {
                byte[] h = zzef.mo45232h();
                int k = zzef.mo45235k();
                int l = zzef.mo45236l();
                while (true) {
                    if (k >= l) {
                        zzef2.mo45230f(k);
                        break;
                    }
                    i = k + 1;
                    b = h[k] & 255;
                    if (this.f24497j == 512 && m41391l((byte) -1, (byte) b)) {
                        if (this.f24499l) {
                            break;
                        }
                        int i7 = i - 2;
                        zzef2.mo45230f(i7 + 1);
                        if (m41392m(zzef2, this.f24489b.f33777a, 1)) {
                            this.f24489b.mo45203h(4);
                            int c = this.f24489b.mo45198c(1);
                            int i8 = this.f24500m;
                            if (i8 == -1 || c == i8) {
                                if (this.f24501n != -1) {
                                    if (!m41392m(zzef2, this.f24489b.f33777a, 1)) {
                                        break;
                                    }
                                    this.f24489b.mo45203h(i6);
                                    if (this.f24489b.mo45198c(4) == this.f24501n) {
                                        zzef2.mo45230f(i7 + 2);
                                    }
                                }
                                if (!m41392m(zzef2, this.f24489b.f33777a, 4)) {
                                    break;
                                }
                                this.f24489b.mo45203h(14);
                                int c2 = this.f24489b.mo45198c(i5);
                                if (c2 >= 7) {
                                    byte[] h2 = zzef.mo45232h();
                                    int l2 = zzef.mo45236l();
                                    int i9 = i7 + c2;
                                    if (i9 < l2) {
                                        byte b2 = h2[i9];
                                        if (b2 != -1) {
                                            if (b2 == 73) {
                                                int i10 = i9 + 1;
                                                if (i10 != l2) {
                                                    if (h2[i10] == 68) {
                                                        int i11 = i9 + 2;
                                                        if (i11 != l2) {
                                                            if (h2[i11] == 51) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            int i12 = i9 + 1;
                                            if (i12 == l2) {
                                                break;
                                            }
                                            byte b3 = h2[i12];
                                            if (m41391l((byte) -1, b3) && ((b3 & 8) >> 3) == c) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    int i13 = this.f24497j;
                    byte b4 = i13 | b;
                    if (b4 == 329) {
                        i2 = Opcodes.FILL_ARRAY_DATA_PAYLOAD;
                    } else if (b4 == 511) {
                        i2 = 512;
                    } else if (b4 != 836) {
                        if (b4 == 1075) {
                            this.f24495h = 2;
                            this.f24496i = 3;
                            this.f24505r = 0;
                            this.f24490c.mo45230f(0);
                            zzef2.mo45230f(i);
                            break;
                        } else if (i13 != 256) {
                            this.f24497j = 256;
                            k = i - 1;
                            i5 = 13;
                            i6 = 2;
                        } else {
                            k = i;
                            i5 = 13;
                            i6 = 2;
                        }
                    } else {
                        i2 = 1024;
                    }
                    this.f24497j = i2;
                    k = i;
                    i5 = 13;
                    i6 = 2;
                }
                this.f24502o = (b & 8) >> 3;
                this.f24498k = 1 == ((b & 1) ^ 1);
                if (!this.f24499l) {
                    this.f24495h = 1;
                    this.f24496i = 0;
                } else {
                    m41388i();
                }
                zzef2.mo45230f(i);
            } else if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        int min = Math.min(zzef.mo45233i(), this.f24505r - this.f24496i);
                        this.f24507t.mo41215e(zzef2, min);
                        int i14 = this.f24496i + min;
                        this.f24496i = i14;
                        int i15 = this.f24505r;
                        if (i14 == i15) {
                            long j = this.f24506s;
                            if (j != -9223372036854775807L) {
                                this.f24507t.mo41216f(j, 1, i15, 0, (zzaao) null);
                                this.f24506s += this.f24508u;
                            }
                            m41387h();
                        }
                    } else {
                        if (m41390k(zzef2, this.f24489b.f33777a, true != this.f24498k ? 5 : 7)) {
                            this.f24489b.mo45203h(0);
                            if (!this.f24503p) {
                                int c3 = this.f24489b.mo45198c(2) + 1;
                                if (c3 != 2) {
                                    zzdw.m48255e("AdtsReader", "Detected audio object type: " + c3 + ", but assuming AAC LC.");
                                }
                                this.f24489b.mo45205j(5);
                                int c4 = this.f24489b.mo45198c(3);
                                int i16 = this.f24501n;
                                int i17 = zzyg.f38963c;
                                byte[] bArr = {(byte) (((i16 >> 1) & 7) | 16), (byte) (((c4 << 3) & 120) | ((i16 << 7) & 128))};
                                zzyf a = zzyg.m55423a(bArr);
                                zzad zzad = new zzad();
                                zzad.mo41331h(this.f24492e);
                                zzad.mo41343s("audio/mp4a-latm");
                                zzad.mo41328f0(a.f38960c);
                                zzad.mo41326e0(a.f38959b);
                                zzad.mo41344t(a.f38958a);
                                zzad.mo41333i(Collections.singletonList(bArr));
                                zzad.mo41335k(this.f24491d);
                                zzaf y = zzad.mo41349y();
                                this.f24504q = 1024000000 / ((long) y.f24227z);
                                this.f24493f.mo41214d(y);
                                this.f24503p = true;
                            } else {
                                this.f24489b.mo45205j(10);
                            }
                            this.f24489b.mo45205j(4);
                            int c5 = this.f24489b.mo45198c(13) - 7;
                            if (this.f24498k) {
                                c5 -= 2;
                            }
                            m41389j(this.f24493f, this.f24504q, 0, c5);
                        }
                    }
                } else if (m41390k(zzef2, this.f24490c.mo45232h(), 10)) {
                    this.f24494g.mo41215e(this.f24490c, 10);
                    this.f24490c.mo45230f(6);
                    m41389j(this.f24494g, 0, 10, 10 + this.f24490c.mo45242r());
                }
            } else if (zzef.mo45233i() != 0) {
                zzee zzee = this.f24489b;
                zzee.f33777a[0] = zzef.mo45232h()[zzef.mo45235k()];
                zzee.mo45203h(2);
                int c6 = this.f24489b.mo45198c(4);
                int i18 = this.f24501n;
                if (i18 == -1 || c6 == i18) {
                    if (!this.f24499l) {
                        this.f24499l = true;
                        this.f24500m = this.f24502o;
                        this.f24501n = c6;
                    }
                    m41388i();
                } else {
                    m41386g();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo41469d(zzzl zzzl, zzaio zzaio) {
        zzaio.mo41517c();
        this.f24492e = zzaio.mo41516b();
        zzaap k = zzzl.mo41256k(zzaio.mo41515a(), 1);
        this.f24493f = k;
        this.f24507t = k;
        if (this.f24488a) {
            zzaio.mo41517c();
            zzaap k2 = zzzl.mo41256k(zzaio.mo41515a(), 5);
            this.f24494g = k2;
            zzad zzad = new zzad();
            zzad.mo41331h(zzaio.mo41516b());
            zzad.mo41343s("application/id3");
            k2.mo41214d(zzad.mo41349y());
            return;
        }
        this.f24494g = new zzzh();
    }

    /* renamed from: e */
    public final void mo41470e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f24506s = j;
        }
    }
}
