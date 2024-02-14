package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfkd extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzfkd zzb;
    private zzfjz zze;

    static {
        zzfkd zzfkd = new zzfkd();
        zzb = zzfkd;
        zzgre.m52983A(zzfkd.class, zzfkd);
    }

    private zzfkd() {
    }

    /* renamed from: F */
    public static zzfkc m50386F() {
        return (zzfkc) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m50388H(zzfkd zzfkd, zzfjz zzfjz) {
        zzfjz.getClass();
        zzfkd.zze = zzfjz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzfkd();
        } else {
            if (i2 == 4) {
                return new zzfkc((zzfka) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
