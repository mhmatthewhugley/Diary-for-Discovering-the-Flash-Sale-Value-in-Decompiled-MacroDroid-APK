package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgvy extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgvy zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzgvl zzh;
    private zzgvp zzi;
    private int zzj;
    private zzgrj zzk = zzgre.m52992n();
    private String zzl = "";
    private int zzm;
    private zzgrn zzn = zzgre.m52995v();
    private byte zzo = 2;

    static {
        zzgvy zzgvy = new zzgvy();
        zzb = zzgvy;
        zzgre.m52983A(zzgvy.class, zzgvy);
    }

    private zzgvy() {
    }

    /* renamed from: G */
    public static zzgvx m53557G() {
        return (zzgvx) zzb.mo47345C();
    }

    /* renamed from: J */
    static /* synthetic */ void m53559J(zzgvy zzgvy, int i) {
        zzgvy.zze |= 1;
        zzgvy.zzf = i;
    }

    /* renamed from: K */
    static /* synthetic */ void m53560K(zzgvy zzgvy, String str) {
        str.getClass();
        zzgvy.zze |= 2;
        zzgvy.zzg = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m53561L(zzgvy zzgvy, zzgvl zzgvl) {
        zzgvl.getClass();
        zzgvy.zzh = zzgvl;
        zzgvy.zze |= 4;
    }

    /* renamed from: M */
    static /* synthetic */ void m53562M(zzgvy zzgvy, String str) {
        str.getClass();
        zzgrn zzgrn = zzgvy.zzn;
        if (!zzgrn.mo47052a()) {
            zzgvy.zzn = zzgre.m52996w(zzgrn);
        }
        zzgvy.zzn.add(str);
    }

    /* renamed from: N */
    static /* synthetic */ void m53563N(zzgvy zzgvy, int i) {
        zzgvy.zzm = i - 1;
        zzgvy.zze |= 64;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzo);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzgvv.f37356a, "zzn"});
        } else if (i2 == 3) {
            return new zzgvy();
        } else {
            if (i2 == 4) {
                return new zzgvx((zzguq) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzo = b;
            return null;
        }
    }

    /* renamed from: F */
    public final int mo47567F() {
        return this.zzn.size();
    }

    /* renamed from: I */
    public final String mo47568I() {
        return this.zzg;
    }
}
