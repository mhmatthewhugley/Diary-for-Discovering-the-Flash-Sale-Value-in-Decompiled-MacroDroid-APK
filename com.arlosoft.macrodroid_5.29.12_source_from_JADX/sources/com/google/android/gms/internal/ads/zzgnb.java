package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgnb extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgnb zzb;
    private String zze = "";
    private zzgmc zzf;

    static {
        zzgnb zzgnb = new zzgnb();
        zzb = zzgnb;
        zzgre.m52983A(zzgnb.class, zzgnb);
    }

    private zzgnb() {
    }

    /* renamed from: H */
    public static zzgnb m52389H() {
        return zzb;
    }

    /* renamed from: I */
    public static zzgnb m52390I(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgnb) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgnb();
        } else {
            if (i2 == 4) {
                return new zzgna((zzgmz) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final zzgmc mo47016F() {
        zzgmc zzgmc = this.zzf;
        return zzgmc == null ? zzgmc.m52301H() : zzgmc;
    }

    /* renamed from: J */
    public final String mo47017J() {
        return this.zze;
    }

    /* renamed from: K */
    public final boolean mo47018K() {
        return this.zzf != null;
    }
}
