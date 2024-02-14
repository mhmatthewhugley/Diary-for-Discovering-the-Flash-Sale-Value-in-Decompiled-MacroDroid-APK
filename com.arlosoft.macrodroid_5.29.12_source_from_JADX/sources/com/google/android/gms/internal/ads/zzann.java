package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzann extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzann zzb;
    private int zze;
    private zzgrn zzf = zzgre.m52995v();
    private zzgpw zzg = zzgpw.f37012a;
    private int zzh = 1;
    private int zzi = 1;

    static {
        zzann zzann = new zzann();
        zzb = zzann;
        zzgre.m52983A(zzann.class, zzann);
    }

    private zzann() {
    }

    /* renamed from: F */
    public static zzanm m41973F() {
        return (zzanm) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m41975H(zzann zzann, zzgpw zzgpw) {
        zzgrn zzgrn = zzann.zzf;
        if (!zzgrn.mo47052a()) {
            zzann.zzf = zzgre.m52996w(zzgrn);
        }
        zzann.zzf.add(zzgpw);
    }

    /* renamed from: I */
    static /* synthetic */ void m41976I(zzann zzann, zzgpw zzgpw) {
        zzann.zze |= 1;
        zzann.zzg = zzgpw;
    }

    /* renamed from: J */
    static /* synthetic */ void m41977J(zzann zzann, int i) {
        zzann.zzi = i - 1;
        zzann.zze |= 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", zzanh.f24979a, "zzi", zzanf.f24977a});
        } else if (i2 == 3) {
            return new zzann();
        } else {
            if (i2 == 4) {
                return new zzanm((zzamj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
