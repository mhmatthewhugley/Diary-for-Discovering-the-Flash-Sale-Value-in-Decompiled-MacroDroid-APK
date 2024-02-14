package com.google.android.gms.internal.icing;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzgd extends zzda<zzgd, zzgc> implements zzef {
    /* access modifiers changed from: private */
    public static final zzgd zzg;
    private int zzb;
    private String zze = "";
    private zzgh zzf;

    static {
        zzgd zzgd = new zzgd();
        zzg = zzgd;
        zzda.m58797g(zzgd.class, zzgd);
    }

    private zzgd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo50166d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzda.m58798h(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgd();
        } else {
            if (i2 == 4) {
                return new zzgc((zzgb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
