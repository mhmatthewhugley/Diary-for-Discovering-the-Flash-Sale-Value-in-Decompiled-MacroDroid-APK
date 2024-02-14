package com.google.android.gms.internal.icing;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzaq extends zzda<zzaq, zzan> implements zzef {
    /* access modifiers changed from: private */
    public static final zzaq zze;
    private zzdg<zzap> zzb = zzda.m58803p();

    static {
        zzaq zzaq = new zzaq();
        zze = zzaq;
        zzda.m58797g(zzaq.class, zzaq);
    }

    private zzaq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo50166d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzda.m58798h(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzap.class});
        } else if (i2 == 3) {
            return new zzaq();
        } else {
            if (i2 == 4) {
                return new zzan((zzam) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }
}
