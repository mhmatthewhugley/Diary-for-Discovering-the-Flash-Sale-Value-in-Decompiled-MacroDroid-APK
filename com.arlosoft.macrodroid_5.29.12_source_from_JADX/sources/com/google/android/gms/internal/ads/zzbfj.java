package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbfj extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzbfj zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzbfj zzbfj = new zzbfj();
        zzb = zzbfj;
        zzgre.m52983A(zzbfj.class, zzbfj);
    }

    private zzbfj() {
    }

    /* renamed from: F */
    public static zzbfi m43289F() {
        return (zzbfi) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m43291H(zzbfj zzbfj, boolean z) {
        zzbfj.zze |= 1;
        zzbfj.zzf = z;
    }

    /* renamed from: I */
    static /* synthetic */ void m43292I(zzbfj zzbfj, boolean z) {
        zzbfj.zze |= 2;
        zzbfj.zzg = z;
    }

    /* renamed from: J */
    static /* synthetic */ void m43293J(zzbfj zzbfj, int i) {
        zzbfj.zze |= 4;
        zzbfj.zzh = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzbfj();
        } else {
            if (i2 == 4) {
                return new zzbfi((zzbew) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
