package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgvo extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgvo zzb;
    private int zze;
    private int zzf;
    private zzgpw zzg;
    private zzgpw zzh;

    static {
        zzgvo zzgvo = new zzgvo();
        zzb = zzgvo;
        zzgre.m52983A(zzgvo.class, zzgvo);
    }

    private zzgvo() {
        zzgpw zzgpw = zzgpw.f37012a;
        this.zzg = zzgpw;
        this.zzh = zzgpw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzgvo();
        } else {
            if (i2 == 4) {
                return new zzgvn((zzguq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
