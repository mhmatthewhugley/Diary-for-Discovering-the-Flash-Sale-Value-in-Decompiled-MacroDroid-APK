package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgmj extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgmj zzb;
    private zzglx zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        zzgmj zzgmj = new zzgmj();
        zzb = zzgmj;
        zzgre.m52983A(zzgmj.class, zzgmj);
    }

    private zzgmj() {
    }

    /* renamed from: H */
    public static zzgmi m52323H() {
        return (zzgmi) zzb.mo47345C();
    }

    /* renamed from: J */
    static /* synthetic */ void m52325J(zzgmj zzgmj, zzglx zzglx) {
        zzglx.getClass();
        zzgmj.zze = zzglx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzgmj();
        } else {
            if (i2 == 4) {
                return new zzgmi((zzgmg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46992F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final zzglx mo46993G() {
        zzglx zzglx = this.zze;
        return zzglx == null ? zzglx.m52287H() : zzglx;
    }

    /* renamed from: L */
    public final boolean mo46994L() {
        return this.zze != null;
    }

    /* renamed from: M */
    public final int mo46995M() {
        int i = this.zzf;
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

    /* renamed from: N */
    public final int mo46996N() {
        int b = zzgnd.m52396b(this.zzh);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
