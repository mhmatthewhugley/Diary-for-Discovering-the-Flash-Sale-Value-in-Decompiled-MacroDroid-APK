package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgij extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgij zzb;
    private zzgip zze;
    private zzgld zzf;

    static {
        zzgij zzgij = new zzgij();
        zzb = zzgij;
        zzgre.m52983A(zzgij.class, zzgij);
    }

    private zzgij() {
    }

    /* renamed from: F */
    public static zzgii m51970F() {
        return (zzgii) zzb.mo47345C();
    }

    /* renamed from: H */
    public static zzgij m51972H(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgij) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: K */
    static /* synthetic */ void m51973K(zzgij zzgij, zzgip zzgip) {
        zzgip.getClass();
        zzgij.zze = zzgip;
    }

    /* renamed from: L */
    static /* synthetic */ void m51974L(zzgij zzgij, zzgld zzgld) {
        zzgld.getClass();
        zzgij.zzf = zzgld;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgij();
        } else {
            if (i2 == 4) {
                return new zzgii((zzgih) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final zzgip mo46845I() {
        zzgip zzgip = this.zze;
        return zzgip == null ? zzgip.m51996I() : zzgip;
    }

    /* renamed from: J */
    public final zzgld mo46846J() {
        zzgld zzgld = this.zzf;
        return zzgld == null ? zzgld.m52215I() : zzgld;
    }
}
