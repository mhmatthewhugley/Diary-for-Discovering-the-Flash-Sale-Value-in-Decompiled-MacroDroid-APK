package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzfx extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzfx zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;
    /* access modifiers changed from: private */
    public zzkm zzj = zzkf.m60505n();

    static {
        zzfx zzfx = new zzfx();
        zza = zzfx;
        zzkf.m60509t(zzfx.class, zzfx);
    }

    private zzfx() {
    }

    /* renamed from: G */
    public static zzfw m59896G() {
        return (zzfw) zza.mo51459x();
    }

    /* renamed from: L */
    static /* synthetic */ void m59898L(zzfx zzfx, String str) {
        str.getClass();
        zzfx.zzd |= 1;
        zzfx.zze = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m59899M(zzfx zzfx, String str) {
        str.getClass();
        zzfx.zzd |= 2;
        zzfx.zzf = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m59900N(zzfx zzfx) {
        zzfx.zzd &= -3;
        zzfx.zzf = zza.zzf;
    }

    /* renamed from: O */
    static /* synthetic */ void m59901O(zzfx zzfx, long j) {
        zzfx.zzd |= 4;
        zzfx.zzg = j;
    }

    /* renamed from: P */
    static /* synthetic */ void m59902P(zzfx zzfx) {
        zzfx.zzd &= -5;
        zzfx.zzg = 0;
    }

    /* renamed from: Q */
    static /* synthetic */ void m59903Q(zzfx zzfx, double d) {
        zzfx.zzd |= 16;
        zzfx.zzi = d;
    }

    /* renamed from: R */
    static /* synthetic */ void m59904R(zzfx zzfx) {
        zzfx.zzd &= -17;
        zzfx.zzi = 0.0d;
    }

    /* renamed from: S */
    static /* synthetic */ void m59905S(zzfx zzfx, zzfx zzfx2) {
        zzfx2.getClass();
        zzfx.m59908a0();
        zzfx.zzj.add(zzfx2);
    }

    /* renamed from: T */
    static /* synthetic */ void m59906T(zzfx zzfx, Iterable iterable) {
        zzfx.m59908a0();
        zzio.m60316g(iterable, zzfx.zzj);
    }

    /* renamed from: a0 */
    private final void m59908a0() {
        zzkm zzkm = this.zzj;
        if (!zzkm.mo51307a()) {
            this.zzj = zzkf.m60506o(zzkm);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzfx.class});
        } else if (i2 == 3) {
            return new zzfx();
        } else {
            if (i2 == 4) {
                return new zzfw((zzfk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final double mo51042B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final float mo51043C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final int mo51044D() {
        return this.zzj.size();
    }

    /* renamed from: E */
    public final long mo51045E() {
        return this.zzg;
    }

    /* renamed from: I */
    public final String mo51046I() {
        return this.zze;
    }

    /* renamed from: J */
    public final String mo51047J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final List mo51048K() {
        return this.zzj;
    }

    /* renamed from: V */
    public final boolean mo51049V() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: W */
    public final boolean mo51050W() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: X */
    public final boolean mo51051X() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: Y */
    public final boolean mo51052Y() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: Z */
    public final boolean mo51053Z() {
        return (this.zzd & 2) != 0;
    }
}
