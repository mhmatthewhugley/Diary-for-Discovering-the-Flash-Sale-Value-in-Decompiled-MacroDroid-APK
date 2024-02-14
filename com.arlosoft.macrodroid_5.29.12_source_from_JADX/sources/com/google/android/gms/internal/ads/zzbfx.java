package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbfx extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzbfx zzb;
    private int zze;
    private String zzf = "";
    private zzbhn zzg;
    private int zzh;
    private zzbhp zzi;
    private int zzj;
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        zzbfx zzbfx = new zzbfx();
        zzb = zzbfx;
        zzgre.m52983A(zzbfx.class, zzbfx);
    }

    private zzbfx() {
    }

    /* renamed from: G */
    public static zzbfx m43316G() {
        return zzb;
    }

    /* renamed from: H */
    static /* synthetic */ void m43317H(zzbfx zzbfx, String str) {
        zzbfx.zze |= 1;
        zzbfx.zzf = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m43318I(zzbfx zzbfx, zzbhp zzbhp) {
        zzbhp.getClass();
        zzbfx.zzi = zzbhp;
        zzbfx.zze |= 8;
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
            return zzgre.m52998y(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgri, "zzl", zzgri, "zzm", zzgri});
        } else if (i2 == 3) {
            return new zzbfx();
        } else {
            if (i2 == 4) {
                return new zzbfw((zzbew) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
