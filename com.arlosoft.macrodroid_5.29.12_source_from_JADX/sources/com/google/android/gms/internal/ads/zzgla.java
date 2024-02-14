package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgla extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgla zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzglg zzf;
    /* access modifiers changed from: private */
    public zzgpw zzg = zzgpw.f37012a;

    static {
        zzgla zzgla = new zzgla();
        zzb = zzgla;
        zzgre.m52983A(zzgla.class, zzgla);
    }

    private zzgla() {
    }

    /* renamed from: G */
    public static zzgkz m52200G() {
        return (zzgkz) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgla m52202I() {
        return zzb;
    }

    /* renamed from: J */
    public static zzgla m52203J(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgla) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: N */
    static /* synthetic */ void m52205N(zzgla zzgla, zzglg zzglg) {
        zzglg.getClass();
        zzgla.zzf = zzglg;
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
            return new zzgla();
        } else {
            if (i2 == 4) {
                return new zzgkz((zzgky) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46935F() {
        return this.zze;
    }

    /* renamed from: K */
    public final zzglg mo46936K() {
        zzglg zzglg = this.zzf;
        return zzglg == null ? zzglg.m52226I() : zzglg;
    }

    /* renamed from: L */
    public final zzgpw mo46937L() {
        return this.zzg;
    }
}
