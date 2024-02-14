package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbhp extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzbhp zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzbhp zzbhp = new zzbhp();
        zzb = zzbhp;
        zzgre.m52983A(zzbhp.class, zzbhp);
    }

    private zzbhp() {
    }

    /* renamed from: F */
    public static zzbho m43453F() {
        return (zzbho) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m43455H(zzbhp zzbhp, int i) {
        zzbhp.zze |= 1;
        zzbhp.zzf = i;
    }

    /* renamed from: I */
    static /* synthetic */ void m43456I(zzbhp zzbhp, int i) {
        zzbhp.zze |= 2;
        zzbhp.zzg = i;
    }

    /* renamed from: J */
    static /* synthetic */ void m43457J(zzbhp zzbhp, int i) {
        zzbhp.zze |= 4;
        zzbhp.zzh = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzbhp();
        } else {
            if (i2 == 4) {
                return new zzbho((zzbew) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
