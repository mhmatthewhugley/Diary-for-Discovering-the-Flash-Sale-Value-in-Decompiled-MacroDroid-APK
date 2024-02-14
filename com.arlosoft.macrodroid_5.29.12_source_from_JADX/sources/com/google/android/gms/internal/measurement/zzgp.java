package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzgp extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzgp zza;
    private zzkm zzd = zzkf.m60505n();

    static {
        zzgp zzgp = new zzgp();
        zza = zzgp;
        zzkf.m60509t(zzgp.class, zzgp);
    }

    private zzgp() {
    }

    /* renamed from: D */
    public static zzgp m60218D() {
        return zza;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzgr.class});
        } else if (i2 == 3) {
            return new zzgp();
        } else {
            if (i2 == 4) {
                return new zzgo((zzgn) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo51242B() {
        return this.zzd.size();
    }

    /* renamed from: E */
    public final List mo51243E() {
        return this.zzd;
    }
}
