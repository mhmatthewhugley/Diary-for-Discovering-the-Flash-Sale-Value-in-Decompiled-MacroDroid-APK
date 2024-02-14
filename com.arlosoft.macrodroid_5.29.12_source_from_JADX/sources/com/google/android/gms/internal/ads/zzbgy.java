package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbgy extends zzgre implements zzgsp {
    private static final zzgrk zzb = new zzbgw();
    /* access modifiers changed from: private */
    public static final zzbgy zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private zzgrj zzk = zzgre.m52992n();
    private zzbgt zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs;

    static {
        zzbgy zzbgy = new zzbgy();
        zze = zzbgy;
        zzgre.m52983A(zzbgy.class, zzbgy);
    }

    private zzbgy() {
    }

    /* renamed from: F */
    static /* synthetic */ void m43387F(zzbgy zzbgy, int i) {
        zzbgy.zzn = i - 1;
        zzbgy.zzf |= 64;
    }

    /* renamed from: G */
    static /* synthetic */ void m43388G(zzbgy zzbgy, int i) {
        zzbgy.zzo = i - 1;
        zzbgy.zzf |= 128;
    }

    /* renamed from: H */
    static /* synthetic */ void m43389H(zzbgy zzbgy, int i) {
        zzbgy.zzq = i - 1;
        zzbgy.zzf |= 512;
    }

    /* renamed from: N */
    public static zzbgx m43390N() {
        return (zzbgx) zze.mo47345C();
    }

    /* renamed from: P */
    public static zzbgy m43392P(byte[] bArr) throws zzgrq {
        return (zzbgy) zzgre.m52988j(zze, bArr);
    }

    /* renamed from: S */
    static /* synthetic */ void m43393S(zzbgy zzbgy, long j) {
        zzbgy.zzf |= 1;
        zzbgy.zzg = j;
    }

    /* renamed from: T */
    static /* synthetic */ void m43394T(zzbgy zzbgy, long j) {
        zzbgy.zzf |= 4;
        zzbgy.zzi = j;
    }

    /* renamed from: U */
    static /* synthetic */ void m43395U(zzbgy zzbgy, long j) {
        zzbgy.zzf |= 8;
        zzbgy.zzj = j;
    }

    /* renamed from: V */
    static /* synthetic */ void m43396V(zzbgy zzbgy, Iterable iterable) {
        zzgrj zzgrj = zzbgy.zzk;
        if (!zzgrj.mo47052a()) {
            zzbgy.zzk = zzgre.m52993o(zzgrj);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzbgy.zzk.mo47354E(((zzbfn) it.next()).zza());
        }
    }

    /* renamed from: W */
    static /* synthetic */ void m43397W(zzbgy zzbgy, zzbgt zzbgt) {
        zzbgt.getClass();
        zzbgy.zzl = zzbgt;
        zzbgy.zzf |= 16;
    }

    /* renamed from: X */
    static /* synthetic */ void m43398X(zzbgy zzbgy, int i) {
        zzbgy.zzf |= 256;
        zzbgy.zzp = i;
    }

    /* renamed from: Y */
    static /* synthetic */ void m43399Y(zzbgy zzbgy, zzbhc zzbhc) {
        zzbgy.zzr = zzbhc.zza();
        zzbgy.zzf |= 1024;
    }

    /* renamed from: Z */
    static /* synthetic */ void m43400Z(zzbgy zzbgy, long j) {
        zzbgy.zzf |= 2048;
        zzbgy.zzs = j;
    }

    /* renamed from: f0 */
    static /* synthetic */ void m43401f0(zzbgy zzbgy, int i) {
        zzbgy.zzh = i - 1;
        zzbgy.zzf |= 2;
    }

    /* renamed from: g0 */
    static /* synthetic */ void m43402g0(zzbgy zzbgy, int i) {
        zzbgy.zzm = i - 1;
        zzbgy.zzf |= 32;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgri zzgri = zzbgc.f26766a;
            return zzgre.m52998y(zze, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n\rဂ\u000b", new Object[]{"zzf", "zzg", "zzh", zzgri, "zzi", "zzj", "zzk", zzbfn.m43301d(), "zzl", "zzm", zzgri, "zzn", zzgri, "zzo", zzgri, "zzp", "zzq", zzgri, "zzr", zzbhc.m43428d(), "zzs"});
        } else if (i2 == 3) {
            return new zzbgy();
        } else {
            if (i2 == 4) {
                return new zzbgx((zzbew) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    /* renamed from: I */
    public final int mo42612I() {
        return this.zzp;
    }

    /* renamed from: J */
    public final long mo42613J() {
        return this.zzj;
    }

    /* renamed from: K */
    public final long mo42614K() {
        return this.zzi;
    }

    /* renamed from: L */
    public final long mo42615L() {
        return this.zzg;
    }

    /* renamed from: M */
    public final zzbgt mo42616M() {
        zzbgt zzbgt = this.zzl;
        return zzbgt == null ? zzbgt.m43364H() : zzbgt;
    }

    /* renamed from: Q */
    public final zzbhc mo42617Q() {
        zzbhc b = zzbhc.m43427b(this.zzr);
        return b == null ? zzbhc.UNSPECIFIED : b;
    }

    /* renamed from: R */
    public final List mo42618R() {
        return new zzgrl(this.zzk, zzb);
    }

    /* renamed from: a0 */
    public final int mo42619a0() {
        int a = zzbgd.m43324a(this.zzn);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: b0 */
    public final int mo42620b0() {
        int a = zzbgd.m43324a(this.zzo);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: c0 */
    public final int mo42621c0() {
        int a = zzbgd.m43324a(this.zzq);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: d0 */
    public final int mo42622d0() {
        int a = zzbgd.m43324a(this.zzh);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: e0 */
    public final int mo42623e0() {
        int a = zzbgd.m43324a(this.zzm);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
