package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbhd extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzbhd zzb;
    private int zze;
    private zzgrn zzf = zzgre.m52995v();
    private int zzg;
    private int zzh;
    private long zzi;
    private String zzj = "";
    private String zzk = "";
    private long zzl;
    private int zzm;

    static {
        zzbhd zzbhd = new zzbhd();
        zzb = zzbhd;
        zzgre.m52983A(zzbhd.class, zzbhd);
    }

    private zzbhd() {
    }

    /* renamed from: F */
    public static zzbgz m43429F() {
        return (zzbgz) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m43431H(zzbhd zzbhd, Iterable iterable) {
        zzgrn zzgrn = zzbhd.zzf;
        if (!zzgrn.mo47052a()) {
            zzbhd.zzf = zzgre.m52996w(zzgrn);
        }
        zzgpf.m52507c(iterable, zzbhd.zzf);
    }

    /* renamed from: I */
    static /* synthetic */ void m43432I(zzbhd zzbhd, int i) {
        zzbhd.zze |= 1;
        zzbhd.zzg = i;
    }

    /* renamed from: J */
    static /* synthetic */ void m43433J(zzbhd zzbhd, int i) {
        zzbhd.zze |= 2;
        zzbhd.zzh = i;
    }

    /* renamed from: K */
    static /* synthetic */ void m43434K(zzbhd zzbhd, long j) {
        zzbhd.zze |= 4;
        zzbhd.zzi = j;
    }

    /* renamed from: L */
    static /* synthetic */ void m43435L(zzbhd zzbhd, String str) {
        str.getClass();
        zzbhd.zze |= 8;
        zzbhd.zzj = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m43436M(zzbhd zzbhd, String str) {
        str.getClass();
        zzbhd.zze |= 16;
        zzbhd.zzk = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m43437N(zzbhd zzbhd, long j) {
        zzbhd.zze |= 32;
        zzbhd.zzl = j;
    }

    /* renamed from: O */
    static /* synthetic */ void m43438O(zzbhd zzbhd, int i) {
        zzbhd.zze |= 64;
        zzbhd.zzm = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zze", "zzf", zzbgy.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i2 == 3) {
            return new zzbhd();
        } else {
            if (i2 == 4) {
                return new zzbgz((zzbew) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
