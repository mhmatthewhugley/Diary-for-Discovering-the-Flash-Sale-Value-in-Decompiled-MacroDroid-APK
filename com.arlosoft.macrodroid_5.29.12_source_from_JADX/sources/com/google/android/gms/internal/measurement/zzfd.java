package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzfd extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzfd zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzfd zzfd = new zzfd();
        zza = zzfd;
        zzkf.m60509t(zzfd.class, zzfd);
    }

    private zzfd() {
    }

    /* renamed from: E */
    static /* synthetic */ void m59766E(zzfd zzfd, String str) {
        str.getClass();
        zzfd.zzd |= 1;
        zzfd.zze = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzfd();
        } else {
            if (i2 == 4) {
                return new zzfc((zzez) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo50956B() {
        return this.zzh;
    }

    /* renamed from: D */
    public final String mo50957D() {
        return this.zze;
    }

    /* renamed from: G */
    public final boolean mo50958G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final boolean mo50959H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final boolean mo50960I() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: J */
    public final boolean mo50961J() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: K */
    public final boolean mo50962K() {
        return (this.zzd & 8) != 0;
    }
}
