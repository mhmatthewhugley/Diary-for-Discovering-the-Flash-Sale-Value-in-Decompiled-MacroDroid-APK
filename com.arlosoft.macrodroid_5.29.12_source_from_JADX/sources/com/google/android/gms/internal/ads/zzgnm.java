package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgnm extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgnm zzb;
    private int zze;

    static {
        zzgnm zzgnm = new zzgnm();
        zzb = zzgnm;
        zzgre.m52983A(zzgnm.class, zzgnm);
    }

    private zzgnm() {
    }

    /* renamed from: G */
    public static zzgnm m52412G() {
        return zzb;
    }

    /* renamed from: H */
    public static zzgnm m52413H(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgnm) zzgre.m52989k(zzb, zzgpw, zzgqq);
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
            return new zzgnm();
        } else {
            if (i2 == 4) {
                return new zzgnl((zzgnk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
