package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzgt extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzgt zza;
    private int zzd;
    private zzkm zze = zzkf.m60505n();
    private zzgp zzf;

    static {
        zzgt zzgt = new zzgt();
        zza = zzgt;
        zzkf.m60509t(zzgt.class, zzgt);
    }

    private zzgt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", zzgy.class, "zzf"});
        } else if (i2 == 3) {
            return new zzgt();
        } else {
            if (i2 == 4) {
                return new zzgs((zzgn) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final zzgp mo51246B() {
        zzgp zzgp = this.zzf;
        return zzgp == null ? zzgp.m60218D() : zzgp;
    }

    /* renamed from: D */
    public final List mo51247D() {
        return this.zze;
    }
}
