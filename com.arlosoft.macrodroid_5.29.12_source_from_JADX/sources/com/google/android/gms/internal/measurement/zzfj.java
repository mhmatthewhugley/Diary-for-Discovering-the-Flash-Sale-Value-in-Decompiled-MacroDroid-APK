package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzfj extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzfj zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzfj zzfj = new zzfj();
        zza = zzfj;
        zzkf.m60509t(zzfj.class, zzfj);
    }

    private zzfj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzfj();
        } else {
            if (i2 == 4) {
                return new zzfi((zzez) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final String mo50983C() {
        return this.zze;
    }

    /* renamed from: D */
    public final String mo50984D() {
        return this.zzf;
    }
}
