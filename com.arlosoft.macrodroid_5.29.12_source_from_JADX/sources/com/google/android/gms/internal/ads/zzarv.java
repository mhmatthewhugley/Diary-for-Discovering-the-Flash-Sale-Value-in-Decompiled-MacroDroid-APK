package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzarv extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzarv zzb;
    private int zze;
    private zzary zzf;
    private zzgpw zzg;
    private zzgpw zzh;

    static {
        zzarv zzarv = new zzarv();
        zzb = zzarv;
        zzgre.m52983A(zzarv.class, zzarv);
    }

    private zzarv() {
        zzgpw zzgpw = zzgpw.f37012a;
        this.zzg = zzgpw;
        this.zzh = zzgpw;
    }

    /* renamed from: G */
    public static zzarv m42192G(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzarv) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzarv();
        } else {
            if (i2 == 4) {
                return new zzaru((zzart) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: H */
    public final zzary mo41852H() {
        zzary zzary = this.zzf;
        return zzary == null ? zzary.m42204K() : zzary;
    }

    /* renamed from: I */
    public final zzgpw mo41853I() {
        return this.zzh;
    }

    /* renamed from: J */
    public final zzgpw mo41854J() {
        return this.zzg;
    }
}
