package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzgg extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzgg zza;
    private int zzd;
    private int zze = 1;
    private zzkm zzf = zzkf.m60505n();

    static {
        zzgg zzgg = new zzgg();
        zza = zzgg;
        zzkf.m60509t(zzgg.class, zzgg);
    }

    private zzgg() {
    }

    /* renamed from: B */
    public static zzge m60137B() {
        return (zzge) zza.mo51459x();
    }

    /* renamed from: D */
    static /* synthetic */ void m60139D(zzgg zzgg, zzfv zzfv) {
        zzfv.getClass();
        zzkm zzkm = zzgg.zzf;
        if (!zzkm.mo51307a()) {
            zzgg.zzf = zzkf.m60506o(zzkm);
        }
        zzgg.zzf.add(zzfv);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", zzgf.f41452a, "zzf", zzfv.class});
        } else if (i2 == 3) {
            return new zzgg();
        } else {
            if (i2 == 4) {
                return new zzge((zzfk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
