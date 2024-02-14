package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgjt extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgjt zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzgjt zzgjt = new zzgjt();
        zzb = zzgjt;
        zzgre.m52983A(zzgjt.class, zzgjt);
    }

    private zzgjt() {
    }

    /* renamed from: G */
    public static zzgjs m52103G() {
        return (zzgjs) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgjt m52105I(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgjt) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgjt();
        } else {
            if (i2 == 4) {
                return new zzgjs((zzgjr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46895F() {
        return this.zze;
    }
}
