package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzawm implements zzauz, zzavg {

    /* renamed from: p */
    public static final zzavb f26061p = new zzawk();

    /* renamed from: q */
    private static final int f26062q = zzbar.m42991g("qt  ");

    /* renamed from: a */
    private final zzbak f26063a = new zzbak(zzbai.f26399a);

    /* renamed from: b */
    private final zzbak f26064b = new zzbak(4);

    /* renamed from: c */
    private final zzbak f26065c = new zzbak(16);

    /* renamed from: d */
    private final Stack f26066d = new Stack();

    /* renamed from: e */
    private int f26067e;

    /* renamed from: f */
    private int f26068f;

    /* renamed from: g */
    private long f26069g;

    /* renamed from: h */
    private int f26070h;

    /* renamed from: i */
    private zzbak f26071i;

    /* renamed from: j */
    private int f26072j;

    /* renamed from: k */
    private int f26073k;

    /* renamed from: l */
    private zzava f26074l;

    /* renamed from: m */
    private zzawl[] f26075m;

    /* renamed from: n */
    private long f26076n;

    /* renamed from: o */
    private boolean f26077o;

    /* renamed from: g */
    private final void m42664g() {
        this.f26067e = 0;
        this.f26070h = 0;
    }

    /* renamed from: h */
    private final void m42665h(long j) throws zzasz {
        zzaxh zzaxh;
        zzaxh zzaxh2;
        zzavd zzavd;
        zzawo a;
        while (!this.f26066d.isEmpty() && ((zzavu) this.f26066d.peek()).f25852P0 == j) {
            zzavu zzavu = (zzavu) this.f26066d.pop();
            if (zzavu.f25948a == zzavw.f25860C) {
                ArrayList arrayList = new ArrayList();
                zzavd zzavd2 = new zzavd();
                zzavv e = zzavu.mo42133e(zzavw.f25857A0);
                if (e != null) {
                    zzaxh = zzawd.m42645c(e, this.f26077o);
                    if (zzaxh != null) {
                        zzavd2.mo42111b(zzaxh);
                    }
                } else {
                    zzaxh = null;
                }
                long j2 = -9223372036854775807L;
                long j3 = LocationRequestCompat.PASSIVE_INTERVAL;
                int i = 0;
                while (i < zzavu.f25854R0.size()) {
                    zzavu zzavu2 = (zzavu) zzavu.f25854R0.get(i);
                    if (zzavu2.f25948a == zzavw.f25864E && (a = zzawd.m42643a(zzavu2, zzavu.mo42133e(zzavw.f25862D), -9223372036854775807L, (zzauv) null, this.f26077o)) != null) {
                        zzawr b = zzawd.m42644b(a, zzavu2.mo42132d(zzavw.f25866F).mo42132d(zzavw.f25868G).mo42132d(zzavw.f25870H), zzavd2);
                        if (b.f26110a != 0) {
                            zzawl zzawl = new zzawl(a, b, this.f26074l.mo42107h(i, a.f26080b));
                            zzasw e2 = a.f26084f.mo41970e(b.f26113d + 30);
                            if (a.f26080b == 1) {
                                if (zzavd2.mo42110a()) {
                                    e2 = e2.mo41968d(zzavd2.f25733a, zzavd2.f25734b);
                                }
                                if (zzaxh != null) {
                                    e2 = e2.mo41972f(zzaxh);
                                }
                            }
                            zzawl.f26059c.mo42117d(e2);
                            zzavd = zzavd2;
                            zzaxh2 = zzaxh;
                            long max = Math.max(j2, a.f26083e);
                            arrayList.add(zzawl);
                            long j4 = b.f26111b[0];
                            if (j4 < j3) {
                                j2 = max;
                                j3 = j4;
                            } else {
                                j2 = max;
                            }
                            i++;
                            zzavd2 = zzavd;
                            zzaxh = zzaxh2;
                        }
                    }
                    zzavd = zzavd2;
                    zzaxh2 = zzaxh;
                    i++;
                    zzavd2 = zzavd;
                    zzaxh = zzaxh2;
                }
                this.f26076n = j2;
                this.f26075m = (zzawl[]) arrayList.toArray(new zzawl[arrayList.size()]);
                this.f26074l.zzb();
                this.f26074l.mo42106b(this);
                this.f26066d.clear();
                this.f26067e = 2;
            } else if (!this.f26066d.isEmpty()) {
                ((zzavu) this.f26066d.peek()).mo42134f(zzavu);
            }
        }
        if (this.f26067e != 2) {
            m42664g();
        }
    }

    /* renamed from: a */
    public final boolean mo42090a() {
        return true;
    }

    /* renamed from: b */
    public final int mo42102b(zzauy zzauy, zzave zzave) throws IOException, InterruptedException {
        zzawl[] zzawlArr;
        boolean z;
        boolean z2;
        zzauy zzauy2 = zzauy;
        zzave zzave2 = zzave;
        while (true) {
            int i = this.f26067e;
            if (i == 0) {
                if (this.f26070h == 0) {
                    if (!zzauy2.mo42100h(this.f26065c.f26406a, 0, 8, true)) {
                        return -1;
                    }
                    this.f26070h = 8;
                    this.f26065c.mo42336v(0);
                    this.f26069g = this.f26065c.mo42327m();
                    this.f26068f = this.f26065c.mo42319e();
                }
                if (this.f26069g == 1) {
                    zzauy2.mo42100h(this.f26065c.f26406a, 8, 8, false);
                    this.f26070h += 8;
                    this.f26069g = this.f26065c.mo42328n();
                }
                int i2 = this.f26068f;
                if (i2 == zzavw.f25860C || i2 == zzavw.f25864E || i2 == zzavw.f25866F || i2 == zzavw.f25868G || i2 == zzavw.f25870H || i2 == zzavw.f25887Q) {
                    long d = (zzauy.mo42096d() + this.f26069g) - ((long) this.f26070h);
                    this.f26066d.add(new zzavu(this.f26068f, d));
                    if (this.f26069g == ((long) this.f26070h)) {
                        m42665h(d);
                    } else {
                        m42664g();
                    }
                } else {
                    if (i2 == zzavw.f25889S || i2 == zzavw.f25862D || i2 == zzavw.f25890T || i2 == zzavw.f25891U || i2 == zzavw.f25921m0 || i2 == zzavw.f25923n0 || i2 == zzavw.f25925o0 || i2 == zzavw.f25888R || i2 == zzavw.f25927p0 || i2 == zzavw.f25929q0 || i2 == zzavw.f25931r0 || i2 == zzavw.f25933s0 || i2 == zzavw.f25935t0 || i2 == zzavw.f25886P || i2 == zzavw.f25898b || i2 == zzavw.f25857A0) {
                        zzbac.m42926e(this.f26070h == 8);
                        zzbac.m42926e(this.f26069g <= 2147483647L);
                        zzbak zzbak = new zzbak((int) this.f26069g);
                        this.f26071i = zzbak;
                        System.arraycopy(this.f26065c.f26406a, 0, zzbak.f26406a, 0, 8);
                    } else {
                        this.f26071i = null;
                    }
                    this.f26067e = 1;
                }
            } else if (i != 1) {
                long j = LocationRequestCompat.PASSIVE_INTERVAL;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    zzawlArr = this.f26075m;
                    if (i3 >= zzawlArr.length) {
                        break;
                    }
                    zzawl zzawl = zzawlArr[i3];
                    int i5 = zzawl.f26060d;
                    zzawr zzawr = zzawl.f26058b;
                    if (i5 != zzawr.f26110a) {
                        long j2 = zzawr.f26111b[i5];
                        if (j2 < j) {
                            i4 = i3;
                            j = j2;
                        }
                    }
                    i3++;
                }
                if (i4 == -1) {
                    return -1;
                }
                zzawl zzawl2 = zzawlArr[i4];
                zzavi zzavi = zzawl2.f26059c;
                int i6 = zzawl2.f26060d;
                zzawr zzawr2 = zzawl2.f26058b;
                long j3 = zzawr2.f26111b[i6];
                int i7 = zzawr2.f26112c[i6];
                if (zzawl2.f26057a.f26085g == 1) {
                    j3 += 8;
                    i7 -= 8;
                }
                long d2 = (j3 - zzauy.mo42096d()) + ((long) this.f26072j);
                if (d2 < 0 || d2 >= 262144) {
                    zzave2.f25735a = j3;
                    return 1;
                }
                int i8 = (int) d2;
                boolean z3 = false;
                zzauy2.mo42101i(i8, false);
                int i9 = zzawl2.f26057a.f26089k;
                if (i9 == 0) {
                    while (true) {
                        int i10 = this.f26072j;
                        if (i10 >= i7) {
                            break;
                        }
                        int c = zzavi.mo42116c(zzauy2, i7 - i10, false);
                        this.f26072j += c;
                        this.f26073k -= c;
                    }
                } else {
                    byte[] bArr = this.f26064b.f26406a;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i11 = 4 - i9;
                    while (this.f26072j < i7) {
                        int i12 = this.f26073k;
                        if (i12 == 0) {
                            zzauy2.mo42100h(this.f26064b.f26406a, i11, i9, z3);
                            this.f26064b.mo42336v(z3 ? 1 : 0);
                            this.f26073k = this.f26064b.mo42323i();
                            this.f26063a.mo42336v(z3);
                            zzavi.mo42115b(this.f26063a, 4);
                            this.f26072j += 4;
                            i7 += i11;
                        } else {
                            int c2 = zzavi.mo42116c(zzauy2, i12, z3);
                            this.f26072j += c2;
                            this.f26073k -= c2;
                            z3 = false;
                        }
                    }
                }
                int i13 = i7;
                zzawr zzawr3 = zzawl2.f26058b;
                zzavi.mo42114a(zzawr3.f26114e[i6], zzawr3.f26115f[i6], i13, 0, (zzavh) null);
                zzawl2.f26060d++;
                this.f26072j = 0;
                this.f26073k = 0;
                return 0;
            } else {
                long j4 = this.f26069g;
                int i14 = this.f26070h;
                long j5 = j4 - ((long) i14);
                long d3 = zzauy.mo42096d() + j5;
                zzbak zzbak2 = this.f26071i;
                if (zzbak2 != null) {
                    zzauy2.mo42100h(zzbak2.f26406a, i14, (int) j5, false);
                    if (this.f26068f == zzavw.f25898b) {
                        zzbak zzbak3 = this.f26071i;
                        zzbak3.mo42336v(8);
                        if (zzbak3.mo42319e() == f26062q) {
                            z2 = true;
                        } else {
                            zzbak3.mo42337w(4);
                            while (true) {
                                if (zzbak3.mo42315a() > 0) {
                                    if (zzbak3.mo42319e() == f26062q) {
                                        break;
                                    }
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            z2 = true;
                        }
                        this.f26077o = z2;
                    } else if (!this.f26066d.isEmpty()) {
                        ((zzavu) this.f26066d.peek()).mo42135g(new zzavv(this.f26068f, this.f26071i));
                    }
                } else if (j5 < 262144) {
                    zzauy2.mo42101i((int) j5, false);
                } else {
                    zzave2.f25735a = zzauy.mo42096d() + j5;
                    z = true;
                    m42665h(d3);
                    if (z && this.f26067e != 2) {
                        return 1;
                    }
                }
                z = false;
                m42665h(d3);
                return 1;
            }
        }
    }

    /* renamed from: c */
    public final long mo42091c(long j) {
        long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
        for (zzawl zzawl : this.f26075m) {
            zzawr zzawr = zzawl.f26058b;
            int a = zzawr.mo42146a(j);
            if (a == -1) {
                a = zzawr.mo42147b(j);
            }
            long j3 = zzawr.f26111b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    /* renamed from: d */
    public final void mo42103d(long j, long j2) {
        this.f26066d.clear();
        this.f26070h = 0;
        this.f26072j = 0;
        this.f26073k = 0;
        if (j == 0) {
            m42664g();
            return;
        }
        zzawl[] zzawlArr = this.f26075m;
        if (zzawlArr != null) {
            for (zzawl zzawl : zzawlArr) {
                zzawr zzawr = zzawl.f26058b;
                int a = zzawr.mo42146a(j2);
                if (a == -1) {
                    a = zzawr.mo42147b(j2);
                }
                zzawl.f26060d = a;
            }
        }
    }

    /* renamed from: e */
    public final void mo42104e(zzava zzava) {
        this.f26074l = zzava;
    }

    /* renamed from: f */
    public final boolean mo42105f(zzauy zzauy) throws IOException, InterruptedException {
        return zzawn.m42673b(zzauy);
    }

    public final long zza() {
        return this.f26076n;
    }
}
