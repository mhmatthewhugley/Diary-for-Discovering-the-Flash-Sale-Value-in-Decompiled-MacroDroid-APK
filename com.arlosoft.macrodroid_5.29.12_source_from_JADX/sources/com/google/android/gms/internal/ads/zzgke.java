package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgke extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgke zzb;
    private zzgmc zze;

    static {
        zzgke zzgke = new zzgke();
        zzb = zzgke;
        zzgre.m52983A(zzgke.class, zzgke);
    }

    private zzgke() {
    }

    /* renamed from: F */
    public static zzgkd m52125F() {
        return (zzgkd) zzb.mo47345C();
    }

    /* renamed from: H */
    public static zzgke m52127H() {
        return zzb;
    }

    /* renamed from: J */
    static /* synthetic */ void m52128J(zzgke zzgke, zzgmc zzgmc) {
        zzgmc.getClass();
        zzgke.zze = zzgmc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzgke();
        } else {
            if (i2 == 4) {
                return new zzgkd((zzgkc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final zzgmc mo46903I() {
        zzgmc zzgmc = this.zze;
        return zzgmc == null ? zzgmc.m52301H() : zzgmc;
    }
}
