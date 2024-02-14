package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzfb extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzfb zza;
    private int zzd;
    private String zze = "";
    private zzkm zzf = zzkf.m60505n();
    private boolean zzg;

    static {
        zzfb zzfb = new zzfb();
        zza = zzfb;
        zzkf.m60509t(zzfb.class, zzfb);
    }

    private zzfb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", zzfh.class, "zzg"});
        } else if (i2 == 3) {
            return new zzfb();
        } else {
            if (i2 == 4) {
                return new zzfa((zzez) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final String mo50947C() {
        return this.zze;
    }
}
