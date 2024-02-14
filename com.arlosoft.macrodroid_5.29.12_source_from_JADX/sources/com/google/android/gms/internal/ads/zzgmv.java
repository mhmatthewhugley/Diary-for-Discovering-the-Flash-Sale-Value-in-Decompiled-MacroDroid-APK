package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgmv extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgmv zzb;
    private String zze = "";

    static {
        zzgmv zzgmv = new zzgmv();
        zzb = zzgmv;
        zzgre.m52983A(zzgmv.class, zzgmv);
    }

    private zzgmv() {
    }

    /* renamed from: G */
    public static zzgmv m52374G() {
        return zzb;
    }

    /* renamed from: H */
    public static zzgmv m52375H(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgmv) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzgmv();
        } else {
            if (i2 == 4) {
                return new zzgmu((zzgmt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final String mo47010I() {
        return this.zze;
    }
}
