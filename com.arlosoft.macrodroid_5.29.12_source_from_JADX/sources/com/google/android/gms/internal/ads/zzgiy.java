package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgiy extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgiy zzb;
    private zzgjb zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgiy zzgiy = new zzgiy();
        zzb = zzgiy;
        zzgre.m52983A(zzgiy.class, zzgiy);
    }

    private zzgiy() {
    }

    /* renamed from: G */
    public static zzgix m52025G() {
        return (zzgix) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgiy m52027I(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgiy) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: K */
    static /* synthetic */ void m52028K(zzgiy zzgiy, zzgjb zzgjb) {
        zzgjb.getClass();
        zzgiy.zze = zzgjb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgiy();
        } else {
            if (i2 == 4) {
                return new zzgix((zzgiw) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46867F() {
        return this.zzf;
    }

    /* renamed from: J */
    public final zzgjb mo46868J() {
        zzgjb zzgjb = this.zze;
        return zzgjb == null ? zzgjb.m52054I() : zzgjb;
    }
}
