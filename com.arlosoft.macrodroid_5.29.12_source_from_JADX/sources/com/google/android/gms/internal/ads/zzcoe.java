package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcoe {

    /* renamed from: a */
    private final int f29153a;

    /* renamed from: b */
    public final int f29154b;

    /* renamed from: c */
    public final int f29155c;

    private zzcoe(int i, int i2, int i3) {
        this.f29153a = i;
        this.f29155c = i2;
        this.f29154b = i3;
    }

    /* renamed from: a */
    public static zzcoe m46199a() {
        return new zzcoe(0, 0, 0);
    }

    /* renamed from: b */
    public static zzcoe m46200b(int i, int i2) {
        return new zzcoe(1, i, i2);
    }

    /* renamed from: c */
    public static zzcoe m46201c(zzq zzq) {
        if (zzq.f2028f) {
            return new zzcoe(3, 0, 0);
        }
        if (zzq.f2033z) {
            return new zzcoe(2, 0, 0);
        }
        if (zzq.f2032s) {
            return m46199a();
        }
        return m46200b(zzq.f2030o, zzq.f2027d);
    }

    /* renamed from: d */
    public static zzcoe m46202d() {
        return new zzcoe(5, 0, 0);
    }

    /* renamed from: e */
    public static zzcoe m46203e() {
        return new zzcoe(4, 0, 0);
    }

    /* renamed from: f */
    public final boolean mo44183f() {
        return this.f29153a == 0;
    }

    /* renamed from: g */
    public final boolean mo44184g() {
        return this.f29153a == 2;
    }

    /* renamed from: h */
    public final boolean mo44185h() {
        return this.f29153a == 5;
    }

    /* renamed from: i */
    public final boolean mo44186i() {
        return this.f29153a == 3;
    }

    /* renamed from: j */
    public final boolean mo44187j() {
        return this.f29153a == 4;
    }
}
