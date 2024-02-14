package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzd {

    /* renamed from: d */
    public static final zzd f31933d = new zzd((Object) null, new zzc[0], 0, -9223372036854775807L, 0);

    /* renamed from: e */
    private static final zzc f31934e = new zzc(0).mo43238b(0);

    /* renamed from: f */
    public static final zzn f31935f = zza.f23697a;

    /* renamed from: a */
    public final int f31936a = 0;

    /* renamed from: b */
    public final long f31937b = 0;

    /* renamed from: c */
    private final zzc[] f31938c;

    private zzd(@Nullable Object obj, zzc[] zzcArr, long j, long j2, int i) {
        this.f31938c = zzcArr;
    }

    /* renamed from: a */
    public final zzc mo44517a(@IntRange(from = 0) int i) {
        return i < 0 ? f31934e : this.f31938c[i];
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzd.class == obj.getClass()) {
            return zzen.m49181t((Object) null, (Object) null) && Arrays.equals(this.f31938c, ((zzd) obj).f31938c);
        }
    }

    public final int hashCode() {
        return (((int) -9223372036854775807L) * 961) + Arrays.hashCode(this.f31938c);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + null + ", adResumePositionUs=0, adGroups=[" + "])";
    }
}
