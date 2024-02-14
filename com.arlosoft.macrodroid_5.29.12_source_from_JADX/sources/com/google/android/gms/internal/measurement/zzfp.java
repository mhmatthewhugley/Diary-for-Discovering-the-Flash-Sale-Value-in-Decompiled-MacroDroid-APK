package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzfp extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzfp zza;
    private int zzd;
    private int zze;
    private zzgi zzf;
    private zzgi zzg;
    private boolean zzh;

    static {
        zzfp zzfp = new zzfp();
        zza = zzfp;
        zzkf.m60509t(zzfp.class, zzfp);
    }

    private zzfp() {
    }

    /* renamed from: C */
    public static zzfo m59814C() {
        return (zzfo) zza.mo51459x();
    }

    /* renamed from: H */
    static /* synthetic */ void m59816H(zzfp zzfp, int i) {
        zzfp.zzd |= 1;
        zzfp.zze = i;
    }

    /* renamed from: I */
    static /* synthetic */ void m59817I(zzfp zzfp, zzgi zzgi) {
        zzgi.getClass();
        zzfp.zzf = zzgi;
        zzfp.zzd |= 2;
    }

    /* renamed from: J */
    static /* synthetic */ void m59818J(zzfp zzfp, zzgi zzgi) {
        zzfp.zzg = zzgi;
        zzfp.zzd |= 4;
    }

    /* renamed from: K */
    static /* synthetic */ void m59819K(zzfp zzfp, boolean z) {
        zzfp.zzd |= 8;
        zzfp.zzh = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzfp();
        } else {
            if (i2 == 4) {
                return new zzfo((zzfk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo50989B() {
        return this.zze;
    }

    /* renamed from: E */
    public final zzgi mo50990E() {
        zzgi zzgi = this.zzf;
        return zzgi == null ? zzgi.m60153J() : zzgi;
    }

    /* renamed from: G */
    public final zzgi mo50991G() {
        zzgi zzgi = this.zzg;
        return zzgi == null ? zzgi.m60153J() : zzgi;
    }

    /* renamed from: L */
    public final boolean mo50992L() {
        return this.zzh;
    }

    /* renamed from: M */
    public final boolean mo50993M() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: N */
    public final boolean mo50994N() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: O */
    public final boolean mo50995O() {
        return (this.zzd & 4) != 0;
    }
}
