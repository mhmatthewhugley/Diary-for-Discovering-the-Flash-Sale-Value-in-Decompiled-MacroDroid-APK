package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgvs extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgvs zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzgpw zzh;
    private zzgpw zzi;

    static {
        zzgvs zzgvs = new zzgvs();
        zzb = zzgvs;
        zzgre.m52983A(zzgvs.class, zzgvs);
    }

    private zzgvs() {
        zzgpw zzgpw = zzgpw.f37012a;
        this.zzh = zzgpw;
        this.zzi = zzgpw;
    }

    /* renamed from: F */
    public static zzgvq m53543F() {
        return (zzgvq) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m53545H(zzgvs zzgvs, String str) {
        zzgvs.zze |= 2;
        zzgvs.zzg = "image/png";
    }

    /* renamed from: I */
    static /* synthetic */ void m53546I(zzgvs zzgvs, zzgpw zzgpw) {
        zzgpw.getClass();
        zzgvs.zze |= 4;
        zzgvs.zzh = zzgpw;
    }

    /* renamed from: J */
    static /* synthetic */ void m53547J(zzgvs zzgvs, int i) {
        zzgvs.zzf = 1;
        zzgvs.zze = 1 | zzgvs.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", zzgvr.f37354a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzgvs();
        } else {
            if (i2 == 4) {
                return new zzgvq((zzguq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
