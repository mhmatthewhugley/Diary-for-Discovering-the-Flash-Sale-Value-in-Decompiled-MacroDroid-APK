package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzem extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzem zza;
    private int zzd;
    private zzey zze;
    private zzer zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        zzem zzem = new zzem();
        zza = zzem;
        zzkf.m60509t(zzem.class, zzem);
    }

    private zzem() {
    }

    /* renamed from: C */
    public static zzem m59701C() {
        return zza;
    }

    /* renamed from: H */
    static /* synthetic */ void m59702H(zzem zzem, String str) {
        zzem.zzd |= 8;
        zzem.zzh = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzem();
        } else {
            if (i2 == 4) {
                return new zzel((zzeg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final zzer mo50910D() {
        zzer zzer = this.zzf;
        return zzer == null ? zzer.m59715C() : zzer;
    }

    /* renamed from: E */
    public final zzey mo50911E() {
        zzey zzey = this.zze;
        return zzey == null ? zzey.m59743D() : zzey;
    }

    /* renamed from: G */
    public final String mo50912G() {
        return this.zzh;
    }

    /* renamed from: I */
    public final boolean mo50913I() {
        return this.zzg;
    }

    /* renamed from: J */
    public final boolean mo50914J() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: K */
    public final boolean mo50915K() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: L */
    public final boolean mo50916L() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: M */
    public final boolean mo50917M() {
        return (this.zzd & 1) != 0;
    }
}
