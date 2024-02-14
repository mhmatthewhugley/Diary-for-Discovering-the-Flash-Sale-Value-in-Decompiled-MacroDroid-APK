package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgbd {

    /* renamed from: a */
    private final zzgmc f36644a;

    private zzgbd(zzgmc zzgmc) {
        this.f36644a = zzgmc;
    }

    /* renamed from: e */
    public static zzgbd m51520e(String str, byte[] bArr, int i) {
        zzgmb F = zzgmc.m52299F();
        F.mo46974n(str);
        F.mo46975o(zzgpw.m52564R(bArr));
        int i2 = i - 1;
        F.mo46976u(i2 != 0 ? i2 != 1 ? 5 : 4 : 3);
        return new zzgbd((zzgmc) F.mo47341h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzgmc mo46681a() {
        return this.f36644a;
    }

    /* renamed from: b */
    public final String mo46682b() {
        return this.f36644a.mo46978J();
    }

    /* renamed from: c */
    public final byte[] mo46683c() {
        return this.f36644a.mo46977I().mo47109i();
    }

    /* renamed from: d */
    public final int mo46684d() {
        int M = this.f36644a.mo46979M() - 2;
        int i = 1;
        if (M != 1) {
            i = 2;
            if (M != 2) {
                i = 3;
                if (M != 3) {
                    if (M == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
