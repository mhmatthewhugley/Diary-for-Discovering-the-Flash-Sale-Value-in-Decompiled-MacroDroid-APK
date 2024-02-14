package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzgi extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzgi zza;
    /* access modifiers changed from: private */
    public zzkl zzd = zzkf.m60503l();
    /* access modifiers changed from: private */
    public zzkl zze = zzkf.m60503l();
    /* access modifiers changed from: private */
    public zzkm zzf = zzkf.m60505n();
    /* access modifiers changed from: private */
    public zzkm zzg = zzkf.m60505n();

    static {
        zzgi zzgi = new zzgi();
        zza = zzgi;
        zzkf.m60509t(zzgi.class, zzgi);
    }

    private zzgi() {
    }

    /* renamed from: H */
    public static zzgh m60151H() {
        return (zzgh) zza.mo51459x();
    }

    /* renamed from: J */
    public static zzgi m60153J() {
        return zza;
    }

    /* renamed from: P */
    static /* synthetic */ void m60154P(zzgi zzgi, Iterable iterable) {
        zzkl zzkl = zzgi.zzd;
        if (!zzkl.mo51307a()) {
            zzgi.zzd = zzkf.m60504m(zzkl);
        }
        zzio.m60316g(iterable, zzgi.zzd);
    }

    /* renamed from: R */
    static /* synthetic */ void m60156R(zzgi zzgi, Iterable iterable) {
        zzkl zzkl = zzgi.zze;
        if (!zzkl.mo51307a()) {
            zzgi.zze = zzkf.m60504m(zzkl);
        }
        zzio.m60316g(iterable, zzgi.zze);
    }

    /* renamed from: T */
    static /* synthetic */ void m60158T(zzgi zzgi, Iterable iterable) {
        zzgi.m60164Z();
        zzio.m60316g(iterable, zzgi.zzf);
    }

    /* renamed from: V */
    static /* synthetic */ void m60160V(zzgi zzgi, int i) {
        zzgi.m60164Z();
        zzgi.zzf.remove(i);
    }

    /* renamed from: W */
    static /* synthetic */ void m60161W(zzgi zzgi, Iterable iterable) {
        zzgi.m60165a0();
        zzio.m60316g(iterable, zzgi.zzg);
    }

    /* renamed from: Y */
    static /* synthetic */ void m60163Y(zzgi zzgi, int i) {
        zzgi.m60165a0();
        zzgi.zzg.remove(i);
    }

    /* renamed from: Z */
    private final void m60164Z() {
        zzkm zzkm = this.zzf;
        if (!zzkm.mo51307a()) {
            this.zzf = zzkf.m60506o(zzkm);
        }
    }

    /* renamed from: a0 */
    private final void m60165a0() {
        zzkm zzkm = this.zzg;
        if (!zzkm.mo51307a()) {
            this.zzg = zzkf.m60506o(zzkm);
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
            return zzkf.m60508q(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", zzfr.class, "zzg", zzgk.class});
        } else if (i2 == 3) {
            return new zzgi();
        } else {
            if (i2 == 4) {
                return new zzgh((zzfk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo51208B() {
        return this.zzf.size();
    }

    /* renamed from: C */
    public final int mo51209C() {
        return this.zze.size();
    }

    /* renamed from: D */
    public final int mo51210D() {
        return this.zzg.size();
    }

    /* renamed from: E */
    public final int mo51211E() {
        return this.zzd.size();
    }

    /* renamed from: G */
    public final zzfr mo51212G(int i) {
        return (zzfr) this.zzf.get(i);
    }

    /* renamed from: K */
    public final zzgk mo51213K(int i) {
        return (zzgk) this.zzg.get(i);
    }

    /* renamed from: L */
    public final List mo51214L() {
        return this.zzf;
    }

    /* renamed from: M */
    public final List mo51215M() {
        return this.zze;
    }

    /* renamed from: N */
    public final List mo51216N() {
        return this.zzg;
    }

    /* renamed from: O */
    public final List mo51217O() {
        return this.zzd;
    }
}
