package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.android.p023dx.p026io.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcm {

    /* renamed from: o */
    public static final Object f28931o = new Object();

    /* renamed from: p */
    private static final Object f28932p = new Object();

    /* renamed from: q */
    private static final zzbg f28933q;

    /* renamed from: r */
    public static final zzn f28934r = zzcl.f28824a;

    /* renamed from: a */
    public Object f28935a = f28931o;

    /* renamed from: b */
    public zzbg f28936b = f28933q;

    /* renamed from: c */
    public long f28937c;

    /* renamed from: d */
    public long f28938d;

    /* renamed from: e */
    public long f28939e;

    /* renamed from: f */
    public boolean f28940f;

    /* renamed from: g */
    public boolean f28941g;
    @Deprecated

    /* renamed from: h */
    public boolean f28942h;
    @Nullable

    /* renamed from: i */
    public zzaw f28943i;

    /* renamed from: j */
    public boolean f28944j;

    /* renamed from: k */
    public long f28945k;

    /* renamed from: l */
    public long f28946l;

    /* renamed from: m */
    public int f28947m;

    /* renamed from: n */
    public int f28948n;

    static {
        zzaj zzaj = new zzaj();
        zzaj.mo41523a("androidx.media3.common.Timeline");
        zzaj.mo41524b(Uri.EMPTY);
        f28933q = zzaj.mo41525c();
    }

    /* renamed from: a */
    public final zzcm mo43956a(Object obj, @Nullable zzbg zzbg, @Nullable Object obj2, long j, long j2, long j3, boolean z, boolean z2, @Nullable zzaw zzaw, long j4, long j5, int i, int i2, long j6) {
        zzaw zzaw2 = zzaw;
        this.f28935a = obj;
        this.f28936b = zzbg != null ? zzbg : f28933q;
        this.f28937c = -9223372036854775807L;
        this.f28938d = -9223372036854775807L;
        this.f28939e = -9223372036854775807L;
        this.f28940f = z;
        this.f28941g = z2;
        this.f28942h = zzaw2 != null;
        this.f28943i = zzaw2;
        this.f28945k = 0;
        this.f28946l = j5;
        this.f28947m = 0;
        this.f28948n = 0;
        this.f28944j = false;
        return this;
    }

    /* renamed from: b */
    public final boolean mo43957b() {
        zzdd.m47212f(this.f28942h == (this.f28943i != null));
        return this.f28943i != null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcm.class.equals(obj.getClass())) {
            zzcm zzcm = (zzcm) obj;
            return zzen.m49181t(this.f28935a, zzcm.f28935a) && zzen.m49181t(this.f28936b, zzcm.f28936b) && zzen.m49181t((Object) null, (Object) null) && zzen.m49181t(this.f28943i, zzcm.f28943i) && this.f28937c == zzcm.f28937c && this.f28938d == zzcm.f28938d && this.f28939e == zzcm.f28939e && this.f28940f == zzcm.f28940f && this.f28941g == zzcm.f28941g && this.f28944j == zzcm.f28944j && this.f28946l == zzcm.f28946l && this.f28947m == zzcm.f28947m && this.f28948n == zzcm.f28948n;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f28935a.hashCode() + Opcodes.RSUB_INT_LIT8) * 31) + this.f28936b.hashCode()) * 961;
        zzaw zzaw = this.f28943i;
        if (zzaw == null) {
            i = 0;
        } else {
            i = zzaw.hashCode();
        }
        long j = this.f28937c;
        long j2 = this.f28938d;
        long j3 = this.f28939e;
        boolean z = this.f28940f;
        boolean z2 = this.f28941g;
        boolean z3 = this.f28944j;
        long j4 = this.f28946l;
        return (((((((((((((((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 961) + ((int) ((j4 >>> 32) ^ j4))) * 31) + this.f28947m) * 31) + this.f28948n) * 31;
    }
}
