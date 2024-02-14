package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzud extends zzcn {

    /* renamed from: h */
    private static final Object f38610h = new Object();

    /* renamed from: i */
    private static final zzbg f38611i;

    /* renamed from: c */
    private final long f38612c;

    /* renamed from: d */
    private final long f38613d;

    /* renamed from: e */
    private final boolean f38614e;
    @Nullable

    /* renamed from: f */
    private final zzbg f38615f;
    @Nullable

    /* renamed from: g */
    private final zzaw f38616g;

    static {
        zzaj zzaj = new zzaj();
        zzaj.mo41523a("SinglePeriodTimeline");
        zzaj.mo41524b(Uri.EMPTY);
        f38611i = zzaj.mo41525c();
    }

    public zzud(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @Nullable Object obj, zzbg zzbg, @Nullable zzaw zzaw) {
        this.f38612c = j4;
        this.f38613d = j5;
        this.f38614e = z;
        this.f38615f = zzbg;
        this.f38616g = zzaw;
    }

    /* renamed from: a */
    public final int mo43599a(Object obj) {
        return f38610h.equals(obj) ? 0 : -1;
    }

    /* renamed from: b */
    public final int mo43600b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo43601c() {
        return 1;
    }

    /* renamed from: d */
    public final zzck mo43602d(int i, zzck zzck, boolean z) {
        zzdd.m47207a(i, 0, 1);
        zzck.mo43859k((Object) null, z ? f38610h : null, 0, this.f38612c, 0, zzd.f31933d, false);
        return zzck;
    }

    /* renamed from: e */
    public final zzcm mo43603e(int i, zzcm zzcm, long j) {
        zzdd.m47207a(i, 0, 1);
        zzcm.mo43956a(zzcm.f28931o, this.f38615f, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f38614e, false, this.f38616g, 0, this.f38613d, 0, 0, 0);
        return zzcm;
    }

    /* renamed from: f */
    public final Object mo43604f(int i) {
        zzdd.m47207a(i, 0, 1);
        return f38610h;
    }
}
