package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgjk extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgjk zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzgpw zzf = zzgpw.f37012a;

    static {
        zzgjk zzgjk = new zzgjk();
        zzb = zzgjk;
        zzgre.m52983A(zzgjk.class, zzgjk);
    }

    private zzgjk() {
    }

    /* renamed from: G */
    public static zzgjj m52077G() {
        return (zzgjj) zzb.mo47345C();
    }

    /* renamed from: I */
    public static zzgjk m52079I(zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        return (zzgjk) zzgre.m52989k(zzb, zzgpw, zzgqq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgjk();
        } else {
            if (i2 == 4) {
                return new zzgjj((zzgji) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46886F() {
        return this.zze;
    }

    /* renamed from: J */
    public final zzgpw mo46887J() {
        return this.zzf;
    }
}
