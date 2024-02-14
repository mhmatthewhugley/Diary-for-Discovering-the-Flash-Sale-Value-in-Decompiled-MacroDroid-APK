package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgiv extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgiv zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgjb zzf;
    /* access modifiers changed from: private */
    public zzgpw zzg = zzgpw.f37012a;

    static {
        zzgiv zzgiv = new zzgiv();
        zzb = zzgiv;
        zzgre.m52983A(zzgiv.class, zzgiv);
    }

    private zzgiv() {
    }

    /* renamed from: G */
    public static zzgiu m52013G() {
        return (zzgiu) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgiv m52015I(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgiv) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: M */
    static /* synthetic */ void m52017M(zzgiv zzgiv, zzgjb zzgjb) {
        zzgjb.getClass();
        zzgiv.zzf = zzgjb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgiv();
        } else {
            if (i2 == 4) {
                return new zzgiu((zzgit) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46862F() {
        return this.zze;
    }

    /* renamed from: J */
    public final zzgjb mo46863J() {
        zzgjb zzgjb = this.zzf;
        return zzgjb == null ? zzgjb.m52054I() : zzgjb;
    }

    /* renamed from: K */
    public final zzgpw mo46864K() {
        return this.zzg;
    }
}
