package com.google.android.gms.internal.icing;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzgf extends zzda<zzgf, zzge> implements zzef {
    /* access modifiers changed from: private */
    public static final zzgf zzg;
    private int zzb;
    private String zze = "";
    private zzdg<zzgd> zzf = zzda.m58803p();

    static {
        zzgf zzgf = new zzgf();
        zzg = zzgf;
        zzda.m58797g(zzgf.class, zzgf);
    }

    private zzgf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo50166d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzda.m58798h(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", zzgd.class});
        } else if (i2 == 3) {
            return new zzgf();
        } else {
            if (i2 == 4) {
                return new zzge((zzgb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
