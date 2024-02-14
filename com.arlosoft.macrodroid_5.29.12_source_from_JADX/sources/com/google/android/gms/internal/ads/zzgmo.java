package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgmo extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgmo zzb;
    private String zze = "";
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        zzgmo zzgmo = new zzgmo();
        zzb = zzgmo;
        zzgre.m52983A(zzgmo.class, zzgmo);
    }

    private zzgmo() {
    }

    /* renamed from: F */
    public static zzgmn m52351F() {
        return (zzgmn) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m52353H(zzgmo zzgmo, String str) {
        str.getClass();
        zzgmo.zze = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzgmo();
        } else {
            if (i2 == 4) {
                return new zzgmn((zzgml) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
