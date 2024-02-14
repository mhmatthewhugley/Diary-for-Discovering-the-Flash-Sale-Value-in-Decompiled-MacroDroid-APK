package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgjb extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgjb zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgjb zzgjb = new zzgjb();
        zzb = zzgjb;
        zzgre.m52983A(zzgjb.class, zzgjb);
    }

    private zzgjb() {
    }

    /* renamed from: G */
    public static zzgja m52052G() {
        return (zzgja) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgjb m52054I() {
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
            return zzgre.m52998y(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzgjb();
        } else {
            if (i2 == 4) {
                return new zzgja((zzgiz) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46877F() {
        return this.zze;
    }
}
