package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzgb extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzgb zza;
    private zzkm zzd = zzkf.m60505n();

    static {
        zzgb zzgb = new zzgb();
        zza = zzgb;
        zzkf.m60509t(zzgb.class, zzgb);
    }

    private zzgb() {
    }

    /* renamed from: B */
    public static zzga m59934B() {
        return (zzga) zza.mo51459x();
    }

    /* renamed from: G */
    static /* synthetic */ void m59936G(zzgb zzgb, zzgd zzgd) {
        zzgd.getClass();
        zzkm zzkm = zzgb.zzd;
        if (!zzkm.mo51307a()) {
            zzgb.zzd = zzkf.m60506o(zzkm);
        }
        zzgb.zzd.add(zzgd);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzgd.class});
        } else if (i2 == 3) {
            return new zzgb();
        } else {
            if (i2 == 4) {
                return new zzga((zzfk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final zzgd mo51064D(int i) {
        return (zzgd) this.zzd.get(0);
    }

    /* renamed from: E */
    public final List mo51065E() {
        return this.zzd;
    }
}
