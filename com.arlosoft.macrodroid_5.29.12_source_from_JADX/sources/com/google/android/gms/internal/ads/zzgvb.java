package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgvb extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgvb zzb;
    private int zze;
    private String zzf = "";

    static {
        zzgvb zzgvb = new zzgvb();
        zzb = zzgvb;
        zzgre.m52983A(zzgvb.class, zzgvb);
    }

    private zzgvb() {
    }

    /* renamed from: F */
    public static zzgva m53513F() {
        return (zzgva) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m53515H(zzgvb zzgvb, String str) {
        zzgvb.zze |= 1;
        zzgvb.zzf = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgvb();
        } else {
            if (i2 == 4) {
                return new zzgva((zzguq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
