package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzgk extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzgk zza;
    private int zzd;
    private int zze;
    private zzkl zzf = zzkf.m60503l();

    static {
        zzgk zzgk = new zzgk();
        zza = zzgk;
        zzkf.m60509t(zzgk.class, zzgk);
    }

    private zzgk() {
    }

    /* renamed from: E */
    public static zzgj m60179E() {
        return (zzgj) zza.mo51459x();
    }

    /* renamed from: I */
    static /* synthetic */ void m60181I(zzgk zzgk, int i) {
        zzgk.zzd |= 1;
        zzgk.zze = i;
    }

    /* renamed from: J */
    static /* synthetic */ void m60182J(zzgk zzgk, Iterable iterable) {
        zzkl zzkl = zzgk.zzf;
        if (!zzkl.mo51307a()) {
            zzgk.zzf = zzkf.m60504m(zzkl);
        }
        zzio.m60316g(iterable, zzgk.zzf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgk();
        } else {
            if (i2 == 4) {
                return new zzgj((zzfk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo51220B() {
        return this.zzf.size();
    }

    /* renamed from: C */
    public final int mo51221C() {
        return this.zze;
    }

    /* renamed from: D */
    public final long mo51222D(int i) {
        return this.zzf.mo51470v(i);
    }

    /* renamed from: H */
    public final List mo51223H() {
        return this.zzf;
    }

    /* renamed from: K */
    public final boolean mo51224K() {
        return (this.zzd & 1) != 0;
    }
}
