package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzama extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzama zzb;
    private int zze;
    private String zzf = "";
    private long zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private long zzk;
    private long zzl;
    private String zzm = "";
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private zzgrn zzq = zzgre.m52995v();
    private int zzr;

    static {
        zzama zzama = new zzama();
        zzb = zzama;
        zzgre.m52983A(zzama.class, zzama);
    }

    private zzama() {
    }

    /* renamed from: F */
    public static zzalw m41731F() {
        return (zzalw) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m41733H(zzama zzama, long j) {
        zzama.zze |= 2;
        zzama.zzg = j;
    }

    /* renamed from: I */
    static /* synthetic */ void m41734I(zzama zzama, String str) {
        str.getClass();
        zzama.zze |= 4;
        zzama.zzh = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m41735J(zzama zzama, String str) {
        str.getClass();
        zzama.zze |= 8;
        zzama.zzi = str;
    }

    /* renamed from: K */
    static /* synthetic */ void m41736K(zzama zzama, String str) {
        zzama.zze |= 16;
        zzama.zzj = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m41737L(zzama zzama, String str) {
        zzama.zze |= 1024;
        zzama.zzp = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m41738M(zzama zzama, String str) {
        str.getClass();
        zzama.zze |= 1;
        zzama.zzf = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m41739N(zzama zzama, int i) {
        zzama.zzr = i - 1;
        zzama.zze |= 2048;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", zzaly.class, "zzr", zzalz.f24962a});
        } else if (i2 == 3) {
            return new zzama();
        } else {
            if (i2 == 4) {
                return new zzalw((zzalv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
