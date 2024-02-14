package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.android.p023dx.p026io.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzck {

    /* renamed from: h */
    public static final zzn f28718h = zzcj.f28616a;
    @Nullable

    /* renamed from: a */
    public Object f28719a;
    @Nullable

    /* renamed from: b */
    public Object f28720b;

    /* renamed from: c */
    public int f28721c;

    /* renamed from: d */
    public long f28722d;

    /* renamed from: e */
    public long f28723e;

    /* renamed from: f */
    public boolean f28724f;

    /* renamed from: g */
    private zzd f28725g = zzd.f31933d;

    /* renamed from: a */
    public final int mo43847a(int i) {
        return this.f28725g.mo44517a(i).f28032b;
    }

    /* renamed from: b */
    public final int mo43848b() {
        int i = this.f28725g.f31936a;
        return 0;
    }

    /* renamed from: c */
    public final int mo43849c(long j) {
        return -1;
    }

    /* renamed from: d */
    public final int mo43850d(long j) {
        return -1;
    }

    /* renamed from: e */
    public final int mo43851e(int i) {
        return this.f28725g.mo44517a(i).mo43237a(-1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzck.class.equals(obj.getClass())) {
            zzck zzck = (zzck) obj;
            return zzen.m49181t(this.f28719a, zzck.f28719a) && zzen.m49181t(this.f28720b, zzck.f28720b) && this.f28721c == zzck.f28721c && this.f28722d == zzck.f28722d && this.f28724f == zzck.f28724f && zzen.m49181t(this.f28725g, zzck.f28725g);
        }
    }

    /* renamed from: f */
    public final int mo43853f(int i, int i2) {
        return this.f28725g.mo44517a(i).mo43237a(i2);
    }

    /* renamed from: g */
    public final long mo43854g(int i, int i2) {
        zzc a = this.f28725g.mo44517a(i);
        if (a.f28032b != -1) {
            return a.f28035e[i2];
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    public final long mo43855h(int i) {
        long j = this.f28725g.mo44517a(i).f28031a;
        return 0;
    }

    public final int hashCode() {
        int i;
        Object obj = this.f28719a;
        int i2 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i3 = (i + Opcodes.RSUB_INT_LIT8) * 31;
        Object obj2 = this.f28720b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        int i4 = this.f28721c;
        long j = this.f28722d;
        return ((((((((i3 + i2) * 31) + i4) * 31) + ((int) ((j >>> 32) ^ j))) * 961) + (this.f28724f ? 1 : 0)) * 31) + this.f28725g.hashCode();
    }

    /* renamed from: i */
    public final long mo43857i() {
        long j = this.f28725g.f31937b;
        return 0;
    }

    /* renamed from: j */
    public final long mo43858j(int i) {
        long j = this.f28725g.mo44517a(i).f28036f;
        return 0;
    }

    /* renamed from: k */
    public final zzck mo43859k(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, zzd zzd, boolean z) {
        this.f28719a = obj;
        this.f28720b = obj2;
        this.f28721c = 0;
        this.f28722d = j;
        this.f28723e = 0;
        this.f28725g = zzd;
        this.f28724f = z;
        return this;
    }

    /* renamed from: l */
    public final boolean mo43860l(int i) {
        boolean z = this.f28725g.mo44517a(i).f28037g;
        return false;
    }
}
