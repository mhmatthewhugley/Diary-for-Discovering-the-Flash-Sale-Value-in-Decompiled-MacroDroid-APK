package com.google.android.gms.internal.icing;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzgh extends zzda<zzgh, zzgg> implements zzef {
    /* access modifiers changed from: private */
    public static final zzgh zzj;
    private int zzb;
    private boolean zze;
    private String zzf = "";
    private long zzg;
    private double zzh;
    private zzgf zzi;

    static {
        zzgh zzgh = new zzgh();
        zzj = zzgh;
        zzda.m58797g(zzgh.class, zzgh);
    }

    private zzgh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo50166d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzda.m58798h(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004က\u0003\u0005ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzgh();
        } else {
            if (i2 == 4) {
                return new zzgg((zzgb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }
}
