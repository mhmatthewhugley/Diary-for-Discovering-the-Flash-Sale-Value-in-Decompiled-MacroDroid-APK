package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzsv implements zzvt {

    /* renamed from: a */
    private final zzvt f38447a;

    /* renamed from: b */
    private final zzcp f38448b;

    public zzsv(zzvt zzvt, zzcp zzcp) {
        this.f38447a = zzvt;
        this.f38448b = zzcp;
    }

    /* renamed from: B */
    public final int mo48180B(int i) {
        return this.f38447a.mo48180B(i);
    }

    /* renamed from: G */
    public final zzaf mo48181G(int i) {
        return this.f38447a.mo48181G(i);
    }

    /* renamed from: a */
    public final int mo48182a() {
        return this.f38447a.mo48182a();
    }

    /* renamed from: b */
    public final zzcp mo48183b() {
        return this.f38448b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzsv)) {
            return false;
        }
        zzsv zzsv = (zzsv) obj;
        return this.f38447a.equals(zzsv.f38447a) && this.f38448b.equals(zzsv.f38448b);
    }

    public final int hashCode() {
        return ((this.f38448b.hashCode() + 527) * 31) + this.f38447a.hashCode();
    }

    /* renamed from: v */
    public final int mo48186v(int i) {
        return this.f38447a.mo48186v(0);
    }
}
