package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfke extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzfke zzb;
    /* access modifiers changed from: private */
    public zzgrn zze = zzgre.m52995v();

    static {
        zzfke zzfke = new zzfke();
        zzb = zzfke;
        zzgre.m52983A(zzfke.class, zzfke);
    }

    private zzfke() {
    }

    /* renamed from: G */
    public static zzfkb m50390G() {
        return (zzfkb) zzb.mo47345C();
    }

    /* renamed from: J */
    static /* synthetic */ void m50393J(zzfke zzfke, zzfkd zzfkd) {
        zzfkd.getClass();
        zzgrn zzgrn = zzfke.zze;
        if (!zzgrn.mo47052a()) {
            zzfke.zze = zzgre.m52996w(zzgrn);
        }
        zzfke.zze.add(zzfkd);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzfkd.class});
        } else if (i2 == 3) {
            return new zzfke();
        } else {
            if (i2 == 4) {
                return new zzfkb((zzfka) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo45854F() {
        return this.zze.size();
    }
}
