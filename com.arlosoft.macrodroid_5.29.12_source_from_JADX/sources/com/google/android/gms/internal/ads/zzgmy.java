package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgmy extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgmy zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgnb zzf;

    static {
        zzgmy zzgmy = new zzgmy();
        zzb = zzgmy;
        zzgre.m52983A(zzgmy.class, zzgmy);
    }

    private zzgmy() {
    }

    /* renamed from: G */
    public static zzgmx m52380G() {
        return (zzgmx) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgmy m52382I(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgmy) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: L */
    static /* synthetic */ void m52384L(zzgmy zzgmy, zzgnb zzgnb) {
        zzgnb.getClass();
        zzgmy.zzf = zzgnb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgmy();
        } else {
            if (i2 == 4) {
                return new zzgmx((zzgmw) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo47013F() {
        return this.zze;
    }

    /* renamed from: J */
    public final zzgnb mo47014J() {
        zzgnb zzgnb = this.zzf;
        return zzgnb == null ? zzgnb.m52389H() : zzgnb;
    }
}
