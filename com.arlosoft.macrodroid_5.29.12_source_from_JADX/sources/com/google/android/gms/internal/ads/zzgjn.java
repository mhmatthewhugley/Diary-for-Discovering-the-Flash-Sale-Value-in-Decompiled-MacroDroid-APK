package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgjn extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgjn zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzgjn zzgjn = new zzgjn();
        zzb = zzgjn;
        zzgre.m52983A(zzgjn.class, zzgjn);
    }

    private zzgjn() {
    }

    /* renamed from: G */
    public static zzgjm m52086G() {
        return (zzgjm) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgjn m52088I(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgjn) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        } else if (i2 == 3) {
            return new zzgjn();
        } else {
            if (i2 == 4) {
                return new zzgjm((zzgjl) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46889F() {
        return this.zze;
    }
}