package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzyv {
    /* renamed from: a */
    public static void m55470a(long j, zzef zzef, zzaap[] zzaapArr) {
        int i;
        while (true) {
            boolean z = true;
            if (zzef.mo45233i() > 1) {
                int c = m55472c(zzef);
                int c2 = m55472c(zzef);
                int k = zzef.mo45235k() + c2;
                if (c2 == -1 || c2 > zzef.mo45233i()) {
                    zzdw.m48255e("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    k = zzef.mo45236l();
                } else if (c == 4 && c2 >= 8) {
                    int s = zzef.mo45243s();
                    int w = zzef.mo45247w();
                    if (w == 49) {
                        i = zzef.mo45237m();
                        w = 49;
                    } else {
                        i = 0;
                    }
                    int s2 = zzef.mo45243s();
                    if (w == 47) {
                        zzef.mo45231g(1);
                        w = 47;
                    }
                    boolean z2 = s == 181 && (w == 49 || w == 47) && s2 == 3;
                    if (w == 49) {
                        if (i != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m55471b(j, zzef, zzaapArr);
                    }
                }
                zzef.mo45230f(k);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m55471b(long j, zzef zzef, zzaap[] zzaapArr) {
        int s = zzef.mo45243s();
        if ((s & 64) != 0) {
            zzef.mo45231g(1);
            int i = (s & 31) * 3;
            int k = zzef.mo45235k();
            for (zzaap zzaap : zzaapArr) {
                zzef.mo45230f(k);
                zzaap.mo41215e(zzef, i);
                if (j != -9223372036854775807L) {
                    zzaap.mo41216f(j, 1, i, 0, (zzaao) null);
                }
            }
        }
    }

    /* renamed from: c */
    private static int m55472c(zzef zzef) {
        int i = 0;
        while (zzef.mo45233i() != 0) {
            int s = zzef.mo45243s();
            i += s;
            if (s != 255) {
                return i;
            }
        }
        return -1;
    }
}
