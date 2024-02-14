package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzfr extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzfr zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        zzfr zzfr = new zzfr();
        zza = zzfr;
        zzkf.m60509t(zzfr.class, zzfr);
    }

    private zzfr() {
    }

    /* renamed from: D */
    public static zzfq m59830D() {
        return (zzfq) zza.mo51459x();
    }

    /* renamed from: G */
    static /* synthetic */ void m59832G(zzfr zzfr, int i) {
        zzfr.zzd |= 1;
        zzfr.zze = i;
    }

    /* renamed from: H */
    static /* synthetic */ void m59833H(zzfr zzfr, long j) {
        zzfr.zzd |= 2;
        zzfr.zzf = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzfr();
        } else {
            if (i2 == 4) {
                return new zzfq((zzfk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo50998B() {
        return this.zze;
    }

    /* renamed from: C */
    public final long mo50999C() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean mo51000I() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: J */
    public final boolean mo51001J() {
        return (this.zzd & 1) != 0;
    }
}
