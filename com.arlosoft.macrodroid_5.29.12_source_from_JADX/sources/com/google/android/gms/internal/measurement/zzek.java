package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzek extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzek zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzkm zzg = zzkf.m60505n();
    private boolean zzh;
    private zzer zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        zzek zzek = new zzek();
        zza = zzek;
        zzkf.m60509t(zzek.class, zzek);
    }

    private zzek() {
    }

    /* renamed from: D */
    public static zzej m59682D() {
        return (zzej) zza.mo51459x();
    }

    /* renamed from: K */
    static /* synthetic */ void m59684K(zzek zzek, String str) {
        zzek.zzd |= 2;
        zzek.zzf = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m59685L(zzek zzek, int i, zzem zzem) {
        zzem.getClass();
        zzkm zzkm = zzek.zzg;
        if (!zzkm.mo51307a()) {
            zzek.zzg = zzkf.m60506o(zzkm);
        }
        zzek.zzg.set(i, zzem);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", zzem.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new zzek();
        } else {
            if (i2 == 4) {
                return new zzej((zzeg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo50897B() {
        return this.zzg.size();
    }

    /* renamed from: C */
    public final int mo50898C() {
        return this.zze;
    }

    /* renamed from: G */
    public final zzem mo50899G(int i) {
        return (zzem) this.zzg.get(i);
    }

    /* renamed from: H */
    public final zzer mo50900H() {
        zzer zzer = this.zzi;
        return zzer == null ? zzer.m59715C() : zzer;
    }

    /* renamed from: I */
    public final String mo50901I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final List mo50902J() {
        return this.zzg;
    }

    /* renamed from: M */
    public final boolean mo50903M() {
        return this.zzj;
    }

    /* renamed from: N */
    public final boolean mo50904N() {
        return this.zzk;
    }

    /* renamed from: O */
    public final boolean mo50905O() {
        return this.zzl;
    }

    /* renamed from: P */
    public final boolean mo50906P() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: Q */
    public final boolean mo50907Q() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: R */
    public final boolean mo50908R() {
        return (this.zzd & 64) != 0;
    }
}
