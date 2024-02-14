package com.google.android.gms.internal.wearable;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzel extends zzen {
    zzel(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo54075a(Object obj, long j) {
        return Double.longBitsToDouble(mo54085k(obj, j));
    }

    /* renamed from: b */
    public final float mo54076b(Object obj, long j) {
        return Float.intBitsToFloat(mo54084j(obj, j));
    }

    /* renamed from: c */
    public final void mo54077c(Object obj, long j, boolean z) {
        if (zzeo.f45743h) {
            zzeo.m64492d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            zzeo.m64493e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo54078d(Object obj, long j, byte b) {
        if (zzeo.f45743h) {
            zzeo.m64492d(obj, j, b);
        } else {
            zzeo.m64493e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo54079e(Object obj, long j, double d) {
        mo54089o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo54080f(Object obj, long j, float f) {
        mo54088n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo54081g(Object obj, long j) {
        if (zzeo.f45743h) {
            return zzeo.m64513y(obj, j);
        }
        return zzeo.m64514z(obj, j);
    }
}
