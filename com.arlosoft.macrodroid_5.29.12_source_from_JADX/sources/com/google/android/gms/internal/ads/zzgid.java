package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgid extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgid zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgid zzgid = new zzgid();
        zzb = zzgid;
        zzgre.m52983A(zzgid.class, zzgid);
    }

    private zzgid() {
    }

    /* renamed from: G */
    public static zzgic m51949G() {
        return (zzgic) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgid m51951I() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzgid();
        } else {
            if (i2 == 4) {
                return new zzgic((zzgib) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46836F() {
        return this.zze;
    }
}
