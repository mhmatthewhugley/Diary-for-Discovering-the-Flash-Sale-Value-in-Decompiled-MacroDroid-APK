package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfjz extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzfjz zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public long zzg;
    /* access modifiers changed from: private */
    public int zzh;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    /* access modifiers changed from: private */
    public int zzl;
    private int zzm;
    /* access modifiers changed from: private */
    public int zzn;
    /* access modifiers changed from: private */
    public long zzo;
    private int zzp;
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    /* access modifiers changed from: private */
    public String zzt = "";
    private String zzu = "";

    static {
        zzfjz zzfjz = new zzfjz();
        zzb = zzfjz;
        zzgre.m52983A(zzfjz.class, zzfjz);
    }

    private zzfjz() {
    }

    /* renamed from: F */
    public static zzfjy m50354F() {
        return (zzfjy) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m50356H(zzfjz zzfjz, String str) {
        str.getClass();
        zzfjz.zzi = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m50357I(zzfjz zzfjz, String str) {
        str.getClass();
        zzfjz.zzj = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m50358J(zzfjz zzfjz, String str) {
        str.getClass();
        zzfjz.zzk = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m50362N(zzfjz zzfjz, String str) {
        str.getClass();
        zzfjz.zzq = str;
    }

    /* renamed from: O */
    static /* synthetic */ void m50363O(zzfjz zzfjz, String str) {
        str.getClass();
        zzfjz.zzr = str;
    }

    /* renamed from: P */
    static /* synthetic */ void m50364P(zzfjz zzfjz, String str) {
        str.getClass();
        zzfjz.zzs = str;
    }

    /* renamed from: S */
    static /* synthetic */ void m50367S(zzfjz zzfjz, String str) {
        str.getClass();
        zzfjz.zzu = str;
    }

    /* renamed from: V */
    static /* synthetic */ void m50370V(zzfjz zzfjz, int i) {
        if (i != 1) {
            zzfjz.zzm = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: W */
    static /* synthetic */ void m50371W(zzfjz zzfjz, int i) {
        if (i != 1) {
            zzfjz.zzp = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        } else if (i2 == 3) {
            return new zzfjz();
        } else {
            if (i2 == 4) {
                return new zzfjy((zzfjx) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
