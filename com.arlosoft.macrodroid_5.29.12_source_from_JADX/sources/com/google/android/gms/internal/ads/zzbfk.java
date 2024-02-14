package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbfk extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzbfk zzb;
    private zzgrn zze = zzgre.m52995v();

    static {
        zzbfk zzbfk = new zzbfk();
        zzb = zzbfk;
        zzgre.m52983A(zzbfk.class, zzbfk);
    }

    private zzbfk() {
    }

    /* renamed from: F */
    public static zzbfe m43295F() {
        return (zzbfe) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m43297H(zzbfk zzbfk, zzbfd zzbfd) {
        zzbfd.getClass();
        zzgrn zzgrn = zzbfk.zze;
        if (!zzgrn.mo47052a()) {
            zzbfk.zze = zzgre.m52996w(zzgrn);
        }
        zzbfk.zze.add(zzbfd);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzbfd.class});
        } else if (i2 == 3) {
            return new zzbfk();
        } else {
            if (i2 == 4) {
                return new zzbfe((zzbew) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
