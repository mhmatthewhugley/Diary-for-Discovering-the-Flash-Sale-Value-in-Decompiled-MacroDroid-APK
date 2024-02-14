package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzmw extends zzmx {
    zzmw(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo51595a(Object obj, long j) {
        return Double.longBitsToDouble(mo51605k(obj, j));
    }

    /* renamed from: b */
    public final float mo51596b(Object obj, long j) {
        return Float.intBitsToFloat(mo51604j(obj, j));
    }

    /* renamed from: c */
    public final void mo51597c(Object obj, long j, boolean z) {
        if (zzmy.f41745h) {
            zzmy.m60849d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            zzmy.m60850e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo51598d(Object obj, long j, byte b) {
        if (zzmy.f41745h) {
            zzmy.m60849d(obj, j, b);
        } else {
            zzmy.m60850e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo51599e(Object obj, long j, double d) {
        mo51609o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo51600f(Object obj, long j, float f) {
        mo51608n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo51601g(Object obj, long j) {
        if (zzmy.f41745h) {
            return zzmy.m60870y(obj, j);
        }
        return zzmy.m60871z(obj, j);
    }
}
