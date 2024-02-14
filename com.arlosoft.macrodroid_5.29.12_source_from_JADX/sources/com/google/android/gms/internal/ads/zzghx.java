package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzghx extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzghx zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzgpw zzf = zzgpw.f37012a;
    private zzgid zzg;

    static {
        zzghx zzghx = new zzghx();
        zzb = zzghx;
        zzgre.m52983A(zzghx.class, zzghx);
    }

    private zzghx() {
    }

    /* renamed from: G */
    public static zzghw m51923G() {
        return (zzghw) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzghx m51925I(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzghx) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: N */
    static /* synthetic */ void m51928N(zzghx zzghx, zzgid zzgid) {
        zzgid.getClass();
        zzghx.zzg = zzgid;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzghx();
        } else {
            if (i2 == 4) {
                return new zzghw((zzghv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46825F() {
        return this.zze;
    }

    /* renamed from: J */
    public final zzgid mo46826J() {
        zzgid zzgid = this.zzg;
        return zzgid == null ? zzgid.m51951I() : zzgid;
    }

    /* renamed from: K */
    public final zzgpw mo46827K() {
        return this.zzf;
    }
}
