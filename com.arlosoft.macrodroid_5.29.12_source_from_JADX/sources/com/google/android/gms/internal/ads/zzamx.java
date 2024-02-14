package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzamx extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzamx zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = 1000;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzu;
    private long zzv;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        zzamx zzamx = new zzamx();
        zzb = zzamx;
        zzgre.m52983A(zzamx.class, zzamx);
    }

    private zzamx() {
    }

    /* renamed from: F */
    public static zzamw m41836F() {
        return (zzamw) zzb.mo47345C();
    }

    /* renamed from: H */
    static /* synthetic */ void m41838H(zzamx zzamx, long j) {
        zzamx.zze |= 1;
        zzamx.zzf = j;
    }

    /* renamed from: I */
    static /* synthetic */ void m41839I(zzamx zzamx, long j) {
        zzamx.zze |= 2;
        zzamx.zzg = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m41840J(zzamx zzamx, long j) {
        zzamx.zze |= 4;
        zzamx.zzh = j;
    }

    /* renamed from: K */
    static /* synthetic */ void m41841K(zzamx zzamx, long j) {
        zzamx.zze |= 8;
        zzamx.zzi = j;
    }

    /* renamed from: L */
    static /* synthetic */ void m41842L(zzamx zzamx) {
        zzamx.zze &= -9;
        zzamx.zzi = -1;
    }

    /* renamed from: M */
    static /* synthetic */ void m41843M(zzamx zzamx, long j) {
        zzamx.zze |= 16;
        zzamx.zzj = j;
    }

    /* renamed from: N */
    static /* synthetic */ void m41844N(zzamx zzamx, long j) {
        zzamx.zze |= 32;
        zzamx.zzk = j;
    }

    /* renamed from: O */
    static /* synthetic */ void m41845O(zzamx zzamx, long j) {
        zzamx.zze |= 128;
        zzamx.zzm = j;
    }

    /* renamed from: P */
    static /* synthetic */ void m41846P(zzamx zzamx, long j) {
        zzamx.zze |= 256;
        zzamx.zzn = j;
    }

    /* renamed from: Q */
    static /* synthetic */ void m41847Q(zzamx zzamx, long j) {
        zzamx.zze |= 512;
        zzamx.zzo = j;
    }

    /* renamed from: R */
    static /* synthetic */ void m41848R(zzamx zzamx, long j) {
        zzamx.zze |= 2048;
        zzamx.zzq = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m41849S(zzamx zzamx, long j) {
        zzamx.zze |= 4096;
        zzamx.zzr = j;
    }

    /* renamed from: T */
    static /* synthetic */ void m41850T(zzamx zzamx, long j) {
        zzamx.zze |= 8192;
        zzamx.zzs = j;
    }

    /* renamed from: U */
    static /* synthetic */ void m41851U(zzamx zzamx, long j) {
        zzamx.zze |= 16384;
        zzamx.zzt = j;
    }

    /* renamed from: V */
    static /* synthetic */ void m41852V(zzamx zzamx, long j) {
        zzamx.zze |= 32768;
        zzamx.zzu = j;
    }

    /* renamed from: W */
    static /* synthetic */ void m41853W(zzamx zzamx, long j) {
        zzamx.zze |= 65536;
        zzamx.zzv = j;
    }

    /* renamed from: X */
    static /* synthetic */ void m41854X(zzamx zzamx, long j) {
        zzamx.zze |= 131072;
        zzamx.zzw = j;
    }

    /* renamed from: Y */
    static /* synthetic */ void m41855Y(zzamx zzamx, long j) {
        zzamx.zze |= 262144;
        zzamx.zzx = j;
    }

    /* renamed from: Z */
    static /* synthetic */ void m41856Z(zzamx zzamx, int i) {
        zzamx.zzl = i - 1;
        zzamx.zze |= 64;
    }

    /* renamed from: a0 */
    static /* synthetic */ void m41857a0(zzamx zzamx, int i) {
        zzamx.zzp = i - 1;
        zzamx.zze |= 1024;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgri zzgri = zzang.f24978a;
            return zzgre.m52998y(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgri, "zzm", "zzn", "zzo", "zzp", zzgri, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        } else if (i2 == 3) {
            return new zzamx();
        } else {
            if (i2 == 4) {
                return new zzamw((zzamj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
