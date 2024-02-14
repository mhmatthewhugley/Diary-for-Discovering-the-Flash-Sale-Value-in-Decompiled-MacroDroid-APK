package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzc {

    /* renamed from: h */
    public static final zzn f28030h = zzb.f26389a;

    /* renamed from: a */
    public final long f28031a;

    /* renamed from: b */
    public final int f28032b;

    /* renamed from: c */
    public final Uri[] f28033c;

    /* renamed from: d */
    public final int[] f28034d;

    /* renamed from: e */
    public final long[] f28035e;

    /* renamed from: f */
    public final long f28036f;

    /* renamed from: g */
    public final boolean f28037g;

    public zzc(long j) {
        this(0, -1, new int[0], new Uri[0], new long[0], 0, false);
    }

    /* renamed from: a */
    public final int mo43237a(@IntRange(from = -1) int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f28034d;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                return i3;
            }
            i3++;
        }
        return i3;
    }

    @CheckResult
    /* renamed from: b */
    public final zzc mo43238b(int i) {
        int[] iArr = this.f28034d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.f28035e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new zzc(0, 0, copyOf, (Uri[]) Arrays.copyOf(this.f28033c, 0), copyOf2, 0, false);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzc.class == obj.getClass()) {
            zzc zzc = (zzc) obj;
            return this.f28032b == zzc.f28032b && Arrays.equals(this.f28033c, zzc.f28033c) && Arrays.equals(this.f28034d, zzc.f28034d) && Arrays.equals(this.f28035e, zzc.f28035e);
        }
    }

    public final int hashCode() {
        return ((((((this.f28032b * 961) + Arrays.hashCode(this.f28033c)) * 31) + Arrays.hashCode(this.f28034d)) * 31) + Arrays.hashCode(this.f28035e)) * 961;
    }

    private zzc(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        zzdd.m47210d(iArr.length == uriArr.length);
        this.f28031a = 0;
        this.f28032b = i;
        this.f28034d = iArr;
        this.f28033c = uriArr;
        this.f28035e = jArr;
        this.f28036f = 0;
        this.f28037g = false;
    }
}
