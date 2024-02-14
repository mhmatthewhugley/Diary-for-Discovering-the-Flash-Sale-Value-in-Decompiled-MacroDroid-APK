package com.google.android.gms.internal.ads;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgmf extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgmf zzb;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        zzgmf zzgmf = new zzgmf();
        zzb = zzgmf;
        zzgre.m52983A(zzgmf.class, zzgmf);
    }

    private zzgmf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzgmf();
        } else {
            if (i2 == 4) {
                return new zzgme((zzgmd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46980F() {
        return this.zzg;
    }

    /* renamed from: H */
    public final String mo46981H() {
        return this.zzi;
    }

    /* renamed from: I */
    public final String mo46982I() {
        return this.zze;
    }

    /* renamed from: J */
    public final String mo46983J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final boolean mo46984K() {
        return this.zzh;
    }
}
