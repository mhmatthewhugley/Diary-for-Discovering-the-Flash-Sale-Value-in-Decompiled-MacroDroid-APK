package com.google.android.gms.internal.p204firebaseauthapi;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzafu extends zzafw {
    zzafu(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo49238a(Object obj, long j) {
        return Double.longBitsToDouble(mo49248k(obj, j));
    }

    /* renamed from: b */
    public final float mo49239b(Object obj, long j) {
        return Float.intBitsToFloat(mo49247j(obj, j));
    }

    /* renamed from: c */
    public final void mo49240c(Object obj, long j, boolean z) {
        if (zzafx.f39857h) {
            zzafx.m56837d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            zzafx.m56838e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo49241d(Object obj, long j, byte b) {
        if (zzafx.f39857h) {
            zzafx.m56837d(obj, j, b);
        } else {
            zzafx.m56838e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo49242e(Object obj, long j, double d) {
        mo49252o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo49243f(Object obj, long j, float f) {
        mo49251n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo49244g(Object obj, long j) {
        if (zzafx.f39857h) {
            return zzafx.m56858y(obj, j);
        }
        return zzafx.m56859z(obj, j);
    }
}
