package com.google.android.gms.internal.icing;

import sun.misc.Unsafe;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzfk extends zzfm {
    zzfk(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final void mo50432a(Object obj, long j, byte b) {
        if (zzfn.f40987i) {
            zzfn.m59072d(obj, j, b);
        } else {
            zzfn.m59073e(obj, j, b);
        }
    }

    /* renamed from: b */
    public final boolean mo50433b(Object obj, long j) {
        if (zzfn.f40987i) {
            return zzfn.m59064A(obj, j);
        }
        return zzfn.m59065B(obj, j);
    }

    /* renamed from: c */
    public final void mo50434c(Object obj, long j, boolean z) {
        if (zzfn.f40987i) {
            zzfn.m59072d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            zzfn.m59073e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final float mo50435d(Object obj, long j) {
        return Float.intBitsToFloat(mo50442k(obj, j));
    }

    /* renamed from: e */
    public final void mo50436e(Object obj, long j, float f) {
        mo50443l(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: f */
    public final double mo50437f(Object obj, long j) {
        return Double.longBitsToDouble(mo50444m(obj, j));
    }

    /* renamed from: g */
    public final void mo50438g(Object obj, long j, double d) {
        mo50445n(obj, j, Double.doubleToLongBits(d));
    }
}
