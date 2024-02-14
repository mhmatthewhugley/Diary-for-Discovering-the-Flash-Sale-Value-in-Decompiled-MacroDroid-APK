package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgip extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgip zzb;
    private zzgis zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgip zzgip = new zzgip();
        zzb = zzgip;
        zzgre.m52983A(zzgip.class, zzgip);
    }

    private zzgip() {
    }

    /* renamed from: G */
    public static zzgio m51994G() {
        return (zzgio) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgip m51996I() {
        return zzb;
    }

    /* renamed from: J */
    public static zzgip m51997J(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgip) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: L */
    static /* synthetic */ void m51998L(zzgip zzgip, zzgis zzgis) {
        zzgis.getClass();
        zzgip.zze = zzgis;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgip();
        } else {
            if (i2 == 4) {
                return new zzgio((zzgin) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46855F() {
        return this.zzf;
    }

    /* renamed from: K */
    public final zzgis mo46856K() {
        zzgis zzgis = this.zze;
        return zzgis == null ? zzgis.m52006I() : zzgis;
    }
}
