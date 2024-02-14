package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgmc extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgmc zzb;
    private String zze = "";
    /* access modifiers changed from: private */
    public zzgpw zzf = zzgpw.f37012a;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzgmc zzgmc = new zzgmc();
        zzb = zzgmc;
        zzgre.m52983A(zzgmc.class, zzgmc);
    }

    private zzgmc() {
    }

    /* renamed from: F */
    public static zzgmb m52299F() {
        return (zzgmb) zzb.mo47345C();
    }

    /* renamed from: H */
    public static zzgmc m52301H() {
        return zzb;
    }

    /* renamed from: K */
    static /* synthetic */ void m52302K(zzgmc zzgmc, String str) {
        str.getClass();
        zzgmc.zze = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgmc();
        } else {
            if (i2 == 4) {
                return new zzgmb((zzgma) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final zzgpw mo46977I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final String mo46978J() {
        return this.zze;
    }

    /* renamed from: M */
    public final int mo46979M() {
        int b = zzgnd.m52396b(this.zzg);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
