package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgkh extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgkh zzb;
    private zzgkk zze;

    static {
        zzgkh zzgkh = new zzgkh();
        zzb = zzgkh;
        zzgre.m52983A(zzgkh.class, zzgkh);
    }

    private zzgkh() {
    }

    /* renamed from: F */
    public static zzgkg m52132F() {
        return (zzgkg) zzb.mo47345C();
    }

    /* renamed from: H */
    public static zzgkh m52134H(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgkh) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: J */
    static /* synthetic */ void m52135J(zzgkh zzgkh, zzgkk zzgkk) {
        zzgkk.getClass();
        zzgkh.zze = zzgkk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzgkh();
        } else {
            if (i2 == 4) {
                return new zzgkg((zzgkf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final zzgkk mo46905I() {
        zzgkk zzgkk = this.zze;
        return zzgkk == null ? zzgkk.m52143I() : zzgkk;
    }
}
