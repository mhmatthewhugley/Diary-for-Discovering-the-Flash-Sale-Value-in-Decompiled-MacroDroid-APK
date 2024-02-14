package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzgm extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzgm zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        zzgm zzgm = new zzgm();
        zza = zzgm;
        zzkf.m60509t(zzgm.class, zzgm);
    }

    private zzgm() {
    }

    /* renamed from: E */
    public static zzgl m60197E() {
        return (zzgl) zza.mo51459x();
    }

    /* renamed from: J */
    static /* synthetic */ void m60199J(zzgm zzgm, long j) {
        zzgm.zzd |= 1;
        zzgm.zze = j;
    }

    /* renamed from: K */
    static /* synthetic */ void m60200K(zzgm zzgm, String str) {
        str.getClass();
        zzgm.zzd |= 2;
        zzgm.zzf = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m60201L(zzgm zzgm, String str) {
        str.getClass();
        zzgm.zzd |= 4;
        zzgm.zzg = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m60202M(zzgm zzgm) {
        zzgm.zzd &= -5;
        zzgm.zzg = zza.zzg;
    }

    /* renamed from: N */
    static /* synthetic */ void m60203N(zzgm zzgm, long j) {
        zzgm.zzd |= 8;
        zzgm.zzh = j;
    }

    /* renamed from: O */
    static /* synthetic */ void m60204O(zzgm zzgm) {
        zzgm.zzd &= -9;
        zzgm.zzh = 0;
    }

    /* renamed from: P */
    static /* synthetic */ void m60205P(zzgm zzgm, double d) {
        zzgm.zzd |= 32;
        zzgm.zzj = d;
    }

    /* renamed from: Q */
    static /* synthetic */ void m60206Q(zzgm zzgm) {
        zzgm.zzd &= -33;
        zzgm.zzj = 0.0d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzgm();
        } else {
            if (i2 == 4) {
                return new zzgl((zzfk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final double mo51233B() {
        return this.zzj;
    }

    /* renamed from: C */
    public final long mo51234C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final long mo51235D() {
        return this.zze;
    }

    /* renamed from: H */
    public final String mo51236H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final String mo51237I() {
        return this.zzg;
    }

    /* renamed from: R */
    public final boolean mo51238R() {
        return (this.zzd & 32) != 0;
    }

    /* renamed from: S */
    public final boolean mo51239S() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: T */
    public final boolean mo51240T() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: U */
    public final boolean mo51241U() {
        return (this.zzd & 4) != 0;
    }
}
