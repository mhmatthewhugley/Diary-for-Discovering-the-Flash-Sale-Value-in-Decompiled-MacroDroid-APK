package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzglu extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzglu zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzglo zzf;
    /* access modifiers changed from: private */
    public zzgpw zzg = zzgpw.f37012a;

    static {
        zzglu zzglu = new zzglu();
        zzb = zzglu;
        zzgre.m52983A(zzglu.class, zzglu);
    }

    private zzglu() {
    }

    /* renamed from: H */
    public static zzglt m52270H() {
        return (zzglt) zzb.mo47345C();
    }

    /* renamed from: J */
    public static zzglu m52272J() {
        return zzb;
    }

    /* renamed from: K */
    public static zzglu m52273K(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzglu) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: N */
    static /* synthetic */ void m52275N(zzglu zzglu, zzglo zzglo) {
        zzglo.getClass();
        zzglu.zzf = zzglo;
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
            return new zzglu();
        } else {
            if (i2 == 4) {
                return new zzglt((zzgls) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46964F() {
        return this.zze;
    }

    /* renamed from: G */
    public final zzglo mo46965G() {
        zzglo zzglo = this.zzf;
        return zzglo == null ? zzglo.m52245H() : zzglo;
    }

    /* renamed from: L */
    public final zzgpw mo46966L() {
        return this.zzg;
    }

    /* renamed from: P */
    public final boolean mo46967P() {
        return this.zzf != null;
    }
}
