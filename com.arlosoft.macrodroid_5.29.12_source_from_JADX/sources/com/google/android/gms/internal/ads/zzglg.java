package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzglg extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzglg zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzglg zzglg = new zzglg();
        zzb = zzglg;
        zzgre.m52983A(zzglg.class, zzglg);
    }

    private zzglg() {
    }

    /* renamed from: G */
    public static zzglf m52224G() {
        return (zzglf) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzglg m52226I() {
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
            return zzgre.m52998y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzglg();
        } else {
            if (i2 == 4) {
                return new zzglf((zzgle) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46944F() {
        return this.zzf;
    }

    /* renamed from: K */
    public final int mo46945K() {
        int b = zzgkx.m52196b(this.zze);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
