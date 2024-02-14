package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgkk extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgkk zzb;
    private zzgkt zze;
    private zzgke zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzgkk zzgkk = new zzgkk();
        zzb = zzgkk;
        zzgre.m52983A(zzgkk.class, zzgkk);
    }

    private zzgkk() {
    }

    /* renamed from: G */
    public static zzgkj m52141G() {
        return (zzgkj) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgkk m52143I() {
        return zzb;
    }

    /* renamed from: K */
    static /* synthetic */ void m52144K(zzgkk zzgkk, zzgkt zzgkt) {
        zzgkt.getClass();
        zzgkk.zze = zzgkt;
    }

    /* renamed from: L */
    static /* synthetic */ void m52145L(zzgkk zzgkk, zzgke zzgke) {
        zzgke.getClass();
        zzgkk.zzf = zzgke;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgkk();
        } else {
            if (i2 == 4) {
                return new zzgkj((zzgki) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final zzgke mo46909F() {
        zzgke zzgke = this.zzf;
        return zzgke == null ? zzgke.m52127H() : zzgke;
    }

    /* renamed from: J */
    public final zzgkt mo46910J() {
        zzgkt zzgkt = this.zze;
        return zzgkt == null ? zzgkt.m52186H() : zzgkt;
    }

    /* renamed from: M */
    public final int mo46911M() {
        int i = this.zzg;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
