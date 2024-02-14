package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzary extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzary zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        zzary zzary = new zzary();
        zzb = zzary;
        zzgre.m52983A(zzary.class, zzary);
    }

    private zzary() {
    }

    /* renamed from: I */
    public static zzarx m42202I() {
        return (zzarx) zzb.mo47345C();
    }

    /* renamed from: K */
    public static zzary m42204K() {
        return zzb;
    }

    /* renamed from: L */
    public static zzary m42205L(zzgpw zzgpw) throws zzgrq {
        return (zzary) zzgre.m52987i(zzb, zzgpw);
    }

    /* renamed from: M */
    public static zzary m42206M(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzary) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: P */
    static /* synthetic */ void m42207P(zzary zzary, String str) {
        str.getClass();
        zzary.zze |= 1;
        zzary.zzf = str;
    }

    /* renamed from: Q */
    static /* synthetic */ void m42208Q(zzary zzary, long j) {
        zzary.zze |= 16;
        zzary.zzj = j;
    }

    /* renamed from: R */
    static /* synthetic */ void m42209R(zzary zzary, String str) {
        str.getClass();
        zzary.zze |= 2;
        zzary.zzg = str;
    }

    /* renamed from: S */
    static /* synthetic */ void m42210S(zzary zzary, long j) {
        zzary.zze |= 4;
        zzary.zzh = j;
    }

    /* renamed from: T */
    static /* synthetic */ void m42211T(zzary zzary, long j) {
        zzary.zze |= 8;
        zzary.zzi = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzary();
        } else {
            if (i2 == 4) {
                return new zzarx((zzarw) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final long mo41860F() {
        return this.zzi;
    }

    /* renamed from: G */
    public final long mo41861G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final long mo41862H() {
        return this.zzj;
    }

    /* renamed from: N */
    public final String mo41863N() {
        return this.zzg;
    }

    /* renamed from: O */
    public final String mo41864O() {
        return this.zzf;
    }
}
