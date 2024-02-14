package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgwa extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgwa zzb;
    private int zze;
    private String zzf = "";
    private long zzg;
    private boolean zzh;
    private int zzi;
    private String zzj = "";
    private String zzk = "";

    static {
        zzgwa zzgwa = new zzgwa();
        zzb = zzgwa;
        zzgre.m52983A(zzgwa.class, zzgwa);
    }

    private zzgwa() {
    }

    /* renamed from: F */
    public static zzgvz m53579F() {
        return (zzgvz) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m53581H(zzgwa zzgwa, String str) {
        zzgwa.zze |= 1;
        zzgwa.zzf = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m53582I(zzgwa zzgwa, long j) {
        zzgwa.zze |= 2;
        zzgwa.zzg = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m53583J(zzgwa zzgwa, boolean z) {
        zzgwa.zze |= 4;
        zzgwa.zzh = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzgwb.f37366a, "zzj", "zzk"});
        } else if (i2 == 3) {
            return new zzgwa();
        } else {
            if (i2 == 4) {
                return new zzgvz((zzguq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
