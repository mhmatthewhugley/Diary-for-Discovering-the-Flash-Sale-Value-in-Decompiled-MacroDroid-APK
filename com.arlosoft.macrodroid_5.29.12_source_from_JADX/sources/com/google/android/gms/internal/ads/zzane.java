package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzane extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzane zzb;
    private int zze;
    private zzgpw zzf;
    private zzgpw zzg;
    private zzgpw zzh;
    private zzgpw zzi;

    static {
        zzane zzane = new zzane();
        zzb = zzane;
        zzgre.m52983A(zzane.class, zzane);
    }

    private zzane() {
        zzgpw zzgpw = zzgpw.f37012a;
        this.zzf = zzgpw;
        this.zzg = zzgpw;
        this.zzh = zzgpw;
        this.zzi = zzgpw;
    }

    /* renamed from: F */
    public static zzand m41948F() {
        return (zzand) zzb.mo47345C();
    }

    /* renamed from: H */
    public static zzane m41950H(byte[] bArr, zzgqq zzgqq) throws zzgrq {
        return (zzane) zzgre.m52991m(zzb, bArr, zzgqq);
    }

    /* renamed from: M */
    static /* synthetic */ void m41951M(zzane zzane, zzgpw zzgpw) {
        zzane.zze |= 1;
        zzane.zzf = zzgpw;
    }

    /* renamed from: N */
    static /* synthetic */ void m41952N(zzane zzane, zzgpw zzgpw) {
        zzane.zze |= 2;
        zzane.zzg = zzgpw;
    }

    /* renamed from: O */
    static /* synthetic */ void m41953O(zzane zzane, zzgpw zzgpw) {
        zzane.zze |= 4;
        zzane.zzh = zzgpw;
    }

    /* renamed from: P */
    static /* synthetic */ void m41954P(zzane zzane, zzgpw zzgpw) {
        zzane.zze |= 8;
        zzane.zzi = zzgpw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzane();
        } else {
            if (i2 == 4) {
                return new zzand((zzamj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final zzgpw mo41747I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final zzgpw mo41748J() {
        return this.zzg;
    }

    /* renamed from: K */
    public final zzgpw mo41749K() {
        return this.zzi;
    }

    /* renamed from: L */
    public final zzgpw mo41750L() {
        return this.zzh;
    }
}
