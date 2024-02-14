package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbft extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzbft zzb;
    private int zze;
    private String zzf = "";
    private zzgrn zzg = zzgre.m52995v();
    private int zzh = 1000;
    private int zzi = 1000;
    private int zzj = 1000;

    static {
        zzbft zzbft = new zzbft();
        zzb = zzbft;
        zzgre.m52983A(zzbft.class, zzbft);
    }

    private zzbft() {
    }

    /* renamed from: G */
    public static zzbft m43308G() {
        return zzb;
    }

    /* renamed from: H */
    static /* synthetic */ void m43309H(zzbft zzbft, String str) {
        str.getClass();
        zzbft.zze |= 1;
        zzbft.zzf = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgri zzgri = zzbgc.f26766a;
            return zzgre.m52998y(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zze", "zzf", "zzg", zzbfp.class, "zzh", zzgri, "zzi", zzgri, "zzj", zzgri});
        } else if (i2 == 3) {
            return new zzbft();
        } else {
            if (i2 == 4) {
                return new zzbfs((zzbew) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
