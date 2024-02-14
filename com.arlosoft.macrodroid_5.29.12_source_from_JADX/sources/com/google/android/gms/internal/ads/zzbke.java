package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class zzbke {

    /* renamed from: a */
    private final String f27385a;

    /* renamed from: b */
    private final Object f27386b;

    /* renamed from: c */
    private final int f27387c;

    protected zzbke(String str, Object obj, int i) {
        this.f27385a = str;
        this.f27386b = obj;
        this.f27387c = i;
    }

    /* renamed from: a */
    public static zzbke m43644a(String str, double d) {
        return new zzbke(str, Double.valueOf(d), 3);
    }

    /* renamed from: b */
    public static zzbke m43645b(String str, long j) {
        return new zzbke(str, Long.valueOf(j), 2);
    }

    /* renamed from: c */
    public static zzbke m43646c(String str, String str2) {
        return new zzbke(str, str2, 4);
    }

    /* renamed from: d */
    public static zzbke m43647d(String str, boolean z) {
        return new zzbke(str, Boolean.valueOf(z), 1);
    }

    /* renamed from: e */
    public final Object mo42728e() {
        zzblh a = zzblj.m43654a();
        if (a == null) {
            if (zzblj.m43655b() != null) {
                zzblj.m43655b().zza();
            }
            return this.f27386b;
        }
        int i = this.f27387c - 1;
        if (i == 0) {
            return a.mo42662d(this.f27385a, ((Boolean) this.f27386b).booleanValue());
        }
        if (i == 1) {
            return a.mo42661c(this.f27385a, ((Long) this.f27386b).longValue());
        }
        if (i != 2) {
            return a.mo42659a(this.f27385a, (String) this.f27386b);
        }
        return a.mo42660b(this.f27385a, ((Double) this.f27386b).doubleValue());
    }
}
