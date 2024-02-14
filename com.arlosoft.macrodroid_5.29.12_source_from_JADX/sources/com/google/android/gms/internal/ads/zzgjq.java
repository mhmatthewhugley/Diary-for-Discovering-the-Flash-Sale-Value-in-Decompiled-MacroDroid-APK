package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgjq extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgjq zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzgpw zzf = zzgpw.f37012a;

    static {
        zzgjq zzgjq = new zzgjq();
        zzb = zzgjq;
        zzgre.m52983A(zzgjq.class, zzgjq);
    }

    private zzgjq() {
    }

    /* renamed from: G */
    public static zzgjp m52094G() {
        return (zzgjp) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgjq m52096I(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgjq) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgjq();
        } else {
            if (i2 == 4) {
                return new zzgjp((zzgjo) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46892F() {
        return this.zze;
    }

    /* renamed from: J */
    public final zzgpw mo46893J() {
        return this.zzf;
    }
}
