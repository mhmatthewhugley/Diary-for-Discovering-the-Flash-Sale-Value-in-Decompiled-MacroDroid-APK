package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgmp extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgmp zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgrn zzf = zzgre.m52995v();

    static {
        zzgmp zzgmp = new zzgmp();
        zzb = zzgmp;
        zzgre.m52983A(zzgmp.class, zzgmp);
    }

    private zzgmp() {
    }

    /* renamed from: F */
    public static zzgmm m52358F() {
        return (zzgmm) zzb.mo47345C();
    }

    /* renamed from: I */
    static /* synthetic */ void m52361I(zzgmp zzgmp, zzgmo zzgmo) {
        zzgmo.getClass();
        zzgrn zzgrn = zzgmp.zzf;
        if (!zzgrn.mo47052a()) {
            zzgmp.zzf = zzgre.m52996w(zzgrn);
        }
        zzgmp.zzf.add(zzgmo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgmo.class});
        } else if (i2 == 3) {
            return new zzgmp();
        } else {
            if (i2 == 4) {
                return new zzgmm((zzgml) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
