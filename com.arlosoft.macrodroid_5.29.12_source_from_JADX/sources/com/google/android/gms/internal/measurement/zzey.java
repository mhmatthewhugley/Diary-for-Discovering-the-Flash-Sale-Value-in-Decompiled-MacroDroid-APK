package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzey extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzey zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private zzkm zzh = zzkf.m60505n();

    static {
        zzey zzey = new zzey();
        zza = zzey;
        zzkf.m60509t(zzey.class, zzey);
    }

    private zzey() {
    }

    /* renamed from: D */
    public static zzey m59743D() {
        return zza;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo50883A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzkf.m60508q(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", zzew.f41439a, "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzey();
        } else {
            if (i2 == 4) {
                return new zzeu((zzeg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo50938B() {
        return this.zzh.size();
    }

    /* renamed from: E */
    public final String mo50939E() {
        return this.zzf;
    }

    /* renamed from: G */
    public final List mo50940G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean mo50941H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final boolean mo50942I() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: J */
    public final boolean mo50943J() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: K */
    public final boolean mo50944K() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: L */
    public final int mo50945L() {
        int a = zzex.m59741a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
