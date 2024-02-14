package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzft extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzft zza;
    private int zzd;
    /* access modifiers changed from: private */
    public zzkm zze = zzkf.m60505n();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        zzft zzft = new zzft();
        zza = zzft;
        zzkf.m60509t(zzft.class, zzft);
    }

    private zzft() {
    }

    /* renamed from: G */
    public static zzfs m59856G() {
        return (zzfs) zza.mo51459x();
    }

    /* renamed from: L */
    static /* synthetic */ void m59858L(zzft zzft, int i, zzfx zzfx) {
        zzfx.getClass();
        zzft.m59866W();
        zzft.zze.set(i, zzfx);
    }

    /* renamed from: M */
    static /* synthetic */ void m59859M(zzft zzft, zzfx zzfx) {
        zzfx.getClass();
        zzft.m59866W();
        zzft.zze.add(zzfx);
    }

    /* renamed from: N */
    static /* synthetic */ void m59860N(zzft zzft, Iterable iterable) {
        zzft.m59866W();
        zzio.m60316g(iterable, zzft.zze);
    }

    /* renamed from: P */
    static /* synthetic */ void m59862P(zzft zzft, int i) {
        zzft.m59866W();
        zzft.zze.remove(i);
    }

    /* renamed from: Q */
    static /* synthetic */ void m59863Q(zzft zzft, String str) {
        str.getClass();
        zzft.zzd |= 1;
        zzft.zzf = str;
    }

    /* renamed from: R */
    static /* synthetic */ void m59864R(zzft zzft, long j) {
        zzft.zzd |= 2;
        zzft.zzg = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m59865S(zzft zzft, long j) {
        zzft.zzd |= 4;
        zzft.zzh = j;
    }

    /* renamed from: W */
    private final void m59866W() {
        zzkm zzkm = this.zze;
        if (!zzkm.mo51307a()) {
            this.zze = zzkf.m60506o(zzkm);
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
            return zzkf.m60508q(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", zzfx.class, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzft();
        } else {
            if (i2 == 4) {
                return new zzfs((zzfk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo51019B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final int mo51020C() {
        return this.zze.size();
    }

    /* renamed from: D */
    public final long mo51021D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final long mo51022E() {
        return this.zzg;
    }

    /* renamed from: I */
    public final zzfx mo51023I(int i) {
        return (zzfx) this.zze.get(i);
    }

    /* renamed from: J */
    public final String mo51024J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final List mo51025K() {
        return this.zze;
    }

    /* renamed from: T */
    public final boolean mo51026T() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: U */
    public final boolean mo51027U() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: V */
    public final boolean mo51028V() {
        return (this.zzd & 2) != 0;
    }
}
