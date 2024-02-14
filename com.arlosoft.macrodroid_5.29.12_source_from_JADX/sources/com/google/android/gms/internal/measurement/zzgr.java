package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzgr extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzgr zza;
    private int zzd;
    private String zze = "";
    private zzkm zzf = zzkf.m60505n();

    static {
        zzgr zzgr = new zzgr();
        zza = zzgr;
        zzkf.m60509t(zzgr.class, zzgr);
    }

    private zzgr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", zzgy.class});
        } else if (i2 == 3) {
            return new zzgr();
        } else {
            if (i2 == 4) {
                return new zzgq((zzgn) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final String mo51244C() {
        return this.zze;
    }

    /* renamed from: D */
    public final List mo51245D() {
        return this.zzf;
    }
}
