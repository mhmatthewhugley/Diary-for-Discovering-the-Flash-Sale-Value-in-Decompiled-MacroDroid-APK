package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgvl extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgvl zzb;
    private int zze;
    private zzgvk zzf;
    private zzgrn zzg = zzgre.m52995v();
    private zzgpw zzh;
    private zzgpw zzi;
    private int zzj;
    private byte zzk = 2;

    static {
        zzgvl zzgvl = new zzgvl();
        zzb = zzgvl;
        zzgre.m52983A(zzgvl.class, zzgvl);
    }

    private zzgvl() {
        zzgpw zzgpw = zzgpw.f37012a;
        this.zzh = zzgpw;
        this.zzi = zzgpw;
    }

    /* renamed from: F */
    public static zzgvi m53531F() {
        return (zzgvi) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m53533H(zzgvl zzgvl, zzgvh zzgvh) {
        zzgvh.getClass();
        zzgrn zzgrn = zzgvl.zzg;
        if (!zzgrn.mo47052a()) {
            zzgvl.zzg = zzgre.m52996w(zzgrn);
        }
        zzgvl.zzg.add(zzgvh);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", zzgvh.class, "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzgvl();
        } else {
            if (i2 == 4) {
                return new zzgvi((zzguq) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzk = b;
            return null;
        }
    }
}
