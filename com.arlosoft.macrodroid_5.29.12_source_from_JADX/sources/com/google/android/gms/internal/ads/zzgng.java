package com.google.android.gms.internal.ads;

import java.util.List;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgng extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgng zzb;
    private String zze = "";
    private zzgrn zzf = zzgre.m52995v();

    static {
        zzgng zzgng = new zzgng();
        zzb = zzgng;
        zzgre.m52983A(zzgng.class, zzgng);
    }

    private zzgng() {
    }

    /* renamed from: G */
    public static zzgng m52398G() {
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
            return zzgre.m52998y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzgmf.class});
        } else if (i2 == 3) {
            return new zzgng();
        } else {
            if (i2 == 4) {
                return new zzgnf((zzgne) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: H */
    public final List mo47019H() {
        return this.zzf;
    }
}
