package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzcu {

    /* renamed from: A */
    public static final zzcu f31548A;
    @Deprecated

    /* renamed from: B */
    public static final zzcu f31549B;
    @Deprecated

    /* renamed from: C */
    public static final zzn f31550C = zzcs.f30969a;

    /* renamed from: a */
    public final int f31551a = Integer.MAX_VALUE;

    /* renamed from: b */
    public final int f31552b = Integer.MAX_VALUE;

    /* renamed from: c */
    public final int f31553c = Integer.MAX_VALUE;

    /* renamed from: d */
    public final int f31554d = Integer.MAX_VALUE;

    /* renamed from: e */
    public final int f31555e = 0;

    /* renamed from: f */
    public final int f31556f = 0;

    /* renamed from: g */
    public final int f31557g = 0;

    /* renamed from: h */
    public final int f31558h = 0;

    /* renamed from: i */
    public final int f31559i;

    /* renamed from: j */
    public final int f31560j;

    /* renamed from: k */
    public final boolean f31561k;

    /* renamed from: l */
    public final zzfvn f31562l;

    /* renamed from: m */
    public final int f31563m;

    /* renamed from: n */
    public final zzfvn f31564n;

    /* renamed from: o */
    public final int f31565o;

    /* renamed from: p */
    public final int f31566p;

    /* renamed from: q */
    public final int f31567q;

    /* renamed from: r */
    public final zzfvn f31568r;

    /* renamed from: s */
    public final zzfvn f31569s;

    /* renamed from: t */
    public final int f31570t;

    /* renamed from: u */
    public final int f31571u;

    /* renamed from: v */
    public final boolean f31572v;

    /* renamed from: w */
    public final boolean f31573w;

    /* renamed from: x */
    public final boolean f31574x;

    /* renamed from: y */
    public final zzfvq f31575y;

    /* renamed from: z */
    public final zzfvs f31576z;

    static {
        zzcu zzcu = new zzcu(new zzct());
        f31548A = zzcu;
        f31549B = zzcu;
    }

    protected zzcu(zzct zzct) {
        this.f31559i = zzct.f31516e;
        this.f31560j = zzct.f31517f;
        this.f31561k = zzct.f31518g;
        this.f31562l = zzct.f31519h;
        this.f31563m = 0;
        this.f31564n = zzct.f31520i;
        this.f31565o = 0;
        this.f31566p = Integer.MAX_VALUE;
        this.f31567q = Integer.MAX_VALUE;
        this.f31568r = zzct.f31523l;
        this.f31569s = zzct.f31524m;
        this.f31570t = zzct.f31525n;
        this.f31571u = 0;
        this.f31572v = false;
        this.f31573w = false;
        this.f31574x = false;
        this.f31575y = zzfvq.m51147c(zzct.f31526o);
        this.f31576z = zzfvs.m51163q(zzct.f31527p);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcu zzcu = (zzcu) obj;
            return this.f31561k == zzcu.f31561k && this.f31559i == zzcu.f31559i && this.f31560j == zzcu.f31560j && this.f31562l.equals(zzcu.f31562l) && this.f31564n.equals(zzcu.f31564n) && this.f31568r.equals(zzcu.f31568r) && this.f31569s.equals(zzcu.f31569s) && this.f31570t == zzcu.f31570t && this.f31575y.equals(zzcu.f31575y) && this.f31576z.equals(zzcu.f31576z);
        }
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f31561k ? 1 : 0) - true) * 31) + this.f31559i) * 31) + this.f31560j) * 31) + this.f31562l.hashCode()) * 961) + this.f31564n.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.f31568r.hashCode()) * 31) + this.f31569s.hashCode()) * 31) + this.f31570t) * 28629151) + this.f31575y.hashCode()) * 31) + this.f31576z.hashCode();
    }
}
