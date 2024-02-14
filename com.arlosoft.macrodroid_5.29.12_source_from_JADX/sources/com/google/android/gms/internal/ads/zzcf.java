package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcf {

    /* renamed from: j */
    public static final zzn f28335j = zzce.f28280a;
    @Nullable

    /* renamed from: a */
    public final Object f28336a;

    /* renamed from: b */
    public final int f28337b;
    @Nullable

    /* renamed from: c */
    public final zzbg f28338c;
    @Nullable

    /* renamed from: d */
    public final Object f28339d;

    /* renamed from: e */
    public final int f28340e;

    /* renamed from: f */
    public final long f28341f;

    /* renamed from: g */
    public final long f28342g;

    /* renamed from: h */
    public final int f28343h;

    /* renamed from: i */
    public final int f28344i;

    public zzcf(@Nullable Object obj, int i, @Nullable zzbg zzbg, @Nullable Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f28336a = obj;
        this.f28337b = i;
        this.f28338c = zzbg;
        this.f28339d = obj2;
        this.f28340e = i2;
        this.f28341f = j;
        this.f28342g = j2;
        this.f28343h = i3;
        this.f28344i = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcf.class == obj.getClass()) {
            zzcf zzcf = (zzcf) obj;
            return this.f28337b == zzcf.f28337b && this.f28340e == zzcf.f28340e && this.f28341f == zzcf.f28341f && this.f28342g == zzcf.f28342g && this.f28343h == zzcf.f28343h && this.f28344i == zzcf.f28344i && zzfss.m50929a(this.f28336a, zzcf.f28336a) && zzfss.m50929a(this.f28339d, zzcf.f28339d) && zzfss.m50929a(this.f28338c, zzcf.f28338c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28336a, Integer.valueOf(this.f28337b), this.f28338c, this.f28339d, Integer.valueOf(this.f28340e), Long.valueOf(this.f28341f), Long.valueOf(this.f28342g), Integer.valueOf(this.f28343h), Integer.valueOf(this.f28344i)});
    }
}
