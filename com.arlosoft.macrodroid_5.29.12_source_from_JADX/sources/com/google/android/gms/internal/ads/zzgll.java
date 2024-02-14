package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgll extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgll zzb;
    private zzglo zze;

    static {
        zzgll zzgll = new zzgll();
        zzb = zzgll;
        zzgre.m52983A(zzgll.class, zzgll);
    }

    private zzgll() {
    }

    /* renamed from: F */
    public static zzglk m52234F() {
        return (zzglk) zzb.mo47345C();
    }

    /* renamed from: H */
    public static zzgll m52236H(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgll) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: J */
    static /* synthetic */ void m52237J(zzgll zzgll, zzglo zzglo) {
        zzglo.getClass();
        zzgll.zze = zzglo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzgll();
        } else {
            if (i2 == 4) {
                return new zzglk((zzglj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final zzglo mo46947I() {
        zzglo zzglo = this.zze;
        return zzglo == null ? zzglo.m52245H() : zzglo;
    }
}
