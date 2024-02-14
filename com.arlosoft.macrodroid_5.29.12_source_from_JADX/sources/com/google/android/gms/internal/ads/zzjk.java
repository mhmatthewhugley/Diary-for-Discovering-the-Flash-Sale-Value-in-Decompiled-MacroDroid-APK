package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzjk {

    /* renamed from: a */
    public final zzsi f37641a;

    /* renamed from: b */
    public final long f37642b;

    /* renamed from: c */
    public final long f37643c;

    /* renamed from: d */
    public final long f37644d;

    /* renamed from: e */
    public final long f37645e;

    /* renamed from: f */
    public final boolean f37646f;

    /* renamed from: g */
    public final boolean f37647g;

    /* renamed from: h */
    public final boolean f37648h;

    /* renamed from: i */
    public final boolean f37649i;

    zzjk(zzsi zzsi, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        zzdd.m47210d(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        zzdd.m47210d(z5);
        this.f37641a = zzsi;
        this.f37642b = j;
        this.f37643c = j2;
        this.f37644d = j3;
        this.f37645e = j4;
        this.f37646f = false;
        this.f37647g = z2;
        this.f37648h = z3;
        this.f37649i = z4;
    }

    /* renamed from: a */
    public final zzjk mo47707a(long j) {
        if (j == this.f37643c) {
            return this;
        }
        return new zzjk(this.f37641a, this.f37642b, j, this.f37644d, this.f37645e, false, this.f37647g, this.f37648h, this.f37649i);
    }

    /* renamed from: b */
    public final zzjk mo47708b(long j) {
        if (j == this.f37642b) {
            return this;
        }
        return new zzjk(this.f37641a, j, this.f37643c, this.f37644d, this.f37645e, false, this.f37647g, this.f37648h, this.f37649i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzjk.class == obj.getClass()) {
            zzjk zzjk = (zzjk) obj;
            return this.f37642b == zzjk.f37642b && this.f37643c == zzjk.f37643c && this.f37644d == zzjk.f37644d && this.f37645e == zzjk.f37645e && this.f37647g == zzjk.f37647g && this.f37648h == zzjk.f37648h && this.f37649i == zzjk.f37649i && zzen.m49181t(this.f37641a, zzjk.f37641a);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.f37641a.hashCode() + 527) * 31) + ((int) this.f37642b)) * 31) + ((int) this.f37643c)) * 31) + ((int) this.f37644d)) * 31) + ((int) this.f37645e)) * 961) + (this.f37647g ? 1 : 0)) * 31) + (this.f37648h ? 1 : 0)) * 31) + (this.f37649i ? 1 : 0);
    }
}
