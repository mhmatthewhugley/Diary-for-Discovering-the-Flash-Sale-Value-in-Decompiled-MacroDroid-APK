package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgkq extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgkq zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgkk zzf;
    /* access modifiers changed from: private */
    public zzgpw zzg;
    /* access modifiers changed from: private */
    public zzgpw zzh;

    static {
        zzgkq zzgkq = new zzgkq();
        zzb = zzgkq;
        zzgre.m52983A(zzgkq.class, zzgkq);
    }

    private zzgkq() {
        zzgpw zzgpw = zzgpw.f37012a;
        this.zzg = zzgpw;
        this.zzh = zzgpw;
    }

    /* renamed from: H */
    public static zzgkp m52168H() {
        return (zzgkp) zzb.mo47345C();
    }

    /* renamed from: J */
    public static zzgkq m52170J() {
        return zzb;
    }

    /* renamed from: K */
    public static zzgkq m52171K(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgkq) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: O */
    static /* synthetic */ void m52173O(zzgkq zzgkq, zzgkk zzgkk) {
        zzgkk.getClass();
        zzgkq.zzf = zzgkk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzgkq();
        } else {
            if (i2 == 4) {
                return new zzgkp((zzgko) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46922F() {
        return this.zze;
    }

    /* renamed from: G */
    public final zzgkk mo46923G() {
        zzgkk zzgkk = this.zzf;
        return zzgkk == null ? zzgkk.m52143I() : zzgkk;
    }

    /* renamed from: L */
    public final zzgpw mo46924L() {
        return this.zzg;
    }

    /* renamed from: M */
    public final zzgpw mo46925M() {
        return this.zzh;
    }
}
