package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbfd extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzbfd zzb;
    private int zze;
    private int zzf;
    private zzbfh zzg;
    private zzbfj zzh;

    static {
        zzbfd zzbfd = new zzbfd();
        zzb = zzbfd;
        zzgre.m52983A(zzbfd.class, zzbfd);
    }

    private zzbfd() {
    }

    /* renamed from: F */
    public static zzbfc m43270F() {
        return (zzbfc) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m43272H(zzbfd zzbfd, zzbfh zzbfh) {
        zzbfh.getClass();
        zzbfd.zzg = zzbfh;
        zzbfd.zze |= 2;
    }

    /* renamed from: I */
    static /* synthetic */ void m43273I(zzbfd zzbfd, zzbfj zzbfj) {
        zzbfj.getClass();
        zzbfd.zzh = zzbfj;
        zzbfd.zze |= 4;
    }

    /* renamed from: J */
    static /* synthetic */ void m43274J(zzbfd zzbfd, int i) {
        zzbfd.zzf = 1;
        zzbfd.zze = 1 | zzbfd.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", zzbff.f26740a, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzbfd();
        } else {
            if (i2 == 4) {
                return new zzbfc((zzbew) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
