package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzsy implements zzsg, zzsf {

    /* renamed from: a */
    private final zzsg[] f38454a;

    /* renamed from: c */
    private final IdentityHashMap f38455c;

    /* renamed from: d */
    private final ArrayList f38456d = new ArrayList();

    /* renamed from: f */
    private final HashMap f38457f = new HashMap();
    @Nullable

    /* renamed from: g */
    private zzsf f38458g;
    @Nullable

    /* renamed from: o */
    private zzuh f38459o;

    /* renamed from: p */
    private zzsg[] f38460p;

    /* renamed from: s */
    private zzub f38461s;

    /* renamed from: z */
    private final zzrt f38462z;

    public zzsy(zzrt zzrt, long[] jArr, zzsg[] zzsgArr, byte... bArr) {
        this.f38462z = zzrt;
        this.f38454a = zzsgArr;
        this.f38461s = new zzrs(new zzub[0]);
        this.f38455c = new IdentityHashMap();
        this.f38460p = new zzsg[0];
        for (int i = 0; i < zzsgArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f38454a[i] = new zzsw(zzsgArr[i], j);
            }
        }
    }

    /* renamed from: F */
    public final void mo48128F(long j) {
        this.f38461s.mo48128F(j);
    }

    /* renamed from: a */
    public final long mo48129a() {
        return this.f38461s.mo48129a();
    }

    /* renamed from: b */
    public final boolean mo48130b(long j) {
        if (this.f38456d.isEmpty()) {
            return this.f38461s.mo48130b(j);
        }
        int size = this.f38456d.size();
        for (int i = 0; i < size; i++) {
            ((zzsg) this.f38456d.get(i)).mo48130b(j);
        }
        return false;
    }

    /* renamed from: c */
    public final long mo48131c(zzvt[] zzvtArr, boolean[] zArr, zztz[] zztzArr, boolean[] zArr2, long j) {
        int length;
        Integer num;
        int i;
        zzvt[] zzvtArr2 = zzvtArr;
        zztz[] zztzArr2 = zztzArr;
        int length2 = zzvtArr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = zzvtArr2.length;
            num = 0;
            if (i2 >= length) {
                break;
            }
            zztz zztz = zztzArr2[i2];
            if (zztz != null) {
                num = (Integer) this.f38455c.get(zztz);
            }
            if (num == null) {
                i = -1;
            } else {
                i = num.intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            zzvt zzvt = zzvtArr2[i2];
            if (zzvt != null) {
                zzcp zzcp = (zzcp) this.f38457f.get(zzvt.mo48183b());
                Objects.requireNonNull(zzcp);
                int i3 = 0;
                while (true) {
                    zzsg[] zzsgArr = this.f38454a;
                    if (i3 >= zzsgArr.length) {
                        break;
                    } else if (zzsgArr[i3].mo48133e().mo48264a(zzcp) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.f38455c.clear();
        zztz[] zztzArr3 = new zztz[length];
        zztz[] zztzArr4 = new zztz[length];
        zzvt[] zzvtArr3 = new zzvt[length];
        ArrayList arrayList = new ArrayList(this.f38454a.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.f38454a.length) {
            for (int i5 = 0; i5 < zzvtArr2.length; i5++) {
                zztzArr4[i5] = iArr[i5] == i4 ? zztzArr2[i5] : num;
                if (iArr2[i5] == i4) {
                    zzvt zzvt2 = zzvtArr2[i5];
                    Objects.requireNonNull(zzvt2);
                    zzcp zzcp2 = (zzcp) this.f38457f.get(zzvt2.mo48183b());
                    Objects.requireNonNull(zzcp2);
                    zzvtArr3[i5] = new zzsv(zzvt2, zzcp2);
                } else {
                    zzvtArr3[i5] = num;
                }
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            zztz[] zztzArr5 = zztzArr4;
            zzvt[] zzvtArr4 = zzvtArr3;
            long c = this.f38454a[i4].mo48131c(zzvtArr3, zArr, zztzArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = c;
            } else if (c != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzvtArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    zztz zztz2 = zztzArr5[i7];
                    Objects.requireNonNull(zztz2);
                    zztzArr3[i7] = zztz2;
                    this.f38455c.put(zztz2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (zztzArr5[i7] != null) {
                        z2 = false;
                    }
                    zzdd.m47212f(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f38454a[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zztzArr4 = zztzArr5;
            zzvtArr3 = zzvtArr4;
            num = null;
        }
        System.arraycopy(zztzArr3, 0, zztzArr2, 0, length);
        zzsg[] zzsgArr2 = (zzsg[]) arrayList.toArray(new zzsg[0]);
        this.f38460p = zzsgArr2;
        this.f38461s = new zzrs(zzsgArr2);
        return j2;
    }

    /* renamed from: d */
    public final long mo48132d() {
        long j = -9223372036854775807L;
        for (zzsg zzsg : this.f38460p) {
            long d = zzsg.mo48132d();
            if (d != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    zzsg[] zzsgArr = this.f38460p;
                    int length = zzsgArr.length;
                    int i = 0;
                    while (i < length) {
                        zzsg zzsg2 = zzsgArr[i];
                        if (zzsg2 == zzsg) {
                            break;
                        } else if (zzsg2.mo48139n(d) == d) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = d;
                } else if (d != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || zzsg.mo48139n(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    /* renamed from: e */
    public final zzuh mo48133e() {
        zzuh zzuh = this.f38459o;
        Objects.requireNonNull(zzuh);
        return zzuh;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo47685f(zzub zzub) {
        zzsg zzsg = (zzsg) zzub;
        zzsf zzsf = this.f38458g;
        Objects.requireNonNull(zzsf);
        zzsf.mo47685f(this);
    }

    /* renamed from: g */
    public final void mo47686g(zzsg zzsg) {
        this.f38456d.remove(zzsg);
        if (this.f38456d.isEmpty()) {
            int i = 0;
            for (zzsg e : this.f38454a) {
                i += e.mo48133e().f38624a;
            }
            zzcp[] zzcpArr = new zzcp[i];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                zzsg[] zzsgArr = this.f38454a;
                if (i2 < zzsgArr.length) {
                    zzuh e2 = zzsgArr[i2].mo48133e();
                    int i4 = e2.f38624a;
                    int i5 = 0;
                    while (i5 < i4) {
                        zzcp b = e2.mo48265b(i5);
                        zzcp c = b.mo44232c(i2 + ":" + b.f29180b);
                        this.f38457f.put(c, b);
                        zzcpArr[i3] = c;
                        i5++;
                        i3++;
                    }
                    i2++;
                } else {
                    this.f38459o = new zzuh(zzcpArr);
                    zzsf zzsf = this.f38458g;
                    Objects.requireNonNull(zzsf);
                    zzsf.mo47686g(this);
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    public final zzsg mo48188h(int i) {
        zzsg zzsg = this.f38454a[i];
        return zzsg instanceof zzsw ? ((zzsw) zzsg).f38449a : zzsg;
    }

    /* renamed from: i */
    public final void mo48135i() throws IOException {
        for (zzsg i : this.f38454a) {
            i.mo48135i();
        }
    }

    /* renamed from: l */
    public final long mo48137l(long j, zzkd zzkd) {
        zzsg zzsg;
        zzsg[] zzsgArr = this.f38460p;
        if (zzsgArr.length > 0) {
            zzsg = zzsgArr[0];
        } else {
            zzsg = this.f38454a[0];
        }
        return zzsg.mo48137l(j, zzkd);
    }

    /* renamed from: m */
    public final boolean mo48138m() {
        return this.f38461s.mo48138m();
    }

    /* renamed from: n */
    public final long mo48139n(long j) {
        long n = this.f38460p[0].mo48139n(j);
        int i = 1;
        while (true) {
            zzsg[] zzsgArr = this.f38460p;
            if (i >= zzsgArr.length) {
                return n;
            }
            if (zzsgArr[i].mo48139n(n) == n) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    /* renamed from: o */
    public final void mo48140o(long j, boolean z) {
        for (zzsg o : this.f38460p) {
            o.mo48140o(j, false);
        }
    }

    /* renamed from: q */
    public final void mo48141q(zzsf zzsf, long j) {
        this.f38458g = zzsf;
        Collections.addAll(this.f38456d, this.f38454a);
        for (zzsg q : this.f38454a) {
            q.mo48141q(this, j);
        }
    }

    public final long zzb() {
        return this.f38461s.zzb();
    }
}
