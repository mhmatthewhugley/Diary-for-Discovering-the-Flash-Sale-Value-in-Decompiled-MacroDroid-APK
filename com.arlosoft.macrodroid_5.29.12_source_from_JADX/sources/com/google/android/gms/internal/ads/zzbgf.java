package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbgf extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzbgf zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private int zzh;
    private int zzi = 1000;
    private zzbhp zzj;
    /* access modifiers changed from: private */
    public zzgrm zzk = zzgre.m52994u();
    private zzbfx zzl;
    private zzbga zzm;
    private zzbgt zzn;
    private zzbfb zzo;
    private zzbhd zzp;
    private zzbik zzq;
    private zzbfk zzr;

    static {
        zzbgf zzbgf = new zzbgf();
        zzb = zzbgf;
        zzgre.m52983A(zzbgf.class, zzbgf);
    }

    private zzbgf() {
    }

    /* renamed from: H */
    public static zzbge m43336H() {
        return (zzbge) zzb.mo47345C();
    }

    /* renamed from: K */
    static /* synthetic */ void m43338K(zzbgf zzbgf, String str) {
        str.getClass();
        zzbgf.zze |= 2;
        zzbgf.zzg = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m43339L(zzbgf zzbgf, Iterable iterable) {
        zzgrm zzgrm = zzbgf.zzk;
        if (!zzgrm.mo47052a()) {
            int size = zzgrm.size();
            zzbgf.zzk = zzgrm.mo47364v(size == 0 ? 10 : size + size);
        }
        zzgpf.m52507c(iterable, zzbgf.zzk);
    }

    /* renamed from: N */
    static /* synthetic */ void m43341N(zzbgf zzbgf, zzbfx zzbfx) {
        zzbfx.getClass();
        zzbgf.zzl = zzbfx;
        zzbgf.zze |= 32;
    }

    /* renamed from: O */
    static /* synthetic */ void m43342O(zzbgf zzbgf, zzbfb zzbfb) {
        zzbfb.getClass();
        zzbgf.zzo = zzbfb;
        zzbgf.zze |= 256;
    }

    /* renamed from: P */
    static /* synthetic */ void m43343P(zzbgf zzbgf, zzbhd zzbhd) {
        zzbhd.getClass();
        zzbgf.zzp = zzbhd;
        zzbgf.zze |= 512;
    }

    /* renamed from: Q */
    static /* synthetic */ void m43344Q(zzbgf zzbgf, zzbik zzbik) {
        zzbik.getClass();
        zzbgf.zzq = zzbik;
        zzbgf.zze |= 1024;
    }

    /* renamed from: R */
    static /* synthetic */ void m43345R(zzbgf zzbgf, zzbfk zzbfk) {
        zzbfk.getClass();
        zzbgf.zzr = zzbfk;
        zzbgf.zze |= 2048;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzbgc.f26766a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        } else if (i2 == 3) {
            return new zzbgf();
        } else {
            if (i2 == 4) {
                return new zzbge((zzbew) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final zzbfb mo42590F() {
        zzbfb zzbfb = this.zzo;
        return zzbfb == null ? zzbfb.m43261G() : zzbfb;
    }

    /* renamed from: G */
    public final zzbfx mo42591G() {
        zzbfx zzbfx = this.zzl;
        return zzbfx == null ? zzbfx.m43316G() : zzbfx;
    }

    /* renamed from: J */
    public final String mo42592J() {
        return this.zzg;
    }
}
