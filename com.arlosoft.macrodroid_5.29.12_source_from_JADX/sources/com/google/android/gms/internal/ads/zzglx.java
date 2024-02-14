package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzglx extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzglx zzb;
    /* access modifiers changed from: private */
    public String zze = "";
    /* access modifiers changed from: private */
    public zzgpw zzf = zzgpw.f37012a;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzglx zzglx = new zzglx();
        zzb = zzglx;
        zzgre.m52983A(zzglx.class, zzglx);
    }

    private zzglx() {
    }

    /* renamed from: F */
    public static zzglw m52285F() {
        return (zzglw) zzb.mo47345C();
    }

    /* renamed from: H */
    public static zzglx m52287H() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzglx();
        } else {
            if (i2 == 4) {
                return new zzglw((zzglv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final zzgpw mo46971I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final String mo46972J() {
        return this.zze;
    }

    /* renamed from: M */
    public final int mo46973M() {
        int i = this.zzg;
        int i2 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 0 : 6 : 5;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
