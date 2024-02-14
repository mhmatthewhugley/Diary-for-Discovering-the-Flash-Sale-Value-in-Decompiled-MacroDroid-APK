package com.google.android.gms.internal.icing;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzfw extends zzda<zzfw, zzfv> implements zzef {
    /* access modifiers changed from: private */
    public static final zzfw zzj;
    private int zzb;
    private boolean zze;
    private int zzf;
    private String zzg = "";
    private zzdg<zzfy> zzh = zzda.m58803p();
    private zzdg<zzfy> zzi = zzda.m58803p();

    static {
        zzfw zzfw = new zzfw();
        zzj = zzfw;
        zzda.m58797g(zzfw.class, zzfw);
    }

    private zzfw() {
    }

    /* renamed from: t */
    public static zzfw m59104t() {
        return zzj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo50166d(int i, Object obj, Object obj2) {
        Class<zzfy> cls = zzfy.class;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzda.m58798h(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", cls, "zzi", cls});
        } else if (i2 == 3) {
            return new zzfw();
        } else {
            if (i2 == 4) {
                return new zzfv((zzfu) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }

    /* renamed from: q */
    public final boolean mo50451q() {
        return this.zze;
    }

    /* renamed from: r */
    public final int mo50452r() {
        return this.zzf;
    }

    /* renamed from: s */
    public final String mo50453s() {
        return this.zzg;
    }
}
