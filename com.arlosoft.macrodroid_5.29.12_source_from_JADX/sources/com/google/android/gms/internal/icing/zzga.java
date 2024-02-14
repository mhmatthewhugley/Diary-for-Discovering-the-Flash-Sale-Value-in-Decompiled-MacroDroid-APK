package com.google.android.gms.internal.icing;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzga extends zzda<zzga, zzfz> implements zzef {
    /* access modifiers changed from: private */
    public static final zzga zzi;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private zzdg<zzfy> zzg = zzda.m58803p();
    private zzfw zzh;

    static {
        zzga zzga = new zzga();
        zzi = zzga;
        zzda.m58797g(zzga.class, zzga);
    }

    private zzga() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo50166d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzda.m58798h(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", zzfy.class, "zzh"});
        } else if (i2 == 3) {
            return new zzga();
        } else {
            if (i2 == 4) {
                return new zzfz((zzfu) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }
}
