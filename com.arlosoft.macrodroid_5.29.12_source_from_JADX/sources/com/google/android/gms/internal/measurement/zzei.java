package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzei extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzei zza;
    private int zzd;
    private int zze;
    private zzkm zzf = zzkf.m60505n();
    private zzkm zzg = zzkf.m60505n();
    private boolean zzh;
    private boolean zzi;

    static {
        zzei zzei = new zzei();
        zza = zzei;
        zzkf.m60509t(zzei.class, zzei);
    }

    private zzei() {
    }

    /* renamed from: K */
    static /* synthetic */ void m59666K(zzei zzei, int i, zzet zzet) {
        zzet.getClass();
        zzkm zzkm = zzei.zzf;
        if (!zzkm.mo51307a()) {
            zzei.zzf = zzkf.m60506o(zzkm);
        }
        zzei.zzf.set(i, zzet);
    }

    /* renamed from: L */
    static /* synthetic */ void m59667L(zzei zzei, int i, zzek zzek) {
        zzek.getClass();
        zzkm zzkm = zzei.zzg;
        if (!zzkm.mo51307a()) {
            zzei.zzg = zzkf.m60506o(zzkm);
        }
        zzei.zzg.set(i, zzek);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", zzet.class, "zzg", zzek.class, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzei();
        } else {
            if (i2 == 4) {
                return new zzeh((zzeg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo50884B() {
        return this.zze;
    }

    /* renamed from: C */
    public final int mo50885C() {
        return this.zzg.size();
    }

    /* renamed from: D */
    public final int mo50886D() {
        return this.zzf.size();
    }

    /* renamed from: G */
    public final zzek mo50887G(int i) {
        return (zzek) this.zzg.get(i);
    }

    /* renamed from: H */
    public final zzet mo50888H(int i) {
        return (zzet) this.zzf.get(i);
    }

    /* renamed from: I */
    public final List mo50889I() {
        return this.zzg;
    }

    /* renamed from: J */
    public final List mo50890J() {
        return this.zzf;
    }

    /* renamed from: M */
    public final boolean mo50891M() {
        return (this.zzd & 1) != 0;
    }
}
