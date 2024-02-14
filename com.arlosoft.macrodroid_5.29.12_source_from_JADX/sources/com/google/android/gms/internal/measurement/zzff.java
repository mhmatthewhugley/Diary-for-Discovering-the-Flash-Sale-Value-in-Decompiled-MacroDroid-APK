package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzff extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzff zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private int zzg;
    private zzkm zzh = zzkf.m60505n();
    private zzkm zzi = zzkf.m60505n();
    /* access modifiers changed from: private */
    public zzkm zzj = zzkf.m60505n();
    private String zzk = "";
    private boolean zzl;
    private zzkm zzm = zzkf.m60505n();
    private zzkm zzn = zzkf.m60505n();
    private String zzo = "";

    static {
        zzff zzff = new zzff();
        zza = zzff;
        zzkf.m60509t(zzff.class, zzff);
    }

    private zzff() {
    }

    /* renamed from: G */
    public static zzfe m59782G() {
        return (zzfe) zza.mo51459x();
    }

    /* renamed from: I */
    public static zzff m59784I() {
        return zza;
    }

    /* renamed from: P */
    static /* synthetic */ void m59785P(zzff zzff, int i, zzfd zzfd) {
        zzfd.getClass();
        zzkm zzkm = zzff.zzi;
        if (!zzkm.mo51307a()) {
            zzff.zzi = zzkf.m60506o(zzkm);
        }
        zzff.zzi.set(i, zzfd);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzfj.class, "zzi", zzfd.class, "zzj", zzei.class, "zzk", "zzl", "zzm", zzgt.class, "zzn", zzfb.class, "zzo"});
        } else if (i2 == 3) {
            return new zzff();
        } else {
            if (i2 == 4) {
                return new zzfe((zzez) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo50970B() {
        return this.zzm.size();
    }

    /* renamed from: C */
    public final int mo50971C() {
        return this.zzi.size();
    }

    /* renamed from: D */
    public final long mo50972D() {
        return this.zze;
    }

    /* renamed from: E */
    public final zzfd mo50973E(int i) {
        return (zzfd) this.zzi.get(i);
    }

    /* renamed from: J */
    public final String mo50974J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final String mo50975K() {
        return this.zzo;
    }

    /* renamed from: L */
    public final List mo50976L() {
        return this.zzj;
    }

    /* renamed from: M */
    public final List mo50977M() {
        return this.zzn;
    }

    /* renamed from: N */
    public final List mo50978N() {
        return this.zzm;
    }

    /* renamed from: O */
    public final List mo50979O() {
        return this.zzh;
    }

    /* renamed from: R */
    public final boolean mo50980R() {
        return this.zzl;
    }

    /* renamed from: S */
    public final boolean mo50981S() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: T */
    public final boolean mo50982T() {
        return (this.zzd & 1) != 0;
    }
}
