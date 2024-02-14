package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgig extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgig zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgim zzf;
    private zzgla zzg;

    static {
        zzgig zzgig = new zzgig();
        zzb = zzgig;
        zzgre.m52983A(zzgig.class, zzgig);
    }

    private zzgig() {
    }

    /* renamed from: G */
    public static zzgif m51958G() {
        return (zzgif) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgig m51960I(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgig) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: M */
    static /* synthetic */ void m51962M(zzgig zzgig, zzgim zzgim) {
        zzgim.getClass();
        zzgig.zzf = zzgim;
    }

    /* renamed from: N */
    static /* synthetic */ void m51963N(zzgig zzgig, zzgla zzgla) {
        zzgla.getClass();
        zzgig.zzg = zzgla;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgig();
        } else {
            if (i2 == 4) {
                return new zzgif((zzgie) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46840F() {
        return this.zze;
    }

    /* renamed from: J */
    public final zzgim mo46841J() {
        zzgim zzgim = this.zzf;
        return zzgim == null ? zzgim.m51983I() : zzgim;
    }

    /* renamed from: K */
    public final zzgla mo46842K() {
        zzgla zzgla = this.zzg;
        return zzgla == null ? zzgla.m52202I() : zzgla;
    }
}
