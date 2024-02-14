package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbgt extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzbgt zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbgt zzbgt = new zzbgt();
        zzb = zzbgt;
        zzgre.m52983A(zzbgt.class, zzbgt);
    }

    private zzbgt() {
    }

    /* renamed from: F */
    public static zzbgm m43362F() {
        return (zzbgm) zzb.mo47345C();
    }

    /* renamed from: H */
    public static zzbgt m43364H() {
        return zzb;
    }

    /* renamed from: M */
    static /* synthetic */ void m43365M(zzbgt zzbgt, int i) {
        zzbgt.zzf = i - 1;
        zzbgt.zze |= 1;
    }

    /* renamed from: N */
    static /* synthetic */ void m43366N(zzbgt zzbgt, int i) {
        zzbgt.zzg = i - 1;
        zzbgt.zze |= 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", zzbgr.f26770a, "zzg", zzbgo.f26768a});
        } else if (i2 == 3) {
            return new zzbgt();
        } else {
            if (i2 == 4) {
                return new zzbgm((zzbew) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final boolean mo42595I() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: J */
    public final boolean mo42596J() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: K */
    public final int mo42597K() {
        int a = zzbgp.m43359a(this.zzg);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: L */
    public final int mo42598L() {
        int a = zzbgs.m43361a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
