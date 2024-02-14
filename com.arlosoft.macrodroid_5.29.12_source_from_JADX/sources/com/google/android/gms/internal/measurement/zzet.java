package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzet extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzet zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzem zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzet zzet = new zzet();
        zza = zzet;
        zzkf.m60509t(zzet.class, zzet);
    }

    private zzet() {
    }

    /* renamed from: D */
    public static zzes m59728D() {
        return (zzes) zza.mo51459x();
    }

    /* renamed from: H */
    static /* synthetic */ void m59730H(zzet zzet, String str) {
        zzet.zzd |= 2;
        zzet.zzf = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzet();
        } else {
            if (i2 == 4) {
                return new zzes((zzeg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo50930B() {
        return this.zze;
    }

    /* renamed from: C */
    public final zzem mo50931C() {
        zzem zzem = this.zzg;
        return zzem == null ? zzem.m59701C() : zzem;
    }

    /* renamed from: G */
    public final String mo50932G() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean mo50933I() {
        return this.zzh;
    }

    /* renamed from: J */
    public final boolean mo50934J() {
        return this.zzi;
    }

    /* renamed from: K */
    public final boolean mo50935K() {
        return this.zzj;
    }

    /* renamed from: L */
    public final boolean mo50936L() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: M */
    public final boolean mo50937M() {
        return (this.zzd & 32) != 0;
    }
}
