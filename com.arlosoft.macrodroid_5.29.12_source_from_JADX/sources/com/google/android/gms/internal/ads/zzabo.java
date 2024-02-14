package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzabo implements zzzi {

    /* renamed from: n */
    public static final zzzp f23835n = zzabn.f23834b;

    /* renamed from: a */
    private final byte[] f23836a;

    /* renamed from: b */
    private final zzef f23837b;

    /* renamed from: c */
    private final zzzq f23838c;

    /* renamed from: d */
    private zzzl f23839d;

    /* renamed from: e */
    private zzaap f23840e;

    /* renamed from: f */
    private int f23841f;
    @Nullable

    /* renamed from: g */
    private zzbq f23842g;

    /* renamed from: h */
    private zzzv f23843h;

    /* renamed from: i */
    private int f23844i;

    /* renamed from: j */
    private int f23845j;

    /* renamed from: k */
    private zzabm f23846k;

    /* renamed from: l */
    private int f23847l;

    /* renamed from: m */
    private long f23848m;

    public zzabo() {
        this(0);
    }

    public zzabo(int i) {
        this.f23836a = new byte[42];
        this.f23837b = new zzef(new byte[32768], 0);
        this.f23838c = new zzzq();
        this.f23841f = 0;
    }

    /* renamed from: b */
    private final long m40995b(zzef zzef, boolean z) {
        boolean z2;
        Objects.requireNonNull(this.f23843h);
        int k = zzef.mo45235k();
        while (k <= zzef.mo45236l() - 16) {
            zzef.mo45230f(k);
            if (zzzr.m55549c(zzef, this.f23843h, this.f23845j, this.f23838c)) {
                zzef.mo45230f(k);
                return this.f23838c.f39045a;
            }
            k++;
        }
        if (z) {
            while (k <= zzef.mo45236l() - this.f23844i) {
                zzef.mo45230f(k);
                try {
                    z2 = zzzr.m55549c(zzef, this.f23843h, this.f23845j, this.f23838c);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (zzef.mo45235k() <= zzef.mo45236l() && z2) {
                    zzef.mo45230f(k);
                    return this.f23838c.f39045a;
                }
                k++;
            }
            zzef.mo45230f(zzef.mo45236l());
            return -1;
        }
        zzef.mo45230f(k);
        return -1;
    }

    /* renamed from: c */
    private final void m40996c() {
        long j = this.f23848m;
        zzzv zzzv = this.f23843h;
        int i = zzen.f34500a;
        this.f23840e.mo41216f((j * 1000000) / ((long) zzzv.f39054e), 1, this.f23847l, 0, (zzaao) null);
    }

    /* renamed from: a */
    public final boolean mo41227a(zzzj zzzj) throws IOException {
        zzzs.m55551a(zzzj, false);
        zzef zzef = new zzef(4);
        ((zzyy) zzzj).mo48454j(zzef.mo45232h(), 0, 4, false);
        if (zzef.mo45217A() == 1716281667) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo41228d(zzzl zzzl) {
        this.f23839d = zzzl;
        this.f23840e = zzzl.mo41256k(0, 1);
        zzzl.mo41255j0();
    }

    /* renamed from: g */
    public final void mo41229g(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f23841f = 0;
        } else {
            zzabm zzabm = this.f23846k;
            if (zzabm != null) {
                zzabm.mo48447d(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f23848m = j3;
        this.f23847l = 0;
        this.f23837b.mo45227c(0);
    }

    /* renamed from: h */
    public final int mo41230h(zzzj zzzj, zzaai zzaai) throws IOException {
        boolean l;
        zzaal zzaal;
        zzzj zzzj2 = zzzj;
        int i = this.f23841f;
        boolean z = true;
        if (i == 0) {
            zzzj.mo48452h();
            long b = zzzj.mo41251b();
            zzbq a = zzzs.m55551a(zzzj2, true);
            ((zzyy) zzzj2).mo48459p((int) (zzzj.mo41251b() - b), false);
            this.f23842g = a;
            this.f23841f = 1;
            return 0;
        } else if (i == 1) {
            ((zzyy) zzzj2).mo48454j(this.f23836a, 0, 42, false);
            zzzj.mo48452h();
            this.f23841f = 2;
            return 0;
        } else if (i == 2) {
            zzef zzef = new zzef(4);
            ((zzyy) zzzj2).mo48453i(zzef.mo45232h(), 0, 4, false);
            if (zzef.mo45217A() == 1716281667) {
                this.f23841f = 3;
                return 0;
            }
            throw zzbu.m44135a("Failed to read FLAC stream marker.", (Throwable) null);
        } else if (i == 3) {
            zzzv zzzv = this.f23843h;
            do {
                zzzj.mo48452h();
                zzee zzee = new zzee(new byte[4], 4);
                zzyy zzyy = (zzyy) zzzj2;
                zzyy.mo48454j(zzee.f33777a, 0, 4, false);
                l = zzee.mo45207l();
                int c = zzee.mo45198c(7);
                int c2 = zzee.mo45198c(24) + 4;
                if (c == 0) {
                    byte[] bArr = new byte[38];
                    zzyy.mo48453i(bArr, 0, 38, false);
                    zzzv = new zzzv(bArr, 4);
                } else if (zzzv == null) {
                    throw new IllegalArgumentException();
                } else if (c == 3) {
                    zzef zzef2 = new zzef(c2);
                    zzyy.mo48453i(zzef2.mo45232h(), 0, c2, false);
                    zzzv = zzzv.mo48469f(zzzs.m55552b(zzef2));
                } else if (c == 4) {
                    zzef zzef3 = new zzef(c2);
                    zzyy.mo48453i(zzef3.mo45232h(), 0, c2, false);
                    zzef3.mo45231g(4);
                    zzzv = zzzv.mo48470g(Arrays.asList(zzaav.m40955c(zzef3, false, false).f23757b));
                } else if (c == 6) {
                    zzef zzef4 = new zzef(c2);
                    zzyy.mo48453i(zzef4.mo45232h(), 0, c2, false);
                    zzef4.mo45231g(4);
                    zzzv = zzzv.mo48468e(zzfvn.m51136z(zzaci.m41046a(zzef4)));
                } else {
                    zzyy.mo48459p(c2, false);
                }
                int i2 = zzen.f34500a;
                this.f23843h = zzzv;
            } while (!l);
            Objects.requireNonNull(zzzv);
            this.f23844i = Math.max(zzzv.f39052c, 6);
            this.f23840e.mo41214d(this.f23843h.mo48466c(this.f23836a, this.f23842g));
            this.f23841f = 4;
            return 0;
        } else if (i != 4) {
            Objects.requireNonNull(this.f23840e);
            zzzv zzzv2 = this.f23843h;
            Objects.requireNonNull(zzzv2);
            zzabm zzabm = this.f23846k;
            if (zzabm != null && zzabm.mo48448e()) {
                return zzabm.mo48444a(zzzj2, zzaai);
            }
            if (this.f23848m == -1) {
                this.f23848m = zzzr.m55548b(zzzj2, zzzv2);
                return 0;
            }
            zzef zzef5 = this.f23837b;
            int l2 = zzef5.mo45236l();
            if (l2 < 32768) {
                int e = zzzj2.mo43927e(zzef5.mo45232h(), l2, 32768 - l2);
                if (e != -1) {
                    z = false;
                }
                if (!z) {
                    this.f23837b.mo45229e(l2 + e);
                } else if (this.f23837b.mo45233i() == 0) {
                    m40996c();
                    return -1;
                }
            } else {
                z = false;
            }
            zzef zzef6 = this.f23837b;
            int k = zzef6.mo45235k();
            int i3 = this.f23847l;
            int i4 = this.f23844i;
            if (i3 < i4) {
                zzef6.mo45231g(Math.min(i4 - i3, zzef6.mo45233i()));
            }
            long b2 = m40995b(this.f23837b, z);
            zzef zzef7 = this.f23837b;
            int k2 = zzef7.mo45235k() - k;
            zzef7.mo45230f(k);
            zzaan.m40938b(this.f23840e, this.f23837b, k2);
            this.f23847l += k2;
            if (b2 != -1) {
                m40996c();
                this.f23847l = 0;
                this.f23848m = b2;
            }
            zzef zzef8 = this.f23837b;
            if (zzef8.mo45233i() >= 16) {
                return 0;
            }
            int i5 = zzef8.mo45233i();
            System.arraycopy(zzef8.mo45232h(), zzef8.mo45235k(), zzef8.mo45232h(), 0, i5);
            this.f23837b.mo45230f(0);
            this.f23837b.mo45229e(i5);
            return 0;
        } else {
            zzzj.mo48452h();
            zzef zzef9 = new zzef(2);
            ((zzyy) zzzj2).mo48454j(zzef9.mo45232h(), 0, 2, false);
            int w = zzef9.mo45247w();
            if ((w >> 2) == 16382) {
                zzzj.mo48452h();
                this.f23845j = w;
                zzzl zzzl = this.f23839d;
                int i6 = zzen.f34500a;
                long c3 = zzzj.mo41252c();
                long d = zzzj.mo41253d();
                zzzv zzzv3 = this.f23843h;
                Objects.requireNonNull(zzzv3);
                if (zzzv3.f39060k != null) {
                    zzaal = new zzzt(zzzv3, c3);
                } else if (d == -1 || zzzv3.f39059j <= 0) {
                    zzaal = new zzaak(zzzv3.mo48464a(), 0);
                } else {
                    zzabm zzabm2 = new zzabm(zzzv3, this.f23845j, c3, d);
                    this.f23846k = zzabm2;
                    zzaal = zzabm2.mo48445b();
                }
                zzzl.mo41254h(zzaal);
                this.f23841f = 5;
                return 0;
            }
            zzzj.mo48452h();
            throw zzbu.m44135a("First frame does not start with sync code.", (Throwable) null);
        }
    }
}
