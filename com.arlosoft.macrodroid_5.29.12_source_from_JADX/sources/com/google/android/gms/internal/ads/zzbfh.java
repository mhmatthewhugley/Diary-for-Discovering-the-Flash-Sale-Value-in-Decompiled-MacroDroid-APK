package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbfh extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzbfh zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbfh zzbfh = new zzbfh();
        zzb = zzbfh;
        zzgre.m52983A(zzbfh.class, zzbfh);
    }

    private zzbfh() {
    }

    /* renamed from: F */
    public static zzbfg m43280F() {
        return (zzbfg) zzb.mo47345C();
    }

    /* renamed from: H */
    public static zzbfh m43282H() {
        return zzb;
    }

    /* renamed from: I */
    static /* synthetic */ void m43283I(zzbfh zzbfh, boolean z) {
        zzbfh.zze |= 1;
        zzbfh.zzf = z;
    }

    /* renamed from: J */
    static /* synthetic */ void m43284J(zzbfh zzbfh, int i) {
        zzbfh.zze |= 2;
        zzbfh.zzg = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzbfh();
        } else {
            if (i2 == 4) {
                return new zzbfg((zzbew) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
