package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzahv implements zzyt {

    /* renamed from: a */
    private final zzel f24688a;

    /* renamed from: b */
    private final zzef f24689b = new zzef();

    /* synthetic */ zzahv(zzel zzel, zzahu zzahu) {
        this.f24688a = zzel;
    }

    /* renamed from: a */
    public final zzys mo41243a(zzzj zzzj, long j) throws IOException {
        int h;
        long j2;
        long c = zzzj.mo41252c();
        int min = (int) Math.min(20000, zzzj.mo41253d() - c);
        this.f24689b.mo45227c(min);
        ((zzyy) zzzj).mo48454j(this.f24689b.mo45232h(), 0, min, false);
        zzef zzef = this.f24689b;
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (zzef.mo45233i() >= 4) {
            if (zzahw.m41490h(zzef.mo45232h(), zzef.mo45235k()) != 442) {
                zzef.mo45231g(1);
            } else {
                zzef.mo45231g(4);
                long c2 = zzahx.m41491c(zzef);
                if (c2 != -9223372036854775807L) {
                    long b = this.f24688a.mo45357b(c2);
                    if (b > j) {
                        if (j3 == -9223372036854775807L) {
                            return zzys.m55459d(b, c);
                        }
                        j2 = (long) i2;
                    } else if (100000 + b > j) {
                        j2 = (long) zzef.mo45235k();
                    } else {
                        i2 = zzef.mo45235k();
                        j3 = b;
                    }
                    return zzys.m55460e(c + j2);
                }
                int l = zzef.mo45236l();
                if (zzef.mo45233i() >= 10) {
                    zzef.mo45231g(9);
                    int s = zzef.mo45243s() & 7;
                    if (zzef.mo45233i() >= s) {
                        zzef.mo45231g(s);
                        if (zzef.mo45233i() >= 4) {
                            if (zzahw.m41490h(zzef.mo45232h(), zzef.mo45235k()) == 443) {
                                zzef.mo45231g(4);
                                int w = zzef.mo45247w();
                                if (zzef.mo45233i() < w) {
                                    zzef.mo45230f(l);
                                } else {
                                    zzef.mo45231g(w);
                                }
                            }
                            while (true) {
                                if (zzef.mo45233i() < 4 || (h = zzahw.m41490h(zzef.mo45232h(), zzef.mo45235k())) == 442 || h == 441 || (h >>> 8) != 1) {
                                    break;
                                }
                                zzef.mo45231g(4);
                                if (zzef.mo45233i() < 2) {
                                    zzef.mo45230f(l);
                                    break;
                                }
                                zzef.mo45230f(Math.min(zzef.mo45236l(), zzef.mo45235k() + zzef.mo45247w()));
                            }
                        } else {
                            zzef.mo45230f(l);
                        }
                    } else {
                        zzef.mo45230f(l);
                    }
                } else {
                    zzef.mo45230f(l);
                }
                i = zzef.mo45235k();
            }
        }
        return j3 != -9223372036854775807L ? zzys.m55461f(j3, c + ((long) i)) : zzys.f39001d;
    }

    public final void zzb() {
        zzef zzef = this.f24689b;
        byte[] bArr = zzen.f34505f;
        int length = bArr.length;
        zzef.mo45228d(bArr, 0);
    }
}
