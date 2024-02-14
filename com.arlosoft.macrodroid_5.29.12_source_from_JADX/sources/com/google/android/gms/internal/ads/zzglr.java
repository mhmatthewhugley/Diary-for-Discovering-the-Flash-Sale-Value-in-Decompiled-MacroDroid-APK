package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzglr extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzglr zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzglu zzf;
    /* access modifiers changed from: private */
    public zzgpw zzg = zzgpw.f37012a;

    static {
        zzglr zzglr = new zzglr();
        zzb = zzglr;
        zzgre.m52983A(zzglr.class, zzglr);
    }

    private zzglr() {
    }

    /* renamed from: G */
    public static zzglq m52256G() {
        return (zzglq) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzglr m52258I(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzglr) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: M */
    static /* synthetic */ void m52260M(zzglr zzglr, zzglu zzglu) {
        zzglu.getClass();
        zzglr.zzf = zzglu;
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
            return new zzglr();
        } else {
            if (i2 == 4) {
                return new zzglq((zzglp) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46957F() {
        return this.zze;
    }

    /* renamed from: J */
    public final zzglu mo46958J() {
        zzglu zzglu = this.zzf;
        return zzglu == null ? zzglu.m52272J() : zzglu;
    }

    /* renamed from: K */
    public final zzgpw mo46959K() {
        return this.zzg;
    }

    /* renamed from: O */
    public final boolean mo46960O() {
        return this.zzf != null;
    }
}
