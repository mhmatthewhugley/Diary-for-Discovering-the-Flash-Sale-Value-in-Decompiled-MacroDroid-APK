package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgim extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgim zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgis zzf;
    /* access modifiers changed from: private */
    public zzgpw zzg = zzgpw.f37012a;

    static {
        zzgim zzgim = new zzgim();
        zzb = zzgim;
        zzgre.m52983A(zzgim.class, zzgim);
    }

    private zzgim() {
    }

    /* renamed from: G */
    public static zzgil m51981G() {
        return (zzgil) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgim m51983I() {
        return zzb;
    }

    /* renamed from: J */
    public static zzgim m51984J(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgim) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: N */
    static /* synthetic */ void m51986N(zzgim zzgim, zzgis zzgis) {
        zzgis.getClass();
        zzgim.zzf = zzgis;
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
            return new zzgim();
        } else {
            if (i2 == 4) {
                return new zzgil((zzgik) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46850F() {
        return this.zze;
    }

    /* renamed from: K */
    public final zzgis mo46851K() {
        zzgis zzgis = this.zzf;
        return zzgis == null ? zzgis.m52006I() : zzgis;
    }

    /* renamed from: L */
    public final zzgpw mo46852L() {
        return this.zzg;
    }
}
