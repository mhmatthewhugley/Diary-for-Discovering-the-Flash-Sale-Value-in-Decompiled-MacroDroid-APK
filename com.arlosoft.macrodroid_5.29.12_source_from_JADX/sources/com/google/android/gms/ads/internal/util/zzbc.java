package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbc {

    /* renamed from: a */
    public final String f2202a;

    /* renamed from: b */
    public final double f2203b;

    /* renamed from: c */
    public final double f2204c;

    /* renamed from: d */
    public final double f2205d;

    /* renamed from: e */
    public final int f2206e;

    public zzbc(String str, double d, double d2, double d3, int i) {
        this.f2202a = str;
        this.f2204c = d;
        this.f2203b = d2;
        this.f2205d = d3;
        this.f2206e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbc)) {
            return false;
        }
        zzbc zzbc = (zzbc) obj;
        if (Objects.m4470a(this.f2202a, zzbc.f2202a) && this.f2203b == zzbc.f2203b && this.f2204c == zzbc.f2204c && this.f2206e == zzbc.f2206e && Double.compare(this.f2205d, zzbc.f2205d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f2202a, Double.valueOf(this.f2203b), Double.valueOf(this.f2204c), Double.valueOf(this.f2205d), Integer.valueOf(this.f2206e));
    }

    public final String toString() {
        return Objects.m4472c(this).mo21720a("name", this.f2202a).mo21720a("minBound", Double.valueOf(this.f2204c)).mo21720a("maxBound", Double.valueOf(this.f2203b)).mo21720a("percent", Double.valueOf(this.f2205d)).mo21720a("count", Integer.valueOf(this.f2206e)).toString();
    }
}
