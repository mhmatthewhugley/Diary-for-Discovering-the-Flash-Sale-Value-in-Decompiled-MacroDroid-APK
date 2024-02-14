package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgkt extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgkt zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public zzgpw zzg = zzgpw.f37012a;

    static {
        zzgkt zzgkt = new zzgkt();
        zzb = zzgkt;
        zzgre.m52983A(zzgkt.class, zzgkt);
    }

    private zzgkt() {
    }

    /* renamed from: F */
    public static zzgks m52184F() {
        return (zzgks) zzb.mo47345C();
    }

    /* renamed from: H */
    public static zzgkt m52186H() {
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
            return zzgre.m52998y(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgkt();
        } else {
            if (i2 == 4) {
                return new zzgks((zzgkr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final zzgpw mo46929I() {
        return this.zzg;
    }

    /* renamed from: K */
    public final int mo46930K() {
        int i = this.zze;
        int i2 = 5;
        if (i == 0) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 4;
        } else if (i != 3) {
            i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* renamed from: L */
    public final int mo46931L() {
        int b = zzgkx.m52196b(this.zzf);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
