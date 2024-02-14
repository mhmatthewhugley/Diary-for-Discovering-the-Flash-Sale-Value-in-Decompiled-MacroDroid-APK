package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgld extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgld zzb;
    private zzglg zze;
    /* access modifiers changed from: private */
    public int zzf;
    private int zzg;

    static {
        zzgld zzgld = new zzgld();
        zzb = zzgld;
        zzgre.m52983A(zzgld.class, zzgld);
    }

    private zzgld() {
    }

    /* renamed from: G */
    public static zzglc m52213G() {
        return (zzglc) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgld m52215I() {
        return zzb;
    }

    /* renamed from: J */
    public static zzgld m52216J(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgld) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: L */
    static /* synthetic */ void m52217L(zzgld zzgld, zzglg zzglg) {
        zzglg.getClass();
        zzgld.zze = zzglg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgld();
        } else {
            if (i2 == 4) {
                return new zzglc((zzglb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46940F() {
        return this.zzf;
    }

    /* renamed from: K */
    public final zzglg mo46941K() {
        zzglg zzglg = this.zze;
        return zzglg == null ? zzglg.m52226I() : zzglg;
    }
}
