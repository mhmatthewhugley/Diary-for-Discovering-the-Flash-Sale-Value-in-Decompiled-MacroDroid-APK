package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbik extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzbik zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbik zzbik = new zzbik();
        zzb = zzbik;
        zzgre.m52983A(zzbik.class, zzbik);
    }

    private zzbik() {
    }

    /* renamed from: F */
    public static zzbij m43481F() {
        return (zzbij) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m43483H(zzbik zzbik, boolean z) {
        zzbik.zze |= 1;
        zzbik.zzf = z;
    }

    /* renamed from: I */
    static /* synthetic */ void m43484I(zzbik zzbik, int i) {
        zzbik.zze |= 2;
        zzbik.zzg = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzbik();
        } else {
            if (i2 == 4) {
                return new zzbij((zzbew) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: J */
    public final boolean mo42640J() {
        return this.zzf;
    }
}
