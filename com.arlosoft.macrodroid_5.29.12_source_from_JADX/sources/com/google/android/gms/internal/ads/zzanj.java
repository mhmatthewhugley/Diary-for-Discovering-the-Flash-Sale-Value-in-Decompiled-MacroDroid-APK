package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzanj extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzanj zzb;
    private int zze;
    private long zzf;
    private String zzg = "";
    private zzgpw zzh = zzgpw.f37012a;

    static {
        zzanj zzanj = new zzanj();
        zzb = zzanj;
        zzgre.m52983A(zzanj.class, zzanj);
    }

    private zzanj() {
    }

    /* renamed from: H */
    public static zzanj m41964H() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzanj();
        } else {
            if (i2 == 4) {
                return new zzani((zzamj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final long mo41751F() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean mo41752I() {
        return (this.zze & 1) != 0;
    }
}
