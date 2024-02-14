package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgkn extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgkn zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgkq zzf;
    /* access modifiers changed from: private */
    public zzgpw zzg = zzgpw.f37012a;

    static {
        zzgkn zzgkn = new zzgkn();
        zzb = zzgkn;
        zzgre.m52983A(zzgkn.class, zzgkn);
    }

    private zzgkn() {
    }

    /* renamed from: G */
    public static zzgkm m52154G() {
        return (zzgkm) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgkn m52156I(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgkn) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: M */
    static /* synthetic */ void m52158M(zzgkn zzgkn, zzgkq zzgkq) {
        zzgkq.getClass();
        zzgkn.zzf = zzgkq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgkn();
        } else {
            if (i2 == 4) {
                return new zzgkm((zzgkl) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46915F() {
        return this.zze;
    }

    /* renamed from: J */
    public final zzgkq mo46916J() {
        zzgkq zzgkq = this.zzf;
        return zzgkq == null ? zzgkq.m52170J() : zzgkq;
    }

    /* renamed from: K */
    public final zzgpw mo46917K() {
        return this.zzg;
    }
}
