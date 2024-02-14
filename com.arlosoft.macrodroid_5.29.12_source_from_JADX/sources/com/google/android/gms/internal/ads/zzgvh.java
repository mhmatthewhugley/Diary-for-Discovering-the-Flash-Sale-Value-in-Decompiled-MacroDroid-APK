package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgvh extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgvh zzb;
    private int zze;
    private zzgpw zzf;
    private zzgpw zzg;
    private byte zzh = 2;

    static {
        zzgvh zzgvh = new zzgvh();
        zzb = zzgvh;
        zzgre.m52983A(zzgvh.class, zzgvh);
    }

    private zzgvh() {
        zzgpw zzgpw = zzgpw.f37012a;
        this.zzf = zzgpw;
        this.zzg = zzgpw;
    }

    /* renamed from: F */
    public static zzgvg m53523F() {
        return (zzgvg) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m53525H(zzgvh zzgvh, zzgpw zzgpw) {
        zzgvh.zze |= 1;
        zzgvh.zzf = zzgpw;
    }

    /* renamed from: I */
    static /* synthetic */ void m53526I(zzgvh zzgvh, zzgpw zzgpw) {
        zzgvh.zze |= 2;
        zzgvh.zzg = zzgpw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgvh();
        } else {
            if (i2 == 4) {
                return new zzgvg((zzguq) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }
}
