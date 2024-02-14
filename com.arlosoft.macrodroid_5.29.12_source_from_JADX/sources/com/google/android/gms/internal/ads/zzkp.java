package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzkp {

    /* renamed from: a */
    public final long f37760a;

    /* renamed from: b */
    public final zzcn f37761b;

    /* renamed from: c */
    public final int f37762c;
    @Nullable

    /* renamed from: d */
    public final zzsi f37763d;

    /* renamed from: e */
    public final long f37764e;

    /* renamed from: f */
    public final zzcn f37765f;

    /* renamed from: g */
    public final int f37766g;
    @Nullable

    /* renamed from: h */
    public final zzsi f37767h;

    /* renamed from: i */
    public final long f37768i;

    /* renamed from: j */
    public final long f37769j;

    public zzkp(long j, zzcn zzcn, int i, @Nullable zzsi zzsi, long j2, zzcn zzcn2, int i2, @Nullable zzsi zzsi2, long j3, long j4) {
        this.f37760a = j;
        this.f37761b = zzcn;
        this.f37762c = i;
        this.f37763d = zzsi;
        this.f37764e = j2;
        this.f37765f = zzcn2;
        this.f37766g = i2;
        this.f37767h = zzsi2;
        this.f37768i = j3;
        this.f37769j = j4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkp.class == obj.getClass()) {
            zzkp zzkp = (zzkp) obj;
            return this.f37760a == zzkp.f37760a && this.f37762c == zzkp.f37762c && this.f37764e == zzkp.f37764e && this.f37766g == zzkp.f37766g && this.f37768i == zzkp.f37768i && this.f37769j == zzkp.f37769j && zzfss.m50929a(this.f37761b, zzkp.f37761b) && zzfss.m50929a(this.f37763d, zzkp.f37763d) && zzfss.m50929a(this.f37765f, zzkp.f37765f) && zzfss.m50929a(this.f37767h, zzkp.f37767h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f37760a), this.f37761b, Integer.valueOf(this.f37762c), this.f37763d, Long.valueOf(this.f37764e), this.f37765f, Integer.valueOf(this.f37766g), this.f37767h, Long.valueOf(this.f37768i), Long.valueOf(this.f37769j)});
    }
}
