package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgia extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgia zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgid zzf;

    static {
        zzgia zzgia = new zzgia();
        zzb = zzgia;
        zzgre.m52983A(zzgia.class, zzgia);
    }

    private zzgia() {
    }

    /* renamed from: G */
    public static zzghz m51940G() {
        return (zzghz) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgia m51942I(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgia) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: L */
    static /* synthetic */ void m51944L(zzgia zzgia, zzgid zzgid) {
        zzgid.getClass();
        zzgia.zzf = zzgid;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgia();
        } else {
            if (i2 == 4) {
                return new zzghz((zzghy) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46833F() {
        return this.zze;
    }

    /* renamed from: J */
    public final zzgid mo46834J() {
        zzgid zzgid = this.zzf;
        return zzgid == null ? zzgid.m51951I() : zzgid;
    }
}
