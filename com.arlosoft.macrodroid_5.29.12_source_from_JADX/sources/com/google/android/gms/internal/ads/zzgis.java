package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgis extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgis zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgis zzgis = new zzgis();
        zzb = zzgis;
        zzgre.m52983A(zzgis.class, zzgis);
    }

    private zzgis() {
    }

    /* renamed from: G */
    public static zzgir m52004G() {
        return (zzgir) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgis m52006I() {
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
            return new zzgis();
        } else {
            if (i2 == 4) {
                return new zzgir((zzgiq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46858F() {
        return this.zze;
    }
}
