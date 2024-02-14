package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzagz implements zzain {

    /* renamed from: a */
    private final List f24509a;

    public zzagz() {
        this(0);
    }

    /* renamed from: b */
    private final zzaid m41398b(zzaim zzaim) {
        return new zzaid(m41400d(zzaim));
    }

    /* renamed from: c */
    private final zzair m41399c(zzaim zzaim) {
        return new zzair(m41400d(zzaim));
    }

    /* renamed from: d */
    private final List m41400d(zzaim zzaim) {
        String str;
        int i;
        List list;
        zzef zzef = new zzef(zzaim.f24766d);
        List list2 = this.f24509a;
        while (zzef.mo45233i() > 0) {
            int s = zzef.mo45243s();
            int k = zzef.mo45235k() + zzef.mo45243s();
            if (s == 134) {
                list2 = new ArrayList();
                int s2 = zzef.mo45243s() & 31;
                for (int i2 = 0; i2 < s2; i2++) {
                    String F = zzef.mo45222F(3, zzfsk.f36339c);
                    int s3 = zzef.mo45243s();
                    int i3 = s3 & 128;
                    if (i3 != 0) {
                        i = s3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte s4 = (byte) zzef.mo45243s();
                    zzef.mo45231g(1);
                    if (i3 != 0) {
                        int i4 = zzdf.f32201c;
                        list = Collections.singletonList((s4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzad zzad = new zzad();
                    zzad.mo41343s(str);
                    zzad.mo41335k(F);
                    zzad.mo41322c0(i);
                    zzad.mo41333i(list);
                    list2.add(zzad.mo41349y());
                }
            }
            zzef.mo45230f(k);
        }
        return list2;
    }

    @Nullable
    /* renamed from: a */
    public final zzaip mo41471a(int i, zzaim zzaim) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzaht(new zzahq(zzaim.f24764b));
            }
            if (i == 21) {
                return new zzaht(new zzaho());
            }
            if (i == 27) {
                return new zzaht(new zzahl(m41398b(zzaim), false, false));
            }
            if (i == 36) {
                return new zzaht(new zzahn(m41398b(zzaim)));
            }
            if (i == 89) {
                return new zzaht(new zzahb(zzaim.f24765c));
            }
            if (i == 138) {
                return new zzaht(new zzaha(zzaim.f24764b));
            }
            if (i == 172) {
                return new zzaht(new zzagv(zzaim.f24764b));
            }
            if (i == 257) {
                return new zzaic(new zzahs("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new zzaic(new zzahs("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new zzaht(new zzagy(false, zzaim.f24764b));
                            case 16:
                                return new zzaht(new zzahh(m41399c(zzaim)));
                            case 17:
                                return new zzaht(new zzahp(zzaim.f24764b));
                            default:
                                return null;
                        }
                    }
                }
                return new zzaht(new zzags(zzaim.f24764b));
            }
        }
        return new zzaht(new zzahe(m41399c(zzaim)));
    }

    public zzagz(int i) {
        this.f24509a = zzfvn.m51135w();
    }
}
