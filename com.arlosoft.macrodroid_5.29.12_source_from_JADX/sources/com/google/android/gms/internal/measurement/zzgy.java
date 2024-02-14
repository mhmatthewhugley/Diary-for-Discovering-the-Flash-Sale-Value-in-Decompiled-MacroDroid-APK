package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzgy extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzgy zza;
    private int zzd;
    private int zze;
    private zzkm zzf = zzkf.m60505n();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        zzgy zzgy = new zzgy();
        zza = zzgy;
        zzkf.m60509t(zzgy.class, zzgy);
    }

    private zzgy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", zzgw.f41454a, "zzf", zzgy.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzgy();
        } else {
            if (i2 == 4) {
                return new zzgu((zzgn) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final double mo51248B() {
        return this.zzj;
    }

    /* renamed from: D */
    public final String mo51249D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final String mo51250E() {
        return this.zzh;
    }

    /* renamed from: G */
    public final List mo51251G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final boolean mo51252H() {
        return this.zzi;
    }

    /* renamed from: I */
    public final boolean mo51253I() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: J */
    public final boolean mo51254J() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: K */
    public final boolean mo51255K() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: L */
    public final int mo51256L() {
        int a = zzgx.m60231a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
