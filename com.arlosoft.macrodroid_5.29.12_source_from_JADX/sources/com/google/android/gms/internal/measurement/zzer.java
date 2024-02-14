package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzer extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzer zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzer zzer = new zzer();
        zza = zzer;
        zzkf.m60509t(zzer.class, zzer);
    }

    private zzer() {
    }

    /* renamed from: C */
    public static zzer m59715C() {
        return zza;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", zzep.f41437a, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzer();
        } else {
            if (i2 == 4) {
                return new zzen((zzeg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final String mo50919D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final String mo50920E() {
        return this.zzi;
    }

    /* renamed from: G */
    public final String mo50921G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean mo50922H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean mo50923I() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: J */
    public final boolean mo50924J() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: K */
    public final boolean mo50925K() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: L */
    public final boolean mo50926L() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: M */
    public final boolean mo50927M() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: N */
    public final int mo50928N() {
        int a = zzeq.m59713a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
