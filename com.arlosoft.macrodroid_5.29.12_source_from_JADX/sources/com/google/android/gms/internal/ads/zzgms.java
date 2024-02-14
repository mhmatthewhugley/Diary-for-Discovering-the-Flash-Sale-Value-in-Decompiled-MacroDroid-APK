package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgms extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgms zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgmv zzf;

    static {
        zzgms zzgms = new zzgms();
        zzb = zzgms;
        zzgre.m52983A(zzgms.class, zzgms);
    }

    private zzgms() {
    }

    /* renamed from: G */
    public static zzgmr m52365G() {
        return (zzgmr) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgms m52367I(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgms) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* renamed from: L */
    static /* synthetic */ void m52369L(zzgms zzgms, zzgmv zzgmv) {
        zzgmv.getClass();
        zzgms.zzf = zzgmv;
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
            return new zzgms();
        } else {
            if (i2 == 4) {
                return new zzgmr((zzgmq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo47008F() {
        return this.zze;
    }

    /* renamed from: J */
    public final zzgmv mo47009J() {
        zzgmv zzgmv = this.zzf;
        return zzgmv == null ? zzgmv.m52374G() : zzgmv;
    }
}
